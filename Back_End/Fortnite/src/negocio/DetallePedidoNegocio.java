package negocio;

import java.util.List;

import bean.Inventario;
import bean.OrdenPedidoDetalle;
import interfaces.DetallePedidoInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Util.MySQLConexion;
import bean.Usuario;
public class DetallePedidoNegocio  implements DetallePedidoInterface{

	@Override
	public List<OrdenPedidoDetalle> UsuariosPedidos() {
		// TODO Auto-generated method stub
		ObtenerNegocio obtener = new ObtenerNegocio();
		List<OrdenPedidoDetalle> lista = new ArrayList<OrdenPedidoDetalle>();
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;

		try {
			con = MySQLConexion.getConexion();
			String sql = "select * from tb_orden_pedido_detalle";
			pst = con.prepareStatement(sql);

			rs = pst.executeQuery();

			while (rs.next()) {
				OrdenPedidoDetalle i = new OrdenPedidoDetalle(obtener.obtenerPedido(rs.getInt(1)),obtener.obtenerPavos(rs.getInt(2)), rs.getInt(3), rs.getDouble(4));
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

}
