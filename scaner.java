package myfirstjavafile;

import java.util.Scanner;

public class scaner {
	public static void main(String args[]) {
//		-----------scaner---------------
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("integer:"+x);
		double y=sc.nextDouble();
		System.out.println("double:"+y);
		float z=sc.nextFloat();
		System.out.println("float:"+z);
		sc.nextLine();
		String b=sc.nextLine();
		System.out.println("string:"+b);
		
		
	}

}
