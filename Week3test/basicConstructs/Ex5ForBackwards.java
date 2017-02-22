package basicConstructs;

public class Ex5ForBackwards {

	public static void main(String[] args) {
		
		//even values backwards from 1000 to -10
		//in rows of 10 each
		
		int numInRow=0;
		for (int index=1000;index>=-10;index=index-10){
			System.out.print(index + "  ");
			numInRow++;
			if(numInRow==10){
				System.out.println();
				numInRow=0;
			}
		}
		
		//NOTE: System.out.println(index);  cannot print here
		// since the variable index was declared in the for loop
		// it cannot be used outside of that scope.
		
	}

}
