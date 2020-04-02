package demo2;

public class Client {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Element element = ObjectStructure.createElement();
            element.accept(new Visitor());
        }
    }
}
