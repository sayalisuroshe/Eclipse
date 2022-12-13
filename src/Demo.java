import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer\n");
		int n = sc.nextInt();
		
		if(n%2==0)
		    System.out.println("Even number\n");
		else
			System.out.println("odd number\n");
		
		System.out.println("Enter a String\n");
		String s= sc.next();
		System.out.println(s);
		
		
	}

}
