package new_1_13_question;

public class Curriculum_New_1_13_1 {

	public static void main(String[] args) {
		/*
		int型の配列aを作成してください。
		配列aに1～5の数字を格納してください。
		繰り返し処理を使用し、
		配列aの数字を順番に表示させてください。

		出力結果：1
				  2
				  3
				  4
				  5
		*/
		
		int[] a = new int[5];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		for(int int1: a) {
			System.out.println(int1);
		}
	}

}
