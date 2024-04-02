/*
 * 작성일 : 2024년 3월 22일
 * 작성자 : 컴퓨터소프트웨어공학과 202195041 임준호
 * 설명 : 내포된 if문 실습.
 * 		점수를 입력받아 학점을 출력하시오
 * 		점수는 0-100점 사이입니다.
 * 		점수 범위를 벗어나면 "잘못된 점수 입니다." 출력하시오
 * 
 * 
 * 문제분석 : 입력받은 점수가 0-100 사이인가?
 * 			점수가 0-100 사이가 아니면?
 * 			90점 이상이면 A학점
 * 			80점 이상이면 B학점
 * 			70점 이상이면 C학점
 * 			60점 이상이면 D학점
 * 			60점 미안이면 F학점
 *
 * 
 * 알고리즘 : 1. 점수를 입력 받는다.
 * 			2.if 점수의 범위가 0-100 사이인가?
 * 			1)A
 * 			2)B
 * 			  :
 * 
 * 			3. else 아닌가?
 * 			3-1. "잘못된 점수 입니다." 출력
 * 	
 */

import java.util.Scanner;

public class NestedIfTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		// 1. 정수를 입력 받는다.
		System.out.print("점수 입력 :");
		int score = stdIn.nextInt();
		
		if (score >= 80)
		{
			System.out.println("우수 학점군 입니다.");
		if (score >= 90)
			System.out.println("A 학점입니다.");
		else
			System.out.println("B 학점입니다.");
		{
		 
		}
		if (score >= 60)
		{
			System.out.println("보통 학점군에 속합니다.");
			if (score >= 70)
				System.out.println("C 학점입니다.");
			else
				System.out.println("D 학점입니다.");
		}

		{
	
		
			
		}
		}
		
				
		
		 
		}

	}


