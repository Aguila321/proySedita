package negocio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.sql.PreparedStatement;

import Util.MySQLConexion;
import bean.Item;
import bean.RarezaItem;
import bean.TipoItem;
import interfaces.ItemInterface;
import sun.security.krb5.internal.crypto.RsaMd5CksumType;


public class ItemNegocio  implements ItemInterface{

	@Override
	public List<Item> listaItem() {
		List<Item> lista = new ArrayList<Item>();
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
		
		
		
		try {
			con = MySQLConexion.getConexion();
			String sql = "select * from item";
			pst = con.prepareStatement(sql);
			
			rs = pst.executeQuery();
			
			while(rs.next()){
				Item i = new Item(rs.getInt(1),rs.getString(2), rs.getInt(3),obtenerTipoItem(rs.getInt(4)) , obtenerRareza(rs.getInt(5)));
				
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

	@Override
	public TipoItem obtenerTipoItem(int id) {
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
		TipoItem t = null;
		
		try {
			con = MySQLConexion.getConexion();
			String sql = "select * from tipo where idtipo = ?";
			pst = con.prepareStatement(sql);
			
			pst.setInt(1, id);;
			rs = pst.executeQuery();
			
			while(rs.next()){
				t = new TipoItem(rs.getInt(1), rs.getString(2));	
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			MySQLConexion.closeStatement(pst);
			MySQLConexion.closeConexion(con);
		}
		
		return t;
	}

	@Override
	public RarezaItem obtenerRareza(int id) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
		RarezaItem r = null;
		
		try {
			con = MySQLConexion.getConexion();
			String sql = "select * from rarity where idrarity = ?";
			pst = con.prepareStatement(sql);
			
			pst.setInt(1, id);;
			rs = pst.executeQuery();
			
			while(rs.next()){
				r = new RarezaItem(rs.getInt(1), rs.getString(2));	
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			MySQLConexion.closeStatement(pst);
			MySQLConexion.closeConexion(con);
		}
		
		return r;
	}

	@Override
	public List<Item> obtenerListaItem(int codigoItem) {
		List<Item> lista = new ArrayList<Item>();
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
	
		try {
			con = MySQLConexion.getConexion();
			String sql = "select * from item where iditem = ?";
			pst = con.prepareStatement(sql);
			pst.setInt(1, codigoItem);
			rs = pst.executeQuery();
			
			while(rs.next()){
				Item i = new Item(rs.getInt(1),rs.getString(2), rs.getInt(3),obtenerTipoItem(rs.getInt(4)) , obtenerRareza(rs.getInt(5)));
				
				lista.add(i);
				System.out.println(lista);
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
