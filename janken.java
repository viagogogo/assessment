/*
[じゃんけん]
（設定）
0:グー
1:チョキ
2:パー
*/ 
public class janken{
  public static void main(String[]args){
    int pc; //コンピュータの手
    int you; //あなたの手

//勝った場合にパワースポットを表示
String[] powerspot ={"https://wondertrip.jp/65520/","https://furaruga.com/2019/08/01/%E3%83%AB%E3%83%AB%E3%83%89%E8%A6%B3%E5%85%89%E3%83%AB%E3%83%BC%E3%83%88/","https://www.travel.co.jp/guide/article/27757/"};
//負けた場合に逆パワースポットを表示
String[] butpowersupot ={"https://beauty.biglobe.ne.jp/news/lifestyle/anan_201210_2418967061/"};
//あいこの場合観光スポットを表示
String[] sightseeing ={"https://www.jalan.net/kankou/270000/","https://gurutabi.gnavi.co.jp/i/gl2/","https://travel.rakuten.co.jp/mytrip/ranking/spot-osaka"};


    //-----じゃんけんをする-------
    //コンピュータの手
    pc = (int)(Math.random()*3;)
    //あなたの手
    you = Input.getInt("0:グー,1:チョキ,2:パー");


    //------勝ち負けの判定-------
    //あなたがグー
    if(you == 0){
      System.out.println("あなた:グー");

      //コンピュータがグー
      if(pc == 0){
        System.out.println("コンピュータ:グー");
        System.out.println("あいこです");
        System.out.println(sightseeing[(int)(Math.random() *3)]);
      }

      //コンピュータがチョキ
      if(you == 1){
        System.out.println("コンピュータ:チョキ");
        System.out.println("あなたの勝ちです");
        System.out.println(powerspot[(int)(Math.random() *3)]);
      }
      
      //コンピュータがパー
      else if(pc ==2){
        System.out.println("コンピュータ:パー");
        System.out.println("あなたの負けです");
        System.out.println(butpowersupot[(int)(Math.random() *3)]);
      }
    }
  
    //あなたがチョキ
    if(you == 1){
      System.out.println("あなた:チョキ");

      //コンピュータがグー
      if(pc == 0){
        System.out.println("コンピュータ:グー");
        System.out.println("あなたの負けです");
        System.out.println(butpowersupot[(int)(Math.random() *3)]);
      }

      //コンピュータがチョキ
      if(you == 1){
        System.out.println("コンピュータ:チョキ");
        System.out.println("あいこです");
        System.out.println(sightseeing[(int)(Math.random() *3)]);
      }
      
      //コンピュータがパー
      else if(pc ==2){
        System.out.println("コンピュータ:パー");
        System.out.println("あなたの勝ちです");
        System.out.println(powerspot[(int)(Math.random() *3)]);
      }
    }

    //あなたがパー
    if(you == 2){
      System.out.println("あなた:パー");

      //コンピュータがグー
      if(pc == 0){
        System.out.println("コンピュータ:グー");
        System.out.println("あなたの勝ちです");
        System.out.println(powerspot[(int)(Math.random() *3)]);
      }

      //コンピュータがチョキ
      if(pc == 1){
        System.out.println("コンピュータ:チョキ");
        System.out.println("あなたの負けです");
        System.out.println(butpowersupot[(int)(Math.random() *3)]);
      }
      
      //コンピュータがパー
      else if(pc ==2){
        System.out.println("コンピュータ:チョキ");
        System.out.println("あいこです");
        System.out.println(sightseeing[(int)(Math.random() *3)]);
      }
    }
  }
}