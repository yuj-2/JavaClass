/**
 * @author kenik  
 * @date 2025. 9. 4. 오후 5:05:08 
 * @subject  한 반 30명 이,국,영,수,총,평 등, 처리 .. 
 * @content  클래스를 사용 구현
 */ 
package days14;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex14 {

   public static void main(String[] args) throws IOException {

      final int STUDENT_COUNT= 30;
      // 클래스 배열 선언
      Student [] students = new Student[STUDENT_COUNT];

      int count = 0;

      String name;
      int kor, eng, mat;
      int tot;
      double avg;
      int no,rank;

      Scanner scanner = new Scanner(System.in);
      char con = 'Y';
      
      do {         
          System.out.printf("> [%d]번 학생의 이, 국, 영, 수 입력 ? ", count+1);
          // 홍길동 90 88 99
          name = getName(); //scanner.next();
          kor = getScore(scanner, "국어"); // scanner.nextInt();
          eng = getScore(scanner, "영어"); // scanner.nextInt();
          mat = getScore(scanner, "수학"); // scanner.nextInt();          
          tot = kor + eng + mat;
          avg = (double)tot/3;      
          
          Student s = new Student();
          s.no = count+1;
          s.name = name;
          s.kor = kor;
          s.eng = eng;
          s.mat = mat;
          s.tot = tot;
          s.avg = avg;   
          
          students[count] = s;          
          count++;          
          
          System.out.print("> 입력 계속 할거니? ");          
          con = (char)System.in.read();
          System.in.skip(System.in.available()); // CRLF(\r\n) 제거
      //} while ( con == 'Y' || con == 'y');
       } while ( Character.toUpperCase(con) == 'Y');


      getRanking(students, count);
      
      System.out.printf("> 입력받은 학생수 : %d명\n", count);
      for (int i = 0; i < count; i++) {
         Student s = students[i];
         
         System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
                s.no, s.name, s.kor, s.eng, s.mat, s.tot, s.avg,
                s.rank);
          
      } // 
       
      System.out.println(" end ");
      
   } // main
   
   private static void getRanking(Student[] students, int count) {
      for (int i = 0; i < count; i++) {
         students[i].rank = 1;
         for (int j = 0; j < count; j++) {
            if(students[i].tot < students[j].tot) students[i].rank++;
         }
      }
   }

   private static String getName() {
      // 한글 1문자 랜덤하게 발생시킬 예정
      char [] nameArr = new char[3];      
      Random rand = new Random();      
      for (int i = 0; i < nameArr.length; i++) {
         nameArr[i] = (char)( rand.nextInt('힣' - '가' + 1) + '가' );
      }       
      String name = String.valueOf(nameArr);
      return name; // 1+"" = "1"  'a'+""="a"  3.14+""="3.14"  true+""="true"
   }

   private static int getScore(Scanner scanner, String subject) {      
      return (int)(Math.random()*101); // 0<= int  <=100
   }


} // class