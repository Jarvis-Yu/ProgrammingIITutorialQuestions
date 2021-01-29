package myGadgets;

import static java.lang.Math.abs;
import static java.lang.Math.round;

public class AllStaticMethods {

  public static Integer myPow(Integer base, Integer exponent) {
    return abs(switch (exponent) {
      case 0 -> 1;
      case 1 -> base;
      case 2 -> base * base;
      default -> exponent % 2 == 0 ? myPow(myPow(base, exponent / 2), 2)
                                   : myPow(myPow(base, exponent / 2), 2) * base;
    });
  }

  public static boolean isApproximatelyAnInt(double num, double toleration) {
    return abs(num - round(num)) < toleration;
  }

  public static boolean isApproximatelyAnInt(double num) {
    return isApproximatelyAnInt(num, 0.01);
  }
}
