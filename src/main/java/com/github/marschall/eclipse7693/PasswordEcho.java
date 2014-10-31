package com.github.marschall.eclipse7693;

import java.io.Console;

public class PasswordEcho {
  
  public static void main(String[] args) {
    Console console = System.console();

    console.printf("Testing ...%n");
    console.readPassword("Enter password: ");
    console.printf("Done%n");

  }

}
