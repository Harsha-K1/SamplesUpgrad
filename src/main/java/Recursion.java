import java.util.Scanner;
public class Recursion {

    static int[] someArr = {5,5,3,3,6,6};
    static int n = 20;
    static int i = 1;

    public static int func(int n) {
        if (n == 1)
            return n;
        else
            return func(n-1);
    }

    public static void main(String args[]) {
       // Scanner sc = new Scanner(System.in);
        //System.out.println("Enter a positive no: ");
        //int n = sc.nextInt();
        //int value = func(20);
        //System.out.println(value);
        //function();
        String st = "abc d efg";
        function2(st);

    }

    public static int function() {
        if (i <= 5) {
            System.out.print(i++ + " ");
            function();
        }
        return 0;
    }

    public static void function2(String st) {
        if ((st == null) || (st.length() <= 1))
            System.out.println(st);
        else {
            System.out.print(st.charAt(st.length() - 1));
            function2(st.substring(0, st.length() - 1));
        }
    }

}