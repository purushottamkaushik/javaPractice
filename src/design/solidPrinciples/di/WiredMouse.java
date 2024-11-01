package src.solidPrinciples.di;

public class WiredMouse implements MouseInterface {
    @Override
    public void click() {
        System.out.println("Wired click");
    }
}
