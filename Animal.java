import java.io.IOException;
import java.util.Scanner;
public class Animal{
	public static void main(String []args){
		Scanner read = new Scanner(System.in);
		String filo, classe,cadeia;
			filo=read.nextLine();
			classe=read.nextLine();
			cadeia=read.nextLine();
		if(filo.equals("vertebrado")){
			if(classe.equals("ave")){
				if(cadeia.equals("carnivoro")){
				System.out.println("aguia");
			}else if(cadeia.equals("onivoro")){
			System.out.println("pomba");	
			}
			}else if(classe.equals("mamifero")){
				if(cadeia.equals("onivoro")){
				System.out.println("homem");
			}else if(cadeia.equals("herbivoro")){
				System.out.println("vaca");
			}
			}
		}else if(filo.equals("invertebrado")){
			if(classe.equals("inseto")){
				if(cadeia.equals("hematofago")){
				System.out.println("pulga");
			}else if(cadeia.equals("herbivoro")){
				System.out.println("lagarta");
			}
			}else if(classe.equals("anelidio")){
				if(cadeia.equals("hematofago")){
				System.out.println("sanguessuga");
			}else if(cadeia.equals("onivoro")){
				System.out.println("minhoca");
			}
			}
		}
}
}