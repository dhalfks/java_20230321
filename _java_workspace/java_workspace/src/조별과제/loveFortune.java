package 조별과제;

import java.text.SimpleDateFormat;
import java.util.Date;

public class loveFortune {

	public loveFortune() {}
	
	public void todayLoveFortune(String fortuneBrithdate, int birthSum) {
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd");
		String dateString = sdf.format(date);					//오늘 일자를받음
		
		int today = Integer.parseInt(dateString);
		int month = Integer.parseInt(fortuneBrithdate.substring(4,6));
		
		int num = 0;
		
		if(today < 10) {								// num를 지정하기 위한 임의로 정한 수식
        	num = birthSum % today + 18 + month;
        	if(num>30) {
        		num = num - month - (today/2);
        	}
        }
        else if (today >=10 && today <20) {
        	num = birthSum % today ;
        	if(num>30) {
        		num = num - month - (today/4);
        	}
        }
        else {
        	num = birthSum % today ;
        }
		
		System.out.println("◆ 애정운");
		switch(num) {
			case 0 : 
				System.out.println("최선을 다해 마음을 전하려는 당신을 그 사람은 느낄 것입니다.");
				System.out.println("당신이 마음을 열고 다가가는 것에 따라 상대방도 당신에게 다가오는날");
				break;
			case 1 :
				System.out.println("사랑에 있어서 눈앞에 놓인 것을 보기 보다는");
				System.out.println("이전의 기억을 한번쯤 떠올려보게 되는 날이 될 것으로 보입니다.");
				System.out.println("사소한 일로 다툼을 부르게 될수 있으니 말실수를 주의해야하는 날입니다.");
				break;
			case 2 :
				System.out.println("걱정을 할 필요가 없는 날로 현재의 상황에 충실하다면");
				System.out.println("애정운은 나쁘지 않을것으로 보입니다.");
				break;
			case 3 :
				System.out.println("사람과의 관계에서 마음만큼 중요한 것이 없나는 사실을 알기에");
				System.out.println("서로가 마음이  척척 맞아 들어가는 것이 더없이 기쁜 하루입니다.");
				break;
			case 4 : 
				System.out.println("사랑이라는 큰 틀을 이룰는 요소들 중에서 믿음이라는 구성체의 역할이 크게");
				System.out.println("작용하는 날이라 해야하겠습니다 의심이 화를 부를 수잇고");
				System.out.println("이로 인해 많은 문제가 생길 수 있음을 기억해두는것이 좋겠습니다.");
				break;
			case 5 :
				System.out.println("하락 곡선을 걸었던 애정운이 급격히 상승하는 시기입니다. 혹시 서로에게");
				System.out.println("소홀해진 느낌이 들엇다면 서로를 다시 생각하는 자세를 가지고");
				System.out.println("서로에 대한 애정을 높일수 있는 날입니다.");
				break;
			case 6 :
				System.out.println("매일 가던곳, 만나던 사람 만나지말고 새로운 장소에 가면 사랑이 피어나는 날입니다.");
				break;
			case 7 :
				System.out.println("사랑이 더욱 커져 가고 있음을 몸으로 느낄 수있는 날입니다.");
				break;
			case 8 :
				System.out.println("상대방의 모습이 유난히 사랑스러워 보이는 날입니다.");
				break;
			case 9 :
				System.out.println("애정운은 호조를 띱니다. 자신이 나서서 노력만 하면 사랑을 얻을 수  있습니다.");
				break;
			case 10 :
				System.out.println("우연히 옛 사랑을 만나는 일이 생길수 있습니다.");
				System.out.println("그로 인해 지금의 사랑과 비교를 할 수 있는 가능성도 있습니다.");
				break;
			case 11 :
				System.out.println("두 사람의 사랑은 계속 커져만 갈것입니다.");
				System.out.println("서로에 대한 사랑이 커짐에 따라 믿음도 함께 커지기 때문에");
				System.out.println("웬만한 오해나 질투에서 벗어나는 것은 자유로울 수있습니다. ");
				break;
			case 12 :
				System.out.println("옛사랑의 희미한 그림자가 떠오르는 날입니다.");
				System.out.println("다시 만나도 부질없는 만남이 되기 쉬우니 마음을 다잡으세요.");
				break;
			case 13 :
				System.out.println("서로에게 조심스러워 오히려 문제가 되는 날입니다.");
				System.out.println("보다 편하게 대할 필요가 있습니다.");
				break;
			case 14 : 
				System.out.println("상대에 대한 애정이 지극해서 생기는 일이지만");
				System.out.println("이로 인해 당신의 사랑이 오해 받을수 있습니다.");
				System.out.println("애정이 커나가는 과정이기도 하지만 지나치면 상대를 질리게 만들기 쉽습니다.");
				break;
			case 15 :
				System.out.println("사랑을 너무 멀리서만 찾으려 하지마시고 인연이라는 것은");
				System.out.println("당신의 생각보다 가까운 곳에 있을 수도 잇다는 점을 잊지 않는다면");
				System.out.println("새로운 사랑의 기회는 어느새 당신 곁으로 찾아가게 될것입니다.");
				break;
			case 16 :
				System.out.println("마음과 마음의 교류는 진솔하게 할 때 가 가장 부드럽고 따듯한 느낌인 것이니,");
				System.out.println("자존심을 세운다거나 이런저런 핑계를 대며 도망친다거나 하지말고");
				System.out.println("오늘은 당신쪽에서 먼저 연락해보세요");
				break;
			case 17 :
				System.out.println("당신의 애정관이 흔들리는 오늘입니다. ");
				System.out.println("좀더 괜찮은 사람을 찾고 싶은 욕심이 생기기도하고");
				System.out.println("주변에서 당신에게 계속적인 관심을 보이는 이성도 있습니다.");
				System.out.println("연인과의 관계가 흔들리수도 있습니다.");
				break;
			case 18 :
				System.out.println("상대방에게 많은것을 베풀어주고 싶은 날입니다.");
				System.out.println("당신이 못먹더라도 상대방이 먹는 모습만 봐도");
				System.out.println("배가 부른날 일 수 있습니다.");
				break;
			case 19 :
				System.out.println("두 사람의 애정은 이제 더 이상 발전할 곳이 없다 ");
				System.out.println("싶을 정도로 강하게 형성되어 있습니다.");
				System.out.println("당신이 생각하는 것을 상대방은 눈빛 하나로도 모두 알 수 있으니");
				System.out.println("이 보다 더 좋은 상황이 있을 수는 없습니다.");
				break;
			case 20 :
				System.out.println("이래저래 충돌이 있고 세상이 돌아가는 것이");
				System.out.println("당신이 기대하고 예상했던 것과는 다소 차이를 보이니 답답할 수도 있을 것입니다.");
				System.out.println("그러나 언제나 좋은 일만 세상에 있는 것은 아닙니다.");
				System.out.println("모든 일은 좋은 것과 나쁜 것이 공존하듯 당신의 일상에 함께 존재하는 것입니다.");
				break;
			case 21 :
				System.out.println("여유로운 마음으로 사람을 만나보세요! ");
				System.out.println("오늘 당신의 사랑운이 무척 좋답니다. ");
				System.out.println("완벽한 사랑을 찾거나 만들려고 하시지 않으셔도 됩니다.");
				break;
			case 22 :
				System.out.println("당신의 사랑은 이미 충분하니 그것을 표현할 방법을 생각해 보십시오.");
				System.out.println("당신 마음속으로만 그걸 표현한다면 그것은 당신에게 ");
				System.out.println("진정한 의미의 사랑을 가져다 주기는 힘듭니다.");
				break;
			case 23 :
				System.out.println("두 사람의 애정전선 또한 아무런 문제가 없이 세력 확장 만을 하고 있는 모습이군요.");
				System.out.println("당신이 한 걸음 다가가는 만큼 상대방도 당신에게 다가올 것입니다.");
				break;
			case 24 :
				System.out.println("적 같은 만남을 기대하기보다는 일상의 소소함 속에서 좋은 인연을 찾아보세요.");
				System.out.println("만남의 기회가 생기면 거절하지 말고 편안한 마음으로 상대를 대해보세요. ");
				break;
			case 25 : 
				System.out.println("상대방에 대해 자신도 모르게 구속을 하게 될 수도 있는 생각이 드는 날입니다.");
				System.out.println("내 틀에 상대를 맞추고 싶은 마음에 약간의 다툼이 생길 수 있습니다. ");
				break;
			case 26 :
				System.out.println("두 사람의 사랑은 계속 발전하는 중이고");
				System.out.println("오늘도 그 발전 과정 중에 있는 날 중에 하루라고 할 수 있겠습니다.");
				System.out.println("상대방에게 있어 자신이 얼마나 큰 존재인지를");
				System.out.println("계속 확인하려는 모습을 보이지 않는다면 별다른 ");
				System.out.println("문제는 그리 발생하지 않을 것입니다.");
				break;
			case 27 :
				System.out.println("상대방을 더욱 더 믿어 보도록 하십시오.");
				System.out.println("이미 상대방은 당신에게 확신을 갖고 있으니 말입니다.");
				System.out.println("자신이 괜스레 의심하는 모습을 보인다면 상대방으로 ");
				System.out.println("하여금 자신의 모습에 실망하는 계기가 될 수 있습니다.");
				break;
			case 28 :
				System.out.println("아직 진정 행복이라는 단어의 뜻을 몸으로 느끼지 못했던 사람에게 ");
				System.out.println("말로만 듣던 그 행복이 직접 곁으로 찾아가게 될 수 있을 것으로 보이는 날입니다.");
				break;
			case 29 :
				System.out.println("전반적으로 애정운이 호조를 보이는 날이며");
				System.out.println("이 인위적인 행동이나 생각을 갖지 않아도 ");
				System.out.println("두 사람의 사랑이 커져 가는 날이라 표현해야 할 것입니다.");
				break;
			case 30 :
				System.out.println("작은 갈등은 있어도 별 탈 없이 서로에게 편안함을 느끼게 되는 날입니다.");
				System.out.println("다만 너무 일상적인 만남이 되지 않도록 여행이나 이벤트를 계획해보세요. ");
				break;

		}
		
		
		
	}
	
	
}
