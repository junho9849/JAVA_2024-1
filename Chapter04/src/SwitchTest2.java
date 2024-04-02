/*
 * 작성일 : 2024년 3월 26일
 * 작성자 : 컴퓨터소프트웨어공학과 202195041 임준호
 * 설명 : 조건식 연습.
 * 		월을 입력받아 해달 계절을 출력하시오
 * 		3,4,5월 => 봄
 * 		6,7,8월 => 여름
 * 		9,10,11월 => 가을
 * 		12,1,2월 => 겨울
 * 
 * 
 * 문제분석 : 입력 받아야할 값은?
 * 		1,2,3,4,5,6,7,8,9,10,11,12이다.
 * 		0이나 13을 입력하면? =>해당 월은 없습니다. 출력하자
 * 		switch ~ case 문 사용
 * 
 * 		다중 if는?
 * 		내포된 if는?
 *
 * 
 * 알고리즘 : 
 * 	
 */

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner 객체 생성
		Scanner stdin = new Scanner(System.in);
		System.out.print("월을 입력하시오(영문자)");
		String month = stdin.next();
		String MtoS;
		switch (month)
		{
		case "December":
		case "January":
		case "February":
			MtoS = "겨울입니다.";
			break;
		case "March":
		case "May":
			MtoS = "봄입니다.";
			break;
		case "June":
		case "July":
		case "Agust":
			MtoS = "여름입니다.";
			break;
		case "September":
			System.out.print("멋진 9월과");
		case "October":
			System.out.print("아름다운 10월과");
		case "November":
			System.out.print("낙엽의 11월은");
			MtoS = "가을입니다.";
			break;
		default:
			MtoS = "1~12월을 벗어난 달입니다.";
			break;
			
		}
		System.out.println(MtoS);
		
		
		}

	}


