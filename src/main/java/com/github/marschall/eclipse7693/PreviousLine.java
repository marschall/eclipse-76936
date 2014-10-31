package com.github.marschall.eclipse7693;

import static java.lang.System.out;
import static java.util.concurrent.TimeUnit.SECONDS;

public class PreviousLine {

  public static void main(String[] args) throws InterruptedException {
    out.print("aaa");
    out.flush();
    Thread.sleep(SECONDS.toMillis(2L));
    out.println("\rxxx");

  }

}
