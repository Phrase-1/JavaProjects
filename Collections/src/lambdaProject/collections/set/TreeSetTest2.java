package lambdaProject.collections.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Student{  
    int num;  
    String name;  
  
    Student(String name, int num) {  
        this.num= num;  
        this.name = name;  
    }  
    public String getName() {
    	return name;
    }
 
    public void setName(String name) {
      this.name = name;
    }

    public int getNum() {
        return num;
 }

    public void setAge(int num) {
       this.num = num;
   }
  
    public String toString() {  
        return "学号:" + num + " 姓名:" + name;  
    }  
} 
    
class MyComparator implements Comparator<Student>{
	
    public int compare(Student st1,Student st2) {  
    	
    	 
        int result = st1.getNum() > st2.getNum() ? 1 : (st1.getNum() == st2.getNum() ? 0 : -1);  
        if (result == 0) {  
            result = st1.getName().compareTo( st2.getName());  
        }  
        return result;  
    }  
}  
  
public class TreeSetTest2 {  
	
    public static void main(String[] args) {     
    	
        Set<Student> treeSet = new TreeSet<Student>(new MyComparator ());  
        treeSet.add(new Student("Jerry", 2));  
        treeSet.add(new Student("Jane", 1));  
        treeSet.add(new Student("Lisa", 3));  
        treeSet.add(new Student("Tom", 4)); 
        treeSet.add(new Student("Tom", 4)); 
        
        System.out.println(treeSet);//直接输出
        System.out.println("-------------");
        
         Iterator itTSet = treeSet.iterator();//遍历输出
        
         while(itTSet.hasNext())  
          System.out.print(itTSet.next() + "\t");  
        
        System.out.println();  
    }   
} 
  
