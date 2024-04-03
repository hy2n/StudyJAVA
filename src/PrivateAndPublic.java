public class PrivateAndPublic {
    public static void main(String[] args) {
        Human me = new Human();
        System.out.println(me.GetInfo());
        System.out.println(MyAge);
    }
}

class Human {
    private int SECURE_KEY = 23;
    public int MyAge = 17;
    private int MyContactInfo = 01057615213;

    int GetInfo() {
        return MyContactInfo;
    }
}