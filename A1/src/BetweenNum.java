import java.util.Scanner;

public class BetweenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			   
			   Scanner input = new Scanner(System.in);
			   
			   System.out.println("Please enter first value: ");
			   int num1 = input.nextInt();
			   
			   System.out.println("Please enter second value: ");
			   int num2 = input.nextInt();
			   
			   System.out.println("The numbers between " + num1 + " and " + num2  +" are: ");
			   
			   for(int i = num1;num1<=num2;num1++)
			   {
			   System.out.print(num1 + " ");
			   }
			   

	}

}
