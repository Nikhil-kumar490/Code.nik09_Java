import static sun.swing.MenuItemLayoutHelper.max;

public class Array {

    public static void main(String[] args) {
        first();
        second();
        search();
        max();
    }

    static void first() {
        int[] array = new int[10];
        array[3] = 43;
        array[8] = 3;
        array[2] = 9;
        array[9] = 99;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static void second() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void search() {
        int[] srch = {1, 3, 44, 6, 8, 2, 0};
//        for (int i = 0; i < srch.length; i++)
        for(int i: srch)
        {
            if (i == 44) {
                System.out.println("Found");
            }
            else {
                System.out.println("Not Found");
            }
        }

    }

    //Find maximum element
    static void max(){
        int[] maxx= {2,6,-2,9,-88,14};
        int res = Integer.MIN_VALUE;
        for (int i = 0; i <maxx.length ; i++) {
            if (maxx[i]>res);
            res=maxx[i];

        }
        System.out.println(res);
    }
}
