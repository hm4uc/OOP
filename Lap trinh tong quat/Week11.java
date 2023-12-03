import java.util.Comparator;
import java.util.List;

public class Week11 {
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> list) {
        list.sort(Comparator.naturalOrder());
        return list;
    }
}
