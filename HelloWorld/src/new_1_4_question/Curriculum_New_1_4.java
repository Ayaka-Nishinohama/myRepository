package new_1_4_question;

public class Curriculum_New_1_4 {

    public static void main(String[] args) {
      	 
	     // Q1 下記9個をクラス変数として宣言のみしてください
	     //		・バイト型・短整数型・整数型・長整数型
	     // 	・単精度浮動小数点数型・倍精度浮動小数点数型
	     //   	・文字型・文字列型
	     //	 	・ブーリアン型 
   	byte by;
   	short sh;
   	int in;
   	long lo;
   	float fl;
   	double dou;
   	char ch;
   	String st;
   	boolean bo;
   	
	     // Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください
   	by = 0;
   	sh = 0;
   	in = 0;
   	lo = 0;
   	fl = 0.f;
   	dou = 0.0;
   	ch = 0;
   	st = null;
   	bo = false;
  	 
	     // Q3 初期化をしたそれぞれの変数に下記の値を代入してください
	
	     // ・バイト型                 10
   	by = 10;
   	
	     // ・短整数型                 100
   	sh = 100;
   	
	     // ・整数型                	 1000
   	in = 1000;
   	
	     // ・長整数型                 10000
   	lo = 10000;
   	
	     // ・単精度浮動小数点数型   	 9.5
   	fl = 9.5f;
   	
	     // ・倍精度浮動小数点数型		 10.5
   	dou = 10.5;
   	
	     // ・文字型                   a
   	ch = 'a';
   	
	     // ・文字列型              	 ハロー
   	st = "ハロー";
   	
	     // ・ブーリアン型          	 true
   	bo = true;
	    	 
	     // Q4 下記の通りにコンソール出力されるようにしてください
	     // 必ず変数を使用すること
	
	     // 11110
   	System.out.println(lo + in + sh + by);
   	
	     // 20.0
   	System.out.println(dou *2 - 1);
   	
	     // a ハロー true
   	System.out.println(ch + st + bo);
   	
	     // 11130.0                    数字を全て足す
   	System.out.println(by + sh + in + lo + fl + dou);
   	
	     // 10000000000                小数点以外の数字を全てかける
   	System.out.println(lo * in * sh * by);
   	
	     // 0.105                      10.5割る100をする
   	System.out.println(dou / sh);
   	
	     // -90                        10引く100をする
   	System.out.println(by - sh);
  	 
  	// Q5 
  	// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
  	//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		by = 43;
		System.out.println("ハローJAVA" + by);
		 
   }

}