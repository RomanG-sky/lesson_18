package lgs.lviv.ua;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class main {
 
	public static void main(String[] args) {
		GenericList<String, List<Integer>> newGeneric = new GenericList("Twenty two", new ArrayList(Arrays.asList("Twenty two"))); //List of Integer add String
		System.out.println(newGeneric.toString());
		newGeneric.ob2.add(22);
		newGeneric.ShowClass();
		System.out.println(newGeneric.toString());
		System.out.println(newGeneric.ob1);
		System.out.println(newGeneric.ob2);
		
		// Task from wiki
		System.out.println();
		MyEntry<String, Integer> marks440 = new MyEntry<String, Integer>("mike", 100);
		MyEntry<String, String> grade440 = new MyEntry<String, String>("mike", "A");
		System.out.println("grade: " + grade440);
		System.out.println("marks: " + marks440);
		
		// 2 task
		System.out.println();
		MyMap<String, Integer> TaskMap = new MyMap<>("uno",1);
		TaskMap.addObject("dos", 2);
		TaskMap.addObject("tres", 3);
		TaskMap.showMap();
		TaskMap.showKeys();
		TaskMap.showValues();
		TaskMap.delObjectKey("dos");
		TaskMap.showMap();
		TaskMap.delObjectValue(3);
		TaskMap.showMap();
		TaskMap.addObject("dos", 2);
		TaskMap.addObject("tres", 3);
		
	}
	
}
