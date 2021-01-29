package q_f79b;

import static java.lang.Math.pow;
import static java.lang.Math.round;
import static myGadgets.AllStaticMethods.isApproximatelyAnInt;
import static myGadgets.AllStaticMethods.myPow;

public class My_f79b {
  public static boolean isPalindromic(String string) {
    final int length = string.length();
    final int halfLength = length / 2;
    for (int i = 0; i < halfLength; i++) {
      if (string.charAt(i) != string.charAt(length - i - 1)) {
        return false;
      }
    }
    return true;
  }

  public static boolean isPalindromic(int integer) {
    return isPalindromic(String.valueOf(integer));
  }

  public static void main(String[] args) {

    final int ENUMERATE_LIMIT = 1500;

    for (int i = 0; i < ENUMERATE_LIMIT; i++) {

      final Integer cube = myPow(i, 3);

      if (isPalindromic(cube)) {
        System.out.printf("%d cubed is %d%n", i, cube);
      }
    }
  }
}
