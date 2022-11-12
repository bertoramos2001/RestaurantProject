/**
 * 
 */
package Negocio.Factura;

import java.util.Collection;

public interface SAFactura {
	
	public Integer abrir(TFactura tFactura);

	public Integer cerrar(Integer id);

	public Integer editar(TFactura tFactura);

	public TFacturaCompleta mostrarUno(Integer id);

	public Collection<TFactura> mostrarTodos();
	
	public Collection<TFactura> mostrarTodosPorEmpleado(Integer id);

	public Collection<TFactura> mostrarTodosPorMesa(Integer id);

	public Integer aniadirMenus(TLineaDePedido info);

	public Integer eliminarMenus(TLineaDePedido info);

	public Integer devolverMenus(TLineaDePedido info);

	public TFactura leerUnoPorId(Integer id);
}