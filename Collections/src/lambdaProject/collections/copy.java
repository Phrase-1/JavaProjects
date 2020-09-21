package lambdaProject.collections;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class copy {

        public static void main(String[] args){
                List m = Arrays.asList("one two three four five six siven".split(" "));
                System.out.println(m);
                List n = Arrays.asList("我 是 复制品".split(" "));
                //System.out.println(n);
                Collections.copy(m,n);
                System.out.println(m);
          }
 }