import java.util.Scanner;

public class Meth2 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		//details("Anjana",27,"Kahapathwala");
		//details("Dilshan",29,"Galabawa");
		System.out.print("Input Num 1:");
		int num1 = input.nextInt();
		System.out.print("Input Num 2:");
		int num2 = input.nextInt();
		findTotal(num1,num2);
	}
	
	//public static void details(String Name,int age, String Village){
		
	//	System.out.println("My Name: "+Name);
	//	System.out.println("My Age: "+age);
	//	System.out.println("My Village: "+Village);
		//}
		
		public static void findTotal(int num1 , int num2){
			
			int total = num1+num2;
			System.out.println(num1+"+"+num2+"="+total);
			
			
			}
		
		
		
}

