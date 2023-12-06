package String;

public class MaxPerChar {
    public static void main(String[] args) {
        String s = "Afsar";
        int[] arr = new int[127];
        for (int i=0; i<s.length()-1; i++){
            arr[s.charAt(i)]=arr[s.charAt(i)]+1;
        }

    }
}
