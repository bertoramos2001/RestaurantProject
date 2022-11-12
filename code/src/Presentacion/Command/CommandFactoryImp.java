/**
 * 
 */
package Presentacion.Command;

import Presentacion.Command.Empleado.CrearEmpleadoCommand;
import Presentacion.Command.Empleado.EditarEmpleado1Command;
import Presentacion.Command.Empleado.EditarEmpleado2Command;
import Presentacion.Command.Empleado.EliminarEmpleadoCommand;
import Presentacion.Command.Empleado.MostrarEmpleadosRangoCommand;
import Presentacion.Command.Empleado.MostrarTodosEmpleadoCommand;
import Presentacion.Command.Empleado.MostrarUnoEmpleadoCommand;
import Presentacion.Command.Factura.*;
import Presentacion.Command.Ingrediente.CrearIngredienteCommand;
import Presentacion.Command.Ingrediente.EditarIngrediente1Command;
import Presentacion.Command.Ingrediente.EditarIngrediente2Command;
import Presentacion.Command.Ingrediente.EliminarIngredienteCommand;
import Presentacion.Command.Ingrediente.MostrarTodosIngredienteCommand;
import Presentacion.Command.Ingrediente.MostrarUnoIngredienteCommand;
import Presentacion.Command.Ingrediente.MostrarUnoPorNombreIngredienteCommand;
import Presentacion.Command.Mesa.CrearMesaCommand;
import Presentacion.Command.Mesa.EditarMesa1Command;
import Presentacion.Command.Mesa.EditarMesa2Command;
import Presentacion.Command.Mesa.EliminarMesaCommand;
import Presentacion.Command.Mesa.MostrarTodosMesaCommand;
import Presentacion.Command.Mesa.MostrarUnoMesaCommand;
import Presentacion.Command.Producto.CrearProductoCommand;
import Presentacion.Command.Producto.DesvincularIngredienteProducto;
import Presentacion.Command.Producto.EditarProducto2Command;
import Presentacion.Command.Producto.EditarProductoCommand;
import Presentacion.Command.Producto.EliminarProductoCommand;
import Presentacion.Command.Producto.MostrarTodosProductosCommand;
import Presentacion.Command.Producto.MostrarUnoPorNombreProductoCommand;
import Presentacion.Command.Producto.MostrarUnoProductoCommand;
import Presentacion.Command.Producto.VincularIngredienteProducto;
import Presentacion.Command.Menu.*;
import Presentacion.Controller.Events;

public class CommandFactoryImp extends CommandFactory {

	@Override
	public Command getCommand(Integer event) {
		
		switch(event){
		//INGREDIENTE
		case Events.ALTA_INGREDIENTE:
			return new CrearIngredienteCommand();
		case Events.BAJA_INGREDIENTE:
			return new EliminarIngredienteCommand();
		case Events.MODIFICAR_INGREDIENTE:
			return new EditarIngrediente1Command();
		case Events.MODIFICAR_INGREDIENTE2:
			return new EditarIngrediente2Command();
		case Events.MOSTRAR_INGREDIENTE_TODOS:
			return new MostrarTodosIngredienteCommand();
		case Events.MOSTRAR_UN_INGREDIENTE:
			return new MostrarUnoIngredienteCommand();
		case Events.MOSTRAR_UN_INGREDIENTE_POR_NOMBRE:
			return new MostrarUnoPorNombreIngredienteCommand();
			
		// MESA
		case Events.ALTA_MESA:
			return new CrearMesaCommand();
		case Events.BAJA_MESA:
			return new EliminarMesaCommand();
		case Events.MOSTRAR_MESA_TODAS:
			return new MostrarTodosMesaCommand();
		case Events.MOSTRAR_UNA_MESA:
			return new MostrarUnoMesaCommand();
		case Events.MODIFICAR_MESA:
			return new EditarMesa1Command();
		case Events.MODIFICAR_MESA2:
			return new EditarMesa2Command();
			
		//EMPLEADO
		case Events.ALTA_EMPLEADO:
			return new CrearEmpleadoCommand();
		case Events.BAJA_EMPLEADO:
			return new EliminarEmpleadoCommand();
		case Events.MOSTRAR_EMPLEADO_TODOS:
			return new MostrarTodosEmpleadoCommand();
		case Events.MOSTRAR_UN_EMPLEADO:
			return new MostrarUnoEmpleadoCommand();	 
		case Events.MODIFICAR_EMPLEADO:
			return new EditarEmpleado1Command();
		case Events.MODIFICAR_EMPLEADO2:
			return new EditarEmpleado2Command();
		case Events.MOSTRAR_EMPLEADO_RANGO:
			return new MostrarEmpleadosRangoCommand();
			
		//FACTURA
		case Events.ALTA_FACTURA:
			return new AbrirFacturaCommand();
		case Events.CERRAR_FACTURA:
			return new CerrarFacturaCommand();
		case Events.MOSTRAR_UNA_FACTURA:
			return new MostrarFacturaCommand();
		case Events.MODIFICAR_FACTURA:
			return new EditarFactura1Command();
		case Events.MODIFICAR_FACTURA2:
			return new EditarFactura2Command();
		case Events.MOSTRAR_FACTURA_TODAS:
			return new MostrarFacturaTodasCommand();
		case Events.MOSTRAR_FACTURA_POR_EMPLEADO:
			return new MostrarFacturaPorEmpleadoCommand();
		case Events.MOSTRAR_FACTURA_POR_MESA:
			return new MostrarFacturaPorMesaCommand();
		case Events.ANIADIR_MENUS_FACTURA:
			return new AniadirMenusFacturaCommand();
		case Events.ELEGIR_MENUS_FACTURA:
			return new ElegirMenusAniadirMenusFacturaCommand();
		case Events.DEVOLVER_MENU:
			return new DevolverMenuCommand();
		case Events.ELIMINAR_MENUS_FACTURA:
			return new EliminarMenusFacturaCommand();
			
		//MENU
		case Events.MODIFICAR_MENU:
			return new EditarMenuCommand();
		case Events.MODIFICAR_MENU2:
			return new EditarMenuCommand2();
		case Events.ALTA_MENU:
			return new CrearMenuCommand();
		case Events.BAJA_MENU:
			return new EliminarMenuCommand();
		case Events.MOSTRAR_UN_MENU:
			return new MostrarUnoMenuCommand();	 
		case Events.MOSTRAR_MENU_TODOS:
			return new MostrarTodosMenusCommand();		
		case Events.DESVINCULAR_PRODUCTO:
			return new DesvincularProductoMenu();		
		case Events.VINCULAR_PRODUCTO:
			return new VincularProductoMenuCommand();				
		case Events.MOSTRAR_MENU_RANGO:
			return new MostrarMenusRangoCommand();
			
			
		//PRODUCTO
		case Events.ALTA_PRODUCTO:
			return new CrearProductoCommand();
		case Events.BAJA_PRODUCTO:
			return new EliminarProductoCommand();
		case Events.MOSTRAR_UN_PRODUCTO:
			return new MostrarUnoProductoCommand();
		case Events.MOSTRAR_PRODUCTO_TODOS:
			return new MostrarTodosProductosCommand();
		case Events.MODIFICAR_PRODUCTO:
			return new EditarProductoCommand();
		case Events.MODIFICAR_PRODUCTO2:
			return new EditarProducto2Command();
		case Events.VINCULAR_INGREDIENTE:
			return new VincularIngredienteProducto();
		case Events.DESVINCULAR_INGREDIENTE:
			return new DesvincularIngredienteProducto();
		case Events.MOSTRAR_UN_PRODUCTO_POR_NOMBRE:
			return new MostrarUnoPorNombreProductoCommand();	
		default:
			return null;
		}
		
		
	}
}