package lesson4;

public class Task3 {
	public static void main (String[] args){

		int [] array = new int[10];

		for(int i = 0; i < array.length ; i++){
			array[i] = (int)(Math.random() * 100);
		}
		
		for(int i = 0; i < array.length ; i++){
			System.out.print(array[i] +" " );
		}
		
		System.out.println(" ");
		
		for(int i = 0; i < array.length ; i++){
			if(array[i] <30) {
				array[i] = 0;
			}
		}
		
		for(int i = 0; i < array.length ; i++){
			System.out.print(array[i] +" " );
		}
		
		System.out.println(" ");

		int sum = 0;							//переменна для подсчета суммы
		for(int i = 0; i < array.length ; i++){ 
			sum = sum + array[i]; 
		}
		System.out.print("Summa - "+ sum );		//вывод суммы к конце цикла

		int count = 0;
		int count1 = 0;
		for(int i = 0; i < array.length ; i++){
			
			if (array[i]%2 == 1){
				count++;
			}else{
				count1++;
			}
		
		}
		System.out.println(" ");

		System.out.print("Нечетных "+ count );		//вывод суммы к конце цикла
		System.out.println(" ");

		System.out.print("четных "+ count1 );		//вывод суммы к конце цикла

	
	}
	
}
