package les1;

public class Main {

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();

        ex5();
        // ex5();
        //naoborot();
    }

    public static void ex1() {

        int IntegerValue = 1024;
        long longValue = 10242048;
        byte byteValue = -64;
        short shortValue = 22222;

        double doubleValue = -12345d;
        float floatValue = 1.2345f;

        char charValue = 'y';
        String stringValue = "-_- o_o 0_0 imazing";
        boolean booleanValue = false;

        System.out.println("№2 ");
        System.out.println("Целочисленные: ");
        System.out.println("-integer: " + IntegerValue);
        System.out.println("-long: " + longValue);
        System.out.println("-byte: " + byteValue);
        System.out.println("-short: " + shortValue);
        System.out.println("С плавающей точкой: ");
        System.out.println("-double: " + doubleValue);
        System.out.println("-float: " + floatValue);
        System.out.println("С символами:");
        System.out.println("-char: " + charValue);
        System.out.println("-string: " + stringValue);
        System.out.println("Специальный:");
        System.out.println("-boolean: " + booleanValue);
    }

    public static void ex2() {
        float a = 1;
        float b = 2;
        float c = 5;
        float d = 10;
        float result = calculate(a, b, c, d);
        System.out.println("№3 Результат выражения: " + result);
    }

    public static float calculate(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return result;
    }


    public static void ex3() {
        int e = 10;
        int f = 15;
        boolean result = compare(e, f);
        System.out.println("№4 находится в диапазоне от 10 до 20: " + result);

    }

    public static boolean compare(int e, int f) {
        return (e + f) > 10 && (e + f) <= 20;
    }


//    public static void ex3() {
//        float e = 11;
//        float f = 10;
//        float sumEF = calculate(e, f);
//        System.out.println("№4 сумма двух чисел: " + sumEF);
//        System.out.println("находится в диапазоне от 10 до 20: " + (10 <= sumEF && sumEF <= 20));
//    }
//        public static float calculate(float e, float f) {
//            float sumEF = e + f;
//            return sumEF;
//        }

//    public static void ex4() { хотел сделать вторым способом, но что-то пошло не так... для начала не дал назвать calculate - is already defined, добавил цифру 2, но чёт не так всё равно работает((
//        float g = 9;
//        float h = 10;
//        float sumGH = calculate2(g, h);
//        System.out.println(true && false);
//
//        if (10 <= sumGH || sumGH <= 20) {
//            System.out.println("№4 сумма двух чисел находится в диапазоне от 10 до 20: ");
//        }
//        else {
//            System.out.println("№4 сумма двух чисел не находится в диапазоне от 10 до 20: ");
//        }
//
//    }
//        public static float calculate2(float g, float h) {
//            float sumGH = g + h;
//            return sumGH;
//    }

    public static void ex5() {
        int chislo = 1234;
        int chislo2 = 456;
        String resultX3 = naoborot(chislo);
        System.out.println(resultX3);
        String resultX4 = naoborot(chislo2);
        System.out.println(resultX4);
    }

    public static String naoborot(int chislo) {
        if (100 <= chislo && chislo <= 999) {
            int fir = chislo / 100;
            int sec = (chislo / 10) % 10;
            int thi = chislo % 10;
            return "№5 число попадает в заданный диапазон " + thi + sec + fir;
        } else {
            return "№5 число не попадает в заданный диапазон " + chislo;
        }

    }


}
