package days30;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * @author kenik  
 * @date 2025. 9. 26. 오전 10:48:00 
 * @subject   
 * @content 
 */ 
public class Ex04_04 {

	public static void main(String[] args) throws IOException {
		// 다양한 데이터소스(배열, 컬렉션 클래스, 파일 등등 )
		String uri = ".\\src\\days30\\Ex01.java";
		Path path = Path.of(uri);
		Stream<String> s1 = Files.lines(path);
		s1.forEach(System.out::println);

	}

}
