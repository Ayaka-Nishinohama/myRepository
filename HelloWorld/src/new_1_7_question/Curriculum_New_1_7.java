package new_1_7_question;

public class Curriculum_New_1_7 {

	public static void main(String[] args) {
		
//		問１）
//		以下のプログラムを作成してください。
//		①int型変数 i に 3 を代入する。
		int i = 3;
		
//		②double型変数 d に i を代入する。
		double d = i;
		
//		③変数 i と変数 d の値をそれぞれコンソールに表示する。
		System.out.println(i);
		System.out.println(d);
		
//		問２）
//		以下のプログラムを作成してください。
//		①double型変数 pi に数値「3.14」を代入して下さい。。
		double pi = 3.14;
		
//		②変数 pi に「3」を掛けた値をコンソールに出力して下さい。
		pi = pi*3;
		
//		④int型の変数 integer を宣言し、変数 pi を int型に型変換しコンソールに出力して下さい。
		int integer;
		pi = (int)pi;
		System.out.println(pi);
		
//		問３）
//		①double型の変数を定義し、「2 + 6.0」を代入して下さい。
//		　double型の変数をコンソールに出力して下さい。
		double d1 = 2 + 6.0;
		System.out.println(d1);
		
//		②int型の変数を定義し、double型の変数をint型に型変換して代入下さい。
//		　int型の変数をコンソールに出力して下さい。
		int i1 = (int)d1;
		System.out.println(i1);
		
//		③String型の変数を定義し、int型の変数をString型に型変換して代入して下さい。
//		　String型の変数をコンソールに出力して下さい。
		String s = Integer.toString(i1);
		System.out.println(s);
		
//		④「②」で定義したint型変数に、String型の変数をint型に型変換して代入して下さい。
//		　int型の変数をコンソールに出力して下さい。
		i1 = Integer.parseInt(s);
		System.out.println(i1);
		
	}
}
