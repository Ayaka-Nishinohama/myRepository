package new_1_5_question;

public class Curriculum_New_1_5 {
	
	public static String like = "寿司";

	public static void main(String[] args) {
		
		// Q1 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
        //  好きな食べ物のみインスタンス変数にして、他の項目はローカル変数に代入し○○に入れてください
        // 『山田太郎 18歳 170.5cm 62.2kg 寿司』

        // ↓↓format↓↓
        // 「初めまして○○です」
        // 「年齢は○○歳です」
        // 「身長は○○cmです」
        // 「体重は○○kgです」
        // 「好きな食べ物は○○です」

    	// Q1を下記に記載

		String name;
		byte age;
		double height,weight;
		
		name = null;
		age = 0;
		height = 0.0;
		weight = 0.0;
		
		name = "山田太郎";
		age = 18;
		height = 170.5;
		weight = 62.2;
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + like + "です");
		
		
        // Q2 Q1で作成した自己紹介に続いて、BMIがコンソールに出力されるようにしてください
    	// 「BMIは○○です」
        // ただし計算は数値を直書きせず、全て変数を使ってすること

        // Q2を下記に記載
		
		height = height/100.0;
		double result = weight/(height*height);
		String bmi = String.format("%.1f",result);
	      
		System.out.println("BMIは" + bmi + "です");
		
		System.out.println("");

        // Q3 Q1で宣言した変数に再代入し、下記の通りコンソールに出力してください
    	// 初めまして鈴木一郎です
    	// 年齢は24歳です
    	// 身長168.5cmです
    	// 体重は64.2kgです
    	// 好きな食べ物はオムライスです
    	// BMIは22.6です

        // Q3を下記に記載

		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		like = "オムライス";
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + like + "です");
		
		height = height/100.0;
		double result2 = weight/(height*height);
		String bmi2 = String.format("%.1f",result2);
		System.out.println("BMIは" + bmi2 + "です");
		

    	// ↓↓コンソール最終結果↓↓
    	
    	//	初めまして山田太郎です
		//	年齢は18歳です
		//	身長170.5cmです
		//	体重は62.2kgです
		//	好きな食べ物は寿司です
		//	BMIは21.4です
		//	
		//	初めまして鈴木一郎です
		//	年齢は24歳です
		//	身長168.5cmです
		//	体重は64.2kgです
		//	好きな食べ物はオムライスです
		//	BMIは22.6です
	}
}

