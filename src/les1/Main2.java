package les1;

public class Main2 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
//        ex6();
    }

    public static void ex1() {
        int[] mas = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("ex1: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (mas[i] == 0) ? 1 : 0;
            System.out.print(mas[i] + " ");
        }
    }

    public static void ex2() {
        int[] array = new int[8];

        System.out.println();
        System.out.println("ex2: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3 + 1;
            System.out.print(array[i] + " ");
        }
    }

    public static void ex3() {
        int[] mas3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println();
        System.out.println("ex3: ");
        for (int i = 0; i < mas3.length; i++) {
            System.out.print(mas3[i] + " ");
        }
        System.out.println();
        doSomething(mas3);
    }

    static void doSomething(int[] mas3) {
        for (int i = 0; i < mas3.length; i++) {
            mas3[i] = (mas3[i] < 6) ? mas3[i] * 2 : mas3[i];
            System.out.print(mas3[i] + " ");
        }
    }

    public static void ex4() {
        int[] mas4 = generateArray();
        int minNum4 = searchMin(mas4);
        int maxNum4 = searchMax(mas4);
        printResult(minNum4, maxNum4);
    }

    private static void printResult(int minNum4, int maxNum4) {
        System.out.println();
        System.out.println("минимальное значение = " + (minNum4 + 1) + " ");
        System.out.println("максимальное значение = " + (maxNum4 + 1) + " ");
    }

    static int[] generateArray() {
        int[] mas4 = new int[10];
        System.out.println();
        System.out.println("ex4:");
        for (int i = 0; i < mas4.length; i++) {
            mas4[i] = (int) (Math.round(Math.random() * 200) - 100);
            System.out.print(mas4[i] + " ");
        }
        return mas4;
    }

    static int searchMin(int[] mas4) {
        int min4 = mas4[0], minNum4 = 0;
        for (int i = 0; i < mas4.length; i++) {
            if (min4 > mas4[i]) {
                min4 = mas4[i];
                minNum4 = i;
            }
        }
        return minNum4;
    }

    static int searchMax(int[] mas4) {
        int max4 = mas4[0], maxNum4 = 0;
        for (int i = 0; i < mas4.length; i++) {
            if (max4 < mas4[i]) {
                max4 = mas4[i];
                maxNum4 = i;
            }
        }
        return maxNum4;
    }

    //    public static void ex5() {               короче, ты мне подсказал с этим:  mas[mas.length-1], но я всё равно до конца не понимаю как оно работает, даже на листочке нарисовал, по шагам прогнал тут в проге, и вроде всё логично, но тем не менее до конца не понял. возьмём как данность.
//        System.out.println("ex5: ");            а этим способом так не получилось, можешь исправить чтобы заработало? (если это вообще возможно, конечно))
//
//        int n = 7;
//    int[][] mas5 = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            mas5[i][i] = 1;
//            mas5[i][n-i-1] = 1;
//
//            }
//        System.out.println(mas5);
//        }
    public static void ex5() {
        System.out.println("ex5: ");
        int[][] mas5 = new int[7][7];
        for (int i = 0; i < mas5.length; i++) {
            for (int j = 0, n = mas5[i].length - 1; j < mas5[i].length; j++, n--) {
                if (i == j || i == n) mas5[i][j] = 1;
                else mas5[i][j] = 0;
                System.out.print(mas5[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

//    public static boolean checkBalance(int[] mas6) { не осилю, не шарю((
//        int lSum = 0;
//        int rSum = 0;
//
//        for (int i = 0; i < mas6.length; i++) {
//            mas6[i] = (int) (Math.round(Math.random() * 10));
//            System.out.print(mas6[i] + " ");
//
//            lSum += mas6[i];
//            for (int j = 0; j < mas6.length; j++) {
//                mas6[j] = (int) (Math.round(Math.random() * 10));
//                System.out.print(mas6[j] + " ");
//
//                rSum += mas6[j];
//
//                if (lSum == rSum) {
//                    return true;
//                } else {
//                    return false;
//                }
//
//            }
//        }
    }




