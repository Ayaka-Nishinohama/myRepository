package new_1_31_question;

class Person{
	
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;
	public static int count;
	public int instanceNumber;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name,int age,double height,double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		instanceNumber = ++count;
	}
	
	//BMIを返すメソッドを作成
	public double bmi() {
		return weight/(height*height);
	}
	
	//インスタンスを数えるメソッドを作成
    public static int getCount() {
        return count;
    }

    //それぞれの値をコンソールに表示
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("BMIは" + Math.floor(bmi()) + "です");
		System.out.println("年は" + this.age + "才です");
	}
	
	//Carを購入するメソッドを作成
	public void buy(Car car) {
		car.setOwner(this.name);
		System.out.println(car.getOwner() + "が購入しました");
	}
	
	//bicycleを購入するメソッドを作成
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.name);
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}