package drive;

import counter.CntNumber;
import java.math.BigDecimal;
import java.util.Random;

public class RandomDrive {

	public static void main(String[] args) {

		//lengthに代入された値だけランダムな数字を生成
		int length = 1000;
		StringBuilder list = new StringBuilder(length);
		Random random = new Random();

		//forで処理
		for (int i = 0; i < length; i++) {
			int digit = random.nextInt(10);
			list.append(digit);
		}

		String randomNumberString = list.toString();

		//生成した文字列をBigDecimalに変換
		BigDecimal randomNumber = new BigDecimal(randomNumberString);
		CntNumber random_result = new CntNumber("擬似乱数", randomNumber);
		random_result.displayInfo();
	}

}
