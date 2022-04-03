/* ==============================
실행흐름 컨트롤(반복문)
javastudy(Test052.java / Test053.java)
================================= */
//■■■Test052.java■■■
//반복문(while 문) 실습
//1 * 2 * 3 * ...* 9 * 10

// 실행 예)
// 연산 결과 :
//===================================
//■■■Test053.java■■■
//반복문(while 문) 실습

//사용자로부터 임의의 정수를 입력받아
//입력받은 정수가 소수인지 아닌지를 판별하여
//결과를 출력하는 프로그램을 구현한다.

// ※ 소수 : 1 또는 자기 자신의 값 이외에 어떤 수로도 나누어 떨어지지 않는 수.
//		     단, 1 은 소수 아님.

//실행 예)
//임의의 정수 입력 : 10
//10 → 소수 아님
//계속하려면.........

//임의의 정수 입력 : 11
// 11 → 소수
//====================================
//반복문이 많으면 이클립스가 느려진다.

package REPEAT;

import java.util.Scanner;

public class Review003
{
	public static void main(String[] args)
	{
		System.out.println("Test052.java");
		int x = 1, mul = 1; //루프변수, 누적곱
		
		
		while (x<10)
		{
			mul *= x;
			x++;
		}
		
		System.out.println("연산결과 : " + mul);
		System.out.println();
		
		
		System.out.println("Test053.java");
		//임의의 정수 입력받기
		//소수는 1또는 자기자신으로만 나누어진다.
		//소수인지 아닌지 판별
		int user, roof = 2; //유저에게 입력받는 값담는 변수, 루프변수
		String result = "소수임.";
		
		Scanner sc =new Scanner(System.in);
		System.out.println("※ 종료『.』 입력.");
		do
		{
			
			System.out.print("임의의 정수 입력 : ");
			String input = sc.next();
			
			//반복문 탈출.(do ~ while)
			if (input.equals("."))
				break;
			
			
			//소수판별
			while (roof < Integer.parseInt(input)) //2 3 4
			{
				if (Integer.parseInt(input) % roof == 0)
				{
					//System.out.println("user" + user);
					//System.out.println("roof" + roof);
					result = "소수아님.";
					break;
				}
				roof ++;
				//System.out.println("result : "+ result);
			}
			System.out.printf("%d → %s\n",Integer.parseInt(input),result);
			
			//do ~ while 문 안에 있기 때문에 반드시 초기화를 시켜야 한다.
			roof = 2;
			result = "소수임.";
			
		} while (true);
	}

}
//결과출력
/*
Test052.java
연산결과 : 362880

Test053.java
※ 종료『.』 입력.
임의의 정수 입력 : 100
100 → 소수아님.
임의의 정수 입력 : 99
99 → 소수아님.
임의의 정수 입력 : 71
71 → 소수임.
임의의 정수 입력 : 5
5 → 소수임.
임의의 정수 입력 : 4
4 → 소수아님.
임의의 정수 입력 : 3
3 → 소수임.
임의의 정수 입력 : 2
2 → 소수임.
임의의 정수 입력 : .
*/













