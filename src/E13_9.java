public class E13_9 {
    public static void main(String[] args) {

    }
 class Circle extends GeometricObject{
        double radius;

     @Override
     public boolean equals(Object obj) {
         if (obj instanceof  Circle) return radius == ((Circle) obj).radius;
         return false;
     }
 }
}
