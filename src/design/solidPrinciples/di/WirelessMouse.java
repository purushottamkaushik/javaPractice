package design.solidPrinciples.di;

import design.solidPrinciples.di.MouseInterface;

public class WirelessMouse implements MouseInterface {
    @Override
    public void click() {
        System.out.println("wireless moise");
    }
}
