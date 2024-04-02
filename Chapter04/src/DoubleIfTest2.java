/*
 * 작성일 : 2024년 3월 19일
 * 작성자 : 컴퓨터소프트웨어공학과 202195041 임준호
 * 설명 : 이중 if문 실습.
 * 		하나의 정수를 입력 받아 음수인지 확인하는 프로그램.
 * 
 * 
 * 문제분석 : 짝수 => 2로 나눈 나머지가 0이다.
 * 		  홀수 => 2로 나눈 나머지가 1이다. (0이 아니다)
 * 			if짝수 아니면(else) 홀수이다.
 * 			홀수 아니면 짝수이다.
 * 
 * 알고리즘 : 1.정수를 입력 받는다.
 * 			2.입력 받은 정수가 홀수인지 판단.
 * 			2-1. 00은 홀수이다. 출력.
 * 			3. 아니면
 * 			3-1. 00은 짝수이다 출력.
 */

import java.util.Scanner;

public class DoubleIfTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner 객체 생성
				Scanner stdIn = new Scanner(System.in);
				// 1. 정수를 입력 받는다.
				System.out.print("정수 입력 :");
				int num = stdIn.nextInt();
				
				// 2. 홀수인지 판단.
				if(num % 2 != 0) {
					System.out.println(num + "은(는) 홀수 입니다.");
				} // 홀수 판단 종료 지점
				else {
					System.out.println(num + "은(는) 짝수 입니다.");
				} // 아니면 (짝수 판단) 종료 지점.
			
				}

	}


