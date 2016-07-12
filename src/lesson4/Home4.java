package lesson4;

public class Home4 {
	
	public static void main (String[] args) {
		
		int[]array = {1,2,3,4,5};
		calcArrayAvg(array);
	}

	public static void calcArrayAvg (int[]array) {
	int avg = 0;
	for(int i = 0; i < array.length ; i++){
	avg = avg + array[i]; 
	}
	avg = avg/array.length;
	
	System.out.println("Среднее значение - "+avg);
	
}

}