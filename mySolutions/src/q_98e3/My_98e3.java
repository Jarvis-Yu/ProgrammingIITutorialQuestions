package q_98e3;

import org.jetbrains.annotations.NotNull;

public class My_98e3 {

  public static int next(int x) {
    return x % 2 == 0 ? x / 2 : 3 * x + 1;
  }

  public static void main(String @NotNull [] args) {

    int initialValue = Integer.parseInt(args[0]);

    do {
      System.out.printf("%d ", initialValue);
      initialValue = next(initialValue);
    } while(initialValue != 1);
  }
}
