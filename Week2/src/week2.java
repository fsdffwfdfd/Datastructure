//public class week2 {
//   public static int seq(int n) {
//     return (n==1) ? 1: seq(n-1) + 3;
//   }
//   public static void main(String[] args) {
//      for(int i =1; i <= 10; i++) {
//         System.out.println(seq(i)+" ");
//     }
//   }



//public class week2 {
//   public static void A(int n) {
//      if(n > 0) {
//    	  System.out.println("   " +n);
//   	  A(n-1);
//      }
//   }
//   public static void main(String[] args) {
//      A(3);
//      }
//   }




public class week2 {
   public static int fact1(int n) {
        int tmp = 1;
        for (int i = 2; i <= n; i++){
        	tmp = tmp * i;
        }
        return tmp;
   }  
   
   public static int fact2(int n) {
       if(n == 0)
           return 1;
       else
    	   return n * fact2(n - 1);
       }       
   
   public static void main(String[] args) {
	   System.out.println(fact1(5));
	   System.out.println(fact2(5));
 
      }
   }