public class Operator {
    public static void main(String[] args) {

        int mySalary = 1000;
        int bounce = 500;
        int total = mySalary+bounce;
        System.out.println(total);

        int yearly = total * 12;
        System.out.println(yearly);

        System.out.println();

        int child = yearly/3;
        System.out.println(child);

        System.out.println();

        int a = 5;
        double b= 10.4;
        System.out.println(a+b);

        System.out.println();

        float c = 12.23f;
        long d = 3254l;
        System.out.println(c+d);

        // Increment and Decrement
        int m =10;
        m++;
        System.out.println(m);
        System.out.println();

        int n = 10;
        int v = --n;
        System.out.println(n);
        System.out.println(v);

        double x = 1.5;
        double y = 2.5;
        double z = 3.5;
        double u = (x+y)*(z-y)/(x+z);
        System.out.println(u);
        System.out.println();

        // Bitwise Operator

        int s = 5;
        int w = 3;

        System.out.println(s&w);
        System.out.println(s|w);
        System.out.println(s^w);
        System.out.println(~s);
        System.out.println(s<<4);
        System.out.println(s>>4);

    }
}
