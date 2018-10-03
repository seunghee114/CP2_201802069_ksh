package star;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		int num;

		Scanner sc = new Scanner(System.in);
		System.out.print("몇 개의 줄로 별을 출력할까요?");
		num = sc.nextInt();

		if (num <= 0)
			num = 5;

		System.out.println("---1번---");
		for (int i = num; i > 0; i--) {
			for (int j = num - i + 1; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.print("몇 개의 줄로 별을 출력할까요?");
		num = sc.nextInt();

		if (num <= 0)
			num = 5;

		System.out.println("---2번---");
		for (int i = num; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.print("몇 개의 줄로 별을 출력할까요?");
		num = sc.nextInt();

		if (num <= 0)
			num = 9;

		System.out.println("---3번---");
		if (num % 2 != 0) {
			for (int i = num / 2; i >= 0; i--) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < num - 2 * i; k++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			for (int i = 1; i <= num / 2; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < num - 2 * i; k++) {
					System.out.print("*");
				}
				System.out.println("");

			}
		}

	}
}
