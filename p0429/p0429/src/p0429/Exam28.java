package p0429;

import java.util.Scanner;

public class Exam28 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1;
		
		do{
			System.out.print("세 자리의 정숫값 : ");
			n1=s.nextInt();
			}while(n1>999 || n1<100);
		
		System.out.print("입력한 값은 "+n1+"입니다.");
		
		s.close();
		}
		

	}


