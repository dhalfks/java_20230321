package Team;
import java.util.ArrayList;
import java.util.Random;

public class Play {
	private ArrayList<String> inPlayList;
	private ArrayList<String> outPlayList;
	
	
	public Play() {
		inPlayList = new ArrayList<>();
		outPlayList = new ArrayList<>();
		
		
		inPlayList.add("아이파크몰 cgv");
		inPlayList.add("라인 볼링장");
		inPlayList.add("나인티 pc카페");
		inPlayList.add("아쿠아리움");
		inPlayList.add("현대 미술관");
		inPlayList.add("수 노래방");
		inPlayList.add("중앙 박물관");
		inPlayList.add("K2 당구장");
		inPlayList.add("아지트 만화카페");
		inPlayList.add("세계 꽃 박람회");
		
		
		outPlayList.add("놀이공원");
		outPlayList.add("펜타포트 락 페스티벌");
		outPlayList.add("고궁 한복 체험");
		outPlayList.add("어린이대공원 벚꽃놀이");
		outPlayList.add("맥주 축제");
		outPlayList.add("호수공원");
		outPlayList.add("동화 힐링 캠핑장");
		outPlayList.add("전통시장");
		outPlayList.add("스카이워크 구름다리");
		outPlayList.add("크루즈 불꽃놀이");
	}
	
	public void inPlayadd(String place) {
		inPlayList.add(place);
	}
	
	public void outPlayadd(String place) {
		outPlayList.add(place);
	}
	
	public String getPlay(boolean num) {
	    ArrayList<String> playList;
	    if(num == false) {
	        playList = inPlayList;
	    } else {
	        playList = outPlayList;
	    }
	    
	    Random ran= new Random();
	    int index= ran.nextInt(playList.size());
	    String ranPlace=playList.get(index);
	    return ranPlace;
	    
	}
	


	@Override
	public String toString() {
		return "Play [inPlayList=" + inPlayList + ", outPlayList=" + outPlayList + "]";
	}

	public ArrayList<String> getInPlayList() {
		return inPlayList;
	}

	public void setInPlayList(ArrayList<String> inPlayList) {
		this.inPlayList = inPlayList;
	}

	public ArrayList<String> getOutPlayList() {
		return outPlayList;
	}

	public void setOutPlayList(ArrayList<String> outPlayList) {
		this.outPlayList = outPlayList;
	}


}