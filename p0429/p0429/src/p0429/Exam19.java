package p0429;

import java.util.Scanner;

public class Exam19 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int grade;
		System.out.print("점수 : ");
		grade=s.nextInt();
		if(grade>100){
			System.out.print("잘못된 점수입니다.");
		}else if(grade>=80){
			System.out.print("수");
		}else if(grade>=70){
			System.out.print("우");
		}else if(grade>=60){
			System.out.print("미");
		}else if(grade>=50){
			System.out.print("양");
		}else {
			System.out.print("가");
		}
		s.close();

	}

}
