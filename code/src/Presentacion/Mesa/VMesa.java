package Presentacion.Mesa;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import Presentacion.Controller.Controller;
import Presentacion.Controller.Events;
import Presentacion.Controller.IGUI;


public class VMesa extends JFrame implements IGUI {
	
	private final Dimension ButtDim = new Dimension(150, 50);
	private final Dimension FrameDim = new Dimension(500, 180);
	private JButton returnButton;
	private Controller ctrl;

	public VMesa() {
		super("Vista Mesa");
		ctrl = Controller.obtenerInstancia();
		initGUI();
	}
	
	public void initGUI(){
		JPanel mainPanel = new JPanel(new BorderLayout());
		setPreferredSize(FrameDim);
		setContentPane(mainPanel);
		
		JPanel botonesPanel = new JPanel();
		mainPanel.add(botonesPanel);
		//RETURN BUTTON
		returnButton= new JButton("RETURN");
		returnButton.setPreferredSize(new Dimension(150, 50));
		returnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ctrl.accion(Events.ABRIR_VPRINCIPAL, null);
			}
		});
		botonesPanel.add(returnButton);
		botonesPanel.add(crearButton());
		botonesPanel.add(editarButton());
		botonesPanel.add(eliminarButton());
		botonesPanel.add(mostUnoButton());
		botonesPanel.add(mostTodosButton());
		
		pack();
		setLocationRelativeTo(getParent());
		setVisible(true);
	}
	//CREAR BUTTON
	JButton crearButton(){
		JButton crearB = new JButton("CREAR");
		crearB.setPreferredSize(ButtDim);
		crearB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.accion(Events.ABRIR_VALTA_MESA, null);
				setVisible(false);
			}
		});
		return crearB;
	}
	//ELIMINAR BUTTON
	JButton eliminarButton(){
		JButton eliminarB = new JButton("ELIMINAR");
		eliminarB.setPreferredSize(ButtDim);
		eliminarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.accion(Events.ABRIR_VBAJA_MESA, null);
				setVisible(false);
			}
		});
		return eliminarB;
	}
	//EDITAR BUTTON
	JButton editarButton(){
		JButton editarB = new JButton("EDITAR");
		editarB.setPreferredSize(ButtDim);
		editarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.accion(Events.ABRIR_VMODIFICAR_MESA, null);
				setVisible(false);
			}
		});
		return editarB;
	}
	//MOSTRAR UNO BUTTON
	JButton mostUnoButton(){
		JButton mostUnoB = new JButton("MOSTRAR UNA");
		mostUnoB.setPreferredSize(ButtDim);
		mostUnoB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.accion(Events.ABRIR_VMOSTRAR_UNA_MESA, null);
				setVisible(false);
			}
		});
		return mostUnoB;
	}
	//MOSTRAR TODOS BUTTON
	JButton mostTodosButton(){
		JButton mostTodosB = new JButton("MOSTRAR TODAS");
		mostTodosB.setPreferredSize(ButtDim);
		mostTodosB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ctrl.accion(Events.MOSTRAR_MESA_TODAS, null);
					setVisible(false);
				}
			});
		return mostTodosB;
	}
	
	public void update(Object data) {
		
	}
}