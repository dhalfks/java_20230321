package product;

import java.util.Scanner;

public interface ProductInterface {

	void add(Scanner scan); //메뉴추가
	void printProduct(); //메뉴출력
	void orderPick(String name, int count); //주문
	void printOrder(); //주문내역출력
	void delete(Scanner scan); //메뉴삭제
	void update(Scanner scan); //메뉴수정 - 가격수정
}
