package pr18.prOne;


public class prOne {
    //Логарифмической сложности тут не может быть в принципе
    public static void decompose(int n, int k) {
        if (k >= n) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            decompose(n / k, k);
        }
        else
            decompose(n, ++k);
    }
    public static void main(String[] args) {
        decompose(21 * 45469, 2);
    }
}
