package NoofVovels;


public class CountVovels {
	public static void main (String [] args) {
		
		String a ="pranil";
		//char []c=a.toCharArray();
		//System.out.println(c);
		int vovel=0;
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') {
		vovel++;
		//System.out.println("vovel:"+vovel+a.charAt(i));
		
		}
		
		
	}System.out.println("vovel:"+vovel);

}
}

