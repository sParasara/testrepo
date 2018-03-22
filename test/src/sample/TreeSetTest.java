package sample;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable{
	int id;
	String name;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	public String toString() {
		return id+"-----"+name;
	}
	@Override
	public int compareTo(Object o) {
		int id=this.id;
		Employee e=(Employee)o;
		int empid=e.id;
		if(id<empid) {
			return -1;
		}
		else if(id>empid) {
			return 1;
		}
		return 0;
	}
}
class Tree{
	TreeSet<Employee> set;
	public void m1() {
		Employee e=new Employee(1,"shravani");
		Employee e1=new Employee(2,"sharath");
		Employee e2=new Employee(3,"vaidehi");
		Employee e3=new Employee(4,"naresh");
		Employee e4=new Employee(5,"swathi");
		Employee e5=new Employee(6,"pnb");
		set=new TreeSet<Employee>();
		set.add(e);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e5);
		set.add(e4);
		
		
		System.out.println(set);	
		set=new TreeSet<Employee>(new Mycomparator());
		set.add(e);
		set.add(e1);
		set.add(e2);
		
		set.add(e4);
		set.add(e3);
		set.add(e5);
		System.out.println(set);
		
		
		
	}	
	
}
class Mycomparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e=(Employee)o1;
		Employee e1=(Employee)o2;
		String name1=e.name;
		String name2=e1.name;
		return name1.compareTo(name2);
	}
	
}

public class TreeSetTest {
	public static void main(String[] args) {
		Tree t=new Tree();
		t.m1();
	
		
	}
	
	

}
