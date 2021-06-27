// If this is your first Java program follow these steps:
// 1/ Install the VS Code java extension pack by opening the following in a browser: vscode:extension/vscjava.vscode-java-pack
// 2/ Create a file with the code from here:https://github.com/jbframe/oakton-computer-architecture-and-organization/blob/main/Labs/Lab3/BinaryToDecimal.java named BinaryToDecimal.java
// 3/ A "JAVA PPROJECTS" section will now appear in the VS Code explorer pane. Hover over the root project folder and hit the play button. Congrats! You just became a Java developer with your fancy new Java IDE, time to update your resume!
// VS CODE DOCS ARE HERE: https://code.visualstudio.com/docs/languages/java
// 4/ For a very easy to follow guide on the fundamentals of Java syntax and project organization check out
// https://www.w3schools.com/java/java_syntax.asp

import java.util.Scanner;

public class BinaryToDecimal
{
  public static void main(String[] args)
  {
    // declare and initialize the program variables
    Scanner cin = new Scanner(System.in);
    String line = "";
    char a, b, c, d, e, f, g, h;
    double decNum = 0.00;
    String result = "";

    // display the program menu
    System.out.println("\n--------------------------------Remarks------------------------------------");
    System.out.println("Name: John Frame, Student Number: B02291550, Date: 6/21/2021");
    System.out.println("Lab # & Name: 3 - Binary to Decimal Conversion Program");
    System.out.println("Course: CSC 204 Computer Architecture and Organization");
    System.out.println("---------------------------------------------------------------------------\n");

    System.out.println("\n(Binary 1's complement to Decimal Converter)\n");
    System.out.println("\nEnter an 8 - digit Binary 1's complement Number\n");
    System.out.println("\nExample: 11101101 \n");

    // input the sample binary number
    line = cin.nextLine();
    a = line.charAt(0);
    b = line.charAt(1);
    c = line.charAt(2);
    d = line.charAt(3);
    e = line.charAt(4);
    f = line.charAt(5);
    g = line.charAt(6);
    h = line.charAt(7);

    // check to see result is negative and bits need to flipped
    if(a == '1') {
      // if yes flip bits can calculate negative number
      if(b == '0') { decNum = decNum - 64; }
      if(c == '0') { decNum = decNum - 32; }
      if(d == '0') { decNum = decNum - 16; }
      if(e == '0') { decNum = decNum - 8; }
      if(f == '0') { decNum = decNum - 4; }
      if(g == '0') { decNum = decNum - 2; }
      if(h == '0') { decNum = decNum - 1; }
    } else { // if no calculate positive number
      if(b == '1') { decNum = decNum + 64; }
      if(c == '1') { decNum = decNum + 32; }
      if(d == '1') { decNum = decNum + 16; }
      if(e == '1') { decNum = decNum + 8; }
      if(f == '1') { decNum = decNum + 4; }
      if(g == '1') { decNum = decNum + 2; }
      if(h == '1') { decNum = decNum + 1; }
    }

    // display the program output
    System.out.println("\nthe decimal equivalent of ");
    result = a + "" + b + "" + c + "" + d + "";
    result += e + "" + f + "" + g + "" + h;
    System.out.println(result);
    System.out.println("" );
    System.out.println(" is " + decNum);
    cin.close();






  }
}