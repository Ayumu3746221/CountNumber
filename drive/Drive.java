package drive;

import counter.CntNumber;//自作したクラス

//JavaAPI
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
public class Drive {

	public static void main(String[] args) {

		//精度と桁数の設定
		int precision = 1000; //桁数
		MathContext digit = new MathContext(precision);//桁数の設定

		//使う値を設定
		BigDecimal one = BigDecimal.ONE;
		BigDecimal two = new BigDecimal("2");
		BigDecimal three = new BigDecimal("3");
		BigDecimal seven = new BigDecimal("7");

		//分数の計算

		// 1/3
		BigDecimal one_three_result = one.divide(three,digit);
		CntNumber one_three = new CntNumber("1/3", one_three_result);
		one_three.displayInfo();

		// 1/7
		BigDecimal one_seven_result = one.divide(seven,digit);
		CntNumber one_seven = new CntNumber("1/7", one_seven_result);
		one_seven.displayInfo();

		//ルートの計算（ニュートン法で計算）　
		MathContext digit_root = new MathContext(precision, RoundingMode.HALF_UP);
		//√2
		BigDecimal sqrtTwo_result = sqrt(two, digit);
		CntNumber sqrtTwo = new CntNumber("√2", sqrtTwo_result);
		sqrtTwo.displayInfo();

		//√3
		BigDecimal sqrtThree_result = sqrt(three , digit_root);
		CntNumber sqrtThree = new CntNumber("√3", sqrtThree_result);
		sqrtThree.displayInfo();

		//ネイピア数の計算
		BigDecimal e_result = napier(digit);
		CntNumber e = new CntNumber("e", e_result);
		e.displayInfo();
	}

	//ニュートン法
	public static BigDecimal sqrt(BigDecimal number, MathContext digit) {
        BigDecimal x = new BigDecimal(Math.sqrt(number.doubleValue()));
        BigDecimal two = BigDecimal.valueOf(2);
        int maxIterations = digit.getPrecision();
        
        for (int i = 0; i < maxIterations; i++) {
            x = x.add(number.divide(x, digit)).divide(two, digit);
        }
        
        return x;
    }

	//ネイピア数の計算
	public static BigDecimal napier(MathContext digit){
		BigDecimal result = BigDecimal.ONE; //初期値を1に設定
		BigDecimal factorial = BigDecimal.ONE; //階乗の計算に使用するBigDecimal

		//ネイピア数を計算
		for(int i = 1; i <= digit.getPrecision(); i++){
			factorial = factorial.multiply(BigDecimal.valueOf(i));
			result = result.add(BigDecimal.ONE.divide(factorial, digit));
		}

		return result;
	}

}
