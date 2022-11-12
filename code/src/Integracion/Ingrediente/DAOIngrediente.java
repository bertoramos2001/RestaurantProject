package Integracion.Ingrediente;

import Negocio.Ingrediente.TIngrediente;

import java.sql.SQLException;
import java.util.Collection;

public interface DAOIngrediente {

	public Integer crear(TIngrediente tIngrediente);

	public int editar(TIngrediente tIngrediente) throws SQLException;

	public Integer eliminar(Integer id);

	public TIngrediente leerUno(Integer id);

	public Collection<TIngrediente> leerTodos();

	public TIngrediente leerUnoPorNombre(String nombre);
	
}