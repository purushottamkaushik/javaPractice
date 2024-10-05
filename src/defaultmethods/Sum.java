package defaultmethods;

interface Summable {
    int getA();

    int getB();

    default int calculateSum() {
        return getA() + getB();
    }

}

interface I {
    public final int a = 10;
}

public class Sum implements Summable {

    public static void main(String[] args) {

        System.out.println(new Sum().calculateSum());
//        System.out.println(I.a);
    }

    @Override
    public int getA() {
        return 1;
    }

    @Override
    public int getB() {
        return 2;
    }
}


