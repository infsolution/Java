import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
public class MediaIdades{
public static void main(String []args){
		Scanner read = new Scanner(System.in);
		read.useLocale(Locale.ENGLISH);
		int next=0,ttl=0;
		double aver,count=0.0;
		while(next>=0){
			ttl=ttl+next;
			next=read.nextInt();
			if(next<0)
				break;
			count++;
		}
		aver=ttl/count;
		System.out.printf("%.2f",aver);
		}
}