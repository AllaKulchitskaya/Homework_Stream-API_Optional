import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(165);
        arrayList.add(42);
        arrayList.add(1278);
        arrayList.add(2);
        arrayList.add(1000);
        arrayList.add(985);
        Stream<Integer> stream = arrayList.stream();
        findMinMax(
                stream,
                Comparator.naturalOrder(),
                (a, b) -> System.out.println("Минимальное значение: " + a + ", максимальное значение: " + b)
        );
    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> arrayList = new ArrayList<>();
        T min;
        T max;
        arrayList = stream
                .sorted(order)
                .collect(Collectors.toList());
        if (arrayList.size() != 0) {
            min = arrayList.get(0);
            max = arrayList.get(arrayList.size() - 1);
            if (min == null && max == null) {
                minMaxConsumer.accept(null, null);
            }
            minMaxConsumer.accept(min, max);
        }
    }
}
