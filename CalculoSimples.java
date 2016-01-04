import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
	Scanner ler = new Scanner(System.in);
	String nums[];
	double total=0.0,ttpc=0.0,valor=0.0;
	int qnt=0;
	for(int i =1;i<=2;i++){
		nums=ler.nextLine().split(" ");
		qnt=Integer.parseInt(nums[1]);
		valor=Double.parseDouble(nums[2]);
		ttpc=qnt*valor;
		total=total+ttpc;
	}
		System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
	
    }
 
}