package HelloWorld;

import java.util.Scanner;

public class scannerexample {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Give an integer:");
	int i = sc.nextInt();
	System.out.println("you gave:" +i);
	
	System.out.println("Give me your name:");
	String name=sc.next();
	System.out.println("Hello:" +name);
	
	sc.close();
	
	
}
}
