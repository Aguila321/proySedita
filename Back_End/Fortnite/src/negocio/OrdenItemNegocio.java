package negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Util.MySQLConexion;
import bean.CompraItemPersonalizado;
import interfaces.OrdenItemInterface;

public class OrdenItemNegocio implements OrdenItemInterface{

	@Override
	public Integer compraItem(CompraItemPersonalizado cpi) {
		// TODO Auto-generated method stub
		int OK = 0;
		int OKA=0;	
			Connection con = null;
			PreparedStatement pst = null;
			
			try {
				int id = AutoGenerado();
				
				con = MySQLConexion.getConexion();
				con.setAutoCommit(false);
				String sql = "insert into orden_item values (?,?)";
				pst = con.prepareStatement(sql);
			
				pst.setInt(1, id);
				//pst.setString(2,sdf.format(new Date()));
				pst.setInt(2, cpi.getUsuario().getIduser());
				OK = pst.executeUpdate();
				System.out.println("primer execute " + OK);
				PreparedStatement pst2 = null;
				
				//OrdenPedidoDetalle opd = new OrdenPedidoDetalle();
				if(OK==1) {
								
					String query ="call usp_compra_item1(?,?,?)";
					pst2 = con.prepareStatement(query);
					pst2.setInt(1,id); 
					pst2.setInt(2,cpi.getItemDetalle().getItem().getIditem());
					pst2.setDouble(3,cpi.getItemDetalle().getPrecio());
					
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
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}			
			} 
			finally {
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
			String sql = "call autogenerar_item()";
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
