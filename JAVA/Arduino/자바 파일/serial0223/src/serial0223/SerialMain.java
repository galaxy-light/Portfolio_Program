package serial0223;

import java.util.Scanner;

public class SerialMain {
	public static final String ADMIN_ID = "admin";
	public static final String GUEST_ID = "guest";
	public static final String ADMIN_PW = "1234";
	public static final String GUEST_PW = "1111";
	
	public static String[] login (Scanner s) {
		System.out.println("----------------------");
		System.out.println("스마트홈 제어 로그인");
		System.out.println("----------------------");
		System.out.print("ID : ");
		String id = s.next();
		System.out.print("PW : ");
		String passwd = s.next();
//		System.out.println("ID : " + id);
//		System.out.println("PW : " + passwd);
		
		String[] loginData = new String[2];
		loginData[0] = id;
		loginData[1] = passwd;
		return loginData;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);	
		
		while (true) {
			String[] loginArr = login(s);
			if (loginArr[0].equals(ADMIN_ID) && loginArr[1].equals(ADMIN_PW)) {
				System.out.println("관리자 모드");
				break;
			}
			else if (loginArr[0].equals(GUEST_ID) && loginArr[1].equals(GUEST_PW)) {
				System.out.println("사용자 모드");
				break;
			}
			else {
				System.out.println("ID 또는 PW가 일치하지 않습니다.");
				System.out.println("다시 입력하세요.");
			}
		}		
	}
}
