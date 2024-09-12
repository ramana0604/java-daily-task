package myfirstjavafile;

import java.util.Scanner;

public class scaner {
	public static int x;
	public static double y;
	public static float z;
	public static String b;
	public static void main(String args[]) {
//		-----------scaner---------------
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		System.out.println("integer:"+x);
		 y=sc.nextDouble();
		System.out.println("double:"+y);
		 z=sc.nextFloat();
		System.out.println("float:"+z);
		sc.nextLine();
		b=sc.nextLine();
		System.out.println("string:"+b);
		
		
	}

}
