package String;

public class CountChar {
    public static void main(String arg[]){
        String s="afsar khan";
        char target='a';
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==target){
                count++;
                System.out.println(target+":"+count);
            }
        }
    }
}
