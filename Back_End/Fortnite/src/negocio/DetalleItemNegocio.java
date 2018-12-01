package negocio;

import java.util.List;

import bean.OrdenItemDetalle;
import interfaces.DetalleItemIterface;

public class DetalleItemNegocio implements DetalleItemIterface{

	@Override
	public List<OrdenItemDetalle> ItemPedidos() {
//		ObtenerNegocio obtener = new ObtenerNegocio();
//		List<OrdenItemDetalle> lista = new ArrayList<OrdenItemDetalle>();
//		ResultSet rs = null;
//		Connection con = null;
//		PreparedStatement pst = null;
//
//		try {
//			con = MySQLConexion.getConexion();
//			String sql = "select * from tb_item_detalle";
//			pst = con.prepareStatement(sql);
//
//			rs = pst.executeQuery();
//
//			while (rs.next()) {
//				OrdenItemDetalle o = new OrdenItemDetalle(obtener, item, precio)
//				lista.add(o);
//			}
//
//			System.out.println(lista);
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			MySQLConexion.closeStatement(pst);
//			MySQLConexion.closeConexion(con);
//		}
		return null;
	}

}
