
public class PassByValue {
    public static void main(String[] args) {
        int number = 10;
        class MyObject{
            int value;
            public static void changePrimitive(int parameter) {
            	parameter = 50;
            	System.out.println(parameter);
            }
            public static void changeObject(MyObject parameter)
        }
        MyObject obj = new MyObject();
            obj.value = 20;
    }
}
