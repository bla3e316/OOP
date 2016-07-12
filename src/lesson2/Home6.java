package lesson2;

public class Home6 {
	public static void main(String []args){
		int k1 = 1234567;
		
		System.out.println(k1);	
		
		int k2 = (k1 - k1%10)/10;
		System.out.println(k2);
		
		int k3 = (k2 - k2%10)/10;		
		System.out.println(k3);
		
		int k4 = (k3 - k3%10)/10;
		System.out.println(k4);
		
		int k5 = (k4 - k4%10)/10;
		System.out.println(k5);
		
		int k6 = (k5 - k5%10)/10;
		System.out.println(k6);
		
		int k7 = (k6 - k6%10)/10;
		System.out.println(k7);
		
		System.out.println(k1%10);
		System.out.println(k2%10);
		System.out.println(k3%10);
		System.out.println(k4%10);
		System.out.println(k5%10);
		System.out.println(k6%10);
		System.out.println(k7%10);
		
		System.out.println("среднее арифметическое - " + (k1%10 + k2%10 + k3%10 + k4%10 + k5%10 + k6%10 + k7%10)/7.0);

	}
}
