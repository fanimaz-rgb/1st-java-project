package HelloWorld;

import java.util.Scanner;

public class exercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("name:");
		String name = sc.nextLine();
		while (name.isEmpty()) {
			System.out.println("Name cannot be blank");
			name = sc.nextLine();
		}

		System.out.println("surname");
		String surname = sc.nextLine();
		while (surname.isEmpty()) {
			System.out.println("Surname cannot be blank");
			surname = sc.nextLine();
		}

		System.out.println("AM");
		String AM = sc.nextLine();
		while (AM.isEmpty()) {
			System.out.println("AM cannot be blank");
			AM = sc.nextLine();
		}

		int examgrade, exgrade, a1, a2, a3;

		System.out.println("grade of exam");
		examgrade = sc.nextInt();
		while (examgrade < 0 || examgrade > 10) {
			System.out.println("grade is not between 0 and 10");
			examgrade = sc.nextInt();
		}

		System.out.println("grade of exersice");
		exgrade = sc.nextInt();
		while (exgrade < 0 || exgrade > 10) {
			System.out.println("grade is not between 0 and 10");
			exgrade = sc.nextInt();

		}

		System.out.println("Βαθμός ασκ.1:");
		a1 = sc.nextInt();
		while (a1 < 0 || a1 > 10) {
			System.out.println("grade is not between 0 and 10");
			a1 = sc.nextInt();
		}

		System.out.println("Βαθμός ασκ.2:");
		a2 = sc.nextInt();
		while (a2 < 0 || a2 > 10) {
			System.out.println("grade is not between 0 and 10");
			a2 = sc.nextInt();

		}

		System.out.println("Βαθμός ασκ.3:");
		a3 = sc.nextInt();
		while (a3 < 0 || a3 > 10) {
			System.out.println("grade is not between 0 and 10");
			a3 = sc.nextInt();
		}

		double MO = (a1 + a2 + a3) / 3.0;

		System.out.println("Student info");
		System.out.println("Name: " + name);
		System.out.println("Surname: " + surname);
		System.out.println("AM: " + AM);
		System.out.println("Exam grade: " + examgrade);
		System.out.println("Project grade: " + exgrade);
		System.out.println("Exercise 1: " + a1);
		System.out.println("Exercise 2: " + a2);
		System.out.println("Exercise 3: " + a3);

		if (examgrade >= 5) {
			double finalgrade = examgrade * 0.8 + exgrade * 0.2 + MO * 0.1;
			// Επειδή το συνολικό ποσοστό βγαίνει 110% κάνουμε έλεγχο του τελικού βαθμού
			if (finalgrade > 10) {
				finalgrade = 10;
			}
			System.out.println("the final grade is:" + finalgrade);
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		sc.close();
	}

}
	
