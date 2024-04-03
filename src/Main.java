
public class Main {
    public static void main(String[] args) {
        ME hy2n = new ME();

        hy2n.setName("DONGHYUN LEE");

        hy2n.sayName();
    }
}

class ME {
    String Name;
    int hp = 0;
    final int secure_key = 1234;

    void sayName() {
        System.out.println("Welcome, "+Name);
    }

    void setName(String name) {
        Name = name;
    }
}