package StringConcepts;

public class StringCapital {
	
	/*
	 * change words starts with small to capital
	 */

		public static void main(String[] args) {

			String s = "my name is rohit";
			String rev = "";
			
			String s1 [] = s.split(" ");
			for(int i =0; i<s1.length; i++){
			String f = s1[i].substring(0, 1).toUpperCase();
			String l = s1[i].substring(1, s1[i].length());
			System.out.print("This is Vasu");
			rev = rev +" "+  (f+l);
			
			
			}
			System.out.println(rev.trim());
			

		}


}
