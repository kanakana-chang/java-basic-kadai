package kadai_028;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		//Scannerクラスのオブジェクトを生成する
	    Scanner scanner = new Scanner(System.in);
	    
	    while(true) {
	    	System.out.println("自分のじゃんけんの手を入力しましょう");
	    	System.out.println("グーはrockのrを入力しましょう");
	    	System.out.println("チョキはscissorsのsを入力しましょう");
	    	System.out.println("パーはpaperのpを入力しましょう");
	    	
	    	//入力した内容を取得する
		    String input= scanner.next();
		    
		    if(!(input.equals("r") || input.equals("s") || input.equals("p"))) {
		    	System.out.println("正しい手を入力してください");
		    }else {
		    	return input;
		    }
	    }		
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		String[] partner= {"r","s","p"};
		
		Random random = new Random();
		int hand=random.nextInt(3);
		//int hand=(int)Math.ceil(Math.random() * 3);
		return partner[hand];
	}
	
	//じゃんけんを行う
	public void playGame() {
		HashMap<String,String> janken=new HashMap<String,String>();
		janken.put("r","グー");
		janken.put("s","チョキ");
		janken.put("p","パー");
		
		String own=getMyChoice();
		String partner=getRandom();
		System.out.println("自分の手は"+janken.get(own)+",対戦相手の手は"+janken.get(partner));
		
		if(own.equals(partner)) {
			System.out.println("あいこです");
		}else if((own.equals("r") && partner.equals("s")) || (own.equals("s") && partner.equals("p")) || (own.equals("p") && partner.equals("r"))) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
	}

}
