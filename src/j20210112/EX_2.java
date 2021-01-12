package j20210112;
import java.util.Scanner;
public class EX_2 {

	public static void main(String[] args) {
		// ctrl + shift + o : 자동 import
		// ctrl + shift + f : 자동 코드 정렬

		Scanner sc = new Scanner(System.in);

		System.out.print("원하는 단을 입력해주세요 : ");
		int dan = sc.nextInt();
		
		for(int i =1 ; i<=9; i++) {
			System.out.println(dan+ " * " + i + " = " +dan*i);
		}
		
	}

}
