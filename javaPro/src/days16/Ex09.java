package days16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex09 {

	public static void main(String[] args) {
		String fileName = args[0];

		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;

			while ((line = reader.readLine()) != null) {
				System.out.println(line);  // 한 줄씩 출력
			}

		} catch (IOException e) {
			System.out.println("파일 읽는 중 오류 발생: " + e.getMessage());
		}

		System.out.println(" end ");
	}

}
