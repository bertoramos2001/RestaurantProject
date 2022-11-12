
package Negocio.FactoriaNegocio;

import Negocio.Empleado.SAEmpleado;
import Negocio.Factura.SAFactura;
import Negocio.Ingrediente.SAIngrediente;
import Negocio.Menu.SAMenu;
import Negocio.Mesa.SAMesa;
import Negocio.Producto.SAProducto;

public abstract class FactoriaSA {


	private static FactoriaSA instance;

	public static FactoriaSA getInstance() {
		if (instance == null) {
			instance = new FactoriaSAImp();
		}
		return instance;
	}

	public abstract SAEmpleado generarSAEmpleado();

	public abstract SAFactura generarSAFactura();

	public abstract SAIngrediente generarSAIngrediente();

	public abstract SAMenu generarSAMenu();

	public abstract SAMesa generarSAMesa();

	public abstract SAProducto generarSAProducto();

}