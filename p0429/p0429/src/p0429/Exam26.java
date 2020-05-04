package p0429;

import java.util.Scanner;

public class Exam26 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int star,i=1;
		System.out.print("몇 개의 *을 표시할까요? : ");
		star=s.nextInt();
		while(i<=star){
			System.out.print("*");
			i++;
		}if(star<1){System.out.print("");}
		else{System.out.print("\n");}
		s.close();

	}

}
