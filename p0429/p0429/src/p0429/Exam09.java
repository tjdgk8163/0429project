package p0429;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String sung,name;
		System.out.print("성 : ");
		sung=s.nextLine();
		System.out.print("이름 : ");
		name=s.nextLine();
		System.out.printf("안녕하세요.%s 씨.",sung+name);
		s.close();

	}

}
