package generics;

public class MainClass {

    public static void main(String[] args) {
        GenericClassExample<Integer> exampleInteger = new GenericClassExample<Integer>();
        exampleInteger.setValue(1);

        System.out.println("exampleInteger : " + exampleInteger.getValue());

        GenericClassExample<Double> exampleDouble = new GenericClassExample<Double>();
        exampleDouble.setValue(10.5);
        System.out.println("exampleDouble : " + exampleDouble.getValue());


        // Multi Param Generics

        MultiGenericParam<String, Integer> multiGenericParam = new MultiGenericParam<>("Hello,", 123);
        System.out.println("multiGenericParam First : " + multiGenericParam.getFirstParam());
        System.out.println("multiGenericParam Second: " + multiGenericParam.getSecondParam());

    }
}
