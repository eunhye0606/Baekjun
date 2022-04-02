/* =======================
자바의 기본 입출력
javastudy(Test021.java)
======================= */

/*==============================================
■■■자바의 개요 및 특징 ■■■

// 자바의 기본 입출력 : java.util.Scanner

//※ java.util.Scanner
//	 단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
//   디폴트(default)로 사용되는 단락문자는 공백이다.
//   작성된 다음 토큰은 『next()』 메소드를 사용
//   다른 형태(자료형)의 값으로 변환할 수 있다.
=============================================*/
//※ Scanner sc = new Scanner(System.in).useDelimiter(",");
//   마지막에도 ,를 입력해야 끝남!!
//sc.naxt()는 문자열을 가져감.
//기본구분자는 공백.
//예외없음 인증받음.
package CONTROL;

import java.util.Scanner;

public class Review003
{
	public static void main(String[] args)
	{
		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in).useDelimiter("\\s*,\\s*");
		
		//주요 변수 선언
		String name, sh1, sh2, sh3, sh4;
		
		//질문하기
		System.out.print("이름과 학교명4개를 순서대로 입력 (,구분): ");
		
		name = sc.next();
		sh1 = sc.next();
		sh2 = sc.next();
		sh3 = sc.next();
		sh4 = sc.next();
		
		//출력하기
		System.out.printf("%s의 첫번째 학교 이름은 %s 입니덩\n",name,sh1);
		System.out.printf("%s의 첫번째 학교 이름은 %s 입니덩\n",name,sh2);
		System.out.printf("%s의 첫번째 학교 이름은 %s 입니덩\n",name,sh3);
		System.out.printf("%s의 첫번째 학교 이름은 %s 입니덩\n",name,sh4);

	}
}

//결과출력
/*
이름과 학교명4개를 순서대로 입력 (,구분): 백이진,서울대,연세대,고려대,동국대
,
백이진의 첫번째 학교 이름은 서울대 입니덩
백이진의 첫번째 학교 이름은 연세대 입니덩
백이진의 첫번째 학교 이름은 고려대 입니덩
백이진의 첫번째 학교 이름은 동국대 입니덩
*/
