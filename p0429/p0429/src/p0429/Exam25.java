package p0429;

import java.util.Scanner;

public class Exam25 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int star;
		System.out.print("몇 개의 *을 표시할까요? : ");
		star=s.nextInt();
		for(int i=1;i<=star;i++){
			System.out.print("*");}
			if(star<1){System.out.print("");}
			else{System.out.print("\n");}
			
			s.close();

	}

}
