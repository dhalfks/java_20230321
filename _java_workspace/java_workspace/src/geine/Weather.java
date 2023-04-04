package geine;
import java.util.*;
public class Weather{
	private int temp;
	private String[]weather= {"맑음","흐림","비","구름많음","눈"};
	private String[]dust= {"좋음","보통","나쁨","매우나쁨"};
	public Weather(){
		weatherPrint();
	}
	public void weatherPrint() {
		System.out.println("[WEATHER]▶ 어디 지역의 날씨를 알려드릴까요?");
		Scanner scan=new Scanner(System.in);
		String a=scan.next().substring(0, 2);
		String w=weather[(int)(Math.random()*5)];
		String d=dust[(int)(Math.random()*4)];
		if(w.equals("비")||w.equals("눈"))
			d=dust[0];
		temp=(int)(Math.random()*10)+2;
		System.out.printf("오늘 %s의 날씨는 %s이며 기온은 %d도, 미세먼지는 %s입니다.",a,w,temp,d);
		System.out.println();
	}
}