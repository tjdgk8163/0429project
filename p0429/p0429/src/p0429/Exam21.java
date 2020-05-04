package p0429;

import java.util.Scanner;

public class Exam21 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b,dif;
		System.out.print("정수 a : ");
		a=s.nextInt();
		System.out.print("정수 b : ");
		b=s.nextInt();
		dif=a-b;
		if(dif<0){
			System.out.printf("두 값의 차는 %d입니다.",-(dif));
		}else{
			System.out.printf("두 값의 차는 %d입니다.",dif);
		}
		s.close();
		

	}

}
