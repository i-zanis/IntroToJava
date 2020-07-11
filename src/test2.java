import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class test2 {
    public static void main(String[] args) {
        int big = 5;
        int small = 1;

        System.out.println("One is smaller" + less(1,5));
        System.out.println();
        System.out.println("5 is larger " + less(5,1));
        System.out.println("They are equal " + less(5,5));
        System.out.println("1".compareTo("5"));
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
}
