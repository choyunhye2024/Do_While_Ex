package com.dowhileExample;

import java.util.Scanner; //scanner을 사용하기위해 필요

public class DoWhileExample {

	public static void main(String[] args) {

		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");

		Scanner scanner = new Scanner(System.in); // scanner 생성
		String inputString;

		do {

			System.out.print(">");
			inputString = scanner.nextLine(); // 키보드로부터 읽기
			System.out.println(inputString);
		} while (!inputString.equals("q"));// 입력된 내용이 q가아니라면 계속 반복

		System.out.println();
		System.out.println("프로그램 종료");

	}
}
