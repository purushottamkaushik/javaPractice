package src.solidPrinciples.di;

public class Target {

    private KeyBoardInterface keyBoardInterface;
    private MouseInterface mouseInterface;

    public Target(KeyBoardInterface keyBoardInterface, MouseInterface mouseInterface) {
        this.keyBoardInterface = keyBoardInterface;
        this.mouseInterface = mouseInterface;
    }

    public static void main(String[] args) {
        Target t = new Target(new WiredKeyboard(),new WirelessMouse());
        t.keyBoardInterface.type();
        t.mouseInterface.click();
        System.out.println("je" +
                "");
    }
}
