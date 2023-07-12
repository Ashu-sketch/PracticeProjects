package com.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		String[] stringArray = new String[] { "A", "B", "C", "D" };
		List stringList = Arrays.asList(stringArray);
		
	ArrayList<String> studArrayList=new ArrayList<>();
	studArrayList.add("Ashu");
	studArrayList.add("harshita");
	studArrayList.add("Muskan");
	
	ArrayList<String>newList=new ArrayList<>();
	newList.add("Chanchal");
	newList.add( "channi");
	//studArrayList.addAll(newList);
	studArrayList.addAll(0, newList);
	
	System.out.println(studArrayList);
	studArrayList.remove(0);
	System.out.println(studArrayList);	
//	studArrayList.clear();
	studArrayList.set(3, "Maansi");
	
System.out.println(	studArrayList.contains(newList));

//for (Iterator iterator = studArrayList.iterator(); iterator.hasNext();) {
//	String string = (String) iterator.next();
//	System.out.println(string);
//}

for(String s:studArrayList)	{
	System.out.println(s);
}
	

ArrayList<String> list = new ArrayList<String>();
list.add(null);
list.add(0, "A");
list.add(null);
list.add(2, "B");
list.add("20");
list.add(1, "C");		     
     
     
     System.out.println(list);
    

    	List<String> stringList2 = new ArrayList<>();
    	processList(list); // This is allowed
    	

    	
    
}

public static void processList(List<?> list) {
 
}
}
