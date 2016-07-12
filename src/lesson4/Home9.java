package lesson4;

public class Home9 {	
	
	public static void main(String[] args) {

		drawStair(4);
		drawStair1(4);
		drawStair2(4);

	}

	public static void drawStair(int height){
		if (height <= 0) {
			System.out.println("Error");
			return;			
		}else{
			for (int i = height -1 ; i >= 0 ; i--) {
				for (int j = i ; j < height ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}	
		}		
	}
	
	public static void drawStair1(int height){
		if (height <= 0) {
			System.out.println("Error");
			return;			
		}else{
			for (int i = height -1 ; i >= 0 ; i--) {
				for (int j = 0 ; j < height ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}	
		}		
	}
	
	public static void drawStair2(int height){
		if (height <= 0) {
			System.out.println("Error");
			return;			
		}else{
			for (int i = 0 ; height > i  ; i++) {
				for (int j = i ; height > j ; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}	
		}		
	}

}

