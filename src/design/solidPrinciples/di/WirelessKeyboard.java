package design.solidPrinciples.di;

import design.solidPrinciples.di.KeyBoardInterface;

public class WirelessKeyboard implements KeyBoardInterface {
    @Override
    public void type() {
        System.out.println("wireless keyboard");
    }
}
