package 조별과제;

import java.util.ArrayList;

public class birthNum {		//입력받은 생년월일의 각 숫자를 받아 더해주는 클래스

	public birthNum() {}
	public int birthNumCreate(String fortuneBrithdate) {
		int birthSum = 0;
		ArrayList<String> birthlist = new ArrayList<>();
    	ArrayList<Integer> birthNumList = new ArrayList<>();
    	String []fortuneBrithdatetmp = new String[8] ;
    	
    	fortuneBrithdatetmp = fortuneBrithdate.split("");

    	for(String tmp : fortuneBrithdatetmp) {
    		birthlist.add(tmp);
    	}
    	
    	
    	
    	for(String tmp : birthlist) {
    		birthNumList.add(Integer.parseInt(tmp));		//string int 치환
    	}
    	
    	for(int tmp : birthNumList) {
    		birthSum = birthSum + tmp;
    		
    	}
    	return birthSum;
	}
	
	
	
}
