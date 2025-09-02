package days12;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author kenik  
 * @date 2025. 9. 2. 오전 10:49:21 
 * @subject   등수 처리 테스트 
 * @content 
 */ 
public class Ex02_02 {

   public static void main(String[] args) {
      // 총점이 들어있는 배열  (0~300 총점)
      //Random rnd = new Random();
      //int [] tots = new int[25];
      //IntStream.range(0, tots.length).forEach(i-> tots[i]= rnd.nextInt(301));
      
      int [] tots = {245, 194, 300, 20, 209, 17, 283, 223, 153, 93, 96, 269, 36, 9, 254, 235, 94, 4, 168, 281, 33, 146, 11, 83, 57};
      int [] ranks = new int[25];
      System.out.println( Arrays.toString(tots) );
      System.out.println( Arrays.toString(ranks) );
      // 등수를 매길 학생
      // i = 0
      // j = 0 1 2 3 4 ~  전체학생
      for (int i = 0; i < ranks.length; i++) {
         // tots[i]  등수를 매길 학생의 총점
         // ranks[i] 등수를 매길 학생의 등수
         ranks[i]= 1;
         for (int j = 0; j < ranks.length; j++) {
            // tots[j] 비교할 학생의 총점
            if( tots[i] < tots[j]) {
               ranks[i]++;
            }
         }
      }
      
      System.out.println( Arrays.toString(ranks) );
      

   }

}
