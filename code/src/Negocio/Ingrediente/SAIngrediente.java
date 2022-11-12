package Negocio.Ingrediente;

import java.util.Collection;

public interface SAIngrediente {

	public int crear(TIngrediente tIng);

	public int editar(TIngrediente tIngr);

	public int eliminar(Integer id);

	public TIngrediente mostrarUno(Integer idIngr);

	public Collection<TIngrediente> mostrarTodos();
	
	public TIngrediente mostrarUnoPorNombre(String nombre);
}