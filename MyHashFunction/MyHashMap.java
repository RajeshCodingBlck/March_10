package MyHashFunction;

import java.util.LinkedList;

public class MyHashMap {

	LinkedList<Entry> [] arr ;
	
	MyHashMap(){
		arr= new LinkedList[5];
		for(int i=0; i<arr.length;i++) {
			arr[i]= new LinkedList();
			//System.out.println(i + "->"+ arr[i]);
		}
	}
	
//	[0, arr.length-1]
	private int hashFunction(String key) {
		int hashValue =Math.abs(key.hashCode());
		return hashValue%arr.length;
	}
	
	// Bahaviour 
	public boolean containsKey(String key) {
		
		int index = hashFunction(key);
		LinkedList<Entry> list= arr[index];
		
		for( Entry e : list) {
			if(e.key.equals(key)) {
				return true;
			}
		}
		return false;	
	}
	
	public void put(String key, Integer value) {
	
		int index= hashFunction(key);
		if(containsKey(key)) {
			LinkedList<Entry> list= arr[index];
			for( Entry e : list) {
				if(e.key.equals(key)) {
					e.value=value;
					break;
				}
			}
		}else {
			
			LinkedList<Entry> list= arr[index];
			Entry newEntry= new Entry(key, value);
			list.add(newEntry);
		}
	}
	
	public Integer get(String key) {
		
		int index= hashFunction(key);
		LinkedList<Entry> list= arr[index];
		for( Entry e : list) {
			if(e.key.equals( key)) {
				return e.value;
			}
		}
		
		return null;
	}
	
	public void remove(String key)
	{ 
		int index= hashFunction(key);
		LinkedList<Entry> list= arr[index];
		for(int i=0; i<list.size();i++) {
			if(list.get(i).key.equals(key)) {
				list.remove(i);
				break;
			}
		}	
	}
	
	
	
	
	
}
