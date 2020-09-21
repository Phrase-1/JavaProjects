package lambdaProject.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class rotate {

	public static void main(String[] args){
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(intList);
        Collections.rotate(intList, 1);
        System.out.println(intList);
   }
}