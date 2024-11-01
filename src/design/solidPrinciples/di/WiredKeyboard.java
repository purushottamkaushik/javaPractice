package src.solidPrinciples.di;

public class WiredKeyboard implements KeyBoardInterface{
    @Override
    public void type() {
        System.out.println("wired type");
    }
}
