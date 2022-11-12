/**
 * 
 */
package Integracion.Empleado;

import Negocio.Empleado.TEmpleado;
import java.util.Collection;


public interface DAOEmpleado {
	
	public Integer crear(TEmpleado tEmpleado);

	public Integer eliminar(Integer id);

	
	public Integer editar(TEmpleado tEmpleado);

	public TEmpleado leerUno(Integer id);


	public Collection leerTodos();

	
	public TEmpleado leerPorDNI(String dni);
}