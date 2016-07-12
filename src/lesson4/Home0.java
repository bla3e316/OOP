package lesson4;

public class Home0 {
	public static void main (String[] args){
		int[]array = {1,2,3,4,5,6,7,8,9};
		calcNonPairCount(array);
	}

	public static void calcNonPairCount (int[]array){		//int
	int index = 0;
	for(int i = 0; i < array.length; i++){
	if (array[i]%2 == 1) {
		index ++;
		}
	}
	System.out.println(" Непарных - " + index);				//return index
	}

}