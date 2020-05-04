package p0429;

import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1,n2;
		System.out.print("변수 a : ");
		n1=s.nextInt();
		System.out.print("변수 b : ");
		n2=s.nextInt();
		if(n1>n2){
			System.out.print("a가 크다.");
		}else if(n1==n2){
			System.out.print("a와 b가 같다.");
		}else{
			System.out.print("b가 크다.");
		}
		s.close();

	}

}
