package les1;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] mas = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; // создал массив с заданными параметрами - пришлось гуглить, т.к.тип ничего не рассказал как коротко заполнить заданные параметры

        for (int i = 0; i < mas.length; i++) {
        }

        System.out.println(Arrays.toString(mas)); // вывод массива в строку с помощью Arrays(см. строка2), опять же пришлось гуглить ибо тип ничего про это не рассказал
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 0) { // сначала написал обычное равно и не мог какое-то время понять при чём тут булинг xD ну ты понял, понял же, да?))
                mas[i] = 1;
            } else {
                mas[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mas)); // вывод итогового результата
    }

}



