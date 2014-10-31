package com.github.marschall.eclipse7693;

import static java.lang.System.out;

public class NewLineInterleaving1 {

  public static void main(String[] args) {
    // no newlines at start or end
    out.print("x\b1\nx\b2\nx\b3");
  }

}
