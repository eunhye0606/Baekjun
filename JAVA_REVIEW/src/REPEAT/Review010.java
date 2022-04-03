/* ==============================
실행흐름 컨트롤(반복문)
javastudy(Test063.java ~ Test066.java)
//별찍기 지옥 시작..
================================= */
//■■■Test063.java■■■
/* 실행 예)
    *	   
   **   
  ***   
 ****
*****
*/
//■■■Test064.java■■■
/* 실행 예)  

    *
   ***
  *****
 *******
*********
*/
//■■■Test065.java■■■
/* 실행 예)

*********
 *******
  *****
   ***
	*
*/
//■■■Test066.java■■■
/* 실행 예)

    *  
   ***  
  ***** 
 *******
*********  
 *******
  ***** 
   ***  
	*   
*/
package REPEAT;

public class Review010
{
	public static void main(String[] args)
	{
		/*//■■■Test063.java■■■
		 실행 예) → 공백이 4,3,2,1
		    *	 1 - 4  = -3 , 1 - 3 = -2 , 1 - 2= -1, 1 -1 = 0 , 1- 0 = 1 
		   **    2 - 4  = -2 , 2 - 3 = -1 , 2 - 2 = 0, 2 - 1 = 1, 2 - 0 = 2
		  ***    3 - 4 =  -1 , 3 - 3 = 0
		 ****    4 - 4 = 0
		*****    
		
		System.out.println("■■■Test063.java■■■");
		for (int i = 1; i <=5; i++)
		{
			for (int j = 4; j >= 0 ; j--)
			{
				if (i - j <= 0)
				{ 
					System.out.print(" ");
				}
				else
					System.out.print("*");
			}
			System.out.println();
		}*/
		
		//■■■Test064.java■■■
		/* 실행 예)  

		    *    	공백 4개 별 1개 공백 4개
		   ***           3      3        3       
		  *****          2      5        2
		 *******         1      7        1
		*********        0      9        0
		*/
														  
		System.out.println("■■■Test064.java■■■");
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 4; j >=0; j--)           
			{
				if (i - j <= 0 ) //i = 1, j = 4 3 2 1 	i = 2, j =4,3,2
				{
					System.out.print(" ");
				}
				else if (i - j > 0) // i =1, j = 0 		i = 2, j = 1,0
				{
					
				}
				
			}
			System.out.println();
		}

	}
}
