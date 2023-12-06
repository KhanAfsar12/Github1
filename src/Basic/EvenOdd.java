//import java.util.Scanner;
//
//package Basic;
//////
//import java.util.Scanner;
//////
//public class EvenOdd {
//    private static Scanner sc = new java.util.Scanner;
//    public void main(String[] args){
//        boolean area = true;
//
//        while (area){
//            System.out.println("ENTER A YEARS");
//            int year = sc.nextInt();
//
//            if (((year%4==0) && (year%100!=0) || (year%400==0))){
//                System.out.println("Leap year");
//            }
//        }
//    }
//}
////////    public static void main(String[] args) {
////////        int a = 10;
////////        if (a%2==0){
////////            System.out.println(a+" is Even number");
////////        }
////////        else {
////////            System.out.println(a+" is Odd number");
////////        }
////////    }
//////
////////    private static final Scanner scanner = new Scanner(System.in);
//////
////////        int N = scanner.nextInt();
////////        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
////////
////////        if(N%2 != 0){
////////            System.out.println("Weird");
////////        }
////////        else{
////////            int even =N;
////////
////////            if(even >= 2 && even <= 5){
////////                System.out.println("Not Weird");
////////            }
////////            else if(even > 5 && even <= 20){
////////                System.out.println("Weird");
////////            }
////////
////////            else{
////////                System.out.println("Not Weird");
////////            }
////////
////////        }
////////
////////
////////        scanner.close();
//////
//////
//////
////////
//////     //   public class Dahil{
//////            private static Scanner sc = new Scanner (System.in);
//////            public static void main(String[] args){
//////                int sum = 0;
//////
//////                int[] a = new int [10];
//////
//////                for(int i=0; i<a.length; i++){
//////                    a[i] = sc.nextInt();
//////                }
//////
//////                for(int i=0; i<a.length; i++){
//////                    System.out.println(a[i]);
//////                }
//////
//////                System.out.println(sum/a.length);
//////            }
//////
//////
//////        }
//////
//////
////public class EvenOdd {
//////    public void show(int a, long b) {
//////        System.out.println(a + b);
//////    }
//////        public void show ( long a, int b){
//////            System.out.println(a + b);
//////        }
//////        public static void main (String[] args){
//////
//////            EvenOdd ss = new EvenOdd();
//////            ss.show(2, 5);
//////
//////        }
////
////    public void show(String a,int h){
////        System.out.println(a);
////    }
////    public void show(boolean b){
////        System.out.println(b);
////    }
////
////    public static void main(String[] args) {
////        EvenOdd evenOdd = new EvenOdd();
////        evenOdd.show("ayaz");
////    }
////
////    }
