package negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import Util.MySQLConexion;
import bean.OrdenPedido;
import bean.Pais;
import bean.Pavos;
import bean.RarezaItem;
import bean.TipoItem;
import bean.TipoUsuario;
import bean.Usuario;
import interfaces.ObtenerInterface;

public class ObtenerNegocio implements ObtenerInterface{
	@Override
	public Usuario obtenerUsuario(int idUser) {
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
		Usuario u = null;

		try {
			con = MySQLConexion.getConexion();
			String sql = "select * from usuario where iduser = ?";
			pst = con.prepareStatement(sql);
			pst.setInt(1, idUser);

			rs = pst.executeQuery();

			while (rs.next()) {
				u = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getInt(8), obtenerPais(rs.getInt(9)),
						obtenerTipoUsuario(rs.getInt(10)));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MySQLConexion.closeStatement(pst);
			MySQLConexion.closeConexion(con);
		}

		return u;
	}

	@Override
	public TipoUsuario obtenerTipoUsuario(int id) {
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
		TipoUsuario tipoUsuario = null;

		try {
			con = MySQLConexion.getConexion();
			String sql = "select * from tipoUser where idtipo = ?";
			pst = con.prepareStatement(sql);

			pst.setInt(1, id);
			;
			rs = pst.executeQuery();

			while (rs.next()) {
				tipoUsuario = new TipoUsuario(rs.getInt(1), rs.getString(2));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MySQLConexion.closeStatement(pst);
			MySQLConexion.closeConexion(con);
		}

		return tipoUsuario;
	}

	@Override
	public Pais obtenerPais(int id) {
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
		Pais pais = null;

		try {
			con = MySQLConexion.getConexion();
			String sql = "select * from pais where idpais = ?";
			pst = con.prepareStatement(sql);

			pst.setInt(1, id);
			;
			rs = pst.executeQuery();

			while (rs.next()) {
				pais = new Pais(rs.getInt(1), rs.getString(2));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MySQLConexion.closeStatement(pst);
			MySQLConexion.closeConexion(con);
		}

		return pais;
	}

	@Override
	public Pavos obtenerPavos(int id) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
		Pavos pavos = null;

		try {
			con = MySQLConexion.getConexion();
			String sql = "select * from pavos where idpavo = ?";
			pst = con.prepareStatement(sql);

			pst.setInt(1, id);
			;
			rs = pst.executeQuery();

			while (rs.next()) {
				pavos = new Pavos(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4));

			}

		} catch (Exception e) {
			System.out.println("error en el obtener pavos");
			e.printStackTrace();
		} finally {
			MySQLConexion.closeStatement(pst);
			MySQLConexion.closeConexion(con);
		}

		return pavos;
	}

	@Override
	public OrdenPedido obtenerPedido(int id) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
		OrdenPedido ordenPedido = null;
		
		/*Dar formato la fecha*/
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		

		try {
			con = MySQLConexion.getConexion();
			String sql = "select * from orden_pedido where idpedido = ?";
			pst = con.prepareStatement(sql);

			pst.setInt(1, id);
			
			rs = pst.executeQuery();

			while (rs.next()) {
				ordenPedido = new OrdenPedido(rs.getInt(1),rs.getString(2),obtenerUsuario(rs.getInt(3)));
				

			}

		} catch (Exception e) {
			System.out.println("error en el obtener obtenerPedido");
			e.printStackTrace();
		} finally {
			MySQLConexion.closeStatement(pst);
			MySQLConexion.closeConexion(con);
		}

		return ordenPedido;
	}
}
