/*
 * 작성일 : 2024년 3월 29일
 * 작성자 : 컴퓨터소프트웨어공학과 202195041 임준호
 * 설명 : 두 정수를 입력받아 두 수가 모두 짝수이면 더한 결과를 출력하고, 그렇지 않고 두 수를 하나라도 홀수이면 몇 번째 입력한 수를 짝수로 입력해야하는지 출력하시오 
 * 
 * 
 * 문제분석 : 짝수는 2로 나눈 나머지가 0이다.
 * 		  홀수는 2로 나눈 나머지가 1이다.(0이 아니다.)
 * 		  두 정수를 입력 받고 모두 짝수 이면 결과를 출력,
 * 		  첫번째 수가 짝수일경우
 * 		  첫번째 수를 짝수로 바꿔주세요라고 한다.
 * 		  두번째 수가 짝수일 경우
 * 		  두번째 수를 짝수로 바꿔주세요라고 한다.
 * 		  두 정수 모두 홀수일 경우
 * 		  두 정수 모두 짝수로 바꿔주세요라고 한다.
 * 
 * 		  (2,2), (2,1) (1,2) (1,1)
 * 		  
 * 		  
 * 		  
 *		
 * 
 * 알고리즘 : 1.두 정수를 입력 받는다.
 * 		2. 두 정수가 모두 짝수인가?
 * 		2-1. 짝수이면 더한 값을 출력
 * 		3.아니고 첫번째 수가 홀수 경우
 * 		3-1 첫번째 수를 짝수로 입력해주세요라고 출력
 * 		4. 두번째 수가 짝수 경우
 * 		4-2 두번째 수를 짝수로 입력해주세요라고 출력
 * 		5.아니면
 * 		5-1. 두 수 모두 짝수로 입력해주세요라고 추력 
 * 		 
 * 	
 */

import java.util.Scanner;

public class SelcetiveTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		
		
	  System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        class EvenChecker {
            void checkEven(int num1, int num2) {
                switch ((num1 % 2 == 0 ? 1 : 0) + (num2 % 2 == 0 ? 2 : 0)) {
                    case 0: // 두 수 모두 홀수
                        System.out.println("두 수 모두 짝수로 입력해주세요.");
                        break;
                    case 1: // 첫 번째 수만 짝수
                        System.out.println("두 번째 수를 짝수로 입력해주세요.");
                        break;
                    case 2: // 두 번째 수만 짝수
                        System.out.println("첫 번째 수를 짝수로 입력해주세요.");
                        break;
                    case 3: // 두 수 모두 짝수
                        System.out.println("두 수의 합: " + (num1 + num2));
                        break;
		 
		

	}

}
