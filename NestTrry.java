class NestTrry {
    public static void main(String args[]) {
        try {
System.out.println("args=" +args[0]+args[1]+args[2]+args[3]);
            int a = args.length;
            int b = 42 / a;  
            System.out.println("a = " + a);

            try {
                if (a == 1)
                    a = a / (a - a);  

                if (a == 2) {
                    int c[] = {1};
                    c[5] = 99;  
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out-of-bounds: " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        }
    }
}
