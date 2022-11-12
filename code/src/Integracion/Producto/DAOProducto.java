package Integracion.Producto;

import Negocio.Producto.TProducto;
import java.util.Collection;


public interface DAOProducto {

	public Integer crear(TProducto tProd);

	public Integer editar(TProducto tProd);

	public Integer eliminar(Integer id);

	public TProducto leerUno(Integer id);

	public Collection<TProducto> leerTodos();

	public TProducto leerPorNombre(String nombre);
}