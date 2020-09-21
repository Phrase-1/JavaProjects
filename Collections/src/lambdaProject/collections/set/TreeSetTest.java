package lambdaProject.collections.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Teacher implements Comparable {  
    int num;  
    String name;  
  
    Teacher(String name, int num) {  
        this.num = num;  
        this.name = name;  
    }  
  
    public String toString() {  
        return "学号:" + num + " 姓名:" + name;  
    }  
  
    public int compareTo(Object o) {  
        Teacher ss = (Teacher) o;  
        int result = num > ss.num ? 1 : (num == ss.num ? 0 : -1);  
        if (result == 0) {  
            result = name.compareTo(ss.name);  
        }  
        return result;  
    }  
}  
  
public class TreeSetTest {  
    public static void main(String[] args) {          
        Set<Teacher> treeSet = new TreeSet<Teacher>();  
        treeSet.add(new Teacher("Jerry", 2));  
        treeSet.add(new Teacher("Jane", 1));  
        treeSet.add(new Teacher("Lisa", 3));  
        treeSet.add(new Teacher("Tom", 4)); 
        treeSet.add(new Teacher("Tom", 4)); 
        
        System.out.println(treeSet);//直接输出
        System.out.println("-------------");
        
        Iterator itTSet = treeSet.iterator();//遍历输出
        while(itTSet.hasNext())  
            System.out.print(itTSet.next() + "\t");  
        System.out.println();  
    }   
} 