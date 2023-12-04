public class MethodOverloadingDiffDataTypes {


    public void method1(int a){
        System.out.println(a);
    }
    public void method1(String a){
        System.out.println(a);
    }
    public static void main(String[] args) {

        MethodOverloadingDiffDataTypes obj = new MethodOverloadingDiffDataTypes();
        obj.method1(100);
        obj.method1("Helloooo!");
    }
}
