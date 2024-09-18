package myfirstjavafile;
import java.util.Scanner;
public class numberChekking {

	public static void main(String[] args) {
		
		Scanner n=new Scanner(System.in);
		System.out.println("enter");
		int num=n.nextInt();
		if(num>0) {
			System.out.println("positive number");
		}
		else if(num<0) {
			System.out.println("negative");
		}
		else {
			System.out.println("the number is zero");
		}

	}

}
