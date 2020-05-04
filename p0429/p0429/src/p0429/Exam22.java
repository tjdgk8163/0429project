package p0429;

import java.util.Scanner;

public class Exam22 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b,c;
		System.out.print("정수 a : ");
		a=s.nextInt();
		System.out.print("정수 b : ");
		b=s.nextInt();
		System.out.print("정수 c : ");
		c=s.nextInt();
		if(a>b && b<c){
			System.out.print("최솟값은 "+b+"입니다.");
		}else if(b>a && a<c){
			System.out.print("최솟값은 "+a+"입니다.");
		}else{
			System.out.print("최솟값은 "+c+"입니다.");
		}
		s.close();

	}

}
