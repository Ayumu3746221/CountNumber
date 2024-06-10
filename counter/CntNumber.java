package counter;
import java.math.BigDecimal;
public class CntNumber {

    //field
    private String name;
    private BigDecimal  number;
    static private int[] CountNumber = new int[10];
    
    //construct
    public CntNumber(String name,BigDecimal number){
        this.name = name;
        this.number = number;
    }

    //method
    static private char[] convert(BigDecimal number){

        //double型をString型に変換
        String numberStr = number.toPlainString();

        //String型をchar型の配列に変換
        char[] numberArray = numberStr.toCharArray();

        return numberArray;
    };

    //指定された配列の要素をカウントする
    static private int[] up(int num){
        CountNumber[num] += 1;
        return CountNumber;
    }

    static private void count(BigDecimal number){
        char[] numberArray = convert(number);
        //識別して各CountNumberに代入
        for (int i = 0; i < numberArray.length; i++) {
            switch (numberArray[i]) {
                case '0' :
                    up(0);; 
                    break;
                case '1':
                    up(1);
                    break;
                case'2':
                    up(2);
                    break;
                case '3':
                    up(3);
                    break;
                case '4':
                    up(4);
                    break;
                case '5':
                    up(5);
                    break;
                case '6':
                    up(6);
                    break;
                case '7':
                    up(7);
                    break;
                case '8':
                    up(8);
                    break;
                case '9':
                    up(9);
                    break;
                default:
                    break;
            }
        }
    }

    public void displayInfo(){
        count(number);
        System.out.println(name + "は");
        for (int i = 0; i < CountNumber.length; i++) {
            System.out.println(i + ":" + CountNumber[i]);
        }
        System.out.println();
    }
}
