package p0429;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double w,h;
		System.out.println("삼각형의 넓이를 구합니다");
		System.out.print("밑변: ");
		w=s.nextDouble();
		System.out.print("높이: ");
		h=s.nextDouble();
		System.out.print("넓이는 "+(w*h)/2+"입니다.");
		
		s.close();

	}

}
