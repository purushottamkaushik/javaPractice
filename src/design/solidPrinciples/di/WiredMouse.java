package design.solidPrinciples.di;

import design.solidPrinciples.di.MouseInterface;

public class WiredMouse implements MouseInterface {
    @Override
    public void click() {
        System.out.println("Wired click");
    }
}
