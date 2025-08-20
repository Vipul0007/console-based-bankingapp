import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Practice {
  static Comparator<Integer> comp = (i, j) -> (i % 10 > j % 10) ? 1 : -1;

  public static void main(String[] args) {
    var i = 100;
    System.out.println(i);
    List<Integer> list = new ArrayList<>();
    list.add(49);
    list.add(12);
    list.add(31);
    list.add(46);

    try {
      Stream<Integer> s1 = list.stream();
      Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
      s2.forEach(n -> System.out.println(n));
    } catch (Exception e) {
      System.out.println("An Exception has occured");
    }

  }
}
