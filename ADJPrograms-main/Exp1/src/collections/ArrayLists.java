package collections;

import java.util.ArrayList;

public class ArrayLists {
	public static void main(String args[]) {
		ArrayList<String> s1 = new ArrayList<String>();
		sl.add("sumaja");
		sl.add("gurlinka");
		sl.add("Bhimavaram");
		System.out.println("Array List elements inserted normally:"+sl);
		sl.add(1,"supraja");
		sl.add(3,"polnati");
		System.out.println("ArrayList elements inserted based on index:"+sl);
		sl.remove("srija");
		System.out.println("Array List element removed based on element:"+sl);
		sl.remove(1);
		System.out.println("Array List element removed based on their index:"+sl);
	}
}
