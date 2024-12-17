import java.util.LinkedList;
import java.util.Queue;

public class QueueCheck {
    public static <T> boolean checkEqual(Queue<T> queue, int i, int j) {
        if (i < 0 || j >= queue.size() || i >= j) {
            throw new IllegalArgumentException("Неверные индексы i и j");
        }
        Queue<T> tempQueue = new LinkedList<>(queue);
        T firstElement = null;
        for (int index = 0; index <= j; index++) {
            T element = tempQueue.poll();
            if (index == i) {
                firstElement = element;
            }
            if (index >= i && index <= j) {
                if (!element.equals(firstElement)) {
                    return false;
                }
            }
        }
        return true;
    }
}