package Presentacion;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Agregar extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public Agregar() {
		setClosable(true);
		setTitle("Agregar");
		setBounds(100, 100, 992, 497);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds
		(33, 41, 890, 390);
		getContentPane().add(panel);
		panel.setLayout(null);

	}
}
