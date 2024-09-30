package HW1;

public class hw1 {
    public static void main(String[] args) {
        // 1.
        int sum = 12+6;
        int product = 12*6;

        System.out.println("12 + 6 = " + sum);
        System.out.println("12 * 6 = " + product);
        System.out.println("--------------------------------");
        // 2.
        int a = 200/12;
        int b = 200 % 12;
        System.out.println("200 eggs = " + a + " 打 " + b + " 顆");
        System.out.println("--------------------------------");
        // 3.
        int day = 256559/86400;
        int r = 256559 % 86400;
        int hr = r/3600;
        int r2= r % 3600;
        int min = r2/60;
        int sec = r2 % 60;
        System.out.println("256559 is "+day+" day "+hr+" hr "+min+" min "+sec+" sec ");
        System.out.println("--------------------------------");
        // 4.
        final double PI = 3.1415;
        double area = PI * 5 * 5;
        double circum = 2 * PI * 5;
        System.out.printf("半徑為5的圓面積與周長分別為: %.2f, %.2f\n", area, circum);
        System.out.println("--------------------------------");
        // 5.
        double save = 1.5 * Math.pow(1.02,10);
        System.out.printf("Saving of $1.5 million after 10 years with 2%% interest rate will be: $%.2f million\n", save);
        System.out.println("--------------------------------");
        // 6.
        System.out.println(5+5); // 2 integer sum
        System.out.println(5+ '5'); // The character '5' has an ASCII value of 53.
        System.out.println(5+ "5"); // 字串連接 string concatenation

    }
}









