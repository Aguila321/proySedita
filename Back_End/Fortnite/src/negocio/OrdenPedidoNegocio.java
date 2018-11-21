package negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Util.MySQLConexion;
import bean.Item;
import bean.OrdenPedido;
import bean.OrdenPedidoDetalle;
import interfaces.OrdenPedidoInteface;

public class OrdenPedidoNegocio implements OrdenPedidoInteface{

	@Override
	public Integer comprarPavos(OrdenPedido op) {
		// TODO Auto-generated method stub
	int OK = 0;
	int OKA=0;	
		Connection con = null;
		PreparedStatement pst = null;
		
		try {
			int id = AutoGenerado();
			con = MySQLConexion.getConexion();
			con.setAutoCommit(false);
			String sql = "insert into orden_pedido values (?,now(),?);";
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			
			pst = con.prepareStatement(sql);
			
			pst.setInt(1, id);
			//pst.setString(2,sdf.format(new Date()));
			pst.setInt(2, op.getUsuario().getIduser());
			OK = pst.executeUpdate();
			System.out.println("primer execute " + OK);
			if(OK==1) {
				PreparedStatement pst2 = null;
				
				OrdenPedidoDetalle opd = new OrdenPedidoDetalle();
				String query ="call usp_compra_detalle(?,?,?,?)";
				pst2 = con.prepareStatement(query);
				pst2.setInt(1, id);
				pst2.setInt(2,opd.getPavos().getIdpavos());
				pst2.setInt(3,opd.getCantidad());
				pst2.setDouble(4,opd.getPrecio());
				
				OKA = pst.executeUpdate();
				
				System.out.println("segundo execute :"  +OKA);
				if(OKA==1) {
					con.commit();
				}else {
					con.rollback();
				}
			}
			
			
		} catch (Exception e) {
			System.out.println("Error en la sentencia  " + e.getMessage());
			
		} finally {
			MySQLConexion.closeStatement(pst);
			MySQLConexion.closeConexion(con);
		}
		return OKA;
		
	}

	@Override
	public int AutoGenerado() {
		// TODO Auto-generated method stub
		int generado =0;
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
		
		
		
		try {
			con = MySQLConexion.getConexion();
			String sql = "call autogenerar()";
			pst = con.prepareStatement(sql);
			
			rs = pst.executeQuery();
			while(rs.next()){
				generado = rs.getInt(1);
				
			}
			
			System.out.println("el generado " + generado);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			MySQLConexion.closeStatement(pst);
			MySQLConexion.closeConexion(con);
		}
		return generado;
	}
	
	

}
