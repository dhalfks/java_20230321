package day03;

public class 과제 {

	public static void main(String[] args) {
		//char : 유니코드표에 따라 글자의 코드별로 글자를 표시
		char ch = 'a';
		System.out.println(ch);
		System.out.println((int)ch);
		
		for(char ch1 ='a'; ch1<='z'; ch1++) {
			System.out.print(ch1+" ");
		}
		System.out.println();
		
		for(char ch1 ='a'; ch1<='z'; ch1++) {
			for(char ch2 ='a'; ch2<=ch1; ch2++) {
				System.out.print(ch2+" ");	
			}
			System.out.println();
		}
		
		
		
		/* a
		 * ab
		 * abc
		 * abcd
		 * abcde
		 * ...
		 * abcde.....z
		 * */

	}

}
