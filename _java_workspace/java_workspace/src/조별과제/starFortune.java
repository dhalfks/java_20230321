package 조별과제;

import java.text.SimpleDateFormat;

import java.util.Date;


class starFortune{
	
	public starFortune() {}	//생성자
	
	public void todayStarFortune(String star , String name) {
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd");
		String dateString = sdf.format(date);						//오늘 일자를받음
		
 
        
		int today = Integer.parseInt(dateString);			//오늘 일자를 받고 숫자로 치환
//		int year = Integer.parseInt(star.substring(0,4));//
		int month = Integer.parseInt(star.substring(4,6));
        int day = Integer.parseInt(star.substring(6,8));
        
        String starSign = "";						//별자리 확인
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            starSign = "양자리";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            starSign = "황소자리";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 21)) {
            starSign = "쌍둥이자리";
        } else if ((month == 6 && day >= 22) || (month == 7 && day <= 22)) {
            starSign = "게자리";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            starSign = "사자자리";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            starSign = "처녀자리";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 23)) {
            starSign = "천칭자리";
        } else if ((month == 10 && day >= 24) || (month == 11 && day <= 22)) {
            starSign = "전갈자리";
        } else if ((month == 11 && day >= 23) || (month == 12 && day <= 21)) {
            starSign = "사수자리";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            starSign = "염소자리";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            starSign = "물병자리";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            starSign = "물고기자리";
        }
        
        System.out.println("===============================================");
        System.out.println(name+"님의 띠 : " + starSign);
        System.out.println("오늘의 "+starSign+" 운세" );
        
        
        if(starSign=="물병자리" && today % 5==0) {
        	System.out.println("오늘의 운세 : 혼자 있고 싶은 날이다. 친구들과 말하기도 싫고 듣고 싶지도 않다.");
        			System.out.println("괜히 나섰다간 말싸움하기 딱 좋은 날이다. 공부를 하거나 과제를 할 때도");
        			System.out.println("여럿이 의견을 모으기 보다는 혼자 생각하고 처리하는 쪽이 훨씬 능률이 높다."); 
        			System.out.println("오늘 건강지수 별로다. 컨디션도 괜스레 찌부둥 한 것이 외출하기 보다는 집에서 ");
        			System.out.println("낮잠이라도 자는 것이 좋겠다. 대신 저녁은 기분전환 겸 뽀대나는 식당에서 외식으로! ");
        			System.out.println("입에 좋은 음식보다 몸에 좋은 건강식을 챙겨먹자.");
        }
        if(starSign=="물병자리" && today % 5==1) {
        	System.out.println("작업지수 높은 날이다. 자신이 제일 자신 있는 것, 자신 있는 분위기를 활용하도록 하자. ");
        			System.out.println("새로운 연출보다는 가장 나다운 모습으로 대쉬해보자. 술술 넘어온다. ");
        			System.out.println("만나기 전 인터넷에서 데이트할 때 가면 좋은 장소, 분위기 띄우는 유머 등 약간의 준비를 해가는 센스!"); 
        			System.out.println("황색, 베이지색처럼 편안한 분위기를 내는 의상이 오늘 당신에게 어울리겠고, ");
        			System.out.println("데이트에서는 분위기가 좋을 때 살짝 스킨십을 시도해 보는 것도 친근감을 높이는 데 한 몫 크게 한다. 파이팅!");
        }
        if(starSign=="물병자리" && today % 5==2) {
        	System.out.println("크게 노력하지 않아도 일이 술술~ 풀리는 날이다. ");
        			System.out.println("상황, 조건 기타 등등 신기하게도 딱 맞아 떨어지는 일들이 생긴다. ");
        			System.out.println("마음에 걸렸던 일들이 있으면 찾아 해보자."); 
        			System.out.println("찝찝했던 지난날의 매듭을 말끔히 정리할 수 있는 날이다. ");
        			System.out.println("정리하다 막히는 일이 생기면 선배나 부모님께 도움을 요청해보자. 해결책이 보인다.");
        			System.out.println("작업거는 그/그녀의 앞에서도 작업멘트가 술술 풀리겠으니 좋은 인연을 만날 수도 있는 날이다.");
        			System.out.println("아침부터 외모에 살짝~ 신경써주는 센스!");
        }
        if(starSign=="물병자리" && today % 5==3) {
        			System.out.println("욕심을 낼수록 오히려 마이너스가 되는 날이다.");
        			System.out.println("평소 하던 만큼만, 지나치게 욕심부리지 말자. ");
        			System.out.println("운동, 공부 모두 적당히 하는 것이 좋겠고,");
        			System.out.println("과식할 수 있겠으니 음식도 양껏~ 적당히 먹자.");
        			System.out.println("급하게 진행하던 일이 있다면 조금만 침착하고 여유롭게...");
        			System.out.println("무리하게 진행했다가는 친구들과 의견충돌로 인해 오히려 공든 탑을 무너뜨릴 수도 있겠다.");
        			System.out.println("그저 그런 컨디션을 가진 하루가 될 것이니 웬만하면 집으로 일찍 들어가서 쉬자.");
        			System.out.println("오늘하루를 일찍 마무리 할수록 실수가 적다");
        }
        if(starSign=="물병자리" && today % 5==4) {
        			System.out.println("에너지가 넘치는 하루! 활동적으로 오늘을 즐기자.");
        			System.out.println("약간의 들뜬 기분이 일의 능률을 올려준다.");
        			System.out.println("작은 일에도 크게 웃을 일들이 생기니 오늘 하루 윤활유가 되겠다.");
        			System.out.println("남친, 여친과의 데이트가 있다면 콘서트, 연극처럼 사람들이");
        			System.out.println("바글바글 많이 모인 시끄러운 장소를 택하는 것이 좋겠다.");
        			System.out.println("살짝 자연스런 스킨십을 시도해 봐도 좋은 날이다.");
        			System.out.println("너무 자제하는 모습을 보이면 답답해 보일 수도 있으니 긴장을 풀고 자연스럽게~");
        }
        if(starSign=="물고기자리" && today % 5==0) {
        			System.out.println("하루종일 바쁘긴 한데 속빈강정, 실속 없는 날이다.");
        			System.out.println("이리저리 움직이고 발로 뛰어도 눈에 보이는 실속 하나 없으니,");
        			System.out.println("하루 스케줄 생각해놓고 시간에 따라 움직이지 않으면");
        			System.out.println("오늘 하루가 홀라당 날아가 버릴 수 있다.");
        			System.out.println("성과 없이 몸만 피곤하니 차분히 생각하고 최대한 동선을 줄이자.");
        			System.out.println("기분전환 하는 것도 좋지만 하루 종일 산만하니 안전사고를 주의하자.");
        			System.out.println("종이 한 장으로도 피를 볼 수 있는 날이다.");
        }
        if(starSign=="물고기자리" && today % 5==1) {
        			System.out.println("당신의 밝고 활기찬 모습이 여러모로 도움을 주는 날이다.");
        			System.out.println("선배, 후배 당신을 자신감있고 의욕적인 사람으로 보게 될 것이니");
        			System.out.println("명랑하고 씩씩한 하루를 보내자. 신체지수, 건강지수 모두 상종가.");
        			System.out.println("하는 만큼, 움직이는 만큼 기대 이상의 소득을 얻을 수 있겠으니,");
        			System.out.println("공부, 시험, 운동 모든 분야에 좋은 결과가 예상된다.");
        			System.out.println("단, 애정운은 별로~ 오늘 데이트가 있다면 약속은 다음으로 미루는게 어떨까?");
        }
        if(starSign=="물고기자리" && today % 5==2) {
        			System.out.println("삐졌거나 싸웠거나 기타 등등 관계가 불편한 사람이 있다면 먼저 화해를 청하는 날로 삼자.");
        			System.out.println("가까운 사이일수록 더욱 먼저 다가가는 것이 필요하겠다.");
        			System.out.println("오늘 기회를 놓치면 불편한 관계 때문에 앞으로 손해볼일이 점점 불어난다.");
        			System.out.println("오늘 당신의 화해신청을 다 받아줄 것이다. 여건이 된다면 실내보다는 실외,");
        			System.out.println("산이나 호수처럼 넓은 자연을 접하는 장소에서 화해신청을 하는 것이 더 좋겠다.");
        }
        if(starSign=="물고기자리" && today % 5==3) {
        			System.out.println("말조심 해야 하는 날! 무심코 던진 농담이 오늘 하루를 망칠만큼 파장을 일으킬 수 있겠다.");
        			System.out.println("특히나 성(性)적인 것과 관련된 이야기는 입에 담지도 말자. 괜스레 구설수에 오른다.");
        			System.out.println("가만히 앉아있기 보다 땀이 쭉 빠지도록 신나게 운동을 하는 것이 좋은 날이다.");
        			System.out.println("간단한 내기로 승부욕을 불태워 보는 것도 자극이 되겠다.");
        			System.out.println("별 관심없는 이성이 고백을 해온다면 의사표현을 확실히 하자.");
        			System.out.println("괜히 애매모호하게 질질 끌었다간 욕만 먹는다.");
        }
        if(starSign=="물고기자리" && today % 5==4) {
        			System.out.println("크고 작은 고민거리들이 있을지라도 밝은 성격을 표현한다면 주위 사람들의 도움을");
        			System.out.println("쉽게 받을 수 있는 날이다. 생각대로 일이 술술 풀리니 기분 좋은 날!");
        			System.out.println("배움과 진학에 관련된 일이 있다면 오늘 좋은 소식이 들릴 수도 있겠다.");
        			System.out.println("과거의 경험으로 위기를 모면할 수 있는 일이 생긴다. 순간의 판단보다는 지난 기억에 비추어");
        			System.out.println("일을 결정하는 것이 실수가 적고, 새로운 것 보다는 익숙한 것들을 선택하도록 하자.");
        }
        if(starSign=="양자리" && today % 5==0) {
        			System.out.println("움직임이 많은 날! 에너지도 충만하니 신나는 하루가 되겠다.");
        			System.out.println("미팅, 새로운 이성과의 만남 약속이 있다면 함께 돌아다니며 즐길 수 있는 방법을 택하라.");
        			System.out.println("좋은 분위기가 예상된다. 잠깐잠깐 쉬는 것 잊지말 것!");
        			System.out.println("움직임을 워낙~ 싫어하는 당신이라면 더 나태하고 쉽게 처지는 날이니,");
        			System.out.println("간단한 외출계획이라도 쥐어짜서 만들자. 컨디션 조절에 도움이 된다.");
        }
        if(starSign=="양자리" && today % 5==1) {
        			System.out.println("겉모습보다 속에 신경써야 하는 날이다.");
        			System.out.println("겉옷이 화려하더라도 속옷이 추레하면 모양새가 어색한 법.");
        			System.out.println("내실을 기해야 겉으로 우러나기 마련이다.");
        			System.out.println("사람들과의 밀착, 접촉하는 일들이 생길 수 있을 것 같으니 몸과 옷의 청결에 신경쓰자.");
        			System.out.println("돈을 쓰고 싶은 상황들이 많이 생기는 날이다.");
        			System.out.println("그러나 생각 없는 지출과 기대 이하의 만족감밖에 남는 것이 없을 것 같으니 가급적 지출을 자제하자.");
        			System.out.println("돈을 꿔줘야 하는 일이 생긴다면? 제대로 받기 힘들 것 같다. 준다는 마음이 아니라면 지혜롭게 비껴가자.");
        }
        if(starSign=="양자리" && today % 5==2) {
        			System.out.println("똑부러지고 현실적인 일처리를 추진하는 것도 좋지만 성급함은");
        			System.out.println("그 동안의 모든 노력을 그르칠 수 있는 결과를 초래한다. 침착하자.");
        			System.out.println("신중하고 여유롭게 결정할 수 있도록 하자. 시간을 내서 운동을 하기에 좋은 날이다.");
        			System.out.println("요즘 들어 몸에 이상이 느껴졌다거나 부쩍 피곤하단 생각이 들었다면 병원을 찾는 것도 좋다.");
        			System.out.println("모처럼 보양식을 챙겨먹는 것도 좋은 방법이겠다.");
        }
        if(starSign=="양자리" && today % 5==3) {
        			System.out.println("사람과의 관계에 속 썩는 날이다. 필요이상의 자존심은 자제해야 원하는 결과를 얻을 수 있겠다.");
        			System.out.println("여러 명이 함께 하는 일보다는 혼자 생각하고 처리할 수 있는 일이 능률적이겠으니");
        			System.out.println("가급적 모임을 자제하고 혼자 생각하자. 여러 명이 모여 있을 때,");
        			System.out.println("사사로운 일이 큰 다툼으로 번질 수 있으므로 말조심 할 것. 지름신이 강림하기 좋은 날이다.");
        			System.out.println("필요치 않은 물건 혹 해서 사는 일이 없도록 주머니 단단히 붙들자.");
        }
        if(starSign=="양자리" && today % 5==4) {
        			System.out.println(".마음을 넓게 열수록 당신에게 좋은 날이다.");
        			System.out.println("나 자신보다는 남을 돕는 여유를 갖자.");
        			System.out.println("금전적인 도움보다 행동으로 도울 수 있는 일이라면 더 좋다.");
        			System.out.println("익숙한 것이 어울리는 오늘, 어설프게 새로운 시도보다는 익숙한 것들이 더 잘 어울리고,");
        			System.out.println("평소와 다른 가벼운 행동과 언행은 주의해야 하니 즐거운 기분을 유지하되,");
        			System.out.println("기본 예의에 어긋나지 않게 수위를 조절하자.");
        }
        if(starSign=="황소자리" && today % 5==0) {
        			System.out.println("규칙적 생활과 자기조절이 필요한 날이다. 스케쥴 짱짱하게 짜놓고 ");
        			System.out.println("하나하나 그어가며 오늘을 알차게 보내자. 남을 위한 일이라면 말보다는 행동으로 보여주자.");
        			System.out.println("궁금하거나 알아야 할 일들은 직접 찾으려고 하는 것도 좋지만");
        			System.out.println("주위 사람들의 도움을 받는 것도 많은 도움이 된다.");
        			System.out.println("오늘은 현금을 가지고 나가지 않는 것이 좋겠다.");
        			System.out.println("가지고 나갔다하면 돌려받지 못할 곳에 빌려주게 될 것이다.");
        			System.out.println("그러니 아예 쓸 돈 만 딱~! 챙겨가지고 가는게 좋겠다.");
        }
        if(starSign=="황소자리" && today % 5==1) {
        			System.out.println("당신의 매력지수가 충만한 날이다. ");
        			System.out.println("동성, 이성에게 당신의 매력을 팍팍 어필할 수 있다.");
        			System.out.println("어색하게 노력하지 않아도 오늘 당신의 매력이 자연스럽게 줄줄 흐를 것이니 모임에서 인기 급상승하겠다.");
        			System.out.println("자연스런 모습이 오늘의 포인트, 은근슬쩍 다가오는 누군가와 핑크빛 젊음이 시작될 수 있겠다.");
        			System.out.println("짝꿍이 있는 당신이라면 아찔한 몰래 데이트를 살짝 꿈꿔봄직하다.");
        }
        if(starSign=="황소자리" && today % 5==2) {
        			System.out.println("오늘 당신은 활활 타오르는 활화산같다.");
        			System.out.println("활달하고 열정적으로 보일수는 있겠지만 스스로 쉽게 지치겠다.");
        			System.out.println("컨디션이 받쳐주질 않으니 꽥 하고 쓰러지기 전에 무리하지 말자.");
        			System.out.println("오후가 될수록 집중력도 점점 떨어지고 몸도 무거워지겠다.");
        			System.out.println("중요한 일이 있다면 가급적 오전에 해결하도록 하고 오후에는 여유있는 시간을 보내도록 하자.");
        			System.out.println("저녁메뉴로 새로운 음식에 도전해보는 것도 좋겠다.");
        }
        if(starSign=="황소자리" && today % 5==3) {
        			System.out.println("자양강장제 세 병을 한꺼번에 마신 듯, 컨디션이 업업업 상승하는 날이다. ");
        			System.out.println("몸도 가뿐한 것이, 기분도 좋으니 뭐든 할 수있을것 같다.");
        			System.out.println("다만, 들뜬 기분에 덜렁거리다 물건을 잃어버릴 수 있으니 오늘 소지품 관리에 주의할 것.");
        			System.out.println("금전적인 도움을 받기 쉬운 날이니, 가족이나 친척들에게 부탁을 하는것도 좋지만");
        			System.out.println("스스로 생각해도 현실성이 없는 부탁은 애초에 피하자. 서로 맘만 상할 수 있다.");
        }
        if(starSign=="황소자리" && today % 5==4) {
        			System.out.println("오늘은 부모님의 말씀이 곧 법이다. 부모님의 말씀대로 하면 손해볼 것이 없느니. ");
        			System.out.println("하지만 전적으로 의지하는 것은 좋지 않다.");
        			System.out.println("부모님의 말씀을 따르되 주체적으로 행동하는 의젓한 모습을 보일 것.");
        			System.out.println("도처에 안전사고가 도사리고 있다 조금 무리했다고 생각이된다면 하루를");
        			System.out.println("일찍 마무리하고 휴식을 취해야 다음날 후유증이 없겠다.");
        			System.out.println("오늘 주의할 것은 갑자기 욱! 하고 치밀어 오르는 화를 잠재우는 것!");
        }
        if(starSign=="쌍둥이자리" && today % 5==0) {
        			System.out.println("돈이 있든 없든 친구를 만나라. ");
        			System.out.println("당신이 돈이 없으면 다른 친구가 쓰면 되고,");
        			System.out.println("당신이 돈이 있으면 당신이 쓰면 되고 하지만 돈을 빌려주는 일은 안 하는 게 좋다.");
        			System.out.println("후에 그 돈으로 인해 친구와 다툴 수 도 있기 때문이다.");
        			System.out.println("도와줄 일이 생기면 할 수 있을 때까지 도와라.");
        			System.out.println("지금까지 당신의 굳어진 나쁜 이미지를 이번 기회에 만회해 보자.");
        			System.out.println("많은 사람들이 그런 당신의 모습을 보고 당신을 새로이 생각할 것이다.");
        }
        if(starSign=="쌍둥이자리" && today % 5==1) {
        			System.out.println("자존심이 밥 먹여주나? ");
        			System.out.println("밥은 엄마가 먹여줄 테니 나중에 후회하지 말고 자존심은 살짝 접어두자.");
        			System.out.println("그리고 마음에 드는 이성에게 당신의 마음을 표현하자.");
        			System.out.println("받아주면 다행인데 안 받아주면? 다른 사람을 찾아보는 것도 괜찮을 듯.");
        			System.out.println("오늘 당신을 받아주지 않는 그 사람은 당신의 짝이 아니거든.");
        			System.out.println("그보다 더 가까운 곳에서 당신의 짝이 기다리고 있으니까");
        			System.out.println("앞서 거절당했다고 해서 주눅 들거나 우울해하지 말자");
        }
        if(starSign=="쌍둥이자리" && today % 5==2) {
        			System.out.println("오늘은 집에서 나올 때 지갑을 놓고 나와도 안심해도 되겠다. ");
        			System.out.println("오래돼서 잊어버리고 있었던 돈을 친구가 갑자기 갚는다거나");
        			System.out.println("길바닥에 떨어진 돈을 줍는다거나 어디서라도 돈이 생기게 되어있으니 말이다.");
        			System.out.println("그렇다고 일부러 지갑을 놓고 나온다던가 하는 오버는 금물~!");
        			System.out.println("어쩌다 생긴 돈이라면 보약을 해먹어도 좋을 듯.");
        			System.out.println("기존에 약했던 건강을 챙기도록 하자. 그리고 주위를 잘 둘러보아라.");
        			System.out.println("가까운 곳에서 당신의 위로가 필요한 사람이 있을 테니 힘이 되어주자.");
        }
        if(starSign=="쌍둥이자리" && today % 5==3) {
        			System.out.println("얼굴보고 얘기한다고 다 좋은 건 아니다. ");
        			System.out.println("오늘은 잠시 그/그녀의 목소리에 귀 기울여 보자.");
        			System.out.println("화가 났을 때 건조한 목소리와 사랑을 고백할 때 떨리는 목소리,");
        			System.out.println("당신을 부르는 목소리는 어떤지 눈감고 들어보는 건 어떨까?");
        			System.out.println("그동안의 오해가 있었다면 그런 감정들이 스르르 녹아 사라질 것이다.");
        			System.out.println("당신의 자존심을 내세우기보다 그/그녀를 이해하려고 해보자.");
        			System.out.println("당신의 진실함이 전달될 것이다.");
        }
        if(starSign=="쌍둥이자리" && today % 5==4) {
        	System.out.println("후배들에겐 항상 카리스마의 상징인 당신~! ");
        			System.out.println("오늘만은 부드러운 말투로 이야기 해보자.");
        			System.out.println("후배들은 당신의 행동에 의아해 할지도 모르겠으나 후에 인맥을 유지하려면 별 수 없다.");
        			System.out.println("그렇다고 후배들에게 휘둘려서는 안 된다. 약간의 카리스마는 남겨 놓을 것.");
        			System.out.println("당신이 분위기를 주도해야 한다. 곧 부드럽고 카리스마를 가진 선배로 후배들에게 기억될 것이다.");
        			System.out.println("할 수 없다고 생각하지 말고 시작해보자.. 부~드럽게 얘들아~");
        }
        if(starSign=="게자리" && today % 5==0) {
        	System.out.println("지나친 절약정신으로 스트레스를 받을 대로 다 받고 있는 당신! 쓸 땐 쓰자. ");
        			System.out.println("오늘은 콘서트에 가서 소리도 맘껏 지르고 사람들과 부딪치고 스트레스를 푸는 게 좋을 듯.");
        			System.out.println("고3 을 시작으로 지나가버린 케케묵은 스트레스까지도 한 방에 날려버리자.");
        			System.out.println("돈이야 쓸려고 모으는 거고. 썼으면 다시 모으면 그만이지..");
        			System.out.println("쓴 돈에 아쉬움이나 서운함은 갖지 말자! 후회도 금물이오~");
        			System.out.println("스트레스 받아서 병원 갈 돈 대신 써버렸다고 생각하자.");
        }
        if(starSign=="게자리" && today % 5==1) {
        			System.out.println("학교에서 잘나가는 그/그녀 의 눈빛이 당신을 향한다. ");
        			System.out.println("애인이 있는 당신 흔들흔들~ 조심하시라.");
        			System.out.println("당신의 주변에 당신 애인이 포섭해 놓은 사람들이 있을지도 모르니..");
        			System.out.println("눈 한 번 딱 감고 유혹에서 벗어나시길..");
        			System.out.println("그래야 오늘밤 맘 편히 두 다리 쭉~ 뻗고 잘 수 있을 것이다.");
        			System.out.println("그래도 못 참겠거든 당신의 연인과 밤새도록 전화통화라도 한다던 지..");
        			System.out.println("벗어나기 위해 노력하는 게 좋다. 솔로는?? 무조건 잡아야지~^^");
        }
        if(starSign=="게자리" && today % 5==2) {
        			System.out.println("유후~ 이게 웬 떡이냐?! 오늘 당신에게 그 떡이 생기는 날이다. ");
        			System.out.println("지난번 당신이 떡볶이를 사 준 친구로부터 패밀리 레스토랑식사를 초대 받는 날.");
        			System.out.println("작은 지출을 아끼지 말라. 배가 되어 당신에게 돌아올 수 있다.");
        			System.out.println("하지만 우동 한 그릇 사주고 호텔 뷔페를 원하는 당신~!!!!!");
        			System.out.println("꿈 깨시오...차라리 그 돈을 당신이 모아서 가는 게 더 빠를 듯.");
        			System.out.println("돼지 저금통에 땡그랑 한 푼~ 땡그랑 두 푼~ 돼지는 오늘도 배가 고프다.");
        }
        if(starSign=="게자리" && today % 5==3) {
        	System.out.println("당신의 연인에게 슈퍼맨, 배트맨 스파이더맨처럼 든든한 바람막이가 되어주어라. ");
        			System.out.println("왜냐하면 당신의 연인이 지금 힘들어 하고 있기 때문이지.");
        			System.out.println("다정하고 부드러운 말투로 대화해보자.");
        			System.out.println("당신과 연인의 관계가 한층 더 업! 그레이드 될 테니..");
        			System.out.println("당신의 연인과 눈물 한 방울 훌쩍~!");
        			System.out.println("흘렸다면 저녁메뉴는 단연 단 맛이 나는 걸로~!!!");
        			System.out.println("불고기나 호박죽 등 우울했던 당신들의 마음에 한줄기 단 빛이 되어줄 것이다.");
        			System.out.println("굿~! 초이스!!!");
        }
        if(starSign=="게자리" && today % 5==4) {
        			System.out.printf("선배에 대한 지나친 친절은 당사자에게 거부감 생기는 아부로 느껴질 지도 모른다. ");
        			System.out.println("후배들에게는 튀는 행동으로 보일 수도 있고.");
        			System.out.println("뭐든지 지나치면 모자란 것 보다 못한 법.");
        			System.out.println("모자라서도 안 되겠지만 지나치지도 말자.");
        			System.out.println("적당히 릴랙~스. 그것이 오늘을 살아가는 당신에게 필요한 한 가지.");
        			System.out.println("오늘 당신에게 돈을 빌려간 사람이 있다면 꼼꼼히 리스트를 만들어 놓자.");
        			System.out.println("친구는 친구요 돈 관계는 또 다른 것이니 이자는 몰라도 원금은 받아야 하지 않을까?");
        }
        if(starSign=="사자자리" && today % 5==0) {
        	System.out.println("아껴야 잘 살겠지만 죽을 때 끌어안고 갈 것 아니라면 ");
        			System.out.println("쓸 땐 또 쓰는 게 좋다. 백 원 아끼려다가 천원 쓰게 되는 날이니");
        			System.out.println("애초에 처음부터 천원 쓰는 게 속은 편하겠다.");
        			System.out.println("부모님한테 받은 용돈이나 아르바이트해서 번 돈이나");
        			System.out.println("다 쓰지 말고 펀드에 투자하라. 혼자서 잘 모르겠다면");
        			System.out.println("주변의 도움을 받는 것도 좋겠다. 재테크로 돈 좀 벌어보자고..");
        			System.out.println("머리 써서 돈벌기~!! 사람이 많은 곳을 찾아다니는 것도 좋을 듯.");
        			System.out.println("그곳에 답이 있다.");;
        }
        if(starSign=="사자자리" && today % 5==1) {
        	System.out.println("하루 종일 고민에 지쳐 아무것도 못 먹은 당신~! ");
        			System.out.println("대형마트에 가자. 식품 매장을 둘러보면서 시식 코너에");
        			System.out.println("의도적으로 접근한 당신은 베이커리에서 빵을 먹고,");
        			System.out.println("육류코너에서 불고기를 먹으며, 과일코너의 파인애플에");
        			System.out.println("마지막으로 음료 시음까지!! 배가 든든해진 당신 뒤도");
        			System.out.println("돌아보지 말고 떠나자. 자칫 한 외모 하는 직원에게 흔들려");
        			System.out.println("물건을 사게 될 수도 있으니..");
        			System.out.println("하지만 이것으로 오늘의 고민은 해결~!");
        }
        if(starSign=="사자자리" && today % 5==2) {
        			System.out.println("아직도 자신이 동화 속 공주님 왕자님이라고 생각하고 당신~! ");
        			System.out.println("헨젤과 그레텔에 나오는 마녀가 사는 과자로 만든 집이 있다고 꿈꾸는 당신~!");
        			System.out.println("꿈 깨는 게 좋겠다. 그렇지 않다면 동네 슈퍼 가서");
        			System.out.println("긴 막대기과자, 동그란 과자, 초콜릿으로 만들어보던가..");
        			System.out.println("당신은 거기 들어갈 수 없겠지만. 그래도 다행인 건 마녀한테 먹힐 일이 없지 않은가!.");
        			System.out.println("어쨌든 이젠 꿈속에서 그만 해매고 집으로 돌아가자.");
        			System.out.println("백마 탄 왕자는 없다. 잠자는 숲속의 공주도.");
        }
        if(starSign=="사자자리" && today % 5==3) {
        			System.out.println("간만에 기대 만땅하고 소개팅에 나간 당신. 허거덕~! ");
        			System.out.println("상대방의 무성의한 코디에 첫인상이 구겨진다.");
        			System.out.println("다른 이유 때문이라고 둘러대는 상대방에 당신의 맘은");
        			System.out.println("이미 상할 대로 상했다. 평소라면 다시 안 만날 생각이겠지만");
        			System.out.println("오늘만은 그 사람의 말을 믿어주자. 밑져야 본전이라는 마음으로.");
        			System.out.println("오늘은 당신의 너그러운 이해심이 발휘되는 날이거든~!");
        			System.out.println("분명 다음 만남에 상대방은 당신이 깜작 놀랄 만큼 멋진 모습으로 나타날 것이다.");
        }
        if(starSign=="사자자리" && today % 5==4) {
        			System.out.println("오늘 당신의 걱정이 하나 줄었다. ");
        			System.out.println("친구 말만 믿고 빌려주었던 돈을 받을 수 있는 날이다.");
        			System.out.println("하지만 도로 나갈 수 있으니 조심할 것. ");
        			System.out.println("돈 갚았다고 한 턱 내라고 말하는 친구들이 종종 있으니 말이다.");
        			System.out.println("지난밤 기분 나쁜 꿈을 꾸었다면 집안 구석구석 청소하자.");
        			System.out.println("옥상에 올라가 이불도 탈탈 털자. 기분이 한 결 나아 질 것이다.");
        			System.out.println("덕분에 스트레스도 제로~! 청소하다가 발견한 비상금은 당신을 위한 오늘의 뽀~너스!!");
        }
        if(starSign=="처녀자리" && today % 5==0) {
        			System.out.println("버릴 것은 미련 없이 버리도록 하자. ");
        			System.out.println("오늘 당신 주위에 있는 필요 없는 잡동사니 싹싹 정리하는 날로 삼자.");
        			System.out.println("정신만 산만해지고 마음만 답답하게 만들 수 있겠다.");
        			System.out.println("싹 버리고 나눠주고 나면 마음이 한결 정돈된다.");
        			System.out.println("오늘은 이성과 다툼수가 있다.");
        			System.out.println("그/그녀가 별것 아닌 일에 토라지거나 화를 낼 수 있겠으니");
        			System.out.println("거기에 덩달아 방방 화내지 말고 일단 들어주기만 하자.");
        			System.out.println("내일, 그/그녀의 기분이 풀어지면 당신에게 사랑의 서비스로");
        			System.out.println("고마움을 표시해 줄 것이다.");
        			System.out.println("말 한마디로 상대를 상처줄 수 있겠으니 말조심!");
        }
        if(starSign=="처녀자리" && today % 5==1) {
        	System.out.println("당신의 성실함으로 좋은 결과를 얻을 수 있는 날이다. ");
        			System.out.println("평소 성실하지 않았던 당신이라면? 그래도 오늘 성실한 척이라도 해보자.");
        			System.out.println("기대 이상의 결과들이 생길 것이다.");
        			System.out.println("오늘 하루 너무 나서지도, 나대지도 말고 특히 후배,");
        			System.out.println("아랫사람들과의 대립에선 무조건 양보하자.");
        			System.out.println("부딪혀서 나에게 득 될 것이 없는 날이다.");
        			System.out.println("내 말이 100% 맞아도 내편되어 주는 사람이 없으니.");
        			System.out.println("연인과는 갈등할 일이 생기지만 참으면 쉽게 넘어갈 수 있겠다.");
        }
        if(starSign=="처녀자리" && today % 5==2) {
        			System.out.println("버스 떠난 뒤에 손 흔들어 봤자 쑥스럽기만 하지, ");
        			System.out.println("한 번 지나간 버스는 후진하지 않는다. 지나간 일들일랑 잊어버리고");
        			System.out.println("오늘, 지금 하고 있는 일, 옆에 있는 사람들에게 성과 열을 다하는 날로 삼자.");
        			System.out.println("한가 지 일에 몰두하기 어렵다면 이것저것 닥치는 대로 일단은");
        			System.out.println("먼저 부딪치고 나서 생각하라. 다만, 너무 저돌적인 모습은 삼가하고");
        			System.out.println("대인관계를 위해 최대한 말을 매너있고 예의바르게 하자.");
        }
        if(starSign=="처녀자리" && today % 5==3) {
        			System.out.println("유들유들~ 유들유들한 처세가 필요한 오늘이다. ");
        			System.out.println("물론 세상엔 절대상식이란 것이 있지만 말이야");
        			System.out.println("'아'다르고 '어'다른 것이니 어떻게 표현하느냐에 따라서");
        			System.out.println("오늘 운세가 확확 바뀌겠다. 특히나 주의해야 할 것은 당신의 연애운!");
        			System.out.println("오늘 처신 잘못했다가 그동안 공들인 탑 우르르 무너질 수 있겠다.");
        			System.out.println("사소한 한마디가 초절정 비극수가 될 수 있으니");
        			System.out.println("오늘은 그/그녀의 기분을 살살 맞춰주는 것이 상책이다.");
        			System.out.println("어설프게 폼잡기보다는 실속을 차리는 쪽을 택하는 것이 결과가 좋은 날!");
        }
        if(starSign=="처녀자리" && today % 5==4) {
        	System.out.println("고민하고 어려워할수록 작정하고 일이 꼬이는 날이다. ");
        			System.out.println("에라 모르겠다 하는 마음으로 가능한한 무식! 간단!");
        			System.out.println("명료하게 생각하는 것이 차라리 낫겠다.");
        			System.out.println("가볍게 단순하게 그리고 이왕이면 유쾌하게 행동하면 금상첨화.");
        			System.out.println("주변 사람들과도 물 흐르듯 자연스럽게, 튀려고 하지만 않는다면");
        			System.out.println("원만한 하루가 될 것 같다. 건강이 안좋아질 수있으니");
        			System.out.println("적당한 운동을 시작하려는 계획을 세워보는 것도 좋겠다.");
        }
        if(starSign=="천칭자리" && today % 5==0) {
        			System.out.println("엇! 소리 나도록 지나친 변화는 오히려 상대에게 반감을 줄 수 있다. ");
        			System.out.println("파격적인 변신보다 평소 당신의 스타일을 유지하는 것이 좋고,");
        			System.out.println("기분전환을 하고 싶다면 가볍게 분위기만 바꿔보는 방법을 택하자.");
        			System.out.println("오늘 하루, 시작이 어렵지만 처음 몇 고비만 넘어가면");
        			System.out.println("그 다음은 술술~ 풀리겠으니 초반이 어렵다고 포기해버리면");
        			System.out.println("아무 것도 얻을 것이 없다.");
        			System.out.println("자신감을 가진 당신, 좋은 하루를 보낼 수 있다.");
        }
        if(starSign=="천칭자리" && today % 5==1) {
        			System.out.println("남의 것이 좋아보인다 해도 괜한 그림의 떡, 못 먹는 감이다. ");
        			System.out.println("부러워만 하지 말고 내가 가진 장점, 내가 가진 좋은 것들을 찾아내는 날로 삼자.");
        			System.out.println("금전운, 명예운이 좋은 날이다.");
        			System.out.println("꽁돈으로 주변에 한턱 크게 쏘면 당신의 이름이 드높이 칭송될 것이니");
        			System.out.println("기분도 좋고 선심도 쓰고 좋은 소리도 듣겠다. 이성운도 나쁘지 않다.");
        			System.out.println("맘에 드는 그/그녀에게 슬쩍 작업을 걸어봐도 반응이 그리 나쁘지 않겠고,");
        			System.out.println("짝꿍이 있는 당신에겐 오늘 하루 데이트 분위기가 나쁘지 않겠다.");
        			System.out.println("지금 있는 당신의 것에만 충실하면 나머지는 모두 좋은 하루!");
        }
        if(starSign=="천칭자리" && today % 5==2) {
        			System.out.println("답답한 마음에 훌쩍 여행이라도 가고싶은 마음은 이해하지만, ");
        			System.out.println("오늘은 여행이나 움직이는 일은 가급적 삼가는 것이 좋겠다.");
        			System.out.println("현재의 위치를 지키는 것이 결과적으로 좋을 하루다.");
        			System.out.println("새로운 것을 시작하거나 새로운 계획을 세우는 것보다");
        			System.out.println("현재의 상태를 점검하고 뒤돌아 보는 일이 더 필요한 날이겠다.");
        			System.out.println("건강이 안좋아질 수 있으니 컨디션이 별로 좋지 않다면");
        			System.out.println("심각해지기 전에 휴식을 취할 것.");
        }
        if(starSign=="천칭자리" && today % 5==3) {
        			System.out.println("보낼 것은 보내버리고, 잊을 것은 잊어버리자! ");
        			System.out.println("지난 일에 얽매여봤자 나아가는 두 발목 붙잡기만 하지 아무 득이 없다.");
        			System.out.println("지나버린 것들에 얽매이지 말고 새로운 시작을 계획하는 것이 필요한 날!");
        			System.out.println("한 곳에 머물러 있는 것보다는 움직이고 변화를 시도하는 것이 도움이 되는 날이다.");
        			System.out.println("잘 안풀리는 일 붙들고 있는 것 보다 취미나 여가를 제대로 활용하면");
        			System.out.println("마음도 안정되고 스트레스도 사라지고 고민도 해결된다.");
        }
        if(starSign=="천칭자리" && today % 5==4) {
        			System.out.println("벌어진 문제들을 피하고 싶더라도 자신의 문제를 ");
        			System.out.println("다른 사람에게 떠넘기지 말지어다!");
        			System.out.println("지금 회피하면 다음에 문제가 생겼을 때 해결하지도 못하고");
        			System.out.println("정작 도움을 받을 수 있는 사람들도 다 떠나보낼 수 있다.");
        			System.out.println("오늘, 당신의 문제를 받아들이고 정면돌파! 하여 해결해보도록 하자.");
        			System.out.println("내일로 미루기보다 오늘, 가능한 빨리 해결하는 것이 손해가 적다.");
        			System.out.println("저녁은 든든한 것으로 먹자. 하루간의 심신의 피로를 말끔하게 씻어낼 수 있도록~");
        }
        if(starSign=="전갈자리" && today % 5==0) {
        			System.out.println("오늘은 허허실실 작전이 통한다. ");
        			System.out.println("당신 고집대로 밀고 가다간 상대방과 마찰이 생길 수 있으니");
        			System.out.println("당신의 생각을 주장하려면 허허~ 실실로 밀어붙이자.");
        			System.out.println("그러나 당신의 방식대로 밀고 가는 것보다는 주변 사람들에");
        			System.out.println("도움을 받는 게 좋은 날이다. 당신 혼자 했을 때보다");
        			System.out.println("더 많은 이득을 얻을 수 있다.");
        			System.out.println("연애운이 제법 좋은 날! 데이트에 필수요소인 재치 있는 농담이 오늘은 술술~");
        }
        if(starSign=="전갈자리" && today % 5==1) {
        			System.out.println("내게 그런 핑계대지마~ 입장 바꿔 생각해보자. ");
        			System.out.println("오늘 어설픈 핑계는 당신에게 망신살로 되돌아 올 것이다.");
        			System.out.println("환경이나 남을 탓할 필요도 없다.");
        			System.out.println("문제의 중심엔 바로 당신이 있다는 것을 명심할 것!");
        			System.out.println("논리적인 싸움, 이치를 따지는 말싸움은 시간 낭비에 불과하고 실속이 없겠다.");
        			System.out.println("약간은 단순하게 결정하고 행하는 것이 좋다.");
        			System.out.println("어수룩한 이미지로 밀고 나가는 것이 오늘은 현명한 처세가 되겠다.");
        }
        if(starSign=="전갈자리" && today % 5==2) {
        			System.out.println("운수좋은 날?? 아차! 실수 연발인 오늘 하루. ");
        			System.out.println("지하철을 놓치거나. 수업에 지각하는 등 당신이 원하지 않던 일들이 줄줄이 벌어진다.");
        			System.out.println("조심하는 방법 말고 별 처방이 없다.");
        			System.out.println("게다가 오늘따라 입이 간질간질하다.");
        			System.out.println("다른 사람에게 옮기는 싶은 말 투성이다.");
        			System.out.println("하지만 오늘은 당신의 입에 지퍼를 채우자.");
        			System.out.println("어설프게 대화에 참여했다가 괜한 구설수에 오를 일이 있겠으니 자나깨나 말조심!.");
        }
        if(starSign=="전갈자리" && today % 5==3) {
        			System.out.println("이것 저것 신경 쓸 일이 많은 하루다. ");
        			System.out.println("생각이 온통 딴 곳에 가 있으니 공부도 하기 싫고, 입맛도 없고,");
        			System.out.println("친구들과의 만남도 시큰둥하다. 신경이 예민하니");
        			System.out.println("조그만 말다툼이 끝내 서로의 자존심에 상처를 주는");
        			System.out.println("심각한 싸움으로 번질 수도 있겠다. 신경전이 벌어질 것 같다면");
        			System.out.println("애초에 시작하지 말자. 데이트 약속이 있다면 다음으로 미루는 것이 좋겠다.");
        			System.out.println("적당히 전화통화, 문자로 주고 받는 온라인 데이트를 해 보는 것도 좋은 방법이다.");
        }
        if(starSign=="전갈자리" && today % 5==4) {
        			System.out.println("견고하던 사랑탑이 흔들흔들 하진 않나 확인이 필요한 날이다 ");
        			System.out.println("요즘 유난히 남친, 여친의 심기가 불편한 것 같단 생각이 들진 않았는지?");
        			System.out.println("오늘 허심탄회한 대화의 자리를 마련하자. 큰맘 먹고");
        			System.out.println("근사한 저녁을 먹으면서 대화를 풀어나가면 분위기는 더 좋겠지?");
        			System.out.println("주변에서 괜스레 참견하려는 사람들이 있다면 오늘은 좋다.");
        			System.out.println("둘, 둘이 모인 더블데이트도 추천!");
        			System.out.println("어부지리로 얻는 것들이 있을 것이니~");
        }
        if(starSign=="사수자리" && today % 5==0) {
        			System.out.println("이것도 해야 되고 , 저것도 해야 되고, ");
        			System.out.println("백날 생각만 하던 당신~! 일기장 가득 해야겠다는 일만");
        			System.out.println("잔뜩 적어놓고 지나온 시간들을 봤을 때 어디? 뭐 실천한 거 있었나???");
        			System.out.println("오늘은 그 일들을 시작하자.");
        			System.out.println("오늘 시작해서 오늘 결과를 볼 수 있는 일이라면 더 좋겠다.");
        			System.out.println("무조건 속전속결! 그것만이 당신이 살 길이다.");
        			System.out.println("주변의 도움을 받는 것도 좋지만 당신이 하는 것만큼 좋은 건 없다.");
        }
        if(starSign=="사수자리" && today % 5==1) {
        			System.out.println("일반 술집에서 하는 것처럼 술에 물탄 듯 물에 술탄 듯 오늘만은 금물이다. ");
        			System.out.println("술에 물을 탄들 물에 술을 탄들 그 어느 쪽도");
        			System.out.println("본연의 맛을 알 수 없으니 술이면 술! 물이면 물!");
        			System.out.println("당신의 정체를 밝혀라~! 자연~스럽게.");
        			System.out.println("맨 인 블랙을 보내기 전에...^^;");
        			System.out.println("남의 입에 오르내리기 싫다면 할 말만 딱 해라.");
        			System.out.println("부탁 잘 들어주기로 소문난 당신이라면 오늘은 단호하게 거절하자.");
        			System.out.println("앞으로 당신이 살아가는데 오늘의 거절이 큰 도움이 될 것이다.");
        }
        if(starSign=="사수자리" && today % 5==2) {
        			System.out.println("친구와 다투는 일이 생길지 모른다. ");
        			System.out.println("당신의 그 죽일 놈의 건망증 때문에 말이다.");
        			System.out.println("당신의 것만 잃어버리면 당신 속만 쓰리겠지만 친구의 물건까지 잃어버리면 쫌...");
        			System.out.println("거기다 그 물건 비싸기라도 하거나.. 당신이 수입이 없는 사람이라면 말 다 했다.");
        			System.out.println("그렇게 되면 무조건 사과하자. 감히 말한다면 당신 것이나 잘 챙기자.");
        			System.out.println("그래도 잃어버릴 수 있으니까.");
        			System.out.println("간혹 그 건망증 때문에 행운이란 걸 경험할 수도 있겠다.");
        }
        if(starSign=="사수자리" && today % 5==3) {
        			System.out.println("함께해요~ 만원의 행복! 오늘의 특별한 경험! ");
        			System.out.println("당신의 연인과 함께 최저의 비용으로 데이트를 즐겨보는 건 어떨지?");
        			System.out.println("카페에서 마시는 커피대신 공원에서 자판기 커피를 마시고");
        			System.out.println("버스 한 두정거장 쯤은 걸어 다니며 비싼 콘서트 대신");
        			System.out.println("거리의 악사 공연을 함께 즐기는 것. 당신의 연인이 순순히 따라주지 않는다고?");
        			System.out.println("그럼 최고의 비용으로 할 수 있는 데이트도 하면 되지 않느냐고 설득하자.");
        			System.out.println("꼭 언제할 지는 말하지 않아도 좋다. 자~ 그럼 고고씽~");
        }
        if(starSign=="사수자리" && today % 5==4) {
        			System.out.println(" 오늘 면접을 보는 당신에게 한 마디~! ");
        			System.out.println("주어진 질문에 소신껏 대답하자. 데굴데굴 머리 굴리는 소리? 다 들린다.");
        			System.out.println("당신의 생각이 맞을 수 있으니 자신 있고 확신 있는 언어로 상대를 제압하라.");
        			System.out.println("그렇다고 알아들을 수 없는 외국어나 외계어는 금물~! 당신의 마음을 전달 할 수가 없다.");
        			System.out.println("또한 다른 사람에게 도움을 요청해도 소용없으니 당신 스스로 해결하도록 하자.");
        			System.out.println("고민은 빨리 해결할수록 좋다.");
        }
        if(starSign=="염소자리" && today % 5==0) {
        			System.out.println("오늘 러브러브 데이트가 예상된다. ");
        			System.out.println("짝있는 당신, 그리고 짝 없는 당신!");
        			System.out.println("기대하시라~ 애정운이 길하니 적극적으로 나서면");
        			System.out.println("그동안 안 되던 일도 술술 풀릴 것이다.");
        			System.out.println("학업, 진행하던 일에 대해서는 악바리가 되어야 한다.");
        			System.out.println("악착같이 추진하고 달려들어야 원하던 결과를 얻을 수 있겠으니");
        			System.out.println("약간의 스트레스가 동반되더라도 꿋꿋하게 이겨내면 좋은 결과를 얻을 수 있다.");
        			System.out.println("금전운은 별로 좋지 않은데다 약간의 지출 또한 예상된다. 무리하지 않도록!!");
        }
        if(starSign=="염소자리" && today % 5==1) {
        			System.out.println("떠지지 않는 눈, 이불속에서 늦잠도 자고 싶고.. ");
        			System.out.println("몸도 영 찌뿌둥한 것이 한껏 게으름을 피우고 싶지만 오늘은 스톱!");
        			System.out.println("휴식보다는 일에 몰두해야 하는 날이다. 원인 없는 결과는 없는 것이니,");
        			System.out.println("나중에 가서 후회 말고 마음을 다잡아 부지런을 떨어보자.");
        			System.out.println("나중에 원망할 사람은 자신밖에 없으니.");
        			System.out.println("어설픈 핑계를 댔다간 본전도 못 찾을 수 있겠다.");
        			System.out.println("오늘 하루, 빈 말을 조심하자. 괜한 말에 책임을 져야 한 다거나");
        			System.out.println("선배의 기분을 상하게 하는 등 말실수가 있을 수 있는 날이다.");
        }
        if(starSign=="염소자리" && today % 5==2) {
        			System.out.println("누군가 톡! 건드리기만 하면 펑!하고 터질 듯 잔뜩 독이 올라있는 하루다. ");
        			System.out.println("그동안 차곡차곡 쌓여온 스트레스로 잔뜩 예민해 있는 당신!");
        			System.out.println("그러나 표정관리는 좀 해주시는 게 좋겠다.");
        			System.out.println("신경질적인 태도를 트집잡힐 수 있다.");
        			System.out.println("내 맘처럼 나를 이해해주는 사람도 별로 없으니");
        			System.out.println("아~ 인생은 외로운 것! 그러나 오늘, 연인과");
        			System.out.println("좀 더 가까워 질 수 있는 기회가 생길 수 있겠으니");
        			System.out.println("그/그녀에게 위로를 받을 수 있겠다.");
        			System.out.println("약간의 어리광도 먹히는 날!");
        }
        if(starSign=="염소자리" && today % 5==3) {
        			System.out.println("뿌린 대로 거두는 법. ");
        			System.out.println("그동안 심은 대로, 투자한 만큼의 결실을 맺는 날이다.");
        			System.out.println("발로 뛰고, 움직이고, 생각하는 만큼 좋은 결과를 얻을 것이니");
        			System.out.println("오늘 하루, 기차처럼 칙칙폭폭 움직이자.");
        			System.out.println("당신의 팔랑귀 때문에 문제가 생길 수 있는 날이다.");
        			System.out.println("친구나 주변 사람들의 말만 믿고 움직였다가는 아무도 책임을 져주지 않는다.");
        			System.out.println("주변의 의견보다 자신의 의지대로 움직이는 것이 결과가 좋다.");
        }
        if(starSign=="염소자리" && today % 5==4) {
        			System.out.println("이성문제로 하루 일을 그르칠 수 있는 날! ");
        			System.out.println("아무리 이성에게 끌리는 것이 본능이라도,");
        			System.out.println("사적인 감정 때문에 일을 그르치지 않도록 하자.");
        			System.out.println("이성과의 문제로 하루 종일 마음쓰이겠으나 공과 사는 구별하는 것이 좋다.");
        			System.out.println("다른 사람에게 티내지 말고 둘의 문제는 둘이 알아서 해결하도록!");
        			System.out.println("오늘의 문제, 오늘 해결되지 않을 가능성이 높으니 차라리 오늘은 해결을 미루고");
        			System.out.println("학업에 몰두하는 것이 좋겠다. 잊고 있으면 없어질 문제일 수도 있다.");
        }
        System.out.println("===============================================");
        }
        
}