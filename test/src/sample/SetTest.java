package sample;

import java.util.HashSet;
import java.util.Set;

class SET{
  Set<String> s;
  String s1="parashara";
	public void setdemo() {
		s=new HashSet<String>();
		
		s.add("java");
		s.add("java");
		s.add("program");
		s.add(s1);
	System.out.println(s.contains(s1));
		System.out.println(s);
		
		
	}
}
public class SetTest {
	public static void main(String[] args) {
		SET s=new SET();
		s.setdemo();
	}

}
      