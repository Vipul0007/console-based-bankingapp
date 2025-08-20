import java.util.*;

public class Subsequence {
  public static void allSubsequence(int indx, int[] arr, List<List<Integer>> list, List<Integer> seq) {
    if (indx >= arr.length) {
      list.add(new ArrayList<>(seq));
      System.out.println(seq);
      return;
    }
    // not accepting the element from the array
    allSubsequence(indx + 1, arr, list, seq);
    // taking the lement from the aray
    seq.add(arr[indx]);
    allSubsequence(indx + 1, arr, list, seq);
    seq.remove(seq.size() - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    List<List<Integer>> list = new ArrayList<>();
    List<Integer> seq = new ArrayList<>();
    allSubsequence(0, arr, list, seq);
    System.out.println(list);
    sc.close();
  }
}
