/* =======================
제어문(조건문) if ~else문
javastudy(Test040.java)
======================= */
/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/

// 사용자로부터 임의의 정수 5개를 입력받아
// 짝수별, 홀수별 합계를 출력하는 프로그램을 구현한다.
// 단, Scanner를 활용하여 데이터를 입력받을 수 있도록 한다.

// 실행 예 )
// 임의의 정수 5개 입력 : 1 2 3 4 5

// >> 짝수의 합은 6이고, 홀수의 합은 9 입니다.
//================================================
//정수 → 문자열
//Integer.toString()
//sc.nextInt()로 받아오면 정수형을 입력해야함.
//문자열을 입력하면 런타임 에러발생!
//그래서 처음에는 int[] 만들었다가
//반복문 탈출을 위해서 String[] 변경!
//※배열에 특정값이 포함되었는지 확인!
//Arrays.asList(arr).contains(".")

package CONTROL;

import java.util.Arrays;
import java.util.Scanner;

public class Review010
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		do
		{
			String [] arr = new String [5];
			int eSum = 0, oSum =0;
			
			
			System.out.println("※종료 『.』 입력");
			System.out.print("임의의 정수 5개 입력(공백 구분.) : ");
			
			for (int i = 0; i < arr.length; i++)
			{
				arr[i] = sc.next();
				
					if (arr[i].equals("."))
						break;
				
				if (Integer.parseInt(arr[i]) % 2 == 0)
					eSum += Integer.parseInt(arr[i]);
				else
					oSum += Integer.parseInt(arr[i]);
			}
			
			if (Arrays.asList(arr).contains("."))
			{
				System.out.println("\n>>종료되었습니다.");
				return;
			}
			else
				System.out.printf("\n>>짝수의 합은 %d 이고, 홀수의 합은 %d 입니다.\n",eSum,oSum);

		} while (true);
	
	}
}
//결과출력
/*
※종료 『.』 입력
임의의 정수 5개 입력(공백 구분.) : 10 1 2 3 4

>>짝수의 합은 16 이고, 홀수의 합은 4 입니다.
※종료 『.』 입력
임의의 정수 5개 입력(공백 구분.) : 100 -100 -60 -60 100

>>짝수의 합은 -20 이고, 홀수의 합은 0 입니다.
※종료 『.』 입력
임의의 정수 5개 입력(공백 구분.) : 10 10 . 

>>종료되었습니다.
*/
