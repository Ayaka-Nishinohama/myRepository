package sub;
import detaBean.DetaBean;

public class Sub extends DetaBean {
	
	public static void deta(String name) {

		// それぞれの値をコンソールに出力する為にインスタンスdtを作成
		DetaBean dt = new DetaBean();

		// それぞれの値をコンソールに出力
		System.out.println("こんにちは 「 " + name + " 」 さん");
		System.out.println("ステータス");
		System.out.println("HP：" + dt.hp());
		System.out.println("MP：" + dt.mp());
		System.out.println("攻撃力：" + dt.hi());
		System.out.println("素早さ：" + dt.sp());
		System.out.println("防御力：" + dt.gu());
		System.out.println();
		System.out.println("さあ冒険に出かけよう！");

	}

}