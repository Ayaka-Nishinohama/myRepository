package main;	
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.stream.Stream;
import sub.Sub;

public class Main {

	public static void main(String[] args) {
		/*

	 	0, "北海道:札幌市:83424"
		1, "青森県:青森市:9646"
		2, "岩手県:盛岡市:15275"
		3, "宮城県:仙台市:7282"
		4, "秋田県:秋田市:11638"
		5, "山形県:山形市:9323"
		6, "福島県:福島市:13784"
		7, "茨城県:水戸市:6097"
		8, "栃木県:宇都宮市:6408"
		9, "群馬県:前橋市:6362"
		10, "埼玉県:さいたま市:3798"

	 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
	 	都道府県がソートされてコンソールに出力されるように作ってください
	   	※Packageを2つ作ってください
	   	※複数選択できるようにしてください

	   	例:
	   	8,5,9,.....
	   	と入力された場合（昇順）

	   	都道府県名：山形県
		県庁所在地：山形市
		面積：9323.0km2

	   	都道府県名：栃木県
		県庁所在地：宇都宮市
		面積：6408.0km2

	   	都道府県名：群馬県
		県庁所在地：前橋市
		面積：6362.0km2

		 */

		// Scannerクラスのインスタンスを作成
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(",");
		System.out.print("コンソールに数字を入力してください > ");
		String m = scanner.nextLine();

		System.out.print("コンソールに昇順or降順を入力してください > ");
		String s = scanner.nextLine();

		// 入力された数字を分割する為にsplitメソッドを使用し、配列valuesに格納
		String[] values = m.split( ",");

		// valuesの値をInteger型に変換し、numbersに格納
		Integer[] numbers = Stream.of(values).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

		// "昇順"でソート
		if(s.equals("昇順")) {
			Arrays.sort(numbers);
		// "降順"でソート
		}else if(s.equals("降順")) {
			Arrays.sort(numbers, Collections.reverseOrder()); 
		}

		//入力された内容を画面に表示
		Sub sub = new Sub();
		sub.sub(numbers);

		// Scannerクラスのインスタンスをクローズ
		scanner.close();
		
	}
}