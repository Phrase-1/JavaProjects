package lambdaProject.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class binarySearch {

        public static void main(String[] args){
                List c = new ArrayList();
                c.add("l");
                c.add("o");
                c.add("v");
                c.add("e");
                System.out.println(c);
                int m = Collections.binarySearch(c, "o");
                System.out.println(m);
          }
}