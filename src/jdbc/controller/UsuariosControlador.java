package jdbc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import jdbc.modelo.Usuarios;
import views.Login;
import views.MenuUsuario;

public class UsuariosControlador implements ActionListener{
	private Login vista;

	public UsuariosControlador(Login vista) {
		this.vista = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String nombre = vista.getName();
		String contraseña = vista.getContraseña();
		
		if(Usuarios.validarUsuario(nombre, contraseña)) {
			MenuUsuario menu = new MenuUsuario();
			menu.setVisible(true);
			vista.dispose();
		} else {
			JOptionPane.showMessageDialog(vista, "Usuario o Contraseña no validos");
		}
	}


	
}
