package p0429;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1;
		System.out.print("정숫값: ");
		n1=s.nextInt();
		if(n1<0){n1=-n1;}
		System.out.print("절댓값은 "+n1+"입니다");
		
		s.close();

	}

}
