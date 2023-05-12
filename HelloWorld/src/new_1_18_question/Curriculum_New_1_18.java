package new_1_18_question;

public class Curriculum_New_1_18 {

	public static void main(String[] args) {

		//　Q1のメソッドを呼び出し
		hello();
		
		//　Q2のメソッドを呼び出し
		num(4,5);
		
		//　Q3のメソッドを呼び出し
		nums(new int[] {3,5,7});
		
		//　Q4のメソッドを呼び出し
		num(3.6,3.8);
		
		//　Q5のメソッドを呼び出し、Q6のメソッドで使用する為変数iに代入
		int[] i = numbers(5);
		
		//　Q6のメソッドを呼び出し、Q7のメソッドで使用する為変数dに代入
		double d = avr(i);
		
		// Q7のメソッドを呼び出し、コンソールに表示
		System.out.println(judge(d));

	}
	
	//　------------------------------------------------------------------------

	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。

	// Q1のメソッド
	public static void hello() {
		
		// コンソールに出力する為の値を代入
		String java = "Hello JavaSE ";
		int ver = 11;
		
		// コンソールに出力
		System.out.println(java + ver);
		
	}
	
	//　------------------------------------------------------------------------

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください

	// Q2のメソッド
	public static void num(int num1,int num2) {
		
		// 引数に渡した値同士を乗算する変数を定義
		int result =num1 * num2;
		
		// コンソールに出力
		System.out.println(result);
		
	}

	//　------------------------------------------------------------------------
	
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください

	// Q3のメソッド
	public static void nums(int [] x){

		// 配列の値を順番にコンソールに出力
		for(int i = 0; i < x.length; i++){
			System.out.println(x[i]);
			
		}
	}
	
	//　------------------------------------------------------------------------

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。

	// Q4のメソッド
	public static void num(double num1,double num2) {
		
		// 引数同士を和算する変数を定義
		double result =num1 + num2;
		
		// 結果をコンソールに出力
		System.out.println(result);
		
	}

	//　------------------------------------------------------------------------

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。

	// Q5のメソッド
	public static int[] numbers(int num3) {
		
		// 配列randomを初期化
		int[] random = new int[num3];
		
		// ランダムに配列の値を生成し、格納後コンソールへ出力
		for(int i = 0; i < num3; i++){
			random[i] = (int)(Math.random()*101);
			System.out.println(random[i]);
		}
		
		// 格納した値を返す
		return random;
		
	}
	
	//　------------------------------------------------------------------------

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。

	// Q6のメソッド
	public static double avr(int[] numbers) {
		
		// 変数を初期化
		int sum = 0;
		
		// 配列の値を順番に和算
		for(int i : numbers) {
			sum += i;
		}
		
		// 和算した値の平均を求める変数を定義
		double average = sum/numbers.length;
		
		// 平均値をコンソールに出力
		System.out.println(average);
		
		// 平均値を返す
		return average;
		
	}
	
	//　------------------------------------------------------------------------

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	// Q7のメソッド
	public static String judge(double d) {
		
		// 受け取った値が50以上ならばtrueを返す
		if(d >= 50) {
			return "true";
			// それ以外はfalse返す
		}else{
			return "false";
		}
		
	}
}