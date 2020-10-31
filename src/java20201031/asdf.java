package java20201031;

import java.util.Scanner;

public class asdf {

	public static void main(String[] args) {
	
	    while(true) {

			Scanner sc = new Scanner(System.in);
			
			System.out.println("명령어를 입력해주세요:");
		    String str = sc.nextLine();
			
		    if(str.equals("exit")) {
		    	System.out.println("프로그램을 종료합니다");
		    	break;
		    }
		    
		    if(str.equals("add")) {
		    	System.out.println("게시물 제목을 입력해주세요: ");
		    	String title = sc.nextLine();
		    	System.out.println("게시물 내용을 입력해주세요: ");
		    	String text = sc.nextLine();
		    	System.out.println("게시물이 등록되었습니다.");
		    }
		    
		    if(str.equals("list")) {
		    	System.out.println("번호: ");
		    	String num = sc.nextLine();
		    	int number = Integer.parseInt(num);
		    	System.out.println();
		    }
		   
	    }

	}
	
}