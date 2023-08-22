package com.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {
		Map<String, Integer>map=new HashMap<>();
		map.put("one", 1);
		map.put("Two", 1);
		map.put("three", 1);
		
		map.put("four", 90);
		map.put("four", 1);
		
	    map.putIfAbsent("four", 90);
		System.out.println(map);
		
		for(Map.Entry<String, Integer>e:map.entrySet())	{
			System.out.println(e);
		}
	}

}
