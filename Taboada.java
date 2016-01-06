import java.io.IOException;
import java.util.Scanner;
public class Taboada{
	public static void main(String []args){
		Scanner read = new Scanner(System.in);
		int n=read.nextInt();
		for(int i=1;i<=10;i++){
			System.out.printf("%d X %d = %d\n",i,n,i*n);
		}

		
		}
		
}