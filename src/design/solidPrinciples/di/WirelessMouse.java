package src.solidPrinciples.di;

public class WirelessMouse implements MouseInterface{
    @Override
    public void click() {
        System.out.println("wireless moise");
    }
}
