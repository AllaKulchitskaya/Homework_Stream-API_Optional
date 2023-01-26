import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(3);
        list.add(8);
        list.add(10);
        int evenNumbersQuantity = getEvenNumbersQuantity(list);
        System.out.println("Количество чётных чисел: " + evenNumbersQuantity);
    }

    public static int getEvenNumbersQuantity (List<Integer> list) {
        List<Integer> evenNumbers = list.stream().filter(n -> (n % 2 == 0)).toList();
        return evenNumbers.size();
    }
}
