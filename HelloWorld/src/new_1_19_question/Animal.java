package new_1_19_question;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {

	public static void main(String[] args) {

		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。

		// Dogクラスに動物の名前,数を代入
		Dog dog= new Dog("猫",200);

		// 動物の名前をコンソールに表示
		System.out.println(dog.animal);

		//　------------------------------------------------------------------------

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。

		// 動物の数をコンソールに表示
		System.out.println(dog.number);

		//　------------------------------------------------------------------------

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

		// 日時を取得
		Date date = new Date();

		// 取得した日時をフォーマット
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd E HH:mm:ss");

		// フォーマットした日時をコンソールに表示
		System.out.println(df.format(date));
	}

}
