package com.ArrayList;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {

	public static void main(String[] args) {
		Set<String>hashset=new HashSet<>();
		hashset.add("Ashu");
		hashset.add("Ajay");
		hashset.add("Manisha");
		hashset.add("kuldeep");
		hashset.add("KULDEEP");		
		System.out.println(hashset);		
		hashset.remove("KULDEEP");
		System.out.println(hashset);
		
		System.out.println(hashset.contains("KULDEEP"));
		hashset.clear();
		System.out.println(hashset);
		
		//User Defined hashset object collection
		Set<Students> st=new HashSet<>();
		st.add(new Students(1, "Suraj"));
		st.add(new Students(9, "Raj"));
		st.add(new Students(9, "kiwi"));
		st.add(new Students(7, "Praj"));
		
	    st.add(new Students(9, "kl"));
		
		
		System.out.println(st);

	}

}
