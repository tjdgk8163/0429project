package p0429;

import java.util.Scanner;

public class Exam18 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1,n2;
		System.out.print("정숫값: ");
		n1=s.nextInt();
		n2=n1%3;
		if(n1%3==0){
			System.out.print("이 값은 3으로 나누어집니다.");
		}else{
			System.out.printf("이 값을 3으로 나눈 나머지는 %d입니다.",n2);
		}
		s.close();

	}

}
