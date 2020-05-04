package p0429;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1;
		System.out.print("정숫값 : ");
		n1=s.nextInt();
		System.out.printf("10을 더한 값은 %d입니다.\n",n1+10);
		System.out.printf("10을 뺀 값은 %d입니다.",n1-10);
		
		s.close();

	}

}
