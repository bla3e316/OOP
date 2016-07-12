package lesson4;

public class Home8 {
	
	public static void main(String[] args){
		int[]array = {3,2,5,8,6,4,5,3,7};
		int[]array1 = {3,2,5,8,6,4};

		printArray(array);
		System.out.println(" ");
		printArray(array1);
		System.out.println(" ");
		revertArray(array);	
		revertArray(array1);
		printArray(array);
		System.out.println(" ");
		printArray(array1);
	}

	public static void revertArray(int[]array){
			int count = array.length;
			System.out.println(count);
		
			for (int i = 0 ; i < count/2 ; i++ ){
				int tmp = array[i];
				array[i] = array[count - i - 1];
				array[count -i - 1] = tmp;
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
