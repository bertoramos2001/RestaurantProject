/**
 * 
 */
package Integracion.Menu;

import Negocio.Menu.TMenu;

import java.util.ArrayList;
import java.util.Collection;


public interface DAOMenu {
	
	public Integer crear(TMenu tMenu);

	
	public Integer eliminar(Integer id);

	public Integer editar(TMenu tMenu);

	
	public TMenu leerUno(Integer id);
	public TMenu leerPorNombre(String s);

	
	public ArrayList<TMenu> leerTodos();
}