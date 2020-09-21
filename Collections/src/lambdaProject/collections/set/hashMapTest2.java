package lambdaProject.collections.set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class hashMapTest2 { //keep this one

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 利用HashMap创建一个城市有区号和城市名两列
		 * */
		HashMap<String, String> cities=new HashMap<String,String>();
		cities.put("029", "陕西");
		cities.put("0991", "乌鲁木齐");
		cities.put("010", "北京");
		/**
		 * 创建Set，是Key的集合,用来存放cities中所有的区号
		 * */
		Set<String> code=cities.keySet();
		/**
		 * 遍历存储在code中的所有cities的区号,打印出所有的区号
		 * */
		Iterator<String> it=code.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		/**
		 * 得到所有城市的名称：值得集合
		 * */
		//cities.values()得到城市集合中所有的城市名并保存在集合cityName中
		Collection<String> cityName=cities.values();     //不能放set中，因为values可能重复    
		/**
		 * 利用迭代器遍历整个cityName中的城市名
		 * */
		Iterator<String> it2 = cityName.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		} 

		System.out.println("---------------------------------------"); 
		//通过 map.values() 方法得到 Map 中的 value 集合  
		Collection<String> value = cities.values();
		for(String obj : value){
			System.out.println(obj);
		}// //it works   //for each 打印values


		System.out.println("---------------------------------------");  
		//通过 Map.entrySet() 得到 Map 的 Entry集合，然后遍历
		Set<Map.Entry<String, String>> entrys = cities.entrySet();
		for(Map.Entry<String, String> entry: entrys){
			String key = entry.getKey();
			String value2 = entry.getValue();
			System.out.println(key+":"+value2);
		}


		//通过 map.keySet() 得到 Map 的key 的集合，然后 通过 get(key) 得到 Value
		System.out.println("---------------------------------------");  
		for (Object key:cities.keySet()) {
			System.out.println("key:"+key+"--value:"+cities.get(key));
		}

		System.out.println("---------------------------------------"); 
		Set<String> set = cities.keySet();
		for(String str : set){
			Object obj = cities.get(str);
			System.out.println(str+": "+obj);
		}


		//输出
		System.out.println("---------------------------------------");  
		System.out.println(cities);

		//查询
		System.out.println("---------------------------------------");  
		System.out.println("key中是否有\"100\" :"+cities.containsKey("100"));
		System.out.println("value中是否有\"北京\" :"+cities.containsValue("北京"));

		//删除
		System.out.println("---------------------------------------");           
		cities.remove("010");
		System.out.println(cities);




	}
}