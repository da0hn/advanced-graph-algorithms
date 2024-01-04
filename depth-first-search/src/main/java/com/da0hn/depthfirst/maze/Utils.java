package com.da0hn.depthfirst.maze;

public class Utils {

  public static void sleep(final long millis) {
    try {
      Thread.sleep(millis);
    }
    catch (final InterruptedException e) {
      e.printStackTrace();
    }
  }

}
