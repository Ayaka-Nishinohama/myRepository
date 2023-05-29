package main;
import sub.Sub;
import java.util.Scanner;

public class Main extends Sub{

	public static void main(String[] args) {

		/*

		 名前を入力したら下記がコンソールに出力されるように作ってください
			条件：数値は毎回変わるように作ってください
			 	 サブクラスを使用してください
				 スーパークラスを使用してください
				 getterとsetterを使用してください
				 packageを2つ作ってメインと処理を分けてください
				 命名する場合は規則にのっとってください
				 コンストラクタを使用してください

			こんにちは 「 名前 」 さん
			ステータス
			HP：849
			MP：862
			攻撃力：375
			素早さ：937
			防御力：24

			さあ冒険に出かけよう！

		 */

		// Scannerクラスのインスタンスを作成
		// 引数で標準入力System.inを指定する
		Scanner scanner = new Scanner(System.in);
		// 入力を促すメッセージ
		System.out.print("名前を入力してください > ");
		//入力された内容をインスタンスから取得
		String input_text = scanner.nextLine();
		//入力された内容を画面に表示
		System.out.println("こんにちは 「 " + input_text + " 」 さん");
		// Scannerクラスのインスタンスをクローズ
		scanner.close();

		// Subクラスのインスタンスを作成
		Sub sub = new Sub();

	}

}