/* =======================
자바의 입출력
javastudy(Test016.java)
======================= */

/*==============================================
■■■자바의 개요 및 특징 ■■■

// 변수와 자료형
// 변수와 자료형 실습 및 테스트 : BufferedReader 클래스

// 사용자로부터 이름, 국어점수, 영어점수 , 수학점수를 입력받아
// 이름과 총점을 출력하는 프로그램을 구현한다.

// 실행 예)
// 이름을 입력하세요 : 
// 국어 점수 입력:
// 영어 점수 입력:
// 수학 점수 입력:

//====[결과]====
// 이름 : 
// 총점 :
=============================================*/
//BufferedReader의 br.readLine()은 『문자열 반환』
package CONTROL;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Review001
{
	public static void main(String[] args)
	{
		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 주요 변수 선언
		String name;
		int kor, eng, mat;
		
		try
		{
			// 사용자에게 질문하기
			System.out.print("이름을 입력하세요 : ");
			name = br.readLine();
			System.out.print("국어 점수 입력 : ");
			kor = Integer.parseInt(br.readLine());
			System.out.print("영어 점수 입력 : ");
			eng = Integer.parseInt(br.readLine());
			System.out.print("수학 점수 입력 : ");
			mat = Integer.parseInt(br.readLine());
			
			// 출력하기
			System.out.println("====[결과]====");
			System.out.println(" 이름 : " + name);
			System.out.println(" 총점 :" + (kor + eng + mat));
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		finally {
			System.out.println("프로그램 종료.");
		}
	}

//결과출력
/*
이름을 입력하세요 : 백이진
국어 점수 입력 : 100
영어 점수 입력 : 50
수학 점수 입력 : 90
====[결과]====
 이름 : 백이진
 총점 :240
프로그램 종료.
*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
