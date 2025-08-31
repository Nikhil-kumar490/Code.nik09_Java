public class demo {
    public static void main(String[] args) {
        System.out.println("Helo Nikhil");
        System.out.println("Hello Nikhil");
        if (args.length >= 2) {
            System.out.println(args[0]);
            System.out.println(args[1]);
        } else {
            System.out.println("Please provide two arguments!");
        }
    }
}
