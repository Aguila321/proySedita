package negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Util.MySQLConexion;
import bean.OrdenItemDetalle;
import interfaces.DetalleItemIterface;

public class DetalleItemNegocio implements DetalleItemIterface{

	@Override
	public List<OrdenItemDetalle> ItemPedidos() {
		// TODO Auto-generated method stub
		ObtenerNegocio obtener = new ObtenerNegocio();
		List<OrdenItemDetalle> lista = new ArrayList<OrdenItemDetalle>();
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;

		try {
			con = MySQLConexion.getConexion();
			String sql = "select * from tb_item_detalle";
			pst = con.prepareStatement(sql);

			rs = pst.executeQuery();

			while (rs.next()) {
				OrdenItemDetalle o = new OrdenItemDetalle(rs.getInt(1),obtener.obtenerItem(rs.getInt(2)), rs.getInt(3));
				lista.add(o);
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

}
