package form;

import java.util.Scanner;

public class userCheck {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter user name: ");
        String userName = scan.next();
        System.out.print("Enter user password: ");
		int passWord = scan.nextInt();
		System.out.println("user name :" + userName);
		System.out.println("password :" + passWord);
	}

}
