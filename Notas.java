import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
public class Notas{
	public static void main(String []args){
		Scanner read = new Scanner(System.in);
        read.useLocale(Locale.ENGLISH);
        int partInt=0, restInt=0,not;
        double partDec;
        double value = read.nextDouble(); 
        partInt=(int)value;
        partDec=(value-partInt)*100;
        int partDecInt=(int)partDec;
        System.out.println(partDecInt);
        int valueCed[]={100,50,20,10,5,2} ;
        System.out.println("NOTAS: ");
        for(int i=0;i<6;i++){
            restInt=partInt%valueCed[i];
            not=partInt/valueCed[i];
            partInt=restInt;
        System.out.printf("%d nota(s) de R$ %d.00\n",not,valueCed[i]);}
        System.out.println("MOEDAS: ");
        System.out.printf("%d moeda(s) de R$ 1.00\n",restInt);
        int valueMoe[]={50,25,10,5,1};
        restInt=0;not=0;partInt=0;
        for(int i=0;i<5;i++){
            restInt=partDecInt%valueMoe[i];
            not=partDecInt/valueMoe[i];
            partDecInt=restInt;
        System.out.printf("%d moeda(s) de R$ 0.%d\n",not,valueMoe[i]);}
    }
}