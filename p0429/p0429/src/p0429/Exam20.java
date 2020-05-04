package p0429;

import java.util.Scanner;

public class Exam20 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a,b;
		System.out.print("실수 a : ");
		a=s.nextDouble();
		System.out.print("실수 b : ");
		b=s.nextDouble();
		if(a>b){
			System.out.printf("큰 쪽의 값은 %.1f입니다.",a);
		}else if(a==b){
			System.out.print("두 수가 같습니다.");
		}else{
			System.out.printf("큰 쪽의 값은 %.1f입니다.",b);
		}
		s.close();

	}

}
