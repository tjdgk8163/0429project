package p0429;

import java.util.Scanner;

public class Exam29 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n1,i=1,fact=1;
		System.out.print("양의 정숫값 : ");
		n1=s.nextInt();
		do{
			fact=fact*i;
			i++;
		}while(i<=n1);
		System.out.printf("1부터 %d까지의 곱은 %d입니다.",n1,fact);

		s.close();
	}

}
