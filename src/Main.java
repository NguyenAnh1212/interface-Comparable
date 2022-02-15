import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Tạo mảng ComparableCircle gồm 3 circle, 3 circle có 3 tham số khác nhau (rỗng, chỉ radius, cả 3 tham số)
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.5);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("red",false, 4.5);
        // Duyệt mảng và in ra mảng.
        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        // Duyệt mảng và sắp xếp lại.
        Arrays.sort(circles);
        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
