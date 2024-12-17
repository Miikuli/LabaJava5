import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PointStream {
    public static Polyline streamPoints(List<Point> points) {
        List<Point> uniquePoints = points.stream()
                .map(p -> new Point(p.getX(), Math.abs(p.getY())))
                .distinct()
                .sorted(Comparator.comparingDouble(Point::getX))
                .collect(Collectors.toList());
        Polyline polyline = new Polyline(uniquePoints.toArray(new Point[0]));
        return polyline;
    }
}