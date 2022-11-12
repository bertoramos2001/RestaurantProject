package Integracion.Mesa;

import Negocio.Mesa.TMesa;
import java.util.Collection;


public interface DAOMesa {
	
	public Integer crear(TMesa tMesa);
	public Integer editar(TMesa tMesa);
	public Integer eliminar(Integer id);
	public Collection<TMesa> leerTodos();
	public TMesa leerPorId(Integer id);
	public TMesa leerPorNum(Integer numMesa);
}