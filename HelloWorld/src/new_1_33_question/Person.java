package new_1_33_question;

class Person{
	// インスタンスフィールドを定義
	public static int count = 0;
	public String firstName;
	public int age;
	public double height, weight;
	// インスタンスフィールドにlastNameを追加
	public String lastName;

	Person(String firstName, int age, double height, double weight){
		// インスタンスを作成するたびにcountに1を足す
		Person.count++;
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// lastNameの値を引数で受け取るコンストラクタを追加で定義
	Person(String firstName, String lastName, int age, double height, double weight){
		Person.count++;
		this.firstName = firstName;
		// lastNameフィールドの値をセット
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// firstNameとlastNameを組み合わせてフルネームを返すfullNameメソッドを作成
	public String fullName(){
		return this.firstName + this.lastName;
	}

	// 	fullNameメソッド,ageの値をコンソールに表示させるprintメソッドを作成
	public void print(){
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	// bmiの値を返すbmiメソッドを作成
	public double bmi(){
		return this.weight / this.height / this.height;
	}

	// インスタンスを数えてコンソールに表示させるprintCountメソッドを作成
	public static void printCount(){
		System.out.println("合計" + Person.count + "人です");
	}
}