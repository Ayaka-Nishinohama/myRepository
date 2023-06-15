package sub;

public class Sub{

	public void sub(Integer[] list) {

		// 11個格納出来る配列を作成
		String[] prefs = new String[11];

		prefs[0] = "北海道:札幌市:83424";
		prefs[1] = "青森県:青森市:9646";
		prefs[2] = "岩手県:盛岡市:15275";
		prefs[3] = "宮城県:仙台市:7282";
		prefs[4] = "秋田県:秋田市:11638";
		prefs[5] = "山形県:山形市:9323";
		prefs[6] = "福島県:福島市:13784";
		prefs[7] = "茨城県:水戸市:6097";
		prefs[8] = "栃木県:宇都宮市:6408";
		prefs[9] = "群馬県:前橋市:6362";
		prefs[10] = "埼玉県:さいたま市:3798";

		// 入力された要素数だけ繰り返す
		for (Integer aug: list) { 
			// 配列に格納された文章をsplitメソッドで分割し、配列p1に格納
			String[] p1 = prefs[aug].split(":");
			// コンソールに表示
			System.out.println("都道府県名：" + p1[0]);
			System.out.println("県庁所在地：" + p1[1]);
			System.out.println("面積：" + p1[2] + ".0km");
			// 改行
			System.out.println("");
		}
	}
}