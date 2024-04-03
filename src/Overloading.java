public class Overloading {
    public static void main(String[] args) {
        Overload SystemInstance = new Overload();
        System.out.println(SystemInstance.grabkey(123));
        System.out.println(SystemInstance.grabkey(122233,99408));
    }
}

class Overload {
    int key_value = 1249378;
    int grabkey(int inputkey) {
        return inputkey*key_value/2;
    }
    int grabkey(int inputkey,int securekey){
        return (inputkey*securekey)/key_value;
    }

}