package Basic;

 class Bull {
     public static void main(String[] args) {
         int a = 10;
         int b = 20;

         String s1 = "Afsar";
         String s2 = null;
         System.out.println(s1+s2);
         System.out.println(s1.concat(s2));

         boolean b1 = true;
         boolean b2 = false;
         boolean b3 =(b1==b2);

         System.out.println(b1);
         System.out.println(b2);
         System.out.println(b3);
         if (a<b){
             System.out.println(b2);
         }
         else {
             System.out.println(b3);
         }
     }
 }