package com.cg.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example4 {

	public static void main(String[] args) 
	{
     Map<Integer,Integer> obj = new HashMap<Integer,Integer>();
     obj.put(1, 312);
     obj.put(2, 133);
     System.out.println(obj);
     Set<Entry<Integer, Integer>>obj1=obj.entrySet();
     Iterator<Map.Entry<Integer, Integer>> itr = obj1.iterator();
    while(itr.hasNext())
    {
    	Map.Entry e1 = itr.next();
    	System.out.print(e1.getKey()+" "+e1.getValue());
    }
 }

}
