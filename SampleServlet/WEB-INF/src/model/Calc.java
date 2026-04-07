package model;

import java.util.ArrayList;

/**
 * 計算クラス
 * @author Owner
 */
public class Calc {
	
	/**
	 * 計算結果＋文字列を格納したフィールド
	 */
	public ArrayList<String> resultList = new ArrayList<String>();
	
	/** コンストラクタ */
	public Calc(int a, int b) {
		resultList.add("加算：" + (a + b));
		resultList.add("減算：" + (a - b));
		resultList.add("乗算：" + (a * b));
		resultList.add("除算：" + (a / b));
		resultList.add("剰余：" + (a % b));
	}
}
