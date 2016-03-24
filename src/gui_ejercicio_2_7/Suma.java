package gui_ejercicio_2_7;

import javax.swing.JOptionPane;

// Programa que muestra la suma de dos enteros utilizando GUI del paquete JOptionPane

public class Suma {

	public static void main(String[] args) {
		
		String numero1S = JOptionPane.showInputDialog("Ingrese el primer entero");
		int numero1 = Integer.parseInt(numero1S); // Se formatea el valor de numero1S a un entero
		String numero2S = JOptionPane.showInputDialog("Ingrese el segundo entero");
		int numero2 = Integer.parseInt(numero2S); // Se formatea el valor de numero2S a un entero
		
		int suma = numero1 + numero2; // Se suman los dos enteros
		
		String mensaje = String.format("La suma de los dos enteros es: \n%S ", suma);
		
		JOptionPane.showMessageDialog(null, mensaje);		
		

	} //Fin del main

} //Fin de la clase Suma
