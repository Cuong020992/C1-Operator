import java.util.Scanner;

public class Operator {

    public static void main(String[] args) {
	// write your code here
        float width;
        float height;
        float area;

        Scanner sc = new Scanner(System.in);

        System.out.println("nhập chiều rộng: ");
        width = sc.nextFloat();
        System.out.println("nhập chiều dài: ");
        height = sc.nextFloat();

        area = width * height;

        System.out.println("Diện tích hình chữ nhật là: "+area);

    }
}
