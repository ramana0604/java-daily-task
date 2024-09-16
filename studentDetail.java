package myfirstjavafile;
import java.util.Scanner;
class student{
	int std_id;
	String std_name;
	float tamil;
	float english;
	float maths;
	float science;
	float social_science;
	void insertId(int id,String name)
	{
		std_id=id;
		std_name=name;
		
		
	}
	 

	void insert(float sub1,float sub2,float sub3,float sub4,float sub5)//parameters
	 {
		 tamil=sub1;
	     english=sub2;
		 maths=sub3;
	     science=sub4;
		 social_science=sub5;}
	

	 void disply() {
//		 System.out.println("subject"+tamil+english+maths+science+social_science);
		 System.out.println("\n-------------------");
			System.out.println("Student Details");
			System.out.println("-------------------");
			System.out.println("ID    :"+std_id);
			System.out.println("Name  :"+std_name);
			System.out.println("\n-------------------");
			System.out.println("Mark Details");
			System.out.println("-------------------");
			System.out.println("Tamil         :"+tamil);
			System.out.println("English       :"+english);
			System.out.println("Maths         :"+maths);
			System.out.println("Science       :"+science);
			System.out.println("Social Science:"+social_science);
			System.out.println("s-------------------");

	 }
	
	void Average() {
		float averag=(tamil+english+maths+science+social_science)/5;//formula for average"
		System.out.println("average is:"+averag );
	}
	void Sum() {
		float sum=tamil+english+maths+science+social_science;
		System.out.println("sum is:"+sum);
	}
}
public class studentDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student avg=new student();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id:");
		int id=sc.nextInt();
		System.out.println("enter name:");
		String name=sc.next();
		System.out.println("enter the mark in tamil:");
		float sub1=sc.nextFloat();
		System.out.println("enter the mark in english:");
		float sub2=sc.nextFloat();
		System.out.println("enter the mark in maths:");
		float sub3=sc.nextFloat();
		System.out.println("enter the mark in science");
		float sub4=sc.nextFloat();
		System.out.println("enter the value in social science");
		float sub5=sc.nextFloat();
    	avg.insert(sub1, sub2, sub3, sub4, sub5);
    	avg.insertId(id,name);
		avg.Average();
		avg.Sum();	
		avg.disply();
		
	}

}
