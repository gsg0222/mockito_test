package blog.tsuchiya.mockito_test;

import static org.mockito.Mockito.*;

public class SpySample {

	public static void main(String[] args) {
		// RepositorySampleのうち、saveLengthImplだけをスタブ化
		RepositorySample spySample = spy(RepositorySample.class);
		doReturn(4).when(spySample).saveLengthImpl("string");

		// saveLengthImplを呼んでいるsaveLengthを実行
		// 長さ６の文字列を渡しているけど、スタブ化したメソッドが4を返す
		// また、saveLengthのprintlnは実行されるけどsaveLengthImplのは実行されない
		System.out.println(spySample.saveLength("string"));

		// スタブ化したメソッドが指定回数呼び出されていることを確認
		verify(spySample, times(1)).saveLength("string");
		verify(spySample, times(1)).saveLengthImpl("string");
	}
}
