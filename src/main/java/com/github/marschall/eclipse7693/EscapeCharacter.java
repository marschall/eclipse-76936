package com.github.marschall.eclipse7693;

import static java.lang.System.out;

public class EscapeCharacter {

	public static void main(String[] args) throws InterruptedException {
	  // test for https://bugs.eclipse.org/bugs/show_bug.cgi?id=76936
		out.println("line 1");
		out.println("fail the test\rwinn"); // winn the test
//		out.flush();
//		Thread.sleep(1_000);
		out.println("win not\b\b\b");
		out.println("win not\b\b\byes"); // win yes
		out.println("line\findented"); // line
		                               //     indented 
	}

}
