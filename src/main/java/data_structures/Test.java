package data_structures;

import java.util.ArrayList;

public class Test
{
	public static enum FLAG_ENUM {
		Y,N
	};
    public static void main(String[] args)
    {

    	if(FLAG_ENUM.Y.toString().equalsIgnoreCase("Y")){
    		System.out.println("true");
    	}
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("11");
        arrayList.add("22");
        arrayList.add("33");
        arrayList.add("44");
        arrayList.add("55");
        arrayList.subList(3, arrayList.size()).clear();
        System.out.println(arrayList);
    }
}