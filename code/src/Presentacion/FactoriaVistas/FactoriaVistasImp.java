/**
 * 
 */
package Presentacion.FactoriaVistas;

import javax.swing.JOptionPane;

import Presentacion.Command.Context;
import Presentacion.Controller.Events;
import Presentacion.Controller.IGUI;
import Presentacion.Empleado.VEmpleado;
import Presentacion.Empleado.VCasosDeUso.VAltaEmpleado;
import Presentacion.Empleado.VCasosDeUso.VBajaEmpleado;
import Presentacion.Empleado.VCasosDeUso.VModificarEmpleado;
import Presentacion.Empleado.VCasosDeUso.VModificarEmpleado2;
import Presentacion.Empleado.VCasosDeUso.VMostrarEmpleado;
import Presentacion.Empleado.VCasosDeUso.VMostrarEmpleadoRango;
import Presentacion.Empleado.VCasosDeUso.VMostrarEmpleado_OK;
import Presentacion.Empleado.VCasosDeUso.VMostrarTodosEmpleados;
import Presentacion.Factura.VFactura;
import Presentacion.Factura.VFacturaCasosUsos.VAltaFactura;
import Presentacion.Factura.VFacturaCasosUsos.VAltaFactura_KO;
import Presentacion.Factura.VFacturaCasosUsos.VAltaFactura_OK;
import Presentacion.Factura.VFacturaCasosUsos.VAnyadirMenusFactura;
import Presentacion.Factura.VFacturaCasosUsos.VAnyadirMenusFactura_KO;
import Presentacion.Factura.VFacturaCasosUsos.VAnyadirMenusFactura_OK;
import Presentacion.Factura.VFacturaCasosUsos.VCerrarFactura;
import Presentacion.Factura.VFacturaCasosUsos.VCerrarFactura_KO;
import Presentacion.Factura.VFacturaCasosUsos.VCerrarFactura_OK;
import Presentacion.Factura.VFacturaCasosUsos.VDevolverMenusFactura;
import Presentacion.Factura.VFacturaCasosUsos.VDevolverMenusFactura_KO;
import Presentacion.Factura.VFacturaCasosUsos.VDevolverMenusFactura_OK;
import Presentacion.Factura.VFacturaCasosUsos.VEditarFactura;
import Presentacion.Factura.VFacturaCasosUsos.VEditarFactura2;
import Presentacion.Factura.VFacturaCasosUsos.VEditarFactura_KO;
import Presentacion.Factura.VFacturaCasosUsos.VEditarFactura_OK;
import Presentacion.Factura.VFacturaCasosUsos.VEliminarMenusFactura;
import Presentacion.Factura.VFacturaCasosUsos.VEliminarMenusFactura_KO;
import Presentacion.Factura.VFacturaCasosUsos.VEliminarMenusFactura_OK;
import Presentacion.Factura.VFacturaCasosUsos.VMostrarFactura;
import Presentacion.Factura.VFacturaCasosUsos.VMostrarFactura_KO;
import Presentacion.Factura.VFacturaCasosUsos.VMostrarFactura_OK;
import Presentacion.Factura.VFacturaCasosUsos.VMostrarPorEmpleado;
import Presentacion.Factura.VFacturaCasosUsos.VMostrarPorMesa;
import Presentacion.Factura.VFacturaCasosUsos.VMostrarPor_KO;
import Presentacion.Factura.VFacturaCasosUsos.VMostrarTodasFacturas;
import Presentacion.Ingrediente.VIngrediente;
import Presentacion.Ingrediente.VIngredienteCasosUso.VAltaIngrediente;
import Presentacion.Ingrediente.VIngredienteCasosUso.VBajaIngrediente;
import Presentacion.Ingrediente.VIngredienteCasosUso.VModificarIngrediente;
import Presentacion.Ingrediente.VIngredienteCasosUso.VModificarIngrediente2;
import Presentacion.Ingrediente.VIngredienteCasosUso.VMostrarIngrediente;
import Presentacion.Ingrediente.VIngredienteCasosUso.VMostrarIngredientePorNombre;
import Presentacion.Ingrediente.VIngredienteCasosUso.VMostrarIngrediente_OK;
import Presentacion.Ingrediente.VIngredienteCasosUso.VMostrarTodosIngredientes;
import Presentacion.Launcher.VComidas;
import Presentacion.Launcher.VDialogo;
import Presentacion.Launcher.VPrincipal;
import Presentacion.Menu.VMenu;
import Presentacion.Menu.VMenuCasosDeUso.VAltaMenu;
import Presentacion.Menu.VMenuCasosDeUso.VAltaMenu_KO;
import Presentacion.Menu.VMenuCasosDeUso.VAltaMenu_OK;
import Presentacion.Menu.VMenuCasosDeUso.VAniadirProducto;
import Presentacion.Menu.VMenuCasosDeUso.VAniadirProducto_KO;
import Presentacion.Menu.VMenuCasosDeUso.VAniadirProducto_OK;
import Presentacion.Menu.VMenuCasosDeUso.VBajaMenu;
import Presentacion.Menu.VMenuCasosDeUso.VBajaMenu_KO;
import Presentacion.Menu.VMenuCasosDeUso.VBajaMenu_OK;
import Presentacion.Menu.VMenuCasosDeUso.VModificarMenu;
import Presentacion.Menu.VMenuCasosDeUso.VModificarMenu2;
import Presentacion.Menu.VMenuCasosDeUso.VMostrarMenu;
import Presentacion.Menu.VMenuCasosDeUso.VMostrarMenuRango;
import Presentacion.Menu.VMenuCasosDeUso.VMostrarMenu_KO;
import Presentacion.Menu.VMenuCasosDeUso.VMostrarMenu_OK;
import Presentacion.Menu.VMenuCasosDeUso.VMostrarTodosMenu;
import Presentacion.Menu.VMenuCasosDeUso.VQuitarProducto;
import Presentacion.Mesa.VMesa;
import Presentacion.Mesa.VMesaCasosUso.VAltaMesa;
import Presentacion.Mesa.VMesaCasosUso.VAltaMesa_KO;
import Presentacion.Mesa.VMesaCasosUso.VAltaMesa_OK;
import Presentacion.Mesa.VMesaCasosUso.VBajaMesa;
import Presentacion.Mesa.VMesaCasosUso.VBajaMesa_KO;
import Presentacion.Mesa.VMesaCasosUso.VBajaMesa_OK;
import Presentacion.Mesa.VMesaCasosUso.VModificarMesa;
import Presentacion.Mesa.VMesaCasosUso.VModificarMesa2;
import Presentacion.Mesa.VMesaCasosUso.VModificarMesa_KO;
import Presentacion.Mesa.VMesaCasosUso.VModificarMesa_OK;
import Presentacion.Mesa.VMesaCasosUso.VMostrarMesa;
import Presentacion.Mesa.VMesaCasosUso.VMostrarMesa_KO;
import Presentacion.Mesa.VMesaCasosUso.VMostrarMesa_OK;
import Presentacion.Mesa.VMesaCasosUso.VMostrarTodasMesas;
import Presentacion.Producto.VProducto;
import Presentacion.Producto.VProductoCasosDeUso.VAltaProducto;
import Presentacion.Producto.VProductoCasosDeUso.VAniadirIngrediente;
import Presentacion.Producto.VProductoCasosDeUso.VBajaProducto;
import Presentacion.Producto.VProductoCasosDeUso.VModificarProducto;
import Presentacion.Producto.VProductoCasosDeUso.VModificarProducto2;
import Presentacion.Producto.VProductoCasosDeUso.VMostrarProducto;
import Presentacion.Producto.VProductoCasosDeUso.VMostrarProductoPorNombre;
import Presentacion.Producto.VProductoCasosDeUso.VMostrarProducto_OK;
import Presentacion.Producto.VProductoCasosDeUso.VMostrarTodosProductos;
import Presentacion.Producto.VProductoCasosDeUso.VQuitarIngrediente;

public class FactoriaVistasImp extends FactoriaVistas {

	public IGUI createView(Context context) {
		switch (context.getEvento()) {
		// Principal
		case Events.ABRIR_VPRINCIPAL:
			return new VPrincipal();

		// COMIDA
		case Events.ABRIR_VCOMIDA:
			return new VComidas();

		// Empleado
		case Events.ABRIR_VEMPLEADO:
			return new VEmpleado();
		case Events.ABRIR_VMOSTRAR_UN_EMPLEADO:
			return new VMostrarEmpleado();
		case Events.MOSTRAR_UN_EMPLEADO_OK:
			return new VMostrarEmpleado_OK();
		case Events.MOSTRAR_UN_EMPLEADO_KO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.ABRIR_VMOSTRAR_EMPLEADO_TODOS:
			return new VMostrarTodosEmpleados();
		case Events.ABRIR_VALTA_EMPLEADO:
			return new VAltaEmpleado();
		case Events.ALTA_EMPLEADO_OK:
			return new VDialogo(JOptionPane.INFORMATION_MESSAGE, "Exito");
		case Events.ALTA_EMPLEADO_KO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.ABRIR_VBAJA_EMPLEADO:
			return new VBajaEmpleado();
		case Events.BAJA_EMPLEADO_OK:
			return new VDialogo(JOptionPane.INFORMATION_MESSAGE, "Exito");
		case Events.BAJA_EMPLEADO_KO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.ABRIR_VMODIFICAR_EMPLEADO:
			return new VModificarEmpleado();
		case Events.ABRIR_VMODIFICAR_EMPLEADO2:
			return new VModificarEmpleado2();
		case Events.MODIFICAR_EMPLEADO_OK:
			return new VDialogo(JOptionPane.INFORMATION_MESSAGE, "Exito");
		case Events.MODIFICAR_EMPLEADO_KO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.ABRIR_VMOSTRAR_EMPLEADO_RANGO:
			return new VMostrarEmpleadoRango();

		// Mesa
		case Events.ABRIR_VMESA:
			return new VMesa();

		case Events.ABRIR_VALTA_MESA:
			return new VAltaMesa();
		case Events.ALTA_MESA_OK:
			return new VAltaMesa_OK();
		case Events.ALTA_MESA_KO:
			return new VAltaMesa_KO();

		case Events.ABRIR_VBAJA_MESA:
			return new VBajaMesa();
		case Events.BAJA_MESA_OK:
			return new VBajaMesa_OK();
		case Events.BAJA_MESA_KO:
			return new VBajaMesa_KO();

		case Events.ABRIR_VMODIFICAR_MESA:
			return new VModificarMesa();
		case Events.ABRIR_VMODIFICAR_MESA2:
			return new VModificarMesa2();
		case Events.MODIFICAR_MESA_OK:
			return new VModificarMesa_OK();
		case Events.MODIFICAR_MESA_KO:
			return new VModificarMesa_KO();

		case Events.ABRIR_VMOSTRAR_UNA_MESA:
			return new VMostrarMesa();
		case Events.MOSTRAR_UNA_MESA_OK:
			return new VMostrarMesa_OK();
		case Events.MOSTRAR_UNA_MESA_KO:
			return new VMostrarMesa_KO();

		case Events.ABRIR_VMOSTRAR_MESA_TODAS:
			return new VMostrarTodasMesas();

		// Factura
		case Events.ABRIR_VFACTURA:
			return new VFactura();

		case Events.ABRIR_VALTA_FACTURA:
			return new VAltaFactura();
		case Events.ALTA_FACTURA_OK:
			return new VAltaFactura_OK();
		case Events.ALTA_FACTURA_KO:
			return new VAltaFactura_KO();

		case Events.ABRIR_VCERRAR_FACTURA:
			return new VCerrarFactura();
		case Events.CERRAR_FACTURA_OK:
			return new VCerrarFactura_OK();
		case Events.CERRAR_FACTURA_KO:
			return new VCerrarFactura_KO();

		case Events.ABRIR_VMOSTRAR_UNA_FACTURA:
			return new VMostrarFactura();
		case Events.MOSTRAR_UNA_FACTURA_OK:
			return new VMostrarFactura_OK();
		case Events.MOSTRAR_UNA_FACTURA_KO:
			return new VMostrarFactura_KO();

		case Events.ABRIR_VMODIFICAR_FACTURA:
			return new VEditarFactura();
		case Events.ABRIR_VMODIFICAR_FACTURA2:
			return new VEditarFactura2();
		case Events.MODIFICAR_FACTURA_OK:
			return new VEditarFactura_OK();
		case Events.MODIFICAR_FACTURA_KO:
			return new VEditarFactura_KO();

		case Events.ABRIR_VMOSTRAR_FACTURA_TODAS:
			return new VMostrarTodasFacturas();

		case Events.ABRIR_VMOSTRAR_POR_EMPLEADO:
			return new VMostrarPorEmpleado();
		case Events.ABRIR_VMOSTRAR_POR_MESA:
			return new VMostrarPorMesa();
		case Events.MOSTRAR_FACTURA_POR_KO:
			return new VMostrarPor_KO();

		case Events.ABRIR_VANIADIR_MENUS_FACTURA:
			return new VAnyadirMenusFactura();
		case Events.ANIADIR_MENUS_FACTURA_OK:
			return new VAnyadirMenusFactura_OK();
		case Events.ANIADIR_MENUS_FACTURA_KO:
			return new VAnyadirMenusFactura_KO();

		case Events.ABRIR_VELIMINAR_MENUS_FACTURA:
			return new VEliminarMenusFactura();
		case Events.ELIMINAR_MENUS_FACTURA_OK:
			return new VEliminarMenusFactura_OK();
		case Events.ELIMINAR_MENUS_FACTURA_KO:
			return new VEliminarMenusFactura_KO();

		case Events.ABRIR_VDEVOLVER_MENU:
			return new VDevolverMenusFactura();
		case Events.DEVOLVER_MENU_OK:
			return new VDevolverMenusFactura_OK();
		case Events.DEVOLVER_MENU_KO:
			return new VDevolverMenusFactura_KO();

		// MENU
		case Events.ABRIR_VMENU:
			return new VMenu();
		
		case Events.ABRIR_VALTA_MENU:
			return new VAltaMenu();
		case Events.ALTA_MENU_OK:
			return new VAltaMenu_OK();
		case Events.ALTA_MENU_KO:
			return new VAltaMenu_KO();
			
		case Events.ABRIR_VBAJA_MENU:
			return new VBajaMenu();
		case Events.BAJA_MENU_OK:
			return new VBajaMenu_OK();
		case Events.BAJA_MENU_KO:
			return new VBajaMenu_KO();
			
			
		case Events.ABRIR_VMODIFICAR_MENU:
			return new VModificarMenu();
		case Events.ABRIR_VMODIFICAR_MENU2:
			return new VModificarMenu2();			
		case Events.MODIFICAR_MENU_KO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.MODIFICAR_MENU_OK:
			return new VDialogo(JOptionPane.INFORMATION_MESSAGE, "Exito");

				
		case Events.ABRIR_VMOSTRAR_UN_MENU:
			return new VMostrarMenu();
		case Events.MOSTRAR_UN_MENU_OK:
			return new VMostrarMenu_OK();
		case Events.MOSTRAR_UN_MENU_KO:
			return new VMostrarMenu_KO();
			
		case Events.ABRIR_VMOSTRAR_MENU_TODOS:
			return new VMostrarTodosMenu();
			
		case Events.ABRIR_VMOSTRAR_MENU_RANGO:
			return new VMostrarMenuRango();
		case Events.MOSTRAR_MENU_RANGO_OK:
			return new VMostrarTodosMenu();
			
		case Events.ABRIR_VVINCULAR_PRODUCTO:
			return new VAniadirProducto();
		case Events.VINCULAR_PRODUCTO_NO_EXISTE_MENU:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.VINCULAR_PRODUCTO_NO_EXISTE_PRODUCTO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.VINCULAR_PRODUCTO_YA_VINCULADO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.VINCULAR_PRODUCTO_KO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.VINCULAR_PRODUCTO_OK:
			return new VDialogo(JOptionPane.INFORMATION_MESSAGE, "Exito");
			
			
		case Events.ABRIR_VDESVINCULAR_PRODUCTO:
			return new VQuitarProducto();
		case Events.DESVINCULAR_PRODUCTO_NO_EXISTE_MENU_NI_PRODUCTO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.DESVINCULAR_PRODUCTO_NO_VINCULADO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.DESVINCULAR_PRODUCTO_KO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.DESVINCULAR_PRODUCTO_OK:
			return new VDialogo(JOptionPane.INFORMATION_MESSAGE, "Exito");


		// Producto
		case Events.ABRIR_VPRODUCTO:
			return new VProducto();
		case Events.ABRIR_VMOSTRAR_UN_PRODUCTO:
			return new VMostrarProducto();
		case Events.MOSTRAR_UN_PRODUCTO_OK:
			return new VMostrarProducto_OK();
		case Events.MOSTRAR_UN_PRODUCTO_KO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.ABRIR_VMOSTRAR_PRODUCTO_TODOS:
			return new VMostrarTodosProductos();
		case Events.MOSTRAR_PRODUCTO_TODOS_OK:
			return new VDialogo(JOptionPane.INFORMATION_MESSAGE, "Exito");
		case Events.MOSTRAR_PRODUCTO_TODOS_KO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.ABRIR_VALTA_PRODUCTO:
			return new VAltaProducto();
		case Events.ALTA_PRODUCTO_OK:
			return new VDialogo(JOptionPane.INFORMATION_MESSAGE, "Exito");
		case Events.ALTA_PRODUCTO_KO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.ABRIR_VBAJA_PRODUCTO:
			return new VBajaProducto();
		case Events.BAJA_PRODUCTO_OK:
			return new VDialogo(JOptionPane.INFORMATION_MESSAGE, "Exito");
		case Events.BAJA_PRODUCTO_KO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.ABRIR_VMOSTRAR_UN_PRODUCTO_POR_NOMBRE:
			return new VMostrarProductoPorNombre();
		case Events.MOSTRAR_UN_PRODUCTO_POR_NOMBRE_OK:
			return new VMostrarProducto_OK();
		case Events.MOSTRAR_UN_PRODUCTO_POR_NOMBRE_KO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.ABRIR_VMODIFICAR_PRODUCTO:
			return new VModificarProducto();
		case Events.ABRIR_VMODIFICAR_PRODUCTO2:
			return new VModificarProducto2();
		case Events.MODIFICAR_PRODUCTO_OK:
			return new VDialogo(JOptionPane.INFORMATION_MESSAGE, "Exito");
		case Events.MODIFICAR_PRODUCTO_KO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.ABRIR_VVINCULAR_INGREDIENTE:
			return new VAniadirIngrediente();
		case Events.VINCULAR_INGREDIENTE_NO_EXISTE_PRODUCTO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.VINCULAR_INGREDIENTE_NO_EXISTE_INGREDIENTE:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.VINCULAR_INGREDIENTE_YA_VINCULADO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.VINCULAR_INGREDIENTE_KO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.DESVINCULAR_INGREDIENTE_NO_EXISTE_PRODUCTO_NI_INGREDIENTE:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.DESVINCULAR_INGREDIENTE_NO_VINCULADO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.DESVINCULAR_INGREDIENTE_KO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.DESVINCULAR_INGREDIENTE_OK:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.ABRIR_VDESVINCULAR_INGREDIENTE:
			return new VQuitarIngrediente();

		// Ingrediente
		case Events.ABRIR_VINGREDIENTE:
			return new VIngrediente();
		case Events.ABRIR_VMODIFICAR_INGREDIENTE:
			return new VModificarIngrediente();
		case Events.ABRIR_VMODIFICAR_INGREDIENTE2:
			return new VModificarIngrediente2();
		case Events.MODIFICAR_INGREDIENTE_OK:
			return new VDialogo(JOptionPane.INFORMATION_MESSAGE, "Exito");
		case Events.MODIFICAR_INGREDIENTE_KO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.ABRIR_VALTA_INGREDIENTE:
			return new VAltaIngrediente();
		case Events.ALTA_INGREDIENTE_OK:
			return new VDialogo(JOptionPane.INFORMATION_MESSAGE, "Exito");
		case Events.ALTA_INGREDIENTE_KO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.ABRIR_VBAJA_INGREDIENTE:
			return new VBajaIngrediente();
		case Events.BAJA_INGREDIENTE_OK:
			return new VDialogo(JOptionPane.INFORMATION_MESSAGE, "Exito");
		case Events.BAJA_INGREDIENTE_KO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.ABRIR_VMOSTRAR_UN_INGREDIENTE:
			return new VMostrarIngrediente();
		case Events.MOSTRAR_UN_INGREDIENTE_OK:
			return new VMostrarIngrediente_OK();
		case Events.MOSTRAR_UN_INGREDIENTE_KO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.ABRIR_VMOSTRAR_UN_INGREDIENTE_POR_NOMBRE:
			return new VMostrarIngredientePorNombre();
		case Events.MOSTRAR_UN_INGREDIENTE_POR_NOMBRE_OK:
			return new VMostrarIngrediente_OK();
		case Events.MOSTRAR_UN_INGREDIENTE_POR_NOMBRE_KO:
			return new VDialogo(JOptionPane.ERROR_MESSAGE, "Error");
		case Events.ABRIR_VMOSTRAR_INGREDIENTE_TODOS:
			return new VMostrarTodosIngredientes();
		case Events.MOSTRAR_INGREDIENTE_TODOS_OK:
			return new VDialogo(JOptionPane.INFORMATION_MESSAGE, "Exito");
		}

		return null;
	}
}