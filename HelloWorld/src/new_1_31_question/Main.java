package new_1_31_question;

class Main {
	public static void main(String[] args) {
		
//		問題1：Vehicleクラスを作成し、String型のprivateなインスタンスフィールド「owner」を定義しましょう。
//		
//		問題2：CarクラスとBicycleクラスを作成しましょう。
//		
//		問題3：Vehicleクラスにownerフィールドのゲッター「getOwner」とセッター「setOwner」を定義しましょう。
//		
//		問題4：MainクラスからsetOwnerを用いて、Carクラスのインスタンス「car」の所有者を「person1」に、Bicycleクラスのインスタンス「bicycle」の所有者を「person2」に設定します。Personクラスのインスタンスからフルネームを取得し、ownerにセットしてください。
//
//		問題5：セットできたら、ownerをコンソールに出力してください。
//		
//		問題6：Personクラスにインスタンスメソッド「buy」を定義しましょう。（仮引数：car）
//
//		問題7：buyメソッドの中でsetOwnerメソッドとthisを用いてownerフィールドの値をセットしましょう。
//		
//		問題8：さらに、「〇〇が購入しました」と出力する処理を追加してください。
//
//		問題9：引数の型が異なるbuyメソッドを定義しましょう。（仮引数：bicycle）
//		
//		問題10：Mainクラスからbuyメソッドを用いて、「person1」がcarを購入、「person2」がbicycleを購入するプログラムを作成しましょう。
		
		//1人目のインスタンスを作成
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		person1.print();
		
		//2人目のインスタンスを作成
		Person person2 = new Person("田中一郎", 24, 1.6, 59);
		person2.print();
		
		//合計人数をコンソールに表示
		System.out.println("合計" + Person.getCount() + "人です");
		
		//改行
		System.out.println();
		
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		
		//オーナーを設定
		car.setOwner(person1.name);
		bicycle.setOwner(person2.name);
		
		//オーナーをコンソールに表示
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());
		
		//乗り物を買うプログラムを作成
		person1.buy(car);
		person2.buy(bicycle);
	}
}
