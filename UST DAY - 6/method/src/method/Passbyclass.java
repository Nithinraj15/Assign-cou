package method;
class MyObject{
    int value;
}
public class Passbyclass {
	public static void changePrimitive(int parameter) {
		parameter = 50;
		System.out.println("Inside changePrimitive " + parameter);
	}
	public static void changeObject(MyObject objParameter) {
		objParameter.value = 100;
		System.out.println("Inside changeObject " + objParameter.value);
	}
	public static void reassignObject(MyObject objParameter) {
		objParameter = new MyObject(); 
		objParameter.value = 200;
		System.out.println("reassignObject " + objParameter.value);
	}
	
	public static void main(String[] args) {
	    int number = 10;
	    
	    MyObject obj = new MyObject();
	    obj.value = 20;
	    System.out.println("initial value : " + number);
	System.out.println("initial Myobj value : " +  obj.value);
	
	System.out.println("Before change Primitive : " + number);
	changePrimitive(number);
	System.out.println("After change Primitive : " + number);
	
	System.out.println("Before change object : " + obj.value);
	changeObject(obj);
	System.out.println("After change object : " + obj.value);
	
	System.out.println("Before Reassign object : " + obj.value);
	reassignObject(obj);
	System.out.println("After Reassign object : " + obj.value);

    }
}

