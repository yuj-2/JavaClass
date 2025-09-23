package days27;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 9. 23. 오전 10:26:24 
 * @subject   
 * @content 
 */ 
public class Ex01_02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // 1<=   <= 1000 유효성 검사
		int [] bars = new int[n];
		for (int i = 0; i < bars.length; i++) 
			bars[i] = scanner.nextInt();  //  1<=   <= 1000 유효성 검사
		Arrays.sort(bars); // 오름차순 정렬
//		System.out.println( Arrays.toString(bars));
//      index=2		
//              ↓ 		
//		[2, 2, 4, 4, 5, 8]
		System.out.println(n);
		int value = bars[0]; // min
		for (int i = 1; i < bars.length; i++) {
			if( value != bars[i] ) {
				System.out.println( n - i);
				value = bars[i];
			}
		}

	} // main

} // class


/*
Scanner sc = new Scanner(System.in);

int n = sc.nextInt(); // 6
sc.nextLine();        // 13, 10    

String input = sc.nextLine(); // "5 4 4 2 2 8"

String[] list = input.split(" ");

int[] intList = Arrays.stream(list)                // String[] -> Stream<String>
		              .mapToInt(Integer::parseInt) // IntStream
		              .toArray();                  // int [] 

ArrayList<Integer> arr = new ArrayList<>();
for(int a: intList) {
	arr.add(a);
}

while(arr.size()>0) {
	System.out.println(arr.size());
	int min = Collections.min(arr);
	arr.removeIf((k) -> min==k);
}
*/





