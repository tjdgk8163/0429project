package p0429;

import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1;
		System.out.print("정숫값 : ");
		n1=s.nextInt();
		if(n1%5==0){
			System.out.print("이 값은 5로 나누어집니다.");
		}else{
			System.out.print("이 값은 5로 나누어지지 않습니다.");
		}
				s.close();

	}

}
