public class MyClass{
    int data;
    public MyClass(){
        data=0;
    }
    public MyClass(int n){
        data=n;
    }
	public String toString(){
		return "Num : "+data;
	}
    public static void main(String[] args) {
        MyClass m1 = new MyClass();
        int n = Integer.parseInt(args[0]);
        MyClass m2 = new MyClass(n);
        System.out.println(m1);
        System.out.println(m2); 
    }
}