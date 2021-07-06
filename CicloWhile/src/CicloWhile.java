import java.util.Scanner;

public class CicloWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Ciclo while 
		 * while(condicion){
		 * codigo codigo
		 * }
		 * 
		 * Escribr un programa que pida 2 numeros por consola de manera 
		 * reiterada la ejecuion del programa terminara cuando los numeros
		 * ingresados sean iguales.
		 * 
		 * Nota: utiliza un ciclo while
		 */
		
		int primerNumero = 0;
		int segundoNumero = 0;
		Scanner leerNumero = new Scanner(System.in);
		
		do {
			System.out.println("Introduce tu primer numero:");
			primerNumero = leerNumero.nextInt();
			System.out.println("Introduce tu segundo numero:");
			segundoNumero = leerNumero.nextInt();
			
		} while(primerNumero != segundoNumero); 

		
		
		System.out.println("Tu primer numero: " + primerNumero + " es igual a "
				+ "tu segundo numero: " + segundoNumero);
		leerNumero.close();
		
		/**
		 * ciclo do while
		 * do{
		 * codigo codigo
		 * codigo
		 * 
		 * }while(condicion)
		 */
	}

}
