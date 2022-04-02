/* =======================
제어문(조건문) if ~else문
javastudy(Test033.java)
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

//사용자로부터 이름, 국어점수 ,영어점수 , 수학점수를 입력받아
//다음과 같은 형태로 출력하는 프로그램을 작성한다.
//등급은 평균 점수를 기준으로 처리한다.

// 90점 ~ 100점 : A		80점 ~ 89점 : B
// 70점 ~ 79점  : C		69점 ~ 69점 : D
// 60점 미만    : F

//단, BufferedReader 의 readLine() 메소드를 통해 입력받을 수 있도록 하며,
//printf() 메소드를 통해 출력할 수 있도록 구현한다.

// 실행 예 )
// 이름 입력 : 홍은혜 
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70

// >> 당신의 이름은 홍은혜입니다.
// >> 국어 점수는 90,
// >> 영어 점수는 80,
// >> 수학 점수는 70,
// >> 총점은 240이고, 평균은 80입니다.
// >> 등급은 B 입니다.
// 계속하려면 아무 키나 누르세요...
package CONTROL;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Review005
{
	public static void main(String[] args)
	{
		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//주요 변수 선언
		String name, grade;
		int kor, eng, mat, tot;
		double avg;
		
		try
		{
			
			/*//나누기 테스트
			//정수 / 정수
			//몫 : /
			//나머지 %
			System.out.println(10 / 10); // 1
			System.out.println(100 % 10); // 0
			System.out.println(102 % 10); // 2
			*/			
			
			
			//입력받기
			System.out.print("이름 입력 : ");
			name = br.readLine();
			System.out.print("국어 점수 : ");
			kor = Integer.parseInt(br.readLine());
			System.out.print("영어 점수 : ");
			eng = Integer.parseInt(br.readLine());
			System.out.print("수학 점수 : ");
			mat = Integer.parseInt(br.readLine());
			
			//연산하기
			tot = kor + eng + mat;
			avg = tot / 3.0;
			
			switch ((int)(avg / 10))
			{
				case 10: grade = "A"; break;
				case 9: grade = "A"; break;
				case 8: grade = "B"; break;
				case 7: grade = "C"; break;
				case 6: grade = "D"; break;
				default :grade = "F"; break;
			}
			
			//출력하기
			System.out.printf("\n >> 당신의 이름은 %s입니다.\n",name);
			System.out.printf(" >> 국어 점수는 %d\n",kor);
			System.out.printf(" >> 영어 점수는 %d\n",eng);
			System.out.printf(" >> 수학 점수는 %d\n",mat);
			System.out.printf(" >> 총점은 %d이고, 평균은 %.1f입니다.\n",tot,avg);
			System.out.printf(" >> 등급은 %s 입니다.\n",grade);
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
//결과출력
/*
이름 입력 : 남주혁
국어 점수 : 100
영어 점수 : 50
수학 점수 : 60

 >> 당신의 이름은 남주혁입니다.
 >> 국어 점수는 100
 >> 영어 점수는 50
 >> 수학 점수는 60
 >> 총점은 210이고, 평균은 70.0입니다.
 >> 등급은 C 입니다.
*/
