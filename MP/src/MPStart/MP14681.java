/*
예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다.
점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.

점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오.
단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.

*/

package MPStart;

import java.util.Scanner;

public class MP14681
{
	public static void main(String[] args)
	{
		
		/*
		 * //주요 변수 선언 int coordinate = 0; //-- 좌표를 담는 변수 1,2,3,4 String x = "" ; //--
		 * x좌표, .을 입력하면 종료하기 위해서 문자열타입으로 선언. int y = 0; //-- y좌표 Scanner sc = new
		 * Scanner(System.in);
		 * 
		 * try { do { //입력받기 System.out.print("두 정수를 입력하시오(공백 구분,종료 『.』) : "); x =
		 * sc.next(); if (x.equals(".")) break; y = sc.nextInt();
		 * 
		 * 
		 * } while (Integer.parseInt(x) <=1000 || Integer.parseInt(x) >=-1000
		 * ||Integer.parseInt(x) != 0);
		 * 
		 * while (true) { if (Integer.parseInt(x) >1000 || Integer.parseInt(x) <-1000
		 * ||Integer.parseInt(x) == 0) break; else if (y > 1000 || y < -1000 || y == 0)
		 * break;
		 * 
		 * //사분면 구분하기 //x>0, y>0 → coordinate = 1 if (Integer.parseInt(x) > 0 && y > 0)
		 * coordinate = 1; //x<0, y>0 → coordinate = 2 else if (Integer.parseInt(x) < 0
		 * && y > 0) coordinate = 2; //x<0, y<0 → coordinate = 3 else if
		 * (Integer.parseInt(x) < 0 && y < 0) coordinate = 3; //x>0, y<0 → coordinate =
		 * 4 else if (Integer.parseInt(x) > 0 && y < 0) coordinate = 4;
		 * 
		 * 
		 * 
		 * //출력하기 if (coordinate != 0) { System.out.println("사분면 : " + coordinate); }
		 * else System.out.println("사분면을 알 수 없음.");
		 * 
		 * break;
		 * 
		 * }
		 * 
		 * } catch (Exception e) { System.out.println(e.toString()); } finally {
		 * System.out.println("프로그램 종료."); }
		 */
	}
}
