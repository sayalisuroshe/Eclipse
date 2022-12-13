import java.util.Scanner;
public class FormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter string and integer");
		String s = sc.next();
		int a = sc.nextInt();
		System.out.printf("%15s%3d", s,a);

	}
}
