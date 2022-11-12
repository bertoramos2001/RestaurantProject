/**
 * 
 */
package Negocio.Mesa;

import java.util.Collection;

public interface SAMesa {

	public Integer crear(TMesa mesa);

	public Integer eliminar(Integer id);

	public Integer editar(TMesa tMesa);

	public TMesa mostrarUno(Integer id);

	public Collection<TMesa> mostrarTodos();
}