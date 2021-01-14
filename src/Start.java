import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        int result = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Write task");
        String task = in.nextLine();
        int plus = task.indexOf('+');
        int minus = task.indexOf('-');
        int mul = task.indexOf('*');
        int div = task.indexOf('/');
        int f = task.indexOf('f');
        if (f>=0){
            String [] fibon = task.split("f");
            int n = Integer.parseInt(fibon[0]);
            int[] fib = new int[n];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2;i < fib.length; ++i){
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            System.out.println(fib[n-1]);

        }
        else if (plus >= 0) {
            String[] primer = task.split("\\+");
            int a = Integer.parseInt(primer[0]);
            int b = Integer.parseInt(primer[1]);
            result = a + b;


        } else if (minus >= 0) {
            String[] primer = task.split("-");
            int a = Integer.parseInt(primer[0]);
            int b = Integer.parseInt(primer[1]);
            result = a - b;


        } else if (mul >= 0) {
            String[] primer = task.split("\\*");
            int a = Integer.parseInt(primer[0]);
            int b = Integer.parseInt(primer[1]);
            result = a * b;


        } else if (div >= 0) {
            String[] primer = task.split("/");
            int a = Integer.parseInt(primer[0]);
            int b = Integer.parseInt(primer[1]);
            result = a / b;

        }
        System.out.println(result);





    }
}
