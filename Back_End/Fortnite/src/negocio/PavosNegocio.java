package negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Util.MySQLConexion;
import bean.Pavos;
import bean.Pavos;
import interfaces.PavosInterface;

public class PavosNegocio implements PavosInterface{

	@Override
	public List<Pavos> listaPavos() {
		List<Pavos> lista = new ArrayList<Pavos>();
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
	
		try {
			con = MySQLConexion.getConexion();
			String sql = "select * from Pavos";
			pst = con.prepareStatement(sql);
			
			rs = pst.executeQuery();
			
			while(rs.next()){
				Pavos i = new Pavos(rs.getInt(1),rs.getString(2), rs.getInt(3),rs.getDouble(4));
				
				lista.add(i);
			}
			
			System.out.println(lista);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			MySQLConexion.closeStatement(pst);
			MySQLConexion.closeConexion(con);
		}
		return lista;
	}

}
