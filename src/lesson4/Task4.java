package lesson4;

public class Task4 {
	
	//очередность описания метода не важнаю
	//описание не может быть внутри дугого метоад
	//описание может быть в любом месте класса
	
	public static void main(String[] args) {
		Task4.sayHello("Sasha");
		Task4.sayHello("Sasha))");

		
		// TODO Auto-generated method stub
		int max = Math.max(3, 6); //max - metod
		System.out.println(max);  //println - metod
		
		int result = Task4.sum(2, 3);
		System.out.println(result);
	}

	//void такой метод никакого значение не отдает в  консоль(результат)
	public static void	sayHello(String name){		//не с цифры метод имя	
		System.out.println("Hi heloo ooo - " + name);
	}


	
	public static int sum(int a,int b){
		int val = a + b;				//процедура ничего не возвращает
		return val ;					// функция - обрабатывает и возвращает результат
	}
	
	
	

	
}
