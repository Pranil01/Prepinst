package RemoveExceptAlphabets;

public class RemoveAlpha {

	public static void main(String[] args) {
		String a ="P1R2A3N4I5L";
		String s = "S2H4I6V";
		
		a = a.replaceAll("[^a-zA-Z]","" );
		//b = b.replaceAll("[^a-zA-Z]","" );
		s = s.replaceAll("[^a-zA-Z]","" );
		System.out.println(a+" "+s);
		//System.out.println(a+" "+b);

	}

}
