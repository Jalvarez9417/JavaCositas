package paquete;

import java.util.Scanner;

public class LongitudMayorAMenor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Dime una Ciudad");
		String c1 = scanner.nextLine();
		System.out.println("Dime una Ciudad");
		String c2 = scanner.nextLine();
		System.out.println("Dime una Ciudad");
		String c3 = scanner.nextLine();

		Integer l1 = c1.length();
		Integer l2 = c2.length();
		Integer l3 = c3.length();

		if (l1 > l2) {
			if (l1 > l3) {
				if (l2 > l3) {
					System.out.println(c1);
					System.out.println(c2);
					System.out.println(c3);
				}
			}
		} else if (l1 > l2) {
			if (l1 > l3) {
				if (l3 > l2) {
					System.out.println(c1);
					System.out.println(c3);
					System.out.println(c2);
				}
			}
		}else if (l3 > l2) {
			if (l3 > l1) {
				if (l2 > l1) {
					System.out.println(c3);
					System.out.println(c2);
					System.out.println(c1);
				}
			}
		} else if (l3 > l2) {
			if (l3 > l1) {
				if (l1 > l2) {
					System.out.println(c3);
					System.out.println(c1);
					System.out.println(c2);
				}
			}
		}else if (l2 > l1) {
			if (l2 > l3) {
				if (l1 > l3) {
					System.out.println(c2);
					System.out.println(c1);
					System.out.println(c3);
				}
			}
		}else if (l2 > l1) {
			if (l2 > l3) {
				if (l3 > l1) {
					System.out.println(c2);
					System.out.println(c3);
					System.out.println(c1);
				}
			}
		}
		scanner.close();
	}
}
