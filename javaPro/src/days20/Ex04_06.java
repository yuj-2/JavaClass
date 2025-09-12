package days20;

/**
 * @author kenik  
 * @date 2025. 9. 12. 오후 3:46:28 
 * @subject   
 * @content 
 */ 
public class Ex04_06 {

	public static void main(String[] args) {
		String dir = System.getProperty("user.dir");
		
		// System.out.println( dir.substring(dir.length()-1) ); // String
		System.out.println( dir.charAt( dir.length()-1 )); // char
		
		// System.out.println( dir );
		String fileName = "Ex01.java";		
		// 전체경로 = dir + fileName;		
		// String path = dir + fileName;
		String path = dir.concat(fileName);
		
		if (dir.charAt( dir.length()-1 ) == '\\') {
			path = dir + fileName;
		} else {
			path = dir +"\\" + fileName;
		}
		
		dir = "C:\\E\\Class\\SS24Class\\JavaClass\\javaPro\\";
		String regex = ".*\\\\$";
		System.out.println( dir.matches(regex) );  // true 
		
		System.out.println( path );
				

	} // main

} // class
