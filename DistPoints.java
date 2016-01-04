import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
import java.math.*;
public class DistPoints{
    public static void main(String[] args) throws IOException {
	Scanner ler = new Scanner(System.in);
	ler.useLocale(Locale.ENGLISH);
	double x1,x2,y1,y2,p1,p2,dist;
	x1=ler.nextDouble();
	y1=ler.nextDouble();
	x2=ler.nextDouble();
	y2=ler.nextDouble();
	//p1=Math.pow((x2-x1),2);
	//p2=Math.pow((y2-y1),2);
	dist=Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
		System.out.printf("%.4f\n",dist);
    }
}