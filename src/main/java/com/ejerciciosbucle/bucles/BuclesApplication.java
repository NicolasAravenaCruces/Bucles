package com.ejerciciosbucle.bucles;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
import java.util.ArrayList;

@SpringBootApplication
public class BuclesApplication {
	

	//11. Escriba un programa que pida un número entero positivo de dos cifras por teclado y lo imprima en pantalla invertido.

	public static int invertido(int numero){

		int vuelta=0;
		while( numero > 0 ) {
         int resto = numero % 10;
         vuelta= (vuelta * 10) + resto;
         numero /= 10;
        }  
		return vuelta;

	} 

	//12. Escriba un programa que imprima en pantalla si un número dado por teclado es positivo, negativo o cero.

	public static void verificar(int numero){

		if(numero>0){
			System.out.println("Su numero es positivo");
		}
		else if (numero==0) {
			System.out.println("Su numero es 0");
		}
		else{
			System.out.println("Su numero es negativo");
		}

	}

	//13. Escriba un programa que lea un número del teclado e imprima en pantalla si es par o impar.

	public static void parImpar(int numero){
		if (numero %2 == 0) {
			System.out.println("Tu numero es par");
		}
		else{
			System.out.println("Tu numero es impar");
		}

	}

	// 14. Escriba un programa que imprima los números del 100 al 1 de dos en dos ejemplo 3,5,7,9,....

	public static void imprimir(){
		for (int i = 1; i <=100; i++) {
			if (i%2 !=0) {
				System.out.println(i);
			}
		}
	}

	// 15. Escriba un programa que imprima todos los números pares entre 0 y 100
	public static void imprimirPares(){
		for (int i = 1; i <=100; i++) {
			if (i%2 ==0) {
				System.out.println(i);
			}
		}
	}

	// 16. Escriba un programa que imprima la suma de los 100 primeros números naturales.

	public static void naturales(){
		int sumador=0;
		for (int i=0; i<=100; i++) {
			sumador=sumador+i;
		}
		System.out.println("La suma de los primeros 100 numeros naturales es de: "+ sumador);
	}

	//17. Escriba un programa que imprima los números impares entre dos extremos dados por el usuario y que además indique cuántos son.

	public static void rangoImpares(int inicio, int fin) {
		int contador = 0;
        int sumador = 0;
        int  rango=0;
        rango=inicio; // para mantener el incio sin modificar 
        while (rango <= fin) {
          if (rango % 2 != 0) {
             sumador = sumador + rango; // suma si el numero es impar 
             contador++; // cuenta cuantos se sumaron
			 System.out.println(rango);
            }
         rango++; //avanza en el rango
        }
        System.out.println("La suma total de los numeros impares en el rango entre "+inicio+ " y "+ fin+" es de : "+ sumador);
        System.out.println("En total fueron "+ contador+" de numeros sumados" );
	}

	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	//Ejercicios Array 

	// 1. Escriba un programa que permita imprimir en pantalla cada uno de los elementos del siguiente arreglo: [0, 28, 30, 10, 4].

	public static void imprimirArreglo (){
		ArrayList <Integer> arreglo = new ArrayList<Integer>();
        arreglo.add(0);
		arreglo.add(28);
		arreglo.add(30);
		arreglo.add(10);
		arreglo.add(4);
        
		for (int i = 0; i < arreglo.size(); i++) {
			System.out.println(arreglo.get(i));			
		}
	}

	// 2. Escriba un programa que permita imprimir al revés cada uno de los elementos del siguiente arreglo: [0, 28, 30, 10, 4].

	public static void imprimirRevez (){
		ArrayList <Integer> arreglo = new ArrayList<Integer>();
        arreglo.add(0);
		arreglo.add(28);
		arreglo.add(30);
		arreglo.add(10);
		arreglo.add(4);
		arreglo.reverse
        
		for (int i = 0; i< arreglo.size(); i++) {
			System.out.println(arreglo.get(i));			
		}
	}

	





	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		// ejercicio 11
		//System.out.println("Ingrese un numero de dos cifras ");
        //int numero = teclado.nextInt();
		// System.out.println("Tu numero invertido es: "+invertido(numero));

        // ejercicio 12
        /* System.out.print("Ingrese un numero a evaluar: ");
		int numero = teclado.nextInt();
		verificar(numero);*/

		//ejercicio 13
		/*System.out.print("Ingresa un numero: ");
		int numero= teclado.nextInt();
		parImpar(numero);*/

		//ejercicio 14
		//imprimir();

		//ejericio 15
		//imprimirPares();

        //ejercicio 16
		//naturales();

		//ejercicio 17
		/*System.out.print("Ingresa un incio de rango: ");
		int inicio = teclado.nextInt();
		System.out.print("Ingrese un final de rango: ");
		int fin = teclado.nextInt();
		rangoImpares(inicio, fin);*/

		//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

		//ejercicio 1 array

		imprimirRevez();















	}

}
