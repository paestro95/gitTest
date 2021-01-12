package j20210112;
import java.util.Scanner;

public class EX_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		// next() : 공백기준 , nextLine() : 줄바꿈 기준 , nextInt() : 숫자변환

		System.out.print("첫번째 숫자를 입력해주세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력해주세요 : ");
		int num2 = sc.nextInt();
		
		System.out.print(num1+"+"+num2+"="+(num1+num2));
		
		//	String str2 = sc.next();
		//	System.out.println(str2);
		
		
		
	}

}
