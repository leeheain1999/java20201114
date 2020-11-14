package java20201031;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Article> articles = new ArrayList<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Article> articles = new ArrayList<>();

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
				String title = sc.nextLine();
				System.out.print("게시물 내용을 입력해주세요 : ");
				String body = sc.nextLine();
				System.out.println("게시물이 등록되었습니다.");
				
				Article article1 = new Article(id, title, body);
				articles.add(article1);

				id++;

			} 

			if (cmd.equals("list")) {
				for (int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);
					System.out.println("번호 : " + article.getId());
					System.out.println("제목 : " + article.getTitle());
					System.out.println("===================");
				}
			}

			if (cmd.equals("update")) {
				System.out.print("수정할 게시물 번호 : ");
				String aid = sc.nextLine();
				int targetId = Integer.parseInt(aid);
				
				int existFlag = 1;
				for(int i = 0; i<articles.size(); i++) {
					Article article = articles.get(i);
					if(targetId == article.getId()) {
						existFlag = 2;
						System.out.print("제목: ");
						String title = sc.nextLine();
						System.out.print("내용: ");
						String body = sc.nextLine();
						Article article2 = new Article(targetId, title, body);
						articles.set(i, article2);
						
						break;
					}
				}
				
				if(existFlag == 1) {
					System.out.println("없는 게시물입니다.");
				}
			}
			
			if (cmd.equals("delete")) {
				System.out.print("삭제할 게시물 번호 : ");
				String aid = sc.nextLine();
				int targetId = Integer.parseInt(aid);
				
				int existFlag = 1;
				for(int i = 0; i<articles.size(); i++) {
					Article article = articles.get(i);
					if(targetId == article.getId()) {
						existFlag = 2;
						articles.remove(i);
						System.out.println("삭제가 완료되었습니다.");
						break;
					}
				}
				
				if(existFlag == 1) {
					System.out.println("없는 게시물입니다.");
				}
			}
			
			if (cmd.equals("read")) {
				System.out.print("원하는 게시물 번호 : ");
				String aid = sc.nextLine();
				int targetId = Integer.parseInt(aid);
				
				int existFlag = 1;
				for(int i = 0; i<articles.size(); i++) {
					Article article = articles.get(i);
					if(targetId == article.getId()) {
						existFlag = 2;
						System.out.println("====="+ targetId+"번 게시물=====");
						System.out.println("번호 : " + article.getId());
						System.out.println("제목 : " + article.getTitle());
						System.out.println("내용 : " + article.getBody());
						System.out.println("===================");
						
						break;
					}
				}
				
				if(existFlag == 1) {
					System.out.println("게시물이 존재하지 않습니다.");
				}
			
			}
		}
	}
}
