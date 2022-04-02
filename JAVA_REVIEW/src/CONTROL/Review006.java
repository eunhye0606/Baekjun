/* =======================
제어문(조건문) if ~else문
javastudy(Test034.java)
======================= */
/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/
// if 문
//if ~ else 문 실습

//1. 프로그램을 작성할 때 주어진 조건에 따라
//   분기 방향을 정하기 위해 사용하는 제어문에는
//   if문, if~else문, 조건연산자, 복합if문(if문 중첩),
//   switch 문이 있다.

//2. if문은 if 다음의 조건이 참일 경우,
//   특정 문장을 수행하고자 할 때 사용되는 구문이다.

//○ 정수를 입력받아 홀수/짝수 판별하는 프로그램을 구현한다.
//   단, 단일 if 구문을 사용한다.
//=====================================================
//※ 『0』 경우를 항상 처리를 해야한다! 
// 『0』 은 짝수도 홀수도 아니다!
package CONTROL;

import java.util.Scanner;

public class Review006
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int x;
		String result = "알수없음";
		
		do
		{
			System.out.print("정수를 입력하시오. (종료『.』): ");
			String temp = sc.next();
			if (temp.equals("."))
				break;
			
			x = Integer.parseInt(temp);
			
			if (x == 0)
				result = "0";
			else if (x % 2 == 0)
				result = "짝수";
			else if (x % 2 != 0)
				result = "홀수";
			
			System.out.println(">>"+result);
			
		} while (true);
		
	}
//결과 출력
/*
정수를 입력하시오. (종료『.』): 0
>>0
정수를 입력하시오. (종료『.』): 1
>>홀수
정수를 입력하시오. (종료『.』): 99
>>홀수
정수를 입력하시오. (종료『.』): -2
>>짝수
정수를 입력하시오. (종료『.』): -61
>>홀수
정수를 입력하시오. (종료『.』): .
*/
	
	
	
	
	
	
	
	
	
	
	
}
