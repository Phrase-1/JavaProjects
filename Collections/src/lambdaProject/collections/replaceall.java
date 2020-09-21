package lambdaProject.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class replaceall {

           public static void main(String[] args){
                  List list = Arrays.asList("one two three four five six siven".split(" "));
                  System.out.println(list);
                  List subList = Arrays.asList("three four five six".split(" "));
                  System.out.println(Collections.replaceAll(list, "siven", "siven eight"));
                  System.out.println(list);
            }
  }