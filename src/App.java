import java.math.BigInteger;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger("1");

            if (a.intValue() == -1) {
                break;
            } else if (a.equals(BigInteger.ZERO)) {
                System.out.println("0");

            } else {
                System.out.println(a.subtract(b));
            }
        }

        sc.close();
    }
}
