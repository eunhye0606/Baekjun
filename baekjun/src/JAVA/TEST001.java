package JAVA;

import java.util.Scanner;

public class TEST001
{
	
	public static void main(String[] args)
	{
		//■■■ 자바 기본 프로그래밍 ■■■
		// 자바 프로그램의 클래스 이름은 첫 글자 대문자로 시작
		// main() : 자바 인터프리터가 처음 찾는 메소드
		// 자바에서의 메소드는 독립적으로 존재할 수 없다.
		// 그래서 자바의 함수를 『메소드』라고 부른다.
		
		System.out.println("자바 하이");
		// 메소드 : 기능, 동작, 행위
		// 메소드를 정의하다.
		// 메소드를 정의해야 호출을 할 수 있다.
		
		
		//변수 선언 → 메모리 공간 확보 / 할당
		int a;
		//변수 초기화(변수 a에 10 대입)
		a = 10;
		
		//변수 선언 및 초기화
		int b = 20;
		
		//연산 및 처리 → 확보한 메모리 공간에 데이터 담아내기
		//				  (대입도 연산, 대입연산자 『=』)
		int c = a + b;
		System.out.println("c:" + c);
		
		//컴파일 에러 : java.exe.가 찾는다.
		//cf) 런타임 에러 : 개발자의 의도와 다른 형태로
		//    				사용자가 사용할 때 나는 에러
		// 알파 테스트 : 개발자
		// 베타 테스트 : 다른 개발자
		// 클로즈 테스트 : 특정 사용자
		// 오픈 테스트 : 아무나
		
		//※ 덧셈 연산자(+)
		//   피 연산자 중 어느 하나라도 문자열 형태이면
		//   산술연산자로써의 기능 x
		//   문자열 결합 연산자로 기능
		
		int x = 10;
		System.out.println(x + "안녕"); //--10안녕
		
		
		//자동형변환, 명시적형변환(강제적형변환)
		/*-자동형변환 : 큰거에 작은거는 자동으로 담긴다 (short가 long에 담긴다)
		-명시적형변환(강제형변환), 자동형변환 위배가 아니더라도 
		 어디서 형변환 된지 알려줄라고 쓸 때도 있삼!*/
		short c2;
		//c2 = a;
		//자동형변환규칙 위반.
		//-- a는 int 타입, 작은 그릇에 큰 것을 담을 수 없다.(컴파일 에러)
		//Type mismatch: cannot convert from int to short
		
		c2 = (short)a; //-- 명시적형변환
		// 스코프 영역 안에서 변수명은 식별자
		// 문법적으로는 변수명 한글도 가능하지만 실무에선 쓰지 않는다.
		
		// printf() 랑 format()
		// JDK1.5부터 지원되는 메소드
		// 서식 출력용 메소드
		// %.2f → 소수점 이하 두 번째 자리까지 표현(반올림)
		
		//long x2 = 1000000000; //백억
		//--『=』 대입 연산자를 기준으로 우측 상수 표현이
		// int 형 메모리(변수 선언시 상수 기본)에 해당 상수 할당 불가.
		// 접미사(L)을 붙혀야 가능.
		// So, 약 21억 이상 되는 상수는 접미사 L을 붙혀라.
		
		int e = 030;
		System.out.println(e); //--24
		//접두어 『0』 → 8진수
		
		// 자바의 자료형
		//  1바이트 2바이트   4바이트  8바이트   4바이트(실수)  8바이트(실수)
		//  byte   < short   < int    < long   < float       < double
		//   		 char : 2바이트
		// boolean : 1바이트
		//자료형의 종류와 구분
		/*
		 * 자료형 데이터 메모리 크기 표현 가능 범위 boolean 참과 거짓 1바이트 T,F
		 * 
		 * char 문자 2바이트 모든 유니코드 문자
		 * 
		 * byte 정수 1바이트 -128~ 127
		 * short 정수 2바이트 -32768~ 32767
		 * int 정수 4바이트 +- 21억
		 * long 정수 8바이트 매우 큰 정수
		 * float 실수 4바이트 매우 큰 실수
		 * double 실수 8바이트 더 큰 실수
		 * //자료형 변환
		 * byte → short ↘
		 * 				 int →long →float →double
		 * 		   char ↗ 
		 */
		// '\n' : gkskdml answk.
		// 실수형 데이터타입의 정밀도 테스트 : float < double이 정밀도가 높다.
		
		
		//■■■자바의 개요 및 특징 ■■■
		//정수와 정수의 나눗셈(몫 반환)
		//피 연산자로 실수가 포함되어 있는 나눗셈 : 실수 기반 연산 수행
		
		//int h = 10, v = 20;
		//선언 및 초기화 한번에 여러개 가능.
		
		//자바의 기본 입출력 : BufferedReader 클래스
		//버퍼 : 임시기억공간
		//br.readLine() : 문자열 반환.
		//new InputStreamReader(System.in)
		//바이트 → 문자 번역기
		//Integer.parseInt() 숫자형(정수형)으로 변환.
		double area;
		int l = 3, h = 5;
		
		area = l * h / 2.0;
		System.out.println(area);
		
		
		
		//자바의 기본 입출력 : System.in.read()
		//System.in.read() : 한 문자만 아스키코드로 반환.
		//System.in.skip(2) : 2개를 안읽고 건너뛴다.
		// 엔터  = '\r' + '\n'
		
		
		//포맷팅에서 양수 / 음수 강조법
		System.out.printf("%+d\n",123);
		System.out.printf("+%d\n",123);
		//--  +123
		//--  +123
		System.out.printf("%d\n",+123);
		//--  123
		//System.out.printf("%-d\n",365);
		//-- 런타임에러 발생
		System.out.printf("-%d\n",365); 
		System.out.printf("%d\n",-365);
		//-- -365
		//-- -365
		
		
		//HEX 16진수
		//DEC 10진수
		//OCT 8진수
		//BIN 2진수
		
		System.out.printf("%2.2f\n",123.456);
		//-- 123.46
		// 준비한 자릿수보다 많으면 그 이상은 무시.
		
		
		
		//자바의 기본 입출력 : java.util.Scanner
		//단락 문자패턴을 사용하여 입력을 토큰에 따라 분할하여
		//디폴트(default)로 사용되는 단락문자는 공백이다.
		//작성된 다음 토큰은 『next()』 메소드를 사용.
		//IOException 없어도됨. 인증받은 입출력 장치.
		//기능↑ 성능↓
		//sc.next() : 문자열 출력
		//System.in.read() : 문자를 아스키코드로 반환.
		//스페이스도 공백하나로 인지
		//엔터도 공백으로 인지
		
		
		//System.out.println("\");
		// '\'는 자바가 \n ? \s ?? 이러고 있어서 컴파일에러발생
		// \이걸 문자로 쓰고 싶으면 \\ ~~
		System.out.print("이름 나이 주소 입력 (콤마구분) : ");
		Scanner sc = new Scanner(System.in);
		//sc.useDelimiter("\\s*,\\s*");
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");	
		String name = sc.next();
		String age = sc.next();
		String address = sc.next();
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		
	}
}
