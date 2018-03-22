package sample;

import java.util.ArrayList;
import java.util.Iterator;

class Collectiontest{
	ArrayList<String> al;
	public void m1() {
	al=new ArrayList<String>();
	al.add("shravani");
	al.add("parashara");
	al.add("parashara");
	al.add("parashara");
	
	System.out.println(al);
	Iterator it=al.iterator();
	while(it.hasNext())
	System.out.println(it.next());
	
	}
}
public class Testsample {
	public static void main(String[] args) {
		Collectiontest c=new Collectiontest();
		c.m1();
	}

}
