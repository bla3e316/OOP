package lesson4;

public class Home6 {
	public static void main(String[] args){
		int[]array = {4,4,3,3,1,1};
		printArray(array);
		System.out.println(" ");
		swapMaxMinInArray(array);
		printArray(array);
		
	}
	
	public static void swapMaxMinInArray(int[]array){
		int maxval = 0;
		int minval = 0;
		int mini = 0;
		int maxi = 0;
		int tmp;
		for(int i = 0; i < array.length ; i++){
			if (array[i] > maxval) {
				maxval = array[i];
				maxi = i;
			}else {
				minval = array[i];
				mini = i;
			}
		}
		System.out.println(maxval +" "+ maxi +" "+ minval +" "+ mini);
		
		array[maxi] = minval;
		array[mini] = maxval;
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
