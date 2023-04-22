package new_1_10_question;

public class Curriculum_New_1_10_2 {

	public static void main(String[] args) {
		/*	
		問題.for文を使用して九九の計算を出力してください。
			※出力例 	1×1=1 1×2=2…1×9=9
						2×1=2 2×2=4…2×9=18
								・
								・
								・
						9×1=9 9×2=18…9×9=81
						*/
		for(int i = 1; i <= 9; i++) {
			for(int s = 1; s <= 9; s++) {
				System.out.print(i + "×" + s + "=" + i*s + " ");
				if(s % 9 == 0) {
					System.out.println("");
				}
			}
		}
	}

}
