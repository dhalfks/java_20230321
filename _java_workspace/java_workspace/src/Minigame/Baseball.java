package Minigame;

import java.util.Scanner;

public class Baseball{
	Scanner scan = new Scanner(System.in);
	int cpu[] = new int[3];
	public void exe() {
		
		System.out.println();
		System.out.println("-----야구게임-----");
		
		System.out.println("==룰 설명==");
		System.out.println("컴퓨터가 1~9사이의 숫자 3개를 생성합니다.");
		System.out.println("플레이어는 같지않은 숫자 3개를 입력하며");
		System.out.println("자리가 같을시 Strike, 자리가 다를시 Ball, 같은 숫자가 없으면 Out 입니다");
		System.out.println("플레이어는 7회안에 3스트라이크를 달성해야하며");
		System.out.println("7회를 넘어가거나 Out이 3번이 되면 플레이어의 패배입니다.");
		System.out.println();
		
		while(true) {
		
			System.out.println("게임시작!");
			cpu = CPU_NumCreat();
		
			NumCreat_HitCheck(cpu);
		System.out.println();
		System.out.println("한판 더 하기 (Any key) / 메뉴로 나가기 (N/n)");
		String abc = scan.next();
		if(abc.equals("N") || abc.equals("n")) {
			return;
			}
		}
	}
	
	public int Creat_RandomNumber(int min, int max) { // 번호 생성 메서드
		if(max<min) {
		int tmp = max;
		max = min;
		min = tmp;
		}
		return (int)(Math.random()*(max-min+1))+min;
	}	
	
	
	 public int[] CPU_NumCreat() { 
		 int arr[] = new int[3]; for (int i = 0; i < 3; i++) { 
			 int random = Creat_RandomNumber(1, 9); 
			 if (DupCheck(arr, random)) 
			 	{ 
				 arr[i] = random; 
			 	} 
			 else i--; 
			 	} 
		 return arr; 
		 }
	 

	public int[] P_NumCreat() {
		int arr[] = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = scan.nextInt();
		}
		return arr;
	}
	
	public boolean randomArray(int arr[], int min, int max) {
		if(arr==null) {
			return false;
		}
		else if((max-min+1) < arr.length) {
			return false;
		}
			int i=0;
		while(i<arr.length) {
			int r = Creat_RandomNumber(min, max);
			if(DupCheck(arr,r)) {
				arr[i]=r;
				i++;
			}
		}
		return true;
	}
	
	public void printArray(int arr[]) {
		for(int tmp : arr) {
			System.out.print(arr + " ");
		}
		System.out.println();
	}
	
	public void NumCreat_HitCheck(int cpu[]) {
		int strike = 0;
		int ball = 0;
		int out = 0;
		int count = 0;

		while (strike != 3 && out != 3) {
			strike = 0;
			ball = 0;
			System.out.print("1~9까지 숫자 3개를 입력하세요 : ");
			int p[] = P_NumCreat();

			for (int i = 0; i < p.length; i++) {
				if (p[i] == cpu[i]) {
					strike++;
				}
				for (int j = 0; j < cpu.length; j++) {

					if (i != j && p[i] == cpu[j]) {
						ball++;
					}   

				}
			}
			if (strike == 0 & ball == 0) {
				out++;
			}
			
			System.out.print("결과 -> 스트라이크 : " + strike + " 볼 : " + ball + " 아웃 : " + out);
			System.out.println();
			count++;
			if (count > 6 && strike != 3 && out != 3) {
				System.out.println("7회 종료! 플레이어의 패배입니다!");
				return;
			}
		}
		if (strike == 3) {
			System.out.println("Strike 3회로 플레이어의 승리입니다 ! 총 시행횟수 : " + count);
			return;
		}
		else if (out ==3) {
			System.out.println("OUT 3회로 플레이어의 패배입니다 ! 총 시행횟수 : " + count);
			return;
		}
	}
	
	public boolean DupCheck(int a[], int random) { // 중복값 있으면 true 반환 없으면 false
		for (int tmp : a) {
			if (tmp == random) {
				return false;
			}
		}
		return true;
	}

}
