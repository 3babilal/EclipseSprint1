package test;
import java.util.Scanner;
public class menu {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String codigo="";
		System.out.println("Introduce una palabra :");
		String palabra = sc.nextLine();
		palabra.toUpperCase();
		System.out.println(palabra);
		for(int i = 0; i<palabra.length(); i++) {
			char letra = palabra.charAt(i);	
			//System.out.println("letra "+letra);
			for(int x = 0; x<txt.length(); x++) {
				char letraComparar = txt.charAt(x);
				if(letra == letraComparar)
				{
					System.out.println(letra);
				}
				 
			}
			
		}
		
		System.out.println(codigo);
	}

}
