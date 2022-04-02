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

// 사용자로부터 임의의 정수를 입력받아
// 다음과 같은 판별 결과를 출력하는 프로그램을 구현한다.

// 2의 배수 / 3의 배수 / 2와 3의 배수 / 2와 3의 배수 아님

// 실행 예)
// 임의의 정수 입력 : 4
// 4 → 2의 배수
// 계속하려면 아무 키나 누르세요....

// 임의의 정수 입력 : 9
// 9 → 3의 배수
// 계속하려면 아무 키나 .....

// 임의의 정수 입력 : 6
// 6 → 2와 3의 배수
// 계속하려면 .....

//임의의 정수 입력 : 17
// 17 → 2와 3의 배수 아님
//==============================================================

package CONTROL;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Review007
{
	
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.print("임의의 정수 입력 (종료 『.』): ");
			try
			{
				String temp = br.readLine();
				
				if (temp.equals("."))
					break;
				
				if (Integer.parseInt(temp) % 2 == 0 && Integer.parseInt(temp) % 3 == 0)
					System.out.printf("%d → 2와 3의 배수\n",Integer.parseInt(temp));
				else if (Integer.parseInt(temp) % 2 == 0)
					System.out.printf("%d → 2의 배수\n",Integer.parseInt(temp));
				else if (Integer.parseInt(temp) % 3 == 0)
					System.out.printf("%d → 3의 배수\n",Integer.parseInt(temp));
				else
					System.out.print("알 수 없음.\n");
				
			} catch (Exception e)
			{
				System.out.println(e.toString());
			}
			
		} while (true);
	}
//결과출력
/*
임의의 정수 입력 (종료 『.』): 4
4 → 2의 배수
임의의 정수 입력 (종료 『.』): 9
9 → 3의 배수
임의의 정수 입력 (종료 『.』): 6
6 → 2와 3의 배수
임의의 정수 입력 (종료 『.』): 7
알 수 없음.
임의의 정수 입력 (종료 『.』): .
*/
	
	
	
	
	
	
	
	
	
	
}
