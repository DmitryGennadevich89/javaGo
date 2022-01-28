package les1;

public class Main4 {
    public static void main(String[] args) {
        int[] mas = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(); // перенос строки
        for (int i = 0; i < mas.length; i++) {
            if (i == mas.length - 1) System.out.print(mas[i]); // если это последний элемент, то печатаем без запятой
            else System.out.print(mas[i] + ", "); // печатаем элемент и запятую
        }
        System.out.println(); // пустая строка после массива
    }


}
