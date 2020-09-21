package lambdaProject.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class indexof {

	public static void main(String[] args){
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 6, 7, 3));
        ArrayList<Integer> targetList = new ArrayList<>(Arrays.asList(6,6,6));
        System.out.println(targetList);
        System.out.println(Collections.lastIndexOfSubList(intList, targetList));
   }
}
