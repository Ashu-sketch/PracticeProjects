package com.StringBuilderAndBuffer;

public class StringExamples {
	
	public static void timeTestOfBoth(){
		StringBuffer bf=new StringBuffer("JavaMyLanguage");
		long start=System.currentTimeMillis();
		for(int i=0;i<1000;i++) {
			bf.append("JavaMyLanguage");
		}
		System.out.println(System.currentTimeMillis()-start);
		
		 start=System.currentTimeMillis();
		for(int i=0;i<1000;i++) {
			bf.append("JavaMyLanguage");
		}
		System.out.println(System.currentTimeMillis()-start);
	}

	public static void main(String[] args) {
		StringBuffer bf=new StringBuffer("hello");
		bf.append(" java");
		System.out.println(bf);
//		timeTestOfBoth();
		
	//for(int i=0;i<10;i++) {
//		if(i==5) {
//			break;
//		}
//		System.out.println(i);
//	}
		
	}

}
