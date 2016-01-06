import java.io.IOException;
import java.util.Scanner;
public class TypeComb{
	public static void main(String []args){
		Scanner read = new Scanner(System.in);
		int end=0,gas=0,alc=0,dies=0;
		while(end!=4){
			end=read.nextInt();
			switch(end){
				case 1:
					alc++;
					break;
				case 2:
					gas++;
					break;
				case 3:
					dies++;
					break;
			}
		}
		System.out.printf("MUITO OBRIGADO\n");
		System.out.printf("Alcool: %d\n",alc);
		System.out.printf("Gasolina: %d\n",gas);
		System.out.printf("Diesel: %d\n",dies);
		}
}