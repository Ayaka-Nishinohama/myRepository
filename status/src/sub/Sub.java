package sub;
import detaBean.DetaBean;

public class Sub extends DetaBean {

	public static void deta() {

		// nameをコンソールに出力する為にインスタンスdtを作成
		DetaBean dt = new DetaBean();
		// セッターを呼び出して変数nameに文字列を代入
		dt.setName("彩香");

		// それぞれの値をコンソールに出力
		System.out.println("こんにちは 「 " + dt.getName() + " 」 さん");
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
