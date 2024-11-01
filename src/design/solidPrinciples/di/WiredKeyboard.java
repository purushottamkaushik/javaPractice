package design.solidPrinciples.di;

import design.solidPrinciples.di.KeyBoardInterface;

public class WiredKeyboard implements KeyBoardInterface {
    @Override
    public void type() {
        System.out.println("wired type");
    }
}
