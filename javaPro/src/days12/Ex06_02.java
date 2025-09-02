package days12;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

/**
 * @author kenik  
 * @date 2025. 9. 2. 오후 3:13:44 
 * @subject   
 * @content 
 */ 
public class Ex06_02 {

   public static void main(String[] args) {
      // 0~9 정수를 랜덤하게 m 배열에 채워넣기.
      int [] m = new int[100];
      Random rand = new Random();
      
      for (int i = 0; i < m.length; i++) {
         m[i] = rand.nextInt(10);
      }      
      // [0, 9, 9, 7, 1, 6, 2, 4, 1, 5, 8, 2, 9, 9, 2, 7, 6, 3, 6, 4, 9, 3, 3, 0, 6, 3, 7, 1, 6, 3, 9, 4, 7, 9, 7, 0, 6, 5, 0, 4, 6, 3, 0, 0, 9, 5, 4, 2, 3, 9, 9, 8, 0, 3, 0, 0, 9, 4, 5, 5, 6, 0, 0, 4, 1, 6, 0, 9, 6, 6, 3, 4, 7, 1, 6, 4, 2, 3, 2, 3, 1, 4, 9, 5, 1, 9, 3, 4, 9, 8, 5, 3, 6, 4, 4, 6, 5, 3, 8, 0]
      System.out.println(Arrays.toString(m));
      
      // [1,2,0,1,0,0,0,0,0,1]
      int [] countArr = new int[10];
      String [] sArr = new String[10];
      Arrays.fill(sArr, "");
      
      // countArr[0] = 0숫자 갯수
      // countArr[1] = 1숫자 갯수
      // :
      // countArr[9] = 9숫자 갯수
      for (int i = 0; i < m.length; i++) {
         int index = m[i];
         countArr[index]++;
         sArr[index]+=i + ", ";
      }
            
      // System.out.println( Arrays.toString( countArr ));
      for (int i = 0; i < countArr.length; i++) {
         System.out.printf("%d - %d개(%s)\n", i,  countArr[i], sArr[i] );
      }
      

   } // main

} // class







