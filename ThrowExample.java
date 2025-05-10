import java.util.Scanner;
public class ThrowExample{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	try	{
	System.out.print("enter your age");
	int age = scanner.nextInt();

	if(age<0){
	throw new IllegalArgumentException("Age cannot be nagetive");
		}
	System.out.println("Your age is: "+age);
	}
	catch(IllegalArgumentException e){
		System.out.println("Exception caught:"+e.getMessage());
		}
	}
}