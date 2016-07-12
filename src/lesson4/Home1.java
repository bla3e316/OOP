package lesson4;

public class Home1 {	
	
public static void main(String[] args) {	
		int[]array = {1,2,3,4,5,6,7,8,9,10};
		printArray(array);
	}
	
public static void printArray(int[]array) {
		for (int i = 0 ; i < array.length ; i++ ){
			if (i == 0) {
				System.out.print("["+array[i]+";");
				
			}else if ((i > 0) && (i < (array.length-1))) {
				System.out.print( array[i]+";" );
				
			}else {
				System.out.println(array[i]+"]");
			}
		}
	}	

}