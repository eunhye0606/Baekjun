/* =======================
제어문(조건문) if ~else문
javastudy(Test039.java)
======================= */
/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/
// if 문
//if ~ else 문 실습

// 사용자로부터 임의의 정수 세개를 입력받아
// 작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 7
// 두 번째 정수 입력 : 70
// 세 번째 정수 입력 : 42

// >> 정렬 결과 : 7 42 70
// 계속하려면 아무 키나 누르세요 .....
package CONTROL;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Review009
{
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int [] arr = new int [3];
		do
		{
			try
			{
				System.out.print("숫자 정렬하기 진행하시겠습니까? (Y / N) : ");
				String respon = br.readLine().toUpperCase();
				
				if (respon.equals("N"))
					break;
				
				//값 입력받기
				for (int i = 0,count = 1; i <3; i++,count++)
				{
					System.out.printf("%d번째 정수 입력 :",count);
					int temp = Integer.parseInt(br.readLine());
					arr[i] = temp;
				}
				//10 100 5
				//값 정렬하기(오름차순)
				for (int i = 1; i < arr.length; i++)
				{
					if (arr[i-1] >= arr[i])
					{
						arr[i] = arr[i]^arr[i-1];
						arr[i-1] = arr[i-1]^arr[i];
						arr[i] = arr[i]^arr[i-1];
					}
				}
				
				if (arr[0] >= arr[1])
				{
					arr[0] = arr[0]^arr[1];
					arr[1] = arr[1]^arr[0];
					arr[0] = arr[0]^arr[1];
				}
				
				//값 출력하기
				System.out.println();
				System.out.print(">>정렬 결과 : ");
				for (int i : arr)
				{
					System.out.print(i + " ");
				}
				System.out.println();
				System.out.println();
				
			} catch (Exception e)
			{
				System.out.println(e.toString());
			}
			
		} while (true);
	}
}
//결과출력
/*
숫자 정렬하기 진행하시겠습니까? (Y / N) : y
1번째 정수 입력 :100
2번째 정수 입력 :4
3번째 정수 입력 :1

>>정렬 결과 : 1 4 100 

숫자 정렬하기 진행하시겠습니까? (Y / N) : y
1번째 정수 입력 :4
2번째 정수 입력 :50
3번째 정수 입력 :-90

>>정렬 결과 : -90 4 50 

숫자 정렬하기 진행하시겠습니까? (Y / N) : n
*/
