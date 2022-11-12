
package Negocio.FactoriaNegocio;

import Negocio.Empleado.SAEmpleado;
import Negocio.Empleado.SAEmpleadoImp;
import Negocio.Factura.SAFactura;
import Negocio.Factura.SAFacturaImp;
import Negocio.Ingrediente.SAIngrediente;
import Negocio.Ingrediente.SAIngredienteImp;
import Negocio.Menu.SAMenu;
import Negocio.Menu.SAMenuImp;
import Negocio.Mesa.SAMesa;
import Negocio.Mesa.SAMesaImp;
import Negocio.Producto.SAProducto;
import Negocio.Producto.SAProductoImp;

public class FactoriaSAImp extends FactoriaSA {

	public SAEmpleado generarSAEmpleado() {
		return new SAEmpleadoImp();
	}

	public SAFactura generarSAFactura() {
		return new SAFacturaImp();
	}

	public SAIngrediente generarSAIngrediente() {
		return new SAIngredienteImp();
	}

	public SAMenu generarSAMenu() {
		return new SAMenuImp();
	}

	public SAMesa generarSAMesa() {
		return new SAMesaImp();
	}

	public SAProducto generarSAProducto() {
		return new SAProductoImp();
	}

}