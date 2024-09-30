package HW2;

public class hw2_2 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=1;i<=49;i++) {
            String number = Integer.toString(i);
            final String TARGET = "4";
            if(! number.contains(TARGET)){
                System.out.print(number + "\t");
                count+=1;
            }
        }
        System.out.println();
        System.out.println("Total: "+ count);

    }
}
