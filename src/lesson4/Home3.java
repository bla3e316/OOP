package lesson4;

public class Home3 {
	public static void main (String[] args){
		int[]array = new int[10];
		int minRandom,maxRandom;
				
			printArray(array);
			System.out.println(" ");
			fillArrayByRandom(array,3,9);
			printArray(array);
		
	}

	public static void fillArrayByRandom(int[]array,int minRandom, int maxRandom){
		
		for (int  i = 0; i < array.length; i++ ){
			array[i] = (int)(Math.random()*10); //*(maxrandom-minrandom)
			//array[i] = minrandom +(int)(Math.random()*(maxrandom-minrandom))

			if ((array[i] >= minRandom) && (array[i] <= maxRandom)){
				array[i]=array[i];
			}else{
				i= i-1;
			}
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
