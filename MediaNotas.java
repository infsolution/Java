import java.util.Locale;
import java.util.Scanner;


public class MediaNotas {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.ENGLISH);
        double nota1,nota2;
        nota1=read.nextDouble();
        while(!validaNota(nota1)){
        nota1=read.nextDouble();
        }
        nota2=read.nextDouble();
        while(!validaNota(nota2)){
        nota2=read.nextDouble();
        }
        double media=media(nota1,nota2);
        System.out.printf("media = %.2f\n",media);
    }
    static boolean validaNota(double nota){
        boolean ret=false;
        if(nota>=0 && nota<=10)
                ret= true;
        else{System.out.printf("Nota invalida\n");}
        return ret;
    }
    static double media(double not1, double not2){   
        return (not1+not2)/2;
    }
}
