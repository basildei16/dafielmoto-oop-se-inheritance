
package Dafielmoto_Task1;

public class Task1Demo {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        InnerClass ic = new InnerClass();
        System.out.println(oc.data);
        System.out.println(ic.data2);
        ic.method(oc);
        
    }
}
