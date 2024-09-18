package myfirstjavafile;
import java.util.Scanner;
public class ifUsedemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n1= new Scanner(System.in);
		System.out.println("enter your name:");
		String name=n1.nextLine();
		System.out.println("enter your age:");
		int age=n1.nextInt();
		
		if(age>90) {
			System.out.println("your not eligible for job");
		
		}
		else if(age<90) {
			System.out.println("your eligible for job");
		}
		else {
			System.out.println("eligible!");
		}
	}

}
