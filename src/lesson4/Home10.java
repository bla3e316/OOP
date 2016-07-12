package lesson4;

public class Home10 {
	
	public static void main(String[] args) {
		drawRectangle(6, 5);
	}
	
	public static void drawRectangle(int height, int width) {
		if (((height <= 0) && (width <= 0))||(height <= 0)||(width <= 0)){
			System.out.println("Error");
			return;
			
		}else{
			for (int i = 0 ; height > i ; i++) {
				for (int j = 0 ; width > j ; j++) {
					System.out.print("*");
				}
				System.out.println(" ");
			}
		}		
	}

}
