package sample.strings;
class StringTest{
	String str="parashara";
	char[] ch=str.toCharArray();
	public void remove() {
		for(int i=0;i<ch.length-1;i++) {
			for(int j=0;j<ch.length-1;j++) {
				if(ch[i]==ch[j]) {
					System.out.print(ch[i]); 
				}
				else {
					
				}
				
			}
			
		}
		
	}
	
}
public class Test {
	public static void main(String[] args) {
		StringTest obj=new StringTest();
		obj.remove();
		
	}

}
