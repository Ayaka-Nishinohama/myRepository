package new_1_14_question;

public class Curriculum_New_1_14 {

	public static void main(String[] args) {
//		string型の配列を作成し、アルファベットa～jまでを格納してください。
//		brake文を使用し、a～dまで表示してください。
//		
//		 出力結果：a
//		           b
//		           c
//		           d

        String[] s = { "a", "b", "c", "d", "e", "f", "g", "h" , "i" , "j" };
     
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
            if (i >= 3) {
                break;
            }
        }
        
        System.out.println("");
		          
//		cotinue文を使用し、i以外を表示してください。
//		
//		 出力結果：a
//		           b
//		           c
//		           d
//		           e
//		           f
//		           g
//		           h
//		           j
        
        for (int i = 0; i < s.length; i++) {
            if (i == 8) {
                continue;
            }
            System.out.println(s[i]);
        }
        
    }
}
