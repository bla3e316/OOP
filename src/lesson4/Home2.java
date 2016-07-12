package lesson4;

public class Home2 {
	
	public static void main (String[] args){
		int[]array = new int[10];
		
			printArray(array);
			System.out.println(" ");
			fillArrayByRandom(array);
			printArray(array);
		
	}

	public static void fillArrayByRandom(int[]array){
		
		for (int  i = 0; i < array.length; i++ ){
			array[i] = (int)(Math.random()*10);
		}
	
	}
	
	public static void printArray(int[]array){
		for (int i = 0 ; i < array.length ; i++ ){
			if (i == 0) {
				System.out.print("["+array[i]+",");
				
			}else if ((i > 0) && (i < (array.length-1))) {
				System.out.print( array[i]+"," );
				
			}else {
				System.out.print(array[i]+"]");
			}
		}
	}	

}
