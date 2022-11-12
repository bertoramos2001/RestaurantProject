package Presentacion.Command.Ingrediente;

import Negocio.FactoriaNegocio.FactoriaSA;
import Negocio.Ingrediente.SAIngrediente;
import Negocio.Ingrediente.TIngrediente;
import Presentacion.Command.Command;
import Presentacion.Command.Context;
import Presentacion.Controller.Events;

public class MostrarUnoIngredienteCommand implements Command {

	@Override
	public Context executeCommand(Object data) {
		FactoriaSA fsa = FactoriaSA.getInstance();
		SAIngrediente saIngr = fsa.generarSAIngrediente();
		TIngrediente tIngr = saIngr.mostrarUno((Integer) data);
		
		Context resContext = null;
		String mensaje;
		if (tIngr != null) {
			resContext = new Context(Events.MOSTRAR_UN_INGREDIENTE_OK, tIngr);
		}
		else {
			mensaje = "No se ha podido leer el ingrediente";
			resContext = new Context(Events.MOSTRAR_UN_INGREDIENTE_KO, mensaje);
		}
		
		return resContext;
	}

}