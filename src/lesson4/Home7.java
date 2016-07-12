package lesson4;

public class Home7 {
	
	public static void main(String[] args){
		int[]array = {1,2,3,4,3,2,1};
		int[]array2 = {1,2,3,4,3,2,1,9};
		
		System.out.print("ARR   ");
		printArray(array);
		System.out.println(" ");
		
		System.out.print("ARR 2 ");
		printArray(array2);
		System.out.println(" ");
		
		System.out.println("Полиндромный ли массив?");
		
		isArrayPalindrom(array);
		if (isArrayPalindrom(array)== true){
			System.out.println("ARR TRUE");
		}else{
			System.out.println("ARR FALSE");
		}
		
		isArrayPalindrom(array2);
		if (isArrayPalindrom(array2)== true){
			System.out.println("ARR2 TRUE");
		}else{
			System.out.println("ARR2 FALSE");
		}
	}

	public static boolean  isArrayPalindrom(int[]array){
		for (int i = 0 ; i < array.length/2 ; i++ ) {
		if (array[i] != array[array.length - i - 1]) {
			return false;
		}
	}
		return true;
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
