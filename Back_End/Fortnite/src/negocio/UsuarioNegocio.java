package negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Util.MySQLConexion;
import bean.Usuario;
import interfaces.UsuarioInterface;

public class UsuarioNegocio implements UsuarioInterface{

	ObtenerNegocio obtener = new ObtenerNegocio();
	@Override
	public List<Usuario> usuarioLista() {
		List<Usuario> listaUsuario = new ArrayList<Usuario>();
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;		
		try {
			con = MySQLConexion.getConexion();
			String sql = "select * from usuario";
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while (rs.next()) {
				Usuario usuario = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
												rs.getString(7), rs.getInt(8), obtener.obtenerPais(rs.getInt(9)),obtener.obtenerTipoUsuario(rs.getInt(10)));
				listaUsuario.add(usuario);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MySQLConexion.closeStatement(pst);
			MySQLConexion.closeConexion(con);
		}
		return listaUsuario;
	}
	@Override
	public int RegistrarUsuario(Usuario u) {
		int OK = 0;
		
		Connection con = null;
		PreparedStatement pst = null;
		
		try {
			con = MySQLConexion.getConexion();
			String sql = "call usp_registrar_usuario(?,?,?,?,?,?,?)";
			
			pst = con.prepareStatement(sql);
			pst.setString(1, u.getNombre());
			pst.setString(2, u.getApellido());
			pst.setString(3, u.getUsername());
			pst.setString(4, u.getClave());
			pst.setString(5, u.getFecnac());
			pst.setString(6, u.getEmail());
			pst.setInt(7, u.getPais().getIdpais());// por pensar
			
			
			OK = pst.executeUpdate();
			
			
		} catch (Exception e) {
			System.out.println("Error en la sentencia" + e.getMessage());
		} finally {
			MySQLConexion.closeStatement(pst);
			MySQLConexion.closeConexion(con);
		}
		return OK;
	}
	@Override
	public Usuario loginUsuario(String user,String pass) {
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
		Usuario u = null;

		try {
			con = MySQLConexion.getConexion();
			String sql = "select * from usuario where username = ? and clave=?";
			pst = con.prepareStatement(sql);
			pst.setString(1,user);
			pst.setString(2, pass);
			

			rs = pst.executeQuery();

			while (rs.next()) {
				u = new Usuario();
				u.setIduser(rs.getInt(1));
				u.setNombre(rs.getString(2));
				u.setApellido(rs.getString(3));
				u.setUsername(rs.getString(4));
				u.setFecnac(rs.getString(6));
				u.setEmail(rs.getString(7));
				u.setPavos(rs.getInt(8));
				u.setPais((obtener.obtenerPais(rs.getInt(9))));
				u.setTipo((obtener.obtenerTipoUsuario(rs.getInt(10))));
				//u.setPavos(rs.getInt(7));
			
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