package LambdaExpression;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LamdaExp {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++) {
            list.add(i+1);
        }
        // using lambda exp
        list.forEach( (item) -> System.out.println(item*2));

        // another way
        //Consumer<Integer> fun = (item) -> System.out.println(item*2);
        //list.forEach(fun);

     // without lamda exp
        /* for(int i=0 ;i <list.size();i++) {
            System.out.println(list.get(i)*3)
        } */
    }
}
