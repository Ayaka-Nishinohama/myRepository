package sushi.main;
import sushi.sub.*;

public class Main {

	public static void main(String[] args) {
		/*

		下記がコンソールに出力されるように作成してください

			こんにちは！ここは日本です！
			この寿司はうまい
			寿司は和食です
			今の現在日時は2023/03/09 10:23:39です

		【条件】
			・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
			・適切なファイルにフィールドで変数を必要な数作ってください。
			・thisを使って作成してください。
			・日時は今日の日付を取得してください。

		 */

		// Subクラス内のSubコンストラクタを呼び出し、値を代入
		Sub sub = new Sub();
		// Nowクラス内のNowコンストラクタを呼び出す
		Now now = new Now();

	}

}
