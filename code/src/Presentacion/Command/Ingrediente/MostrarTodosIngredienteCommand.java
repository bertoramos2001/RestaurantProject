package Presentacion.Command.Ingrediente;

import java.util.Collection;

import Negocio.FactoriaNegocio.FactoriaSA;
import Negocio.Ingrediente.SAIngrediente;
import Negocio.Ingrediente.TIngrediente;
import Presentacion.Command.Command;
import Presentacion.Command.Context;
import Presentacion.Controller.Events;

public class MostrarTodosIngredienteCommand implements Command {

	@Override
	public Context executeCommand(Object data) {
		FactoriaSA fsa = FactoriaSA.getInstance();
		SAIngrediente saIngr = fsa.generarSAIngrediente();
		
		Collection<TIngrediente> ingredientes = saIngr.mostrarTodos();
		Context resContext = new Context(Events.MOSTRAR_INGREDIENTE_TODOS_OK, ingredientes);
		
		return resContext;
	}
	
}