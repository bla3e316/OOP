package lesson5;

public class Home2 {
	public static void main(String[]args) {
		String str = "Hello World Hello World Hello World";
		String sub = "lo";
		indexOfv2(str, sub);
	}
	
	public static void indexOfv2(String str, String sub) {
		int idx = 0;
//		do{
//			idx = str.indexOf(sub,idx);
//			if(idx != -1){
//				System.out.println(idx);
//				idx +=sub.length();
//			}
//		}while(idx != -1);
//_________________________________________________________________________		
//		while((idx = str.indexOf(sub, idx)) != -1){ // ()запишется после подсчета
//			System.out.println(idx);
//			idx +=sub.length();
//			System.out.println("+="+ idx);
//
//		}		
//_________________________________________________________________________		
		for (int i = 0;(i=str.indexOf(sub, i)) != -1; i += sub.length()){
			System.out.println(i);

		}	
	}

}