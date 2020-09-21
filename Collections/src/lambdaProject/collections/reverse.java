package lambdaProject.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverse {

         public static void main(String[] args){
                 List list = Arrays.asList("one two three four five six siven".split(" "));
                 System.out.println(list);
                 Collections.reverse(list);
                System.out.println(list);
         }
}