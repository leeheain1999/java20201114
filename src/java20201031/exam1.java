package java20201031;

import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] titles = new String[10];
		String[] bodies = new String[10];
		int[] ids = new int[10];

		int index = 0;
		int id = 1;
		
		
		while (true) {
			System.out.print("명령어를 입력해주세요 : ");
			String cmd = sc.nextLine();
			if (cmd.equals("exit")) {
				System.out.println("종료");
				break;
			}

			if (cmd.equals("add")) {

				System.out.print("게시물 제목을 입력해주세요 : ");
				titles[index] = sc.nextLine();
				System.out.print("게시물 내용을 입력해주세요 : ");
				bodies[index] = sc.nextLine();
				System.out.println("게시물이 등록되었습니다.");
				ids[index] = id;

				index++;
				id++;

			}
			if (cmd.equals("list")) {

				for (int i = 0; i < index; i++) {
					System.out.println("번호 : " + ids[i]);
					System.out.println("제목 : " + titles[i]);
					System.out.println("===================");
				}

			}
			if (cmd.equals("update")) {
				System.out.print("수정할 게시물 번호: ");
				String number = sc.nextLine();
				int num = Integer.parseInt(number);
				for (int i = 0; i < index; i++) {
					if (num > ids[i]) {
						System.out.println("없는 번호입니다.");
					} else {
						System.out.println("제목 : " + titles[i]);
						System.out.print("새제목 : ");
						titles[i] = sc.nextLine();
						System.out.println("내용 : " + bodies[i]);
						System.out.print("새내용 : ");
						bodies[i] = sc.nextLine();
						System.out.println("게시물 수정이 완료되었습니다.");
					}

				}

			}
			if (cmd.equals("delete")) {
				System.out.println("수정할 게시물 번호 : ");
				String number = sc.nextLine();
				int num = Integer.parseInt(number);
				for (int i = 0; i < index; i++) {
					if (num > ids[i]) {
						System.out.println("없는 번호입니다.");
					} else {
						System.out.println("게시물 삭제가 완료되었습니다.");
					}

				}

			}

		}

	}

}