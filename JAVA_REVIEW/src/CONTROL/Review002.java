/* =======================
자바의 입출력
javastudy(Test017.java)
======================= */

/*==============================================
■■■자바 기본 프로그래밍■■■

// 자바의 기본 입출력 : System.in.read()
//readLine()은 BufferedReader에서 사용.

System.in.read() 메소드는 한 문자만 가져온다.
readLine() 처럼 문자열대기열에 있는거 가져오는 건 같음.
단 , 입력받은 하나의 문자를 문자 그대로 가져오는 것이 아니라
ASCII Code 값으로 반환한다.


// 실행 예)
// 한 문자 입력 : A
// 한 자리 정수 입력 : 8

// 입력한 문자 : A
// 입력한 정수 : 8
// 계속하려면 아무 키나 ............

==============================================*/
//system.in.read()는 인스턴스 생성할 필요 x
//int를 반환한다(아스키코드 반환)
//숫자도 아스키코드가 따로 있다.
//엔터도 아스키코드가 있다 (\r + \n이기때문에)
//→ 그래서 System.in.skip(2)를 해서 공백을 건너뛰기를 해야함.
package CONTROL;

import java.io.IOException;

public class Review002
{
	public static void main(String[] args) throws IOException
	{
		//주요 변수 선언
		char ch;		//System.in.read()로 받아온 아스키코드를 문자형태로 형변환 해야한다.
		int x;    		//System.in.read()로 받아온 한자리 정수도 아스키코드가 있다. 연산을 통해 숫자로 출력하도록 해야한다.
		
		
		//사용자에게 질문하기
		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read();
		System.in.skip(2);
		System.out.print("한자리 정수 입력 : ");
		x = System.in.read();
		
		//출력하기
		System.out.printf("\n입력한 문자 : " + ch);
		System.out.println();
		System.out.printf("입력한 정수 : " + (x-48));
		//10 → 49    39 
		//5  → 53    48 
		//1  → 49    48 		→ 한 자리 정수는 아스키 코드로 +48해서 출력이 된다. 
		//10010 → 49           → 아무리 긴 정수를 입력해도 첫번째 자리만 가져가서 아스키코드로 변환한다.
		//5050 → 53
	}
}
//결과출력
/*
한 문자 입력 : a
한자리 정수 입력 : 8

입력한 문자 : a
입력한 정수 : 8
*/
