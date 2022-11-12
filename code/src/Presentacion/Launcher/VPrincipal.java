package Presentacion.Launcher;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Presentacion.Command.Context;
import Presentacion.Controller.Controller;
import Presentacion.Controller.Events;
import Presentacion.Controller.IGUI;
import Presentacion.Mesa.VMesa;

public class VPrincipal extends JFrame implements IGUI {
	private JButton factButton;
	private JButton mesaButton;
	private JButton comidaButton;
	private JButton emplButton;

	private Controller ctrl;
	public VPrincipal() {
		super("Restaurante");
		ctrl = Controller.obtenerInstancia();
		initGUI();
	}

	public void initGUI() {
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.setPreferredSize(new Dimension(700, 200));
		setContentPane(mainPanel);

		JPanel botonesPanel = new JPanel();
		botonesPanel.setPreferredSize(new Dimension(700, 300));
		mainPanel.add(botonesPanel, BorderLayout.CENTER);

		// FACTURA BUTTON
		factButton = new JButton("FACTURAS");
		factButton.setPreferredSize(new Dimension(100, 50));
		factButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
  				ctrl.accion(Events.ABRIR_VFACTURA, null);
				setVisible(false);
			}
		});
		botonesPanel.add(factButton);

		// MESA BUTTON
		mesaButton = new JButton("MESAS");
		mesaButton.setPreferredSize(new Dimension(100, 50));
		mesaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
  				ctrl.accion(Events.ABRIR_VMESA, null);
				setVisible(false);
			}
		});
		botonesPanel.add(mesaButton);

		// COMIDA BUTTON
		comidaButton = new JButton("COMIDAS");
		comidaButton.setPreferredSize(new Dimension(100, 50));
		comidaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.accion(Events.ABRIR_VCOMIDA, null);
				setVisible(false);
			}
		});
		botonesPanel.add(comidaButton);
		

		// EMPL BUTTON
		emplButton = new JButton("EMPLEADOS");
		emplButton.setPreferredSize(new Dimension(150, 50));
		emplButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.accion(Events.ABRIR_VEMPLEADO, null);
				setVisible(false);
			}
		});
		botonesPanel.add(emplButton);

		setLocation(Toolkit.getDefaultToolkit().getScreenSize().width/2 - 350,Toolkit.getDefaultToolkit().getScreenSize().height/2 - 100);
		setVisible(true);
		pack();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}


	@Override
	public void update(Object data) {
		// TODO Auto-generated method stub
		
	}


}