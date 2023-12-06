package String;

public class staticmethod1 {
    static public void show(){
        System.out.println(5);
    }
    public static void main(String[] args) {
        String a = "is My name is Afsar";
        String name = "ZAIN";
        System.out.println(a.replace("is","was"));
        System.out.println(a.replaceFirst("is","was"));
        System.out.println(a.replaceAll("is","was"));
        System.out.println(a.replaceAll("is(.)","was"));
        System.out.println(a.replaceAll("is(.*)","was"));
        System.out.println(a.indexOf("s"));
        System.out.println(a.lastIndexOf("a"));
        System.out.println(a.charAt(4));
        System.out.println(a.contains("Af"));
        System.out.println(a.startsWith("is"));
        System.out.println(a.endsWith("ar"));
        System.out.println(a.length());
        System.out.println(name.contains("A"));
    staticmethod1.show();
    }
}
