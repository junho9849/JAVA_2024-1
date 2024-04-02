/*
 * 작성일 : 2024년 3월 19일
 * 작성자 : 컴퓨터소프트웨어공학과 202195041 임준호
 * 설명 : 다중 if문 실습.
 * 		점수를 입력받아 학점을 출력하시오
 * 
 * 
 * 문제분석 : 90점 이상이면 A학점
 * 			80점 이상이면 B학점
 * 			70점 이상이면 C학점
 * 			60점 이상이면 D학점
 * 			50점 이상이면 F학점
 * 			정수는 정수로 입력 받는다.
 *
 * 
 * 알고리즘 : 1.정수를 입력 받는다.
 * 			2.점수가 90점 이상인가?
 * 			2-1. A학점입니다. 출력
 * 			3.아니면 점수가 80점 이상인가?
 * 			3-1. B학점입니다. 출력
 * 			4. 아니고 점수가 70점 이상인가?
 * 			4-1. C학점 입니다.출력
 * 			5. 아니고 점수가 60점 이상인가?
 * 			5-1. D학점 입니다. 출력
 * 			6. 아니면 (나머지는)
 * 			6-1. F학점입니다. 출력

 */

import java.util.Scanner;

 

public class ComConditionTest1 {

 

public static void main(String[] args) {

// Scanner 객체 생성

Scanner stdIn = new Scanner(System.in);

System.out.print("월 입력(1~12) : ");

intmonth = stdIn.nextInt();

 

if (month == 12 || month == 1 || month == 2) {

System.out.println("겨울입니다.");

}

elseif (month == 3 || month == 4 || month == 5) {

System.out.println("봄입니다.");

}

elseif (month == 6 || month == 7 || month == 8) {

System.out.println("여름입니다.");

}

elseif (month == 9 || month == 10 || month == 11) {

System.out.println("가을입니다.");

}

else {

System.out.println("해당 월은 없습니다.");

}

}

 

}

 
