package negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Util.MySQLConexion;
import bean.Pais;
import interfaces.PaisInterface;

public class PaisNegocio implements PaisInterface {

	@Override
	public List<Pais> paises() {
		List<Pais> lista = new ArrayList<Pais>();
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
	
		try {
			con = MySQLConexion.getConexion();
			String sql = "select * from Pais";
			pst = con.prepareStatement(sql);
			
			rs = pst.executeQuery();
			
			while(rs.next()){
				Pais p = new Pais(rs.getInt(1), rs.getString(2));
				
				lista.add(p);
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
