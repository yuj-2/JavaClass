package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yujin  
 * @date 2025. 8. 19. 오후 5:19:36 
 * @subject [문제] 키보드로부터    
 * @content      이름, 국어, 영어, 수학 점수를 입력받아서 -> 변수 선언
 *               총점 계산, 평균 계산 -> 변수 선언
 *               출력 형식)
 *               홍길동 90 89 100 279 평균점수
 *               (조건) 국영수 자료형 byte로 선언
 *                    총점  자료형 short로 선언
 *                   평균  자료형 double로 선언
 */ 
public class Ex13 {

   public static void main(String[] args) throws NumberFormatException, IOException {

      String name;
      byte language, english, math;
      short total;
      double avg;
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      //이름
      System.out.print("이름 : ");
      name = br.readLine();
      
      //국어
      System.out.print("국어 점수 : ");
      language = Byte.parseByte(br.readLine());
      
      
      //영어
      System.out.print("영어 점수 : ");
      english = Byte.parseByte(br.readLine());
      
      //수학
      System.out.print("수학 점수 : ");
      math = Byte.parseByte(br.readLine());
      
      //총점
      total = (short) (language + english + math);
      
      //평균
      avg = (double) total / 3;
      
      System.out.printf("%s  %d  %d  %d  %d  %.2f", name, language, english, math, total, avg);
      
   } //main

} //class
 
