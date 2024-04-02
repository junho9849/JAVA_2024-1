/*
 * 작성일 : 2024년 4월 2일
 * 작성자 : 컴퓨터소프트웨어공학과 202195041 임준호
 * 설명 : 1부터 10까지 합을 출력하시오
 * 
 * 
 * 문제분석 : 1+2+3+4+5+6+7+8+9+10
 * 			1부터(초기값)
 * 			10까지(조건식)
 * 			1씩 증가(증감식)
 * 			하면서 합계를 계산한다. //sum = sum(0부터 시작) + num(1씩증가)
 * 			sum = sum + num 공식
 * 			sum = 0 초기값 지정이 반드시 필요하다.
 * 
 *
 * 알고리즘 : 0. sum = 0으로 지정
 *  1.수는 1부터 (초기값)
 * 		  2. 수는 10까지 반복하면서 (반복문)
 * 			2-1 합계를 계산한다.
 * 			2-2 수를 1씩 증가한다. (증감식)
 * 			2-3 합계를 출력한다.
 * 		  3. 합계를 출력한다.
 * 
 * 
 * 
 * 
 * 
 */
public class WhileTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		//1. 초기값
		int num = 1;
		//2. 조건식
		while(num <= 10) {
			 sum = sum + num;
			 //2. 증감식
			 num = num + 1; // num ++;
			
		}
		 System.out.println("1~10까지 합은" + sum + "입니다.");

	}

}
