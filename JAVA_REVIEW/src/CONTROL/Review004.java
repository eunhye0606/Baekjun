/* =======================
제어문(조건문) if ~else문
javastudy(Test031.java)
======================= */

/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================

//if ~else 

//사용자로부터 임의의 문자를 하나 입력받아
//대문자이면 소문자로 소문자이면 대문자로
//알파벳이 아닌 기타문자이면 입력오류 처리하는 프로그램을 구현한다.

// 실행 예)
// 한 문자 입력 : A
// >> A → a
//계속하려면 아무 키나 누르세요....


// 한 문자 입력 : b
// >> b → B
//계속하려면 아무 키나 누르세요....

// 한 문자 입력 : 7
// >> 입력 오류 ~!!!
//계속하려면 아무 키나 누르세요....
=============================================*/
//문자열 → 아스키코드변환법
//*byte[] asc = "a".getBytes(StandardCharsets.US_ASCII);
//숫자나 특수문자형태의 문자열들도 toUppercase() / toLowerCase()가 가능하다.

package CONTROL;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Review004
{
	public static void main(String[] args) throws IOException 
	{
		String temp;
		
		Scanner sc = new Scanner(System.in);
		
			//문자범위 
			//소문자 65 ~ 97
			//대문자 90~122
		do
		{
			System.out.print("한 문자 입력(종료 : .) :");
			temp = sc.next();
			if (temp.equals("."))
				break;
			
			//문자가 아닌걸 어떻게 구분?
			//방법1. 알파벳 배열을 만든다. ㅈㄴ노가다임 26개 언제함.
			//방법2. 아스키코드의 문자범위 밖이면 문자가 아님을 이용하라. (ok)
			
			//문자열을 아스키코드로 변환하는방법.
			byte[] asc = temp.getBytes(StandardCharsets.US_ASCII);
			int acsN = asc[0];
			
			if (!(acsN >= 65 && acsN <= 97 || acsN >=90 && acsN<=122))
				System.out.println("입력오류.");
			else if (temp.toLowerCase().equals(temp))
				System.out.printf("%s → %s\n",temp,temp.toUpperCase());
			else if (temp.toUpperCase().equals(temp))
				System.out.printf("%s → %s\n",temp,temp.toLowerCase());
			
				
		} while (true);
		
		System.out.println("프로그램 종료.");
		
		//문자열 → 아스키코드
		/*byte[] asc = "a".getBytes(StandardCharsets.US_ASCII);
		for (byte b : asc)
		{
			System.out.println(b);
			//-- 97
		}*/
		
		
	}
}
//결과출력
/*
한 문자 입력(종료 : .) :a
a → A
한 문자 입력(종료 : .) :A
A → a
한 문자 입력(종료 : .) :6
입력오류.
한 문자 입력(종료 : .) :%
입력오류.
한 문자 입력(종료 : .) :.
프로그램 종료.
*/
