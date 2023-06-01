package ans;

import add1.FirstNum;
import add2.SecondNum;

public class Addition {
    public static void main(String[] args) {
        FirstNum firstNum = new FirstNum();
        SecondNum secondNum = new SecondNum();

        int p,q,s;

        p = firstNum.a1();
        q = secondNum.a2();

        s = p + q;
        System.out.println(s);


    }
}
