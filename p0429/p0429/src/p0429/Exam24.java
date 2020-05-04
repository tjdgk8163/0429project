package p0429;

import java.util.Scanner;

public class Exam24 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int month;
		System.out.print("몇 월입니까? : ");
		month=s.nextInt();
		switch(month){
		case 3:
		case 4:
		case 5: 
			System.out.print("봄");break;
		case 6:
		case 7:
		case 8:
			System.out.print("여름");break;
		case 9:
		case 10:
		case 11:
			System.out.print("가을");break;
		case 12:
		case 1:
		case 2:
			System.out.print("겨울");break;
		default : 
			System.out.print("그런 월은 없습니다.");
		
		
		}
		s.close();

	}

}
