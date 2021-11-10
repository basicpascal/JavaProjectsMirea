public class Recursion {
    public static void recursionOdds()
    {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        if (n > 0) {
            System.out.print("Enter the number: ");
            int m = in.nextInt();
            System.out.print("Number with odd index: ");
            System.out.println(n);
            if (m > 0)
                recursionOdds();
        }

    }
    public static String recursionSplitLeftToRight(int n) {
        if (n < 10)
            return Integer.toString(n);
        else
            return recursionSplitLeftToRight(n / 10) + " " + n % 10;
    }
    public static int recursionSplitRightToLeft(int n) {
        if (n < 10) {
            return n;
        }
        else {
            System.out.print(n % 10 + " ");
            return recursionSplitRightToLeft(n / 10);
        }
    }

    public static void main(String[] args)
    {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("Task 13");
        recursionOdds();
        System.out.println("Task 14");
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.println(recursionSplitLeftToRight(n));
        System.out.println("Task 15");
        System.out.println(recursionSplitRightToLeft(n));
    }
}
