package new_1_27_question;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 
	 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
	 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
	  	
	  	コンソール出力結果
	  	
	  	コンソールに文字を入力してください
	  	動物名：ライオン
		体長：2.1m
		速度：80km/h
		学名：パンテラ レオ
		
		動物名：ゾウ
		体長：3.2m
		速度：40km/h
		学名：ロキソドンタ・サイクロティス
		
		動物名：パンダ
		体長：1.9m
		速度：30km/h
		学名：アイルロポダ・メラノレウカ
		
		動物名：チンパンジー
		体長：0.94m
		速度：25km/h
		学名：パン・トゥログロディテス
		
		動物名：シマウマ
		体長：2.4m
		速度：65km/h
		学名：チャップマンシマウマ
		
		動物名：インコ
		体長：0.1m
		速度：50km/h
		学名：不明

	  */
		
		// Scannerクラスのインスタンスを作成
		// 引数で標準入力System.inを指定する
		Scanner scanner = new Scanner(System.in);
		
		// 入力を促すメッセージ
		System.out.print("コンソールに文字を入力してください");
		
		//入力された内容をインスタンスから取得
		String input_text = scanner.nextLine();
		String[] input_text_array = input_text.split("[,:]");
		
		//入力された内容を画面に表示
		System.out.println("動物名：" + input_text_array[0]);
		System.out.println("体長：" + input_text_array[1] + "m");
		System.out.println("速度：" + input_text_array[2] + "km/h");
		System.out.println("学名：パンテラ レオ");
		
		System.out.println();
		
		System.out.println("動物名：" + input_text_array[3]);
		System.out.println("体長：" + input_text_array[4] + "m");
		System.out.println("速度：" + input_text_array[5] + "km/h");
		System.out.println("学名：ロキソドンタ・サイクロティス");
		
		System.out.println();
		
		System.out.println("動物名：" + input_text_array[6]);
		System.out.println("体長：" + input_text_array[7] + "m");
		System.out.println("速度：" + input_text_array[8] + "km/h");
		System.out.println("学名：アイルロポダ・メラノレウカ");
		
		System.out.println();
		
		System.out.println("動物名：" + input_text_array[9]);
		System.out.println("体長：" + input_text_array[10] + "m");
		System.out.println("速度：" + input_text_array[11] + "km/h");
		System.out.println("学名：パン・トゥログロディテス");
		
		System.out.println();
		
		System.out.println("動物名：" + input_text_array[12]);
		System.out.println("体長：" + input_text_array[13] + "m");
		System.out.println("速度：" + input_text_array[14] + "km/h");
		System.out.println("学名：チャップマンシマウマ");
		
		System.out.println();
		
		System.out.println("動物名：" + input_text_array[15]);
		System.out.println("体長：" + input_text_array[16] + "m");
		System.out.println("速度：" + input_text_array[17] + "km/h");
		System.out.println("学名：不明");
		
		// Scannerクラスのインスタンスをクローズ
		scanner.close();
		
		
	}

}