package Minigame;

import java.util.*;

class Boom {
   final int SIZE = 3;
   LinkedList<String> player = new LinkedList<>();

   Scanner scan = new Scanner(System.in);

   // 플레이어 추가 메서드
   public void addPlayer() {

      try {
         while (true) {
            System.out.println();
            System.out.println("1. 플레이어 추가");
            System.out.println("2. 플레이어 변경");
            System.out.println("3. 플레이어 조회");
            System.out.println("4. 플레이어 메뉴 나가기");
            System.out.print("메뉴 입력 : ");
            int number = scan.nextInt();
            if (number == 1) {
               playerAdd();
            } else if (number == 2) {
               playerChange(player);
            } else if (number == 3) {
               searchPlayer();
            } else if (number == 4) {
               break;
            }

         }
      } catch (InputMismatchException e) {
         System.out.println("입력한 메뉴가 없습니다. 다시 입력해주세요.");
      }

   }

   // 플레이어 등록
   public void playerAdd() {
      player.add("플레이어");
      while (true) {
         System.out.println("플레이어를 등록하시겠습니까? y/n");
         char yor = scan.next().charAt(0);
         if (yor == 'y') {
            for (int i = 1; i < SIZE; i++) {
               System.out.println("플레이어 이름을 입력해주세요.");
               System.out.print("▶ ");
               String name = scan.next();
               player.add(i, name);
            }
            break;
         } else if (yor == 'n') {
            break;
         }
      }
   }

   // 플레이어 변경
   public void playerChange(LinkedList<String> player) {
      String newName = "";
      String playN = "";
      int check = 0;
      int count = 0;
      try {
         while (true) {
            System.out.println("변경을 원하는 플레이어 이름을 입력해주세요. 종료:n");
            System.out.print("▶ ");
            playN = scan.next();

            if (playN.equals("n")) {
               break;
            }

            for (int i = 1; i < SIZE; i++) {
               if (playN.equals(player.get(i))) {
                  check = 1;
                  count = i;
                  player.remove(i);
                  break;
               }
            }
            if (check != 1) {
               System.out.println("입력하신 이름이 없습니다. 다시 입력해주세요\n");
               continue;
            }
            break;

         }

         if (check == 1) {
            System.out.println();
            System.out.println("새로운 플레이어 이름을 입력해주세요.");
            System.out.print("▶ ");
            newName = scan.next();
            player.add(count, newName);
            System.out.println("플레이어 이름이 변경되었습니다.\n");
         }
      } catch (IndexOutOfBoundsException e) {
         System.out.println("변경할 플레이어가 없습니다.\n");
      }

   }

   // 플레이어 조회
   public void searchPlayer() {
      try {
         for (int i = 0; i < SIZE; i++) {
            System.out.println("플레이어"+"["+(i+1)+"]"+" : "+player.get(i));
            
         }
      } catch (IndexOutOfBoundsException e) {
         System.out.println("저장된 플레이어가 없습니다.");
      }

   }

   // 메뉴 출력
   public void printMenu() {
      System.out.println("(*☌ᴗ☌)｡ﾟ━💣ﾟ.*･｡ﾟ ");
      System.out.println("누구 손에서 폭탄이 터질까요?\n");

      System.out.println("[게임 방법]");
      System.out.println("▶ 같이 게임을 진행할 플레이어 2명을 추가합니다(본인제외)");
      System.out.println("▶ 게임이 시작되면 제한 횟수가 랜덤으로 정해집니다.");
      System.out.println("▶ 사용자는 폭탄을 주고싶은 플레이어 닉네임을 입력해주세요.");
      System.out.println("▶ 폭탄이 자신에게 터지지 않도록 다른 플레이어에게 폭탄을 넘겨주세요.\n");
   }

   // 폭탄 주고받기
   public void startGame() {
      try {

         String nowplayer = "";
         nowplayer = player.get(0);

         System.out.println(" ___    _                _   ");
         System.out.println("/ __> _| |_  ___  _ _  _| |_ ");
         System.out.println("\\__ \\  | |  <_> || '_>  | |  ");
         System.out.println("<___/  |_|  <___||_|    |_|  ");
         System.out.println();

         int bomb = (int) (Math.random() * 15) + 2;
         int count = 0;
         while (true) {

            System.out.println("[" + player.get(0) + "]" + "님 💣 폭탄을 받았습니다. 다른사람에게 넘겨주세요!");

            while (true) {
               System.out.print("플레이어 입력 : ");
               String playerInput = scan.next();
               if (playerInput.equals(player.get(1)) || playerInput.equals(player.get(2))) {
                  nowplayer = playerInput;
                  break;
               } else if (playerInput.equals(player.get(0))) {
                  System.out.println("나에게 넘길 수 없습니다. 다른 플레이어에게 넘겨주세요.");
               } else {
                  System.out.println("존재하지 않는 플레이어 입니다.");
               }
            }

            System.out.println(); // 줄바꿈

            for (int i = 1; i < SIZE; i++) {
               if (nowplayer.equals(player.get(i))) {
                  count++;
                  System.out.println("[" + player.get(i) + "]" + "님에게 💣 넘어갔습니다.");
                  System.out.println("[" + player.get(i) + "]" + "님이 💁🏻=͟͟͞͞💣 넘길 차례입니다.");
                  System.out.println();
                  nowplayer = player.get(i);
                  ;
               }
            }

            if (bomb <= count) {
               System.out.println("💥" + "[" + nowplayer + "]" + "님 폭탄이 터졌습니다!💥");
               System.out.println("제한횟수는 " + bomb + "입니다.");
               break;
            }

            // 내가 다른 플레이어에게 폭탄을 줬을때
            while (true) {
               int playerRandom = (int) (Math.random() * 3);

               if (player.get(playerRandom).equals(nowplayer)) {
                  continue;

               } else {
                  count++;
                  System.out.println("[" + player.get(playerRandom) + "]" + "님에게 💣 넘어갔습니다.");
                  System.out.println("[" + player.get(playerRandom) + "]" + "님이 💁🏻=͟͟͞͞💣 넘길 차례입니다.");
                  System.out.println();
                  nowplayer = player.get(playerRandom);
                  break;
               }
            }

            if (bomb <= count) {
               System.out.println("💥" + "[" + nowplayer + "]" + "님 폭탄이 터졌습니다!💥");
               System.out.println("제한횟수는 " + bomb + "입니다.");
               break;
            }

            // 다른 플레이어가 내가 아닌 다른 플레이어에게 폭탄을 줬을 때
            if (!nowplayer.equals(player.get(0)) || bomb != count) {
               while (true) {
                  int playerRandom = (int) (Math.random() * 3);

                  if (player.get(playerRandom).equals(nowplayer)) {
                     continue;

                  } else if (player.get(playerRandom).equals(player.get(0))) {
                     count++;
                     System.out.println("[" + player.get(0) + "]" + "님에게 폭탄이 넘어왔습니다.");
                     nowplayer = player.get(playerRandom);
                     break;

                  } else {
                     count++;
                     System.out.println("[" + player.get(playerRandom) + "]" + "님에게 💣 넘어갔습니다");
                     System.out.println("[" + player.get(playerRandom) + "]" + "님이 💁🏻=͟͟͞͞💣 넘길 차례입니다.");
                     System.out.println();
                     nowplayer = player.get(playerRandom);
                     if (bomb <= count) {
                        break;
                     } else if (!(player.get(playerRandom).equals(player.get(0)))) {
                        continue;
                     }
                     break;
                  }
               }
            }

            if (bomb <= count) {
               System.out.println("💥" + "[" + nowplayer + "]" + "님 폭탄이 터졌습니다!💥");
               System.out.println("제한횟수는 " + bomb + "입니다.");
               break;
            }
         }
         System.out.println(" ___  ___ ._ _ _  ___  ___  _ _  ___  _ _");
         System.out.println("/ . |<_> || ' ' |/ ._>/ . \\| | |/ ._>| '_>");
         System.out.println("\\_. |<___||_|_|_|\\___.\\___/|__/ \\___.|_|");
         System.out.println("<___'");
         System.out.println();
      } catch (IndexOutOfBoundsException e) {
         System.out.println("플레이어를 추가한 후 다시 시작해주세요!\n");
      }
   }

   // 실행하는 메서드 이름은 exe
   public void exe() {

      int num = 1;
      printMenu();
      boolean menu = false;

      while (num != 3) {
         System.out.println("1. 🙍플레이어 추가");
         System.out.println("2. 🕹게임시작");
         System.out.println("3. 🖐️게임종료");
         System.out.print("메뉴입력 : ");

         try {
            num = scan.nextInt();
            menu = true;
         } catch (InputMismatchException e) {
            System.out.println("입력한 메뉴가 없습니다. 다시 입력해주세요.\n");
            scan.next();
         }

         if (menu) {
            switch (num) {
            case 1:
               addPlayer();
               break;
            case 2:
               startGame();
               break;
            case 3:
               System.out.println("폭탄돌리기 게임을 종료합니다.");
               break;
            default:
               System.out.println("입력한 메뉴가 없습니다. 다시 입력해주세요.\n");
            }
            menu = false;
         }
      }
   }
}