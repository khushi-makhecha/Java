public class Main{
    public static void main(String[] args) {
        var point1 = new Point(1,2);
        var point2 = new Point(1,2);
        var textBox = new TextBox();
//        System.out.println(point1.hashCode());
//        System.out.println(point2.hashCode());
        System.out.println(point1.equals(point2));
    }
}