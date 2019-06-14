package javaConcepts;

public class DoWhile {

	public static void main(String[] args) {
		int i=19;
		do {
			System.out.println(i);
			i++;
			
		}
		while(i<25);
		
	}

}
// At least one time the loop body will be executed.
// while condition is true the loop will be again executed.
// while directly we are taking as true then it will be unreachable statement(it will run infinite times)