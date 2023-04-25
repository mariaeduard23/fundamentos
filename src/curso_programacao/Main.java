package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1, s2, s3;
		int x;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();

	}

}





/*	String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");

		System.out.printf("%s, wich price is $ %.2f%n", product1, price1 );
		System.out.printf("%s, wich price is $ %.2f%n", product2, price2 );
		System.out.println();
		System.out.printf("Record: %d, years old, code $d, and gender: %c%n", age, code, gender);
		System.out.println();
		System.out.printf("Masue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded:  %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal poin: %.3f%n", measure);
		
		
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();	
		System.out.println("DADOS DIGITADOS: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
*/



