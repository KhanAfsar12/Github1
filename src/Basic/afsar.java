package Basic;

public   class afsar {

    public void a(int a){
        System.out.println("this is int "+a);
    }

    public void a(long a){
        System.out.println( "this is long "+ a);
    }

    public void a(byte a){
        System.out.println("this is byte "+a);

    }

    public void a(short a){
        System.out.println( "this is short "+a);
    }

    public static void main(String[] args) {

//        int a=153;
//        int remainder=0,result=0,orignalNumber=a;
//        String str= Integer.toString(a);
//        while(orignalNumber>0){
//            remainder = orignalNumber%10;
//            result += Math.pow(remainder , str.length());
//            orignalNumber /=10;
//        }
//        if (a==result){
//            System.out.println("Armstrong");
//        }
//        else {
//            System.out.println("Not armstrong");
//
        afsar a = new afsar();
        a.a(10);


    }
}
