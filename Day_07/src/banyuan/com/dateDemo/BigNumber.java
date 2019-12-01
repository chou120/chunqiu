package banyuan.com.dateDemo;

import java.math.BigDecimal;

public class BigNumber {

    public static void main(String[] args) {

        System.out.println(0.01+0.09); //0.09999999999999999
        System.out.println(0.3-0.23);  //0.06999999999999998
        System.out.println(1.02333*100000); //


        BigDecimal   big=new BigDecimal("0.3");
        BigDecimal   big2=new BigDecimal("0.23");

        System.out.println(big.subtract(big2));

        //System.out.println(big.add(big2));

        System.out.println(big.divide(big2,6,BigDecimal.ROUND_CEILING));



    }


}
