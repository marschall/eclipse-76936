package com.github.marschall.eclipse7693;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Echo {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String answer;
    int i = 1;
    do {
      System.out.print("prompt" + i++ + "> ");
      answer = in.readLine();
      System.out.println("You said: \"" + answer + "\".");
    } while (!"exit".equals(answer));
    System.out.println("Bye.");
  }
}