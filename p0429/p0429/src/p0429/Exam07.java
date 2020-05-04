package p0429;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double x,y;
		System.out.print("x값 : ");
		x=s.nextDouble();
		System.out.print("y값 : ");
		y=s.nextDouble();
		System.out.printf("합계는 %.2f입니다.\n",x+y);
		System.out.printf("평균은 %.3f입니다",(x+y)/2);
		
		s.close();
	}

}
