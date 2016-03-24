package gui_3_9;

import javax.swing.JOptionPane;

// Entrada basica con un cuadro de dialogo

public class DialogoNombre 
{

	public static void main(String[] args) 
	{
		
		// Pide al usuario que escriba su nombre
		String nombre = JOptionPane.showInputDialog( "Cual es tu nombre" );
		
		// Crea el mensaje
		String mensaje = String.format( "Bienvenido, %s, a la programación en Java!" , nombre);
		
		// Muestra el mensaje para dar la bienvenida al usuario por su nombreç
		JOptionPane.showMessageDialog(null, mensaje);

	} // Fin del Main

} // Fin de la clase DialogoNombre
