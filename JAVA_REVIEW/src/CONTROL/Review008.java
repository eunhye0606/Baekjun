/* =======================
제어문(조건문) if ~else문
javastudy(Test037.java)
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

// ◎ 과제 → 카페 
//사용자로부터 임의의 연도를 입력받아
//입력받은 연도가... 윤년인지 평년인지 판별하여
//그 결과를 출력하는 프로그램을 구현한다.
//단, 입력은 BufferedReader의 readLine()을 활용하고
//if 조건문을 활용하여 연산을 수행할 수 있도록 한다.

// 실행 예)
// 임의의 연도 입력 : 2000
// 2000년 → 윤년
// 계속하려면 아무 키나 누르세요...

// 임의의 연도 입력 : 2012
// 2021년 → 윤년
// 계속하려면 아무 키나 누르세요...

// 임의의 연도 입력 : 2022
// 2022년 → 평년
// 계속하려면 아무 키나 누르세요...

// ※ 2월이 28일까지 있는 해 → 평년
//		    29일까지 있는 해 → 윤년
// ※ 윤년의 판별 조건
//    연도가 4의 배수이면서 100의 배수가 아니거나
//    400의 배수이면 윤년이다.
//    그렇지 않으면 평년이다.
package CONTROL;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Review008
{
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String yearStr;
		int year = -1;
		try
		{
			do
			{
				System.out.print("임의의 연도 입력 (종료『.』): ");
				yearStr = br.readLine();
				
				if (yearStr.equals("."))
					break;
				
				year = Integer.parseInt(yearStr);
				
				if (year > 0)
				{
					//4의 배수이면서 100의 배수가 아니다.
					if (year % 4 == 0 && year % 100 != 0)
						System.out.printf("%d년은 윤년\n",year);
					//400의 배수이다.
					else if (year % 400 == 0)
						System.out.printf("%d년은 윤년\n",year);
					else
						System.out.printf("%d년은 평년\n",year);
				}
				else 
					System.out.println("년도는 음수를 입력할 수 없습니다.");
				
			} while (true);
	
		}
		 catch (Exception e)
		{
			System.out.println(e.toString());
		}

	}
}

//결과출력
/*
임의의 연도 입력 (종료『.』): -1
년도는 음수를 입력할 수 없습니다.
임의의 연도 입력 (종료『.』): 2000
2000년은 윤년
임의의 연도 입력 (종료『.』): 1999
1999년은 평년
임의의 연도 입력 (종료『.』): 2022
2022년은 평년
임의의 연도 입력 (종료『.』): .
*/
