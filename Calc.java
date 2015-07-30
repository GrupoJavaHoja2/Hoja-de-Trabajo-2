import java.util.*;
import java.io.*;

public class Calc implements ADTCalculadora<Double>{
	
	private int resultado;
	private String everything;

	private Stack1 Pila;
	
	public Calc(){
		Pila = new Stack1();
		Pila.empty();
	}
	
	public void readFile(String file) throws FileNotFoundException{
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = null;
			try {
				line = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        try {
					line = br.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		    everything = sb.toString();
		} finally {
		    try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		}
	}
	
	public Double calcular(){
		double resultado = 0;
		double resultado2;
		for (int cont = 0; cont < everything.length();cont++){
			
			if (everything.charAt(cont) == '1'  ){
				Pila.push(1.0);
			}
			if (everything.charAt(cont)== '2'){
				Pila.push(2.0);
			}
			if (everything.charAt(cont) == '3'  ){
				Pila.push(3.0);
			}
			if (everything.charAt(cont)=='4'){
				Pila.push(4.0);
			}
			if (everything.charAt(cont) == '5'  ){
				Pila.push(5.0);
			}
			if (everything.charAt(cont)=='6'){
				Pila.push(6.0);
			}
			if (everything.charAt(cont) == '7'  ){
				Pila.push(7.0);
			}
			if (everything.charAt(cont)=='8'){
				Pila.push(8.0);
			}
			if (everything.charAt(cont) == '9'  ){
				Pila.push(9.0);
			}
			
			if (everything.charAt(cont) == '+'){
				try {
					resultado = Pila.pop() + Pila.pop();
					Pila.push(resultado);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//Try
			}//If
			
			if (everything.charAt(cont) == '-'){
				try {
					resultado = Pila.pop() - Pila.pop();
					Pila.push(resultado);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//Try
			}//If
			
			if (everything.charAt(cont) == '*'){
				try {
					resultado = Pila.pop() * Pila.pop();
					Pila.push(resultado);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//Try
			}//If
			
			if (everything.charAt(cont) == '/'){
				try {
					resultado = Pila.pop() ;
					resultado2 = Pila.pop();
					if (resultado2 == 0){
						return null;
						}
					else{
						resultado = resultado / resultado2;
						Pila.push(resultado);
					}
					Pila.push(resultado);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//Try
			}//If
			
			
		}
		
		return  resultado;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	public String getLinea(){
		return everything;
	}
	
	
}