import java.io.IOException;
import java.util.Scanner;
public class ValuesPar{
public static void main(String []args){
		Scanner read = new Scanner(System.in);
		int value,par=0;
		for(int i =0;i<5;i++){
			value=read.nextInt();
			if(value%2==0)
				par++;
		}
		System.out.printf("%d valores pares.\n",par);
		}
}