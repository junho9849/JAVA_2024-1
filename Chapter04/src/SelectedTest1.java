/*작성일 : 3월 26일 화요일
 *작성자 : 컴퓨터소프트웨어학과 202195041 임준호
 
 * 세 자리의 십진수를 입력받아 각자리의 숫자들이 짝수인지 홀수인지 판단.
 * 
 * [문제분석]
 * 		짝수는 2로 나눈 나머지가 0이다.
 * 		홀수는 2로 나눈 나머지가 1이다.(0이 아니다.)
 * 		세자리 수 : 100~999
 * 		예를들어, 123을 입력했다면
 * 		100의 자리 1은 홀수입니다.
 * 		10의 자리 2는 짝수입니다.
 * 		1의 자리 3은 홀수입니다.  출력한다.
 * 
 * 		100의 자리, 10의 자리, 1의 자리를 구분해야 한다.
 * 		힌트) 나누기와 나머지 연산자를 활용한다.
 * 
 * [알고리즘]
 * 		1. 세 자리 정수를 입력받는다.
 * 		2. 만약 정수가 3자리이면 (100보다 크고, 1000보다 작다)	
 * 			1) 100의 자리를 찾는다.
 * 			2) 10의 자리를 찾는다.
 * 			3) 1의 자리를 찾는다.
 * 			4) 만약 100의 자리가 짝수이면
 * 				① 0은 짝수입니다.
 * 			5) 아니면
 * 				① 0은 홀수입니다.
 * 			6) 만약 10의 자리가 짝수이면
 * 				① 0은 짝수입니다.
 * 			7) 아니면
 * 				① 0은 홀수입니다.
 * 			8) 만약 1의 자리가 짝수이면
 * 				① 0은 짝수입니다.
 * 			9) 아니면
 * 				① 0은 홀수입니다
 * 		3. 아니면
 * 			1) 잘못 입력하셨습니다. 출력.
 */

import java.util.Scanner;

public class SelectedTest1 {

	public static void main(String[] args) {
		// Scanner 객체 생성.
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("세자리 수 입력(100~999) : ");

int num = stdIn.nextInt();

if(num/100==0 || num/100>=10) {

System.out.println("세 자리 수를 입력하세요!");

}

else {

// 100의 자리 수를 구하고 짝수인지 홀수인지 판별

if(num/100%2==0) {

System.out.println("100의 자리 " + (num/100) + "은 짝수입니다.");

}

else {

System.out.println("100의 자리 " + (num/100) + "은 홀수입니다.");

}

// 100의 자리수를 제거한 후 다시 변수에 저장

num = num%100;

// 10의 자리 수를 구하고 짝수인지 홀수인지 판별

if(num/10%2==0) {

System.out.println("10의 자리 " + (num/10) + "은 짝수입니다.");

}

else {

System.out.println("10의 자리 " + (num/10) + "은 홀수입니다.");

}

// 1의 자리 수를 구하고 짝수인지 홀수인지 판별

if(num%10%2==0) {

System.out.println("1의 자리 " + (num%10) + "은 짝수입니다.");

}

else {

System.out.println("1의 자리 " + (num%10) + "은 홀수입니다.");

}

	}

}
