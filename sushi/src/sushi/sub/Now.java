package sushi.sub;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 

public class Now {

	// Nowコンストラクタを作成
	public Now(){

		// LocalDateTimeクラスのnow()メソッドを使用し、現在時刻を取得
		LocalDateTime nowDate = LocalDateTime.now();

		// 表示形式を指定
		DateTimeFormatter dtf2 =
				DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String formatNowDate = dtf2.format(nowDate);

		// コンソールに出力
		System.out.println("今の現在時刻は" + formatNowDate + "です");

	}
}
