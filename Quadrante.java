 import java.util.Scanner;
 public class Quadrante {
 
 public static void main(String[] args) {
        // TODO code application logic here
         Scanner read = new Scanner(System.in);
        int x=1,y=1;
        while(x!=0 && y!=0){
        x=read.nextInt();
        y=read.nextInt();
        position(x,y);}
    } 
    public static void position(int x,int y){
    if(x>0 && y>0)
            System.out.println("primeiro");
        if(x<0 && y>0)
            System.out.println("segundo");
        if(x<0 && y<0)
            System.out.println("terceiro");
        if(x>0 && y<0)
            System.out.println("quarto");
    }
}