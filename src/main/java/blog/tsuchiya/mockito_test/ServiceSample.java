package blog.tsuchiya.mockito_test;

import lombok.RequiredArgsConstructor;

/**
 * ビジネスロジックを実装するクラス。
 */
@RequiredArgsConstructor
public class ServiceSample {

	/** DBアクセサのダミー */
	private final RepositorySample rs;
	
	/**
	 * 引数の文字列の長さを保存して、その値を返す。
	 * @param target
	 * @return
	 */
	public int saveLength(String target) {
		return rs.saveLength(target);
	}
}
