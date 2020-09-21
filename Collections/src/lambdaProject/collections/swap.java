package lambdaProject.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class swap {

        public static void main(String[] args){
               List m = Arrays.asList("one two three four five six siven".split(" "));
                System.out.println(m);
                Collections.swap(m, 2, 3);
                System.out.println(m);
          }
}