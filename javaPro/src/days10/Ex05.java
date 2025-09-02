package days10;

/**
 * @author kenik  
 * @date 2025. 8. 29. 오후 5:02:50 
 * @subject 별찍기  
 * @content 
 */ 
public class Ex05 {

   public static void main(String[] args) {
      // ****
      // ****
      // ****
      // ****
      
      // [1]
      /*
      System.out.println("***************");
      System.out.println("****");
      System.out.println("****");
      System.out.println("****");
      */
      
      // [2]
      /*
      for (int i = 1; i <= 4; i++) {
         System.out.println("****");
      }
      */
      
      /*
      // [3]
      for (int i = 1; i <= 4; i++) {
         //System.out.println("****");
         for (int j = 1; j <= 4; j++) { // ****
            System.out.print("*");
         }
         System.out.println();
      }
      */

      
         /*
          
         
        *
        **
        ***
        ****
      */
//      for (int i = 1; i <= 4; i++) {
//         for (int j = 1; j <= 4; j++) {
//            System.out.println("*".repeat(i++));
//         }
//         System.out.println();
//      }  
      
      
      
      /*
        ___*
        __**
        _***
        ****
        
        */
      
//      for (int i = 1; i <= 4; i++) {
//         for (int j = 1; j <=1 ; j++) {
//            System.out.print(" ".repeat(4-i)+ "*".repeat(i));
//         }
//         System.out.println();
//      }
      
      
      
      /*
        
        ****
        ***
        **
        *
        
       */
        
      for (int i = 4; i >=1 ; i--) {
         for (int j = 1; j <=1; j++) {
            System.out.print("*".repeat(i));
         }
         System.out.println();
      }
      
      
      
      
      
      /*
        ****
        _***
        __**
        ___*
        
        */
//      for (int i = 4; i >=1; i--) {
//         for (int j = 1; j <=1; j++) {
//            System.out.print(" ".repeat(4-i) + "*".repeat(i));
//         }
//         System.out.println();
//      }
      
      
      
      
      
      /*
        
        __*__
        _***_
        *****

        */
     /* 
   for (int i = 0; i < 3; i++) {
      for (int j = 2; j <= 2 ; j++) {
         System.out.print(" ".repeat(j-i) + "*".repeat(1+2*i) + " ".repeat(j-i));
      }
      System.out.println();
   }
      */
      
      
      
        
        /*
        __*__
        _***_
        *****
        _***_
        __*__
        
       * */
      
      for (int i = 0; i < args.length; i++) {
         
      }
      
   }

}