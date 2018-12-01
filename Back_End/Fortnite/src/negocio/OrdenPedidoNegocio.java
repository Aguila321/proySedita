 	package negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Util.MySQLConexion;
import bean.CompraPavosPersonalizado;
import bean.OrdenPedido;
import bean.OrdenPedidoDetalle;
import interfaces.OrdenPedidoInteface;

public class OrdenPedidoNegocio implements OrdenPedidoInteface{

	@Override
	public Integer comprarPavos(OrdenPedido op) {
	int OK = 0;
	int OKA=0;	
		Connection con = null;
		PreparedStatement pst = null;
		
		try {
			int id = AutoGenerado();
			con = MySQLConexion.getConexion();
			con.setAutoCommit(false);
			String sql = "insert into orden_pedido values (?,now(),?);";
			
		
			
			pst = con.prepareStatement(sql);
			
			pst.setInt(1, id);
			//pst.setString(2,sdf.format(new Date()));
			pst.setInt(2, op.getUsuario().getIduser());
			OK = pst.executeUpdate();
			System.out.println("primer execute " + OK);
			PreparedStatement pst2 = null;
			List<OrdenPedidoDetalle> opd = new ArrayList<>();
			for (OrdenPedidoDetalle  i : opd) {
				
				String query ="call usp_compra_detalle(?,?,?,?)";
				pst2 = con.prepareStatement(query);
				pst2.setInt(1, id);
				pst2.setInt(2,i.getPavos().getIdpavos());
				
				pst2.setInt(3,i.getCantidad());
				pst2.setDouble(4,i.getPrecio());
				
				OKA = pst2.executeUpdate();
				
				System.out.println("segundo execute :"  +OKA);
				if(OKA==1) {
					System.out.println("executa 2");
				}else {
					
				}
			} 
			con.commit();
	
			
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

	// Boton comprar 
	@Override
	public Integer comprarPavos2(CompraPavosPersonalizado op) {
		int OK = 0;
		int OKA=0;	
			Connection con = null;
			PreparedStatement pst = null;
			
			try {
				int id = AutoGenerado();
				
				con = MySQLConexion.getConexion();
				con.setAutoCommit(false);
				String sql = "insert into orden_pedido values (?,now(),?);";
				
			
				
				pst = con.prepareStatement(sql);
			
				pst.setInt(1, id);
				//pst.setString(2,sdf.format(new Date()));
				pst.setInt(2, op.getUsuario().getIduser());
				OK = pst.executeUpdate();
				System.out.println("primer execute " + OK);
				PreparedStatement pst2 = null;
				
				//OrdenPedidoDetalle opd = new OrdenPedidoDetalle();
				if(OK==1) {
					
					
					String query ="call usp_compra_detalle(?,?,?,?)";
					pst2 = con.prepareStatement(query);
					pst2.setInt(1,id); 
					pst2.setInt(2,op.getPedidoDetalle().getPavos().getIdpavos());
					pst2.setInt(3,op.getPedidoDetalle().getCantidad());
					pst2.setDouble(4,op.getPedidoDetalle().getPrecio());
					
					OKA = pst2.executeUpdate();
					
					System.out.println("segundo execute :"  +OKA);
					if(OKA==1) {
						System.out.println("Ejecutado OKA");
					}else {
						System.out.println("No Ejecutado");
					}
				}
				con.commit();
		
				
			} catch (Exception e) {
				System.out.println("Error en la sentencia  " + e.getMessage());
				try {
					con.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			} finally {
				MySQLConexion.closeStatement(pst);
				MySQLConexion.closeConexion(con);
			}
			return OKA;
	}
	
	

}
