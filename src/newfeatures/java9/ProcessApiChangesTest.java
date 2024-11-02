package newfeatures.java9;

public class ProcessApiChangesTest {

    public static void main(String[] args) {
        String information = ProcessHandle.current().info().user().get();
        String command = ProcessHandle.current().info().command().get();
        System.out.println(information);
        System.out.println("command " + command);
    }
}
