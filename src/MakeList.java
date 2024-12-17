import java.util.List;
import java.util.ArrayList;

public class MakeList {
    public static <T> List<T>makeList(List<T> list_1, List<T> list_2) {
        List<T> listResult = new ArrayList<>();
        for (T element : list_1) {
            if (!list_2.contains(element) && !listResult.contains(element)) {
                listResult.add(element);
            }
        }
        for (T element : list_2) {
            if (!list_1.contains(element) && !listResult.contains(element)) {
                listResult.add(element);
            }
        }
        return listResult;
    }
}
