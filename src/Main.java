import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner Sc = new Scanner(System.in);
			String name = Sc.nextLine();
			Hello hello = new Hello();
			hello.setName(name);
			System.out.print(hello.getName());
		

	}

}
