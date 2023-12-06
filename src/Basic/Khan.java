package Basic;

public class Khan {
    public void ashil() {
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1==i2);
        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i1.getClass().getSimpleName());
        System.out.println(i4.getClass().getSimpleName());
        System.out.println(i3.equals(i4));
    }
}
