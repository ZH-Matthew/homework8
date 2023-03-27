import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Задача 1 и 2");
        int[] whole = new int[3];
        whole[0] = 1;
        whole[1] = 2;
        whole[2] = 3;

        double[] fractions = {1.57, 7.654, 9.986};

        Random random = new Random();               //пусть идея сама этим занимается
        double[] randomNumbers = new double[3];
        for (int i = 0; i < 3; i++) {
            randomNumbers[i] = random.nextDouble();
        }
        //тут пошла задача 2
        // конечно можно было написать "System.out.println(whole[0]+","+ whole[1]+","+whole[2]);
        //но это скучно, да и по задаче показалось что не так все просто должно быть, поэтому:
        for (int j = 0; j < 3; j++) {
            if (j == 2) {
                System.out.println(whole[j]);
            } else {
                System.out.print(whole[j] + ",");
            }
        }
        for (int k = 0; k < 3; k++) {
            if (k == 2) {
                System.out.println(fractions[k]);
            } else {
                System.out.print(fractions[k] + ",");
            }
        }
        for (int l = 0; l < 3; l++) {
            if (l == 2) {
                System.out.println(randomNumbers[l]);
            } else {
                System.out.print(randomNumbers[l] + ",");
            }
        }
        System.out.println("Задача 3");
        for (int b = 2; b >= 0; b--) {
            if (b == 0) {
                System.out.println(whole[b]);
            } else {
                System.out.print(whole[b] + ",");
            }
        }
        for (int n = 2; n >= 0; n--) {
            if (n == 0) {
                System.out.println(fractions[n]);
            } else {
                System.out.print(fractions[n] + ",");
            }
        }
        for (int m = 2; m >= 0; m--) {
            if (m == 0) {
                System.out.println(randomNumbers[m]);
            } else {
                System.out.print(randomNumbers[m] + ",");
            }
        }
        System.out.println("Задача 4");
        for (int v = 0; v < 3; v++) {
            if (whole[v] % 2 == 1) {
                whole[v] = whole[v] + 1;
            }
            System.out.println(whole[v]);
        }
    }
}
