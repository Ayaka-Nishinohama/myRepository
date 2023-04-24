package new_1_15_question;

public class Curriculum_New_1_15 {

	public static void main(String[] args) {
		/*
		①配列int test[][]に以下の成績を格納し、表示してください。
			出力結果：生徒1：国語64点、数学73点、英語69点
					  生徒2：国語58点、数学81点、英語75点
					  生徒3：国語86点、数学68点、英語79点
					  生徒4：国語72点、数学55点、英語80点
			
		②それぞれの教科の平均点を表示してください。
			出力結果：国語の平均点は○○点です。
					  数学の平均点は○○点です。
					  英語の平均点は○○点です。
		*/
		
		int[][] test = new int[4][4];
		
		test[0][0] = 1;
		test[0][1] = 64;
		test[0][2] = 73;
		test[0][3] = 69;
		
		test[1][0] = 2;
		test[1][1] = 58;
		test[1][2] = 81;
		test[1][3] = 75;
		
		test[2][0] = 3;
		test[2][1] = 86;
		test[2][2] = 68;
		test[2][3] = 79;
		
		test[3][0] = 4;
		test[3][1] = 72;
		test[3][2] = 55;
		test[3][3] = 80;
		
		int sum1 = 0;
		sum1 = test[0][1] + test[1][1] + test[2][1] + test[3][1];
		
		System.out.println("国語の平均点は" + sum1 / test.length + "点です。");
		
		int sum2 = 0;
		sum2 = test[0][2] + test[1][2] + test[2][2] + test[3][2];
		
		System.out.println("数学の平均点は" + sum2 / test.length + "点です。");
		
		int sum3 = 0;
		sum3 = test[0][3] + test[1][3] + test[2][3] + test[3][3];
		
		System.out.println("英語の平均点は" + sum3 / test.length + "点です。");
	}

}
