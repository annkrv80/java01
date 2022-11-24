/*class Program {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);
    }

}*/

/*class Program {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 0;
        if (a > b) c = a;
        if (b > a) c = b;

        System.out.println(c);
    }
}*/

/*class Program {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int min = a < b ? a : b;
        System.out.println(min);
    }
}*/

/*import java.util.Scanner;
class Program {
    public static void main(String[] args) {
        int mounth = value;
        String text = "";
        switch (mounth) {
            case 1:
                text = "Autumn";
                break;
		
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);
        iScanner.close();
    }
}*/

/*class Program {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;

        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);
    }
}*/
/*class Program {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;

        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);
    }
}*/

/*class Program {
    public static void main(String[] args) {

        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
        }
        System.out.println(s);
    }
}*/
/*class Program {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
    }
}*/
class Program {
    public static void main(String[] args) {

        int arr[] = new int[10];
        for (int item : arr) {
            System.out.printf("%d ", item);
        }
        System.out.println();
    }
}










