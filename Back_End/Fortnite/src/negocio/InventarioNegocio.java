package negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Util.MySQLConexion;
import bean.Inventario;
import bean.Item;
import bean.Pais;
import bean.Pavos;
import bean.RarezaItem;
import bean.TipoItem;
import bean.TipoUsuario;
import bean.Usuario;
import interfaces.InventarioInterface;

public class InventarioNegocio implements InventarioInterface {

	@Override
	public List<Inventario> inventarioLista() {
		List<Inventario> lista = new ArrayList<Inventario>();
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;

		try {
			con = MySQLConexion.getConexion();
			String sql = "select * from inventario";
			pst = con.prepareStatement(sql);

			rs = pst.executeQuery();

			while (rs.next()) {
				Inventario i = new Inventario(obtenerUsuario(rs.getInt(1)), obtenerItem(rs.getInt(2)));
				lista.add(i);
			}

			System.out.println(lista);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MySQLConexion.closeStatement(pst);
			MySQLConexion.closeConexion(con);
		}
		return lista;

	}

	@Override
	public TipoItem obtenerTipoItem(int id) {
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
		TipoItem tipoItem = null;

		try {
			con = MySQLConexion.getConexion();
			String sql = "select * from tipo where idtipo = ?";
			pst = con.prepareStatement(sql);

			pst.setInt(1, id);
			;
			rs = pst.executeQuery();

			while (rs.next()) {
				tipoItem = new TipoItem(rs.getInt(1), rs.getString(2));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MySQLConexion.closeStatement(pst);
			MySQLConexion.closeConexion(con);
		}

		return tipoItem;
	}

	@Override
	public RarezaItem obtenerRareza(int id) {
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
		RarezaItem rareza = null;

		try {
			con = MySQLConexion.getConexion();
			String sql = "select * from rarity where idrarity = ?";
			pst = con.prepareStatement(sql);

			pst.setInt(1, id);
			;
			rs = pst.executeQuery();

			while (rs.next()) {
				rareza = new RarezaItem(rs.getInt(1), rs.getString(2));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MySQLConexion.closeStatement(pst);
			MySQLConexion.closeConexion(con);
		}

		return rareza;
	}

	@Override
	public Item obtenerItem(int codigoItem) {

		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
		Item i = null;

		try {
			con = MySQLConexion.getConexion();
			String sql = "select * from item where iditem = ?";
			pst = con.prepareStatement(sql);
			pst.setInt(1, codigoItem);

			rs = pst.executeQuery();

			while (rs.next()) {
				i = new Item(rs.getInt(1), rs.getString(2), rs.getInt(3), obtenerTipoItem(rs.getInt(4)),
						obtenerRareza(rs.getInt(5)));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MySQLConexion.closeStatement(pst);
			MySQLConexion.closeConexion(con);
		}
		return i;
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
	public Pavos obtenerPavos(int id) {
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
		Pavos pavos = null;

		try {
			con = MySQLConexion.getConexion();
			String sql = "select * from pavos where idpavo = ?";
			pst = con.prepareStatement(sql);

			pst.setInt(1, id);
			
			rs = pst.executeQuery();

			while (rs.next()) {
				pavos = new Pavos(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MySQLConexion.closeStatement(pst);
			MySQLConexion.closeConexion(con);
		}

		return pavos;
	}

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

}
