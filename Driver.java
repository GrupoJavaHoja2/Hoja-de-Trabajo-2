/**
 * 
 */

/**
 * @author Delbert Custodio -> 14246, Jonathan Aguirre -> 14349, Samuel Diaz -> 14083
 *
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Driver {
	
	public static void main (String args[] ){
		String DireccionArchivo;
		BufferedReader LectorBuffer;
		FileReader FileR;
		Calc Calcu;
		Scanner Scan = new Scanner(System.in);
		double resultado;
		
			
		try {
			System.out.println("Universidad del Valle de Guatemala \n Algoritmos y Estructuras de Datos\n");
			System.out.println("Seccion 10 \n Delbert Custodio, 14246 \n Jonathan Aguirre, 14349 \n Samuel Diaz, 14083");
	
			System.out.println();
	
			System.out.println("Por favor, ingrese la direccion de su archivo de texto: \n");
			System.out.println("Tomar en cuenta que si se encuentra en la misma carpeta que el main\n se puede escribir solo el nombre del archivo.");
	
			DireccionArchivo = Scan.nextLine();
	
			System.out.println(DireccionArchivo);
	
			Calcu = new Calc();
			
			Calcu.readFile(DireccionArchivo);
			System.out.println(Calcu.getLinea());
			
			resultado = Calcu.calcular();
			
			
		} catch (Exception io){
			System.out.println("Revise su string en postfix, es posible que \n exista una division dentro de 0 o que el \n formato ingresao sea incorrecto");
		}
			}

}