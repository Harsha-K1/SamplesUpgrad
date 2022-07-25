class Source{


    public static int sum(int n){
        if(n == 1) return 1;
        if(n == 0) return 0;
        return n + sum(n - 1);
    }


    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
       /* int n = 5;//sc.nextInt();
        if (n > 0){
            int value = Source.sum(n);
            System.out.print(value);
        } else {
            System.out.println("Enter a natural number");
        }*/
        //Scanner inpt = new Scanner(System.in);

       /* int a = 2;//inpt.nextInt();
        int b = 3;//inpt.nextInt();
        // printing the value of a^b i.e.,
        System.out.printf("%d", powerfunc(a, b));
        */

        //Scanner in = new Scanner(System.in);
        int n = 3;//in.nextInt();
        func(n);
        //printStars(3);
    }

    public static int powerfunc(int base, int power) {
        if(power == 0) return 1;
        if(power == 1) return base;

        return base * powerfunc(base, power - 1);
    }
    private static int k = 1;

    private static void printStars(int k){
        if(k == 0) {
            return;
        }
        System.out.print("*" + " ");
        printStars(k - 1);
    }
    public static void func(int n) {
        if(n == 0) {
            return;
        }
        printStars(n - (n-k++)) ;
        System.out.println();
        func(n-1);
    }
}
