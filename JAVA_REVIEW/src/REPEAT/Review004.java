/* ==============================
실행흐름 컨트롤(반복문)
javastudy(Test054.java)
================================= */
/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/

// 반복문(while 문) 실습

// 사용자로부터 임의의 두 정수를 입력받아
// 작은 수부터 큰 수 까지의 합을 구하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 20 
// >> 10 ~ 20 까지의 합은 : xxxx

// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 2 
// >> 2 ~ 10 까지의 합은 : xxxx
//======================================

package REPEAT;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Review004
{
	public static void main(String[] args)
	{
		String user1; //입력받는 첫 번째 정수 (반복문 탈출을 위해 String 타입으로 선언)
		int user2; //입력받는 두 번째 정수
		int sum = 0; //누적합 계산 변수
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			try
			{
				System.out.println("※ 종료시, 『.』 입력.");
				System.out.print("첫 번째 정수 입력 : ");
				user1 = br.readLine();

				//반복문 탈출
				if (user1.equals("."))
					break;
				
				//user1이 숫자면 정수타입 변수에 담는다.
				int userStr = Integer.parseInt(user1);
				
				System.out.print("두 번째 정수 입력 : ");
				user2 = Integer.parseInt(br.readLine());
				
				//두 정수 크기 비교. (userStr > user2 이다.)
				if (user2 > userStr)
				{
					//자리바꾸기
					userStr = user2^userStr;
					user2 = userStr^user2;
					userStr = userStr^user2;
					System.out.println("userStr : " + userStr);
					System.out.println("user2 : " + user2);
				}
				
				//결과 출력용 userStr2선언 및 값 담기.
				int userStr2 = user2;
				
				//누적합 계산
				while (user2<=userStr)
				{
					sum += user2;
					user2++;
				}
				System.out.printf(">>%d ~ %d 까지의 합은 : %d\n",userStr2,userStr,sum);
				
				//do ~ while 때문에 sum을 초기화 해야한다.
				sum = 0;
			} catch (Exception e)
			{
				System.out.println(e.toString());
			}
			
			
		} while (true);
	}
}
//결과출력
/*
※ 종료시, 『.』 입력.
첫 번째 정수 입력 : 1
두 번째 정수 입력 : 10
userStr : 10
user2 : 1
>>1 ~ 10 까지의 합은 : 55
※ 종료시, 『.』 입력.
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 1
>>1 ~ 10 까지의 합은 : 55
※ 종료시, 『.』 입력.
첫 번째 정수 입력 : 100
두 번째 정수 입력 : 101
userStr : 101
user2 : 100
>>100 ~ 101 까지의 합은 : 201
※ 종료시, 『.』 입력.
첫 번째 정수 입력 : 1
두 번째 정수 입력 : 1000
userStr : 1000
user2 : 1
>>1 ~ 1000 까지의 합은 : 500500
※ 종료시, 『.』 입력.
첫 번째 정수 입력 : 50
두 번째 정수 입력 : 4
>>4 ~ 50 까지의 합은 : 1269
※ 종료시, 『.』 입력.
첫 번째 정수 입력 : .
*/








