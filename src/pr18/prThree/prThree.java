package pr18.prThree;


import java.util.Scanner;

public class prThree {

    public static int maximum() {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n == 0)
            return 0;
        else
            return Math.max(n, maximum());
    }
    //Вводить числа нужно через enter
    public static void main(String[] args) {
        System.out.println(maximum());
    }
}