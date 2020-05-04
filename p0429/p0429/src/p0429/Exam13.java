package p0429;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1,n2;
		System.out.print("변수 A : ");
		n1=s.nextInt();
		System.out.print("변수 B : ");
		n2=s.nextInt();
		if(n1%n2==0){
			System.out.print("B는 A의 약수입니다.");
		}else{
			System.out.print("B는 A의 약수가 아닙니다.");
		}
s.close();
	}

}
