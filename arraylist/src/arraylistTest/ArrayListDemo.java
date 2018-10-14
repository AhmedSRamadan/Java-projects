package arraylistTest;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class ArrayListDemo  {
	
	List<String> list = new ArrayList<String>();
	
	
	
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public ArrayListDemo() {
		constructArrayList();
			}	
	
	private void constructArrayList()
	{
		list.add("Ahmed");
		list.add("Ramadan");
		list.add("Sherif");
		list.add("Ayman");
		
	}
	
	
	public static void main(String[] args) {
		
		
		ArrayListDemo obj = new ArrayListDemo();
		
		for(int i =0 ; i<obj.list.size() ;i++)
		{
		System.out.println(obj.list.get(i));
		}
		
		int length = 0;
		String index = "";
		for(int i =0 ; i<obj.list.size() ;i++)
		{
		if (obj.list.get(i).length()> length)
		{
			index = obj.list.get(i);
			length = obj.list.get(i).length();
			
		}
						
		}
		
		System.out.println(index);
		
		Collections.sort(obj.list);
		
		for(int i =0 ; i<obj.list.size() ;i++)
		{
		System.out.println(obj.list.get(i));
		}
		
		
		
		
		

	}

}
