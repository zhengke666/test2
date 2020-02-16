import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author zhengKe
 * @date 2019-08-26 17:55
 * @desc
 */
public class aa {
    public static void main(String[] args) {
        String str = "/1123/1102/1201/"+1+"/";
        String[] split = str.substring(1).split("/");
        System.out.println(split[3]);
        BigDecimal bigDecimal = new BigDecimal("2.22225").setScale(4,BigDecimal.ROUND_HALF_UP);
        BigDecimal bigDecimal1 = new BigDecimal("2.222245");
        bigDecimal1.setScale(4,RoundingMode.HALF_UP).doubleValue();
        System.out.println(bigDecimal);
        System.out.println(bigDecimal1);
    }
}
