package p0429;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1;
		System.out.print("정숫값: ");
		n1=s.nextInt();
		if(n1>0){
			System.out.print("값이 양수입니다.");
		}else if(n1==0){
			System.out.print("값이 0입니다.");
		}else{
			System.out.print("값이 음수입니다.");
		}
		s.close();

	}

}
