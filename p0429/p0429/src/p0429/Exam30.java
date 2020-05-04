package p0429;

import java.util.Scanner;

public class Exam30 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count;
		System.out.println("카운트다운 합니다.");
		System.out.print("양의 정숫값: ");
		count=s.nextInt();
		
		for(int i=count; i>=0; i--){
			System.out.println(i);
		}
		s.close();
	}

}
