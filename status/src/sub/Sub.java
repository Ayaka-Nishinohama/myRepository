package sub;

public class Sub extends DetaBean {
	
	// コンストラクタを作成
	public Sub() {
		
	System.out.println("ステータス");
	
	// detaメソッドを呼び出し
	deta();
	
	System.out.println("さあ冒険に出かけよう！");
	
	}
	
	public static void deta() {
		
		// それぞれの値をコンソールに出力する為にインスタンスdtを作成
		DetaBean dt = new DetaBean();

		// それぞれの値をコンソールに出力
		System.out.println("HP：" + dt.hp());
		System.out.println("MP：" + dt.mp());
		System.out.println("攻撃力：" + dt.hi());
		System.out.println("素早さ：" + dt.sp());
		System.out.println("防御力：" + dt.gu());
		System.out.println();

}
	
}