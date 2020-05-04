package p0429;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1;
		System.out.print("정숫값 : ");
		n1=s.nextInt();
		if(n1<0){
			System.out.print("이 값은 음의 값입니다.");
		}else{
			System.out.print("정숫값:"+n1);
		}
		s.close();
	}

}
