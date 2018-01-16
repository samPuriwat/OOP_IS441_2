package mid_exam;

import java.util.Scanner;

public class CalAge {
    private static final int x = 2561;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("กรุณากรอกข้อมูลปี พ.ศ. เกิดของคุณ: ");
        int y = scanner.nextInt();
        System.out.println("อายุของคุณคือ: "+(x-y));
    }
}
