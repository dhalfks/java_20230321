package 조별과제;

import java.util.ArrayList;

public class cBirthNumber {				//탄생수
	public cBirthNumber(){}
	int cbirthNumber = 0;
	public int sum = 0;
	
	public  void fortuneBirithNum(String fortuneBrithdate, String name) {	//탄생수
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
		sum = sum + tmp;
		
	}
	
	while(sum >= 10) {
		int a = sum / 10;
		int b = sum % 10;
		cbirthNumber = a+b;
		//sum = 탄생수
		sum = cbirthNumber;
		if(cbirthNumber <10 ) {break;}
	}
	
	switch(cbirthNumber) {
	case 1 : System.out.println("===============================================");
			 System.out.println(name+"님의 탄생수 : 1");
			 System.out.println();
			 System.out.println("좋은점 : 외향적, 정열, 의지력, 포용력");
			 System.out.println("나쁜점 : 공격적, 완고함, 제멋대로");
			 System.out.println();
			 System.out.println("주도적으로 씩씩하게 인생을 개척해 나가는 정열적인 사람으로 강력하고 패기만만하다.");
			 System.out.println("사람과의 교제를 좋아하 기에 주변에 사람도 많고,");
			 System.out.println("개인적인 관계보다 사회적 활동에 에너지를 쏟는편이며 많은 사람에게 활력소가 되는 존재이다. ");
			 System.out.println("그래서 우정, 동정심이 흘러넘치는 따뜻한 사람이기도 하다.");
			 System.out.println("다만, 자존심을 상하게 하는 말에는 민감하게 반응하기도 하고,");
			 System.out.println("기본 성향이 개인적이며 적극적이고, 창조적이며 지배적인 리더형이라서");
			 System.out.println("타인으로부터 지시받는 것을 싫어한다.");
			 System.out.println(". 만약 리더형의 성향이 부정적으로 나타난다면 자기중심적이고 무뚝뚝하며 ");
			 System.out.println("폭군이 될 가능성이 높다. 대신인생에서 성공할 가능성은 큰 사람이다.  ");
			 System.out.println("===============================================");
			 break;
	case 2 : System.out.println("===============================================");
			System.out.println(name+"님의 탄생수 : 2");
			 System.out.println();
			 System.out.println("좋은점 : 감수성, 섬세함, 배려심, 모성적, 친절");
			 System.out.println("나쁜점 : 이기적, 기분파, 소심함, 몽상적");
			 System.out.println();
			 System.out.println("행동보다 사고형으로 수동적이며 추진력이 다소 부족한 경향이 있다.");
			 System.out.println("감수성이 풍부하며 부드러운 성품으로 예술에 사조가 깊고,");
			 System.out.println("인간관계에서 어떤사람과도 잘 어울려지낼 수 있다.");
			 System.out.println("모성애/부성애가 강하며, 반면에 부정적인 경향이 있고 보수적이라 좋고");
			 System.out.println("싫음이 좀 격렬한 편이고 지나치게 예민할때도 있다.");
			 System.out.println("단, 자신이 좋아하는 사람에게는 어머니같은 포용력을 보여준다.");
			 System.out.println("===============================================");
			 break;
	case 3 : System.out.println("===============================================");
			 System.out.println(name+"님의 탄생수 : 3");
		     System.out.println();
			 System.out.println("좋은점 : 활발함, 개방적, 사교적, 다재다능, 예의바름");
			 System.out.println("나쁜점 : 허영, 사치, 극단적");
			 System.out.println();
			 System.out.println("타고난 엔터테이너 기질이 있는 사람으로 특출난 재능을 갖고 있을 가능성이 있다.");
			 System.out.println("자기 분야에서 전문성을 갖추고 있고 인내심이 강하고 마음이 깊어서");
			 System.out.println("신중하게 행동하는편이다. 활발한 성격으로 자유로운 영혼이라 할 수있고,");
			 System.out.println("자존심이 강하고 독립적 성향도 가졌다. 다만 이 성향이 부정적으로 다가온다면");
			 System.out.println("많은 분야에 흥미를 가져 도전은 하지만 흥미가 식는 속도도 빨라서");
			 System.out.println("지속적이지 못하고, 솔직하게 얘기를 하는 성격탓에 ");
			 System.out.println("다른사람에게 상처를 주는 일도 생긴다. ");
			 System.out.println("===============================================");
			 break;
	case 4 : System.out.println("===============================================");
			 System.out.println(name+"님의 탄생수 : 4");
		     System.out.println();
			 System.out.println("좋은점 : 현실적, 근면, 독립심, 논리적, 온화함, 안정적");
			 System.out.println("나쁜점 : 독단적, 고독함 냉담함, 고집, 의심");
			 System.out.println();
			 System.out.println("착실하고 근면성실한 노력가이다. 소극적이지만 정열이 있어 ");
			 System.out.println("목표를 정하면 무조건 이뤄낸다.참을성이 많고 실용적인 성격이며");
			 System.out.println("합리적이고 논리적이라 좋고 나쁨을 확실히 한다. 아첨이나 붙임성 없이 정직한 성격이다.");
			 System.out.println("반면 겉모습이 차가워보이고 사교성이 부족하면서 과묵해보이지만");
			 System.out.println("가까운 사람에게는 누구보다 다정하다. ");
			 System.out.println("===============================================");
			 break;
	case 5 : System.out.println("===============================================");
			 System.out.println(name+"님의 탄생수 : 5");
		     System.out.println();
			 System.out.println("좋은점 : 활동적, 모험심, 적응력, 지성, 다재다능");
			 System.out.println("나쁜점 : 불안정, 신경질적, 분열적, 사소한 걱정가득");
			 System.out.println();
			 System.out.println("재치있고 활기찬 성격이며 감각적이고 즐거움을 추구한다.");
			 System.out.println("호기심도 왕성하고 두뇌회전이 빠르기 때문에 생각도 빠르다.");
			 System.out.println("모든방면에서 재능을 발휘하고 모험심이 크기 때문에 도전을 즐긴다.");
			 System.out.println("다만 지적욕구를 채우기 위해 늘 탐구하고 노력하지만 어느 정도 채우면 흥미를");
			 System.out.println("금방 잃어버리는 스타일이다. 성격도 급하기에 간혹 신경과민을 겪을 가능성도 있다");
			 System.out.println("===============================================");
			 break;
	case 6 : System.out.println("===============================================");
			 System.out.println(name+"님의 탄생수 : 6");
		     System.out.println();
			 System.out.println("좋은점 : 외유내강, 성실, 책임감, 친절, 헌신, 가정적");
			 System.out.println("나쁜점 : 독점욕, 고집, 질투, 사치, 이기적");
			 System.out.println();
			 System.out.println("이성으로서 사람으로서 매력적이다. 미적 센스가 있고 항상 자신감이 넘친다.");
			 System.out.println("믿음직하고 신뢰가 가는 타입으로 평화주의적 성격이라 다툼보단 문제해결에 집중한다.");
			 System.out.println("부탁을 받으면 거절하는게 힘든사람으로 어떻게든 도움을 주려고 노력하는 사람이다. ");
			 System.out.println("다만 이 성향이 부정적으로 다가온다면고집이 세고 자기주장이 강하게 된다. ");
			 System.out.println("사랑에는 빠르고 깊게 빠지며, 독점욕도 강해 질투도 많이 한다.");
			 System.out.println("만약 원망이 생기면 감정표현에 노골적이다. ​");
			 System.out.println("===============================================");
			 break;
	case 7 : System.out.println("===============================================");
			 System.out.println(name+"님의 탄생수 : 7");
		     System.out.println();
			 System.out.println("좋은점 : 자립심, 독창성, 냉정, 의지, 박애");
			 System.out.println("나쁜점 : 고독, 냉혹, 고집, 신경과민, 분열적, 빈정거림");
			 System.out.println();
			 System.out.println("신비로운 분위기를 풍기며 혼자 조용히 있는 것을 좋아하는 내성적 성향의 사람으로");
			 System.out.println("자립심과 독창성이 높은 신비로운 사색가 스타일로 타고났다.");
			 System.out.println("자신만의 철학이 확고한 사람으로 날카로운 통찰력과");
			 System.out.println("비판력, 분석과 직관능력이 뛰어나다. 감이 남다르기 때문에 영매가 될 가능성도 있다.");
			 System.out.println("반면 신념이 강해졌을때 주장을 굽히지 않는 고집도 있다.");
			 System.out.println("===============================================");
			 break;
	case 8 : System.out.println("===============================================");
			 System.out.println(name+"님의 탄생수 : 8");
		     System.out.println();
			 System.out.println("좋은점 : 정열적, 적극적, 대담함, 현실적, 통솔력");
			 System.out.println("나쁜점 : 성급함, 오만함, 이기적, 공격적");
			 System.out.println();
			 System.out.println("큰의지력과 개성있고 대담한 활동력의 소유자이다.");
			 System.out.println("사에 적극적이고 야망이 큰편이며,성공에 대한 욕심이 크고 ");
			 System.out.println("자존심이 강하다. 위험에 대한 걱정이없고 타인을 지배하고 싶어하며");
			 System.out.println("자신이 최고여야하는 사람이다. 우유부단하고 애매모호한 것들을 싫어하며");
			 System.out.println("불쾌한 기분이 들면 이기적인 사람으로 변하며 상황에 따라 냉혹한 면모도 갖고 있다. ");
			 System.out.println("===============================================");
			 break;
			 
	case 9 : System.out.println("===============================================");
		 	 System.out.println(name+"님의 탄생수 : 9");
		     System.out.println();
			 System.out.println("좋은점 : 정의감, 봉사, 자기희생적, 포용력, 예술적");
			 System.out.println("나쁜점 : 이기주의, 고집, 충동적, 소심");
			 System.out.println();
			 System.out.println("자기주장에 적극적이다. 기본적으로 봉사정신이 투철하고 영웅 심리도 큰편이라 불의를 보면");
			 System.out.println("참지 못해 나서는 편이고 결국 해결해낸다. 이렇게 성격이 불같기 때문에");
			 System.out.println("감정 변화의 폭도 크다. 다만 외향적 성격같지만 은근 내향적 성향이");
			 System.out.println("있어서 본인의 있는 그대로를 보여주는 것이 부끄러워 연극처럼 연기하여 본심을 숨기기도 한다.");
			 System.out.println("연기로 자신이 되고 싶은 성격을 만들어 내어 지낼 수도 있다.");
			 System.out.println("===============================================");
			 break;
	}
	
	
}
}
