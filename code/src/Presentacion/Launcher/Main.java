package Presentacion.Launcher;


import Presentacion.Command.Context;
import Presentacion.Controller.Controller;
import Presentacion.Controller.Events;
import Presentacion.FactoriaVistas.FactoriaVistas;
import Negocio.FactoriaNegocio.FactoriaSA;
import Negocio.Mesa.*;

public class Main {

	public static void main(String[] args) {
		Controller.obtenerInstancia().accion(Events.ABRIR_VPRINCIPAL, null);
		
	}

}
