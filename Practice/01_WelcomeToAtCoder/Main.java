// https://atcoder.jp/contests/abs/tasks/practice_1

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        try {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            String input3 = scanner.next();
            int sum = a + b + c;
            System.out.println(sum + " " + input3);
            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}