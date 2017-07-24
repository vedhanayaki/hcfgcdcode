package player;

import java.util.Scanner;

public class HCF {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,hcf,t;
Scanner s=new Scanner (System.in);
int c=s.nextInt();
int d=s.nextInt();
a=c;
b=d;
while(b!=0){
	t=b;
	b=a%b;
	a=t;
}
hcf=a;
System.out.println("HCF is"+hcf);
}
}