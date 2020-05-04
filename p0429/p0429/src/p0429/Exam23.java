package p0429;

import java.util.Scanner;

public class Exam23 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		System.out.print("정수 a : ");
		a=s.nextInt();
		System.out.print("정수 b : ");
		b=s.nextInt();
		if(a>b){
			System.out.println("작은 값은 "+b+"입니다.");
			System.out.println("큰 값은 "+a+"입니다.");
		}else if(a==b){
			System.out.print("두 값이 같습니다.");
		}else{
			System.out.println("작은 값은 "+a+"입니다.");
			System.out.println("큰 값은 "+b+"입니다.");
		}
		s.close();

	}

}
