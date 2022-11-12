/**
 * 
 */
package Integracion.Producto;

import Negocio.Menu.TMenu;
import Negocio.Producto.TProducto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import Integracion.Almacendeldominio.Transaction;
import Integracion.Almacendeldominio.TransactionManager;

public class DAOProductoImp implements DAOProducto {

	public Integer crear(TProducto tProd) {
		int res = -1;
		
		try {
			String consulta = "INSERT INTO supermercado.producto(nombre, activo) VALUES (?, ?);";
			
			TransactionManager tManager = TransactionManager.getInstance();
			Transaction transaction = tManager.getTransaction();
			Connection connection = (Connection) transaction.getResource();
			
			PreparedStatement ps = connection.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
			
			ps.setString(1, tProd.getNombre());
			ps.setBoolean(2, tProd.getActivo());
			ps.executeUpdate();
			
			ResultSet rs = ps.getGeneratedKeys();
			
			if (rs.next())
				res = rs.getInt(1);
			
			ps.close();
			rs.close();
	
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}

	public Integer editar(TProducto tProd) {
		int res = -1;
		
		try {
			String consulta = "UPDATE supermercado.producto SET nombre = ?, activo = ? WHERE idProducto = ?;"; 
			
			Transaction transaction = TransactionManager.getInstance().getTransaction();
			Connection connection = (Connection)transaction.getResource();
			
			PreparedStatement ps = connection.prepareStatement(consulta);

			ps.setString(1, tProd.getNombre());
			ps.setBoolean(2, tProd.getActivo());
			ps.setInt(3, tProd.getId());
			
			if (ps.executeUpdate() == 1)
				res = tProd.getId();
			
			ps.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}

	public Integer eliminar(Integer id) {
		int res = -1;
		try {
			String consulta = "UPDATE supermercado.producto SET activo = ? WHERE idProducto = ?;";
			
			Transaction transaction = TransactionManager.getInstance().getTransaction();
			Connection connection = (Connection)transaction.getResource();
			
			PreparedStatement s = connection.prepareStatement(consulta);
			
			s.setBoolean(1, false);
			s.setInt(2, id);

			res = (s.executeUpdate() == 1) ? 0 : -1;
			
			s.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}

	public TProducto leerUno(Integer id) {
		TProducto tProducto = null;
		
		try {
			String consulta = "SELECT * FROM supermercado.producto WHERE idProducto = ? FOR UPDATE;";
			
			Transaction transaction = TransactionManager.getInstance().getTransaction();
			Connection connection = (Connection)transaction.getResource();
			
			PreparedStatement s = connection.prepareStatement(consulta);
			
			s.setInt(1, id);
			ResultSet rs = s.executeQuery();
			
			if (rs.next()) {
				tProducto = new TProducto(rs.getInt("idProducto"), rs.getBoolean("activo"), rs.getString("nombre"));
			}
			
			s.close();
			rs.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return tProducto;
	}

	public Collection<TProducto> leerTodos() {
		ArrayList<TProducto> lista = new ArrayList<TProducto>();
		
		try {
			String consulta = "SELECT * FROM supermercado.producto WHERE activo = 1 FOR UPDATE";
			
			TransactionManager tManager = TransactionManager.getInstance(); 
			Transaction transaction = tManager.getTransaction();
			Connection connection = (Connection) transaction.getResource();
			
			PreparedStatement statement = connection.prepareStatement(consulta);
					
			ResultSet results = statement.executeQuery();
			
			while (results.next()) {
				lista.add(new TProducto(results.getInt("idProducto"), results.getBoolean("activo"), results.getString("nombre")));
			}
			
			statement.close();
			results.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}

	public TProducto leerPorNombre(String nombre) {
		TProducto tProducto = null;
		
		try {
			String consulta = "SELECT * FROM supermercado.producto WHERE nombre = ?;";
			
			Transaction transaction = TransactionManager.getInstance().getTransaction();
			Connection connection = (Connection)transaction.getResource();
			
			PreparedStatement s = connection.prepareStatement(consulta);
			
			s.setString(1, nombre);
			ResultSet rs = s.executeQuery();
			
			if (rs.next()) {
				tProducto = new TProducto(rs.getInt("idProducto"), rs.getBoolean("activo"), rs.getString("nombre"));
			}
			
			s.close();
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tProducto;
	}
}