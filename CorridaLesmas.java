import java.io.IOException;
import java.util.Scanner;
public class CorridaLesmas{
	public static void main(String []args){
		Scanner read = new Scanner(System.in);
		int cas, velo;
		cas=0;
		while(cas>=0){
			int mVelo=0;
			cas=read.nextInt();
			if(cas<0)
				break;
			for(int i=1;i<=cas;i++){
				velo=read.nextInt();
				if(velo>mVelo)
					mVelo=velo;
			}
			if(mVelo<10)
				System.out.printf("%d\n",1);
			if(mVelo>=10 && mVelo<20)
				System.out.printf("%d\n",2);
			if(mVelo>=20)
				System.out.printf("%d\n",3);
		}
	}
}