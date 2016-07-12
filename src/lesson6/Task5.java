package lesson6;

import java.io.FileWriter; //в файлик
import java.io.IOException;//исключения


public class Task5 {

	public static void main(String[] args) throws IOException {
		//путь мак 
		FileWriter writer = new FileWriter("/Alex/Desctop/text.txt",true); //true дописывает
		
		for (int i = 0; i < 1000; i++){
		writer.write("Hello World" + System.lineSeparator());//что пишем или дописываем в файл- буферизируется
		}   //System.lineSeparator()- подстраивает под операционку
		//проверить буфер ссд))))  745 строк на уроке влезло
		//writer.flush();//записать с буфера в файл
		writer.close();//прекратить обращение к врайтеру
	}

}
