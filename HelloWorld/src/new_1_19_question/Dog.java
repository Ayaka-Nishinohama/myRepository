package new_1_19_question;

public class Dog {

	// Q1：フィールドに動物の名前の変数を定義してください。
	
	// 変数animalを定義
	public String animal;
	
	// Q2：フィールドに動物の数の変数を定義してください。
	
	// 動物の数を指定する変数を定義
	public int number;
	
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	
	// 引数を2つ渡すコンストラクタを作成
	public Dog(String animal,int number){
		
		// 変数animalに犬を代入
		this.animal = animal;
		animal = "犬";
			
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	
		// 指定した引数を変数numberに代入する
		this.number = number;
	
	}
	
}
