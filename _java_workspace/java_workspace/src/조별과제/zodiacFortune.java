package 조별과제;

	import java.text.SimpleDateFormat;

	import java.util.Date;
	

class zodiacFortune {
	
	public zodiacFortune() {} //생성자 
			 
	public void todayZodiacFortune(String birth, String name) {		// 사용자의 생년월일 입력받음
		        
		   
		        //오늘 날짜 숫자로 치환
		        Date date = new Date();
		        SimpleDateFormat sdf = new SimpleDateFormat("dd");
		        String dateString = sdf.format(date);
		        int today = Integer.parseInt(dateString);
		        
		        // 입력받은 생년이 무슨띠인지 확인
		        int year = Integer.parseInt(birth.substring(0, 4));
		        String[] zodiacs = {"원숭이띠", "닭띠", "개띠", "돼지띠", "쥐띠", "소띠", "호랑이띠","토끼띠","용띠", "뱀띠", "말띠", "양띠"}; 
		        int zodiacIndex = year%12;

		        
		     // 오늘의 운세 출력하기
		        System.out.println("===============================================");
		        System.out.println(name+"님의 띠 : " + zodiacs[zodiacIndex]);
		        System.out.println("오늘의 "+zodiacs[zodiacIndex]+" 운세" );
		        
		        //띠별 데이터
		        if(zodiacs[zodiacIndex]=="원숭이띠" && today%5==0) {
		        	System.out.println("오늘은 특히 가족들과의 관계에 신경 쓰며 함께 시간을 보내보길 바랍니다. ");
		        	System.out.println("가까운 곳으로 여행을 떠나 봐도 좋겠습니다.");
		        }
		        else if(zodiacs[zodiacIndex]=="원숭이띠" && today%5==1) {
		        	System.out.println("그동안 쌓인 스트레스와 긴장을 풀기에 아주 좋은 날입니다. ");
		        	System.out.println("잠깐이라도 시간을 내서 가벼운 등산을 하는 것이 좋겠습니다.");
		        }
		        else if(zodiacs[zodiacIndex]=="원숭이띠" && today%5==2) {
		        	System.out.println("오늘은 성과가 없더라도 급하게 생각하지 말고 마음을 비우는 것이 우선입니다.");
		        	System.out.println(" 좋아하는 음악을 들으며 마음을 진정시켜 보세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="원숭이띠" && today%5==3) {
		        	System.out.println("이성에게 너무 많은 관심을 보이기보단 적당한 무관심이 더 시선을 끌 수 있을 거랍니다.");
		        	System.out.println(" 만남을 가진다면 사람이 붐비는 곳이 좋겠습니다.");
		        }
		        else if(zodiacs[zodiacIndex]=="원숭이띠" && today%5==4) {
		        	System.out.println("학업의 기운이 좋으니 새로운 공부를 시작해 봐도 좋겠습니다.");
		        	System.out.println(" 스터디나 모임에 참석해 누군가와 함께하면 더욱 유리합니다.");
		        }
		        else if(zodiacs[zodiacIndex]=="닭띠" && today%5==0 ) {
		        	System.out.println("현재 수준에 만족하지 말고 더 나아질 여지는 없는지 찾아보는 것이 좋습니다.");
		        	System.out.println(" 북쪽에서 나의 귀인이 찾아오니 잘 찾아보세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="닭띠" && today%5==1 ) {
		        	System.out.println("지난날의 실패 보다는 앞으로의 성장에 눈을 돌려 집중하길 바라요.");
		        	System.out.println(" 친한 친구와 앞으로의 전망에 대해 이야기 해봐도 좋겠습니다.");
		        }
		        else if(zodiacs[zodiacIndex]=="닭띠" && today%5==2 ) {
		        	System.out.println("고민이나 어려운 일이 있다면 혼자 삭히기보단 누군가에게 도움을 청해보세요.");
		        	System.out.println(" 오늘은 그 분야의 전문가와 함께 해보길 바랍니다.");
		        }
		        else if(zodiacs[zodiacIndex]=="닭띠" && today%5==3 ) {
		        	System.out.println("이성을 만날 때 무엇보다 당당한 모습과 자신감이 필요하겠습니다. ");
		        	System.out.println("붉은색의 옷차림으로 기운을 상승시켜 보세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="닭띠" && today%5==4 ) {
		        	System.out.println("당신의 말과 행동에 힘이 실리니, 백마에 날개를 달아놓은 듯 합니다.");
		        	System.out.println("함께 한 사람들에게 반드시 보상을 해주도록 하세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="개띠" && today%5==0 ) {
		        	System.out.println("주변을 하나씩 정리하면 좋은 기운을 끌어 올릴 수 있는 날입니다. ");
		        	System.out.println("우선 청소를 하며 공간적 여유를 만드는 것부터 시작하세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="개띠" && today%5==1 ) {
		        	System.out.println("소중한 인간관계를 해치지 않도록 감정을 잘 조절하는 것이 현명합니다. ");
		        	System.out.println("오늘은 누가 잘못을 해도 눈감고 넘어가주세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="개띠" && today%5==2 ) {
		        	System.out.println("금전운이 좋네요. 수입을 더 늘릴 수 있는 방법을 찾아봐도 좋겠습니다. ");
		        	System.out.println("자투리 시간에 할 수 있는 부업을 시작해보도록 하세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="개띠" && today%5==3 ) {
		        	System.out.println("이성운이 좋으니 나에게 접근해오는 이성이 많아질 수 있겠습니다. ");
		        	System.out.println("기존의 연인에게 집중해야 탈이 없음을 명심하세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="개띠" && today%5==4 ) {
		        	System.out.println("오늘은 누군가와의 만남에 있어 소극적으로 행동하는 것이 유리하답니다.");
		        	System.out.println("행동하기 전 반드시 3번은 생각하길 바랍니다.");
		        }
		        else if(zodiacs[zodiacIndex]=="돼지띠" && today%5==0 ) {
		        	System.out.println("제대로 계획을 세우고 행동하거나 빈틈없이 준비해야 되는 날입니다. ");
		        	System.out.println("주변 말띠, 쥐띠와 함께 하면 문제없이 진행 가능합니다.");
		        }
		        else if(zodiacs[zodiacIndex]=="돼지띠" && today%5==1 ) {
		        	System.out.println("새로운 만남이 이루어지거나 좋은 신뢰를 쌓을 수 있는 날입니다. ");
		        	System.out.println("동업자를 구하고 있다면 오늘 제안해 봐도 좋겠습니다.");
		        }
		        else if(zodiacs[zodiacIndex]=="돼지띠" && today%5==2 ) {
		        	System.out.println("외출을 하면 지출만 커지니 집안에 머무르는 게 가장 좋겠습니다. ");
		        	System.out.println("밖으로 나갈 일이 있다면 꼭 필요한 현금만 지참하세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="돼지띠" && today%5==3 ) {
		        	System.out.println("연애운이 좋은 날이니 마음에 드는 이성과 만남을 가져보길 바라요. ");
		        	System.out.println("상대를 적극적으로 칭찬하는 방식이 효과적이겠네요.");
		        }
		        else if(zodiacs[zodiacIndex]=="돼지띠" && today%5==4 ) {
		        	System.out.println("일이 문제없이 진행되길 바란다면 끊임없는 확인과 반복적인 점검이 필요합니다.");
		        	System.out.println("토끼띠나 양띠 동료들과 함께 해나가도록 하세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="쥐띠" && today%5==0 ) {
		        	System.out.println("다른 이들에게 활기찬 목소리와 미소를 전달하면 즐거움이 배가 되는 날입니다.");
		        	System.out.println("오늘은 내가 먼저 다가가 인사를 해보도록 하세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="쥐띠" && today%5==1 ) {
		        	System.out.println("나만의 시간을 만들어 새로운 계획을 수립하며 내일을 준비하기 좋은 날입니다. ");
		        	System.out.println("현재 자신의 문제점을 냉철히 파악하는 것에 집중하세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="쥐띠" && today%5==2 ) {
		        	System.out.println("어떤 사람이나 일에 구속되지 않고 자유롭게 내 생각대로 움직일 수 있는 날입니다. ");
		        	System.out.println("누군가와 함께 하기보단 혼자 실천해보세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="쥐띠" && today%5==3 ) {
		        	System.out.println("상대의 말에 눈치껏 반응하며 대화를 해야 문제가 생기지 않음을 명심하세요. ");
		        	System.out.println("중요한 것은 상대방을 배려하는 다정한 마음이랍니다.");
		        }
		        else if(zodiacs[zodiacIndex]=="쥐띠" && today%5==4 ) {
		        	System.out.println("연애운이 좋은 날이니 좋아하는 감정을 전하면 원하는 대로 이루어진답니다. ");
		        	System.out.println("절대 문자나 전화를 피하고, 직접 만나서 전하도록 하세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="소띠" && today%5==0 ) {
		        	System.out.println("혼자 일하는 것이 익숙해도 오늘은 다른 사람들과 함께 일을 하는 것이 좋습니다. ");
		        	System.out.println("영양제를 잘 챙겨 먹으며 체력 안배에 주의하세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="소띠" && today%5==1 ) {
		        	System.out.println("내 곁의 사람들을 지나치게 챙기려 애쓰지 않는 것이 현명합니다. ");
		        	System.out.println("나의 호의를 이용하려는 사람이 있으니 주의하세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="소띠" && today%5==2 ) {
		        	System.out.println("조금이라도 확신이 든다면 과감하게 행동으로 옮겨 봐도 좋은 날입니다.");
		        	System.out.println("주변의 개띠, 돼지띠와 함께 하도록 하세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="소띠" && today%5==3 ) {
		        	System.out.println("평소에 어렵고 힘들게 느껴졌던 일에 도전해보면 좋은 결과를 얻을 수 있습니다. ");
		        	System.out.println("진한 회색 옷차림으로 기운을 상승시켜 보세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="소띠" && today%5==4 ) {
		        	System.out.println("마음에 있는 상대에게 하고 싶었던 말을 마음껏 전해 봐도 좋은 날입니다. ");
		        	System.out.println("진지한 분위기보단 아늑한 분위기가 유리하답니다.");
		        }
		        else if(zodiacs[zodiacIndex]=="호랑이띠" && today%5==0 ) {
		        	System.out.println("오늘은 일보다는 자신을 위해 시간을 쓰는 것이 현명하답니다. ");
		        	System.out.println("정적인 취미보단 활동적이고 움직임이 많은 운동을 해보세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="호랑이띠" && today%5==1 ) {
		        	System.out.println("문득 떠오른 아이디어라도 흘리지 말고 기록해둔다면 분명 사용될 수 있는 곳이 있어요.");
		        	System.out.println("친구나 동료와의 사적인 대화에서 좋은 방안을 얻을 수 있습니다.");
		        }
		        else if(zodiacs[zodiacIndex]=="호랑이띠" && today%5==2 ) {
		        	System.out.println("끝난 일에 신경을 쓰지 말고 앞으로의 일에 전력을 다해야 합니다. ");
		        	System.out.println("특히 누군가와 비교하며 시기 질투 하는 일을 절대 삼가세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="호랑이띠" && today%5==3 ) {
		        	System.out.println("누군가와 함께 하고 싶은 나의 마음을 표출해 봐도 좋은 날입니다.");
		        	System.out.println("우선 상대에게 나의 계획을 알리도록 하세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="호랑이띠" && today%5==4 ) {
		        	System.out.println("한 번에 너무 많은 일을 처리하기보다 하나씩 진행하는 것이 유리합니다. ");
		        	System.out.println("오늘 나의 행운의 숫자는 3과 5입니다.");
		        }
		        else if(zodiacs[zodiacIndex]=="토끼띠" && today%5==0 ) {
		        	System.out.println("좋은 결과를 얻기 위해서는 다른 사람들의 조언도 들어보는 것이 현명합니다.");
		        	System.out.println("같은 토끼띠나 뱀띠의 조언을 참고해보길 바라요.");
		        }
		        else if(zodiacs[zodiacIndex]=="토끼띠" && today%5==1 ) {
		        	System.out.println("생각만으로 일들이 이루어지지 않으니 기본적인 준비를 해 두어야 합니다. ");
		        	System.out.println("문서나 서류로 준비해두면 더욱 유리합니다.");
		        }
		        else if(zodiacs[zodiacIndex]=="토끼띠" && today%5==2 ) {
		        	System.out.println("쉽게 결론을 내릴 수 없는 일이라면 오늘은 일단 뒤로 미루어 두면 좋겠습니다. ");
		        	System.out.println("억지로 종결 짓는다면 갈등과 분쟁만 초래함을 명심하세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="토끼띠" && today%5==3 ) {
		        	System.out.println("선택의 순간에 놓인다면 다른 사람의 말에 현혹되지 않는 것이 중요합니다. ");
		        	System.out.println("오늘은 누군가의 조언을 한 귀로 듣고 한 귀로 흘리도록 하세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="토끼띠" && today%5==4 ) {
		        	System.out.println("오늘은 한 발 물러서서 마음을 느긋하게 가지는 모습을 보여주세요. ");
		        	System.out.println("일이나 공부에 집중하기보단 취미를 즐겨 봐도 좋겠습니다.");
		        }
		        else if(zodiacs[zodiacIndex]=="용띠" && today%5==0 ) {
		        	System.out.println("노력만큼의 수익이 없을 수 있으나 정신적으로 얻는 것이 많은 날입니다.");
		        	System.out.println(" 오늘 얻은 노하우나 팁은 반드시 후배들에게 전해주세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="용띠" && today%5==1 ) {
		        	System.out.println("기회는 준비된 사람에게 찾아온다는 말이 있듯 항상 나아가려는 자세가 필요합니다. ");
		        	System.out.println("평소보다 일찍 일어나 하루를 시작해보세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="용띠" && today%5==2 ) {
		        	System.out.println("오늘은 재테크나 투자에 있어 무모한 모습을 보이지 않길 바랍니다. ");
		        	System.out.println("실제 투자를 진행하기보단 정보를 수집하는 정도에 그치세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="용띠" && today%5==3 ) {
		        	System.out.println("유난히 이성들에게 주목받을 일이 잦으니 부끄럽지만 기회가 될 수 있는 좋은 하루에요. ");
		        	System.out.println("외적인 것에 신경 쓰면 오히려 불리해짐을 명심하세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="용띠" && today%5==4 ) {
		        	System.out.println("오늘은 억지로 일을 하려고 하지 말고 휴식을 취하는 것이 좋겠습니다.");
		        	System.out.println("충분히 잠을 자며 체력을 보충하도록 하세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="뱀띠" && today%5==0 ) {
		        	System.out.println("혼자 감당할 만한 일이 아니라는 생각이 들어도 일단은 버틸만큼 버텨내야 합니다. ");
		        	System.out.println("오전보단 늦은 오후의 기운이 더 좋으니 참고해보세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="뱀띠" && today%5==1 ) {
		        	System.out.println("가만히 있기 답답하더라도 일을 억지로 만들어 하려고 하지 않는 것이 좋습니다. ");
		        	System.out.println("드라마나 영화를 보며 감정을 표출해보도록 하세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="뱀띠" && today%5==2 ) {
		        	System.out.println("당신의 의견에 좋은 반응을 보이는 사람이 많아지는 날입니다. ");
		        	System.out.println("스스로를 믿고 리더십과 추진력을 발휘하며 사람들을 이끌어보세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="뱀띠" && today%5==3 ) {
		        	System.out.println("연애운이 최고조에 있으니 호감을 느껴온 이성과 약속을 잡아도 좋은 날입니다. ");
		        	System.out.println("되도록 서쪽에서 만남을 가지길 바랍니다.");
		        }
		        else if(zodiacs[zodiacIndex]=="뱀띠" && today%5==4 ) {
		        	System.out.println("무슨 일이든 시작하기 전에 자세히 알아보고 진행해야 함을 명심하세요. ");
		        	System.out.println("호랑이띠, 토끼띠와 함께 하면 걱정을 줄일 수 있습니다.");
		        }
		        else if(zodiacs[zodiacIndex]=="말띠" && today%5==0 ) {
		        	System.out.println("평범하게 생각했던 정보들 속에서 고귀한 정보를 찾아낼 수 있는 날입니다. ");
		        	System.out.println("형제, 자매와 정보를 공유하면 기운이 더욱 상승합니다.");
		        }
		        else if(zodiacs[zodiacIndex]=="말띠" && today%5==1 ) {
		        	System.out.println("서두르지 말고 일의 우선 순위를 정해 중요한 것부터 처리해야 하는 날입니다. ");
		        	System.out.println("오늘만큼은 나의 사적인 일이 우선임을 명심하세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="말띠" && today%5==2 ) {
		        	System.out.println("스스로에 대한 확신이 부족하다면 무언가를 결정하지 않는 것이 좋습니다. ");
		        	System.out.println("오늘은 기존의 것을 지키는 것에 주력하도록 하세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="말띠" && today%5==3 ) {
		        	System.out.println("주변 사람들에게 신뢰를 얻고 싶다면 적당한 자신감을 내비춰보길 바라요. ");
		        	System.out.println("노란 계열의 옷차림으로 사람들 앞에 서 봐도 좋겠습니다.");
		        }
		        else if(zodiacs[zodiacIndex]=="말띠" && today%5==4 ) {
		        	System.out.println("다양한 경험을 해보고 견문을 쌓아 자신의 가능성을 확장시키기 좋은 날입니다. ");
		        	System.out.println("어느 하나에 깊게 파고들기보단 여러 가지를 한 번에 진행하세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="양띠" && today%5==0 ) {
		        	System.out.println("기분을 최고조로 만들 수 있는 취미생활을 찾아 즐기기 좋은 날입니다. ");
		        	System.out.println("누군가와 함께하기보단 혼자 하는 취미가 좋겠습니다.");
		        }
		        else if(zodiacs[zodiacIndex]=="양띠" && today%5==1 ) {
		        	System.out.println("주변의 사소한 일이나 사건에 휘말리지 않도록 정신 차릴 필요가 있는 날입니다. ");
		        	System.out.println("동쪽으로 이동하면 요란스러운 기운이 중화됩니다.");
		        }
		        else if(zodiacs[zodiacIndex]=="양띠" && today%5==2 ) {
		        	System.out.println("전반적인 기운이 좋으니 새로운 일을 시작해 봐도 문제 없겠습니다. ");
		        	System.out.println("짧은 기간 내에 마무리 할 수 있는 일을 진행해보세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="양띠" && today%5==3 ) {
		        	System.out.println("오늘 당신의 머릿속으로 계산하고 분석하는 일이 잘 작동하는 날입니다. ");
		        	System.out.println("누군가에게 지시를 받거나 몸을 직접 움직이는 일은 피하세요.");
		        }
		        else if(zodiacs[zodiacIndex]=="양띠" && today%5==4 ) {
		        	System.out.println("실행 가능한 계획을 세우는 것에 집중하며 들뜬 마음을 추스러야 하는 날입니다. ");
		        	System.out.println("");
		        }
		        System.out.println("===============================================");

		        
}
}
