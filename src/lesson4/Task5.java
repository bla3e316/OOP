package lesson4;

public class Task5 {

	public static void main(String[] args) {

		int result = maksi(2, 3);
		System.out.println(result);
	}
		
	

	public static int maksi(int a,int b){
		int result;
		if (a > b){
			result =  a;
		}else{
			result = b;
		}
		return result ;
	}

}
