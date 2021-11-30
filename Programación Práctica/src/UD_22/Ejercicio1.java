 /** @author: <vuestro nombre> */

package UD_22;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Escribe un número: ");
		int numeroFinal = in.nextInt();
		
		for (int i = 1; i<=numeroFinal; i++ ) {
			System.out.println(i);
		}

	}

}