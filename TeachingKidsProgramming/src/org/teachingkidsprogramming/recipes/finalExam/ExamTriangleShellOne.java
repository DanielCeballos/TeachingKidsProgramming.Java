package org.teachingkidsprogramming.recipes.finalExam;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ExamTriangleShellOne
{
  private static int length;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //    Set the size of a shell to a number that the user supplies HINT: Use a Message Box
    int shell = MessageBox.askForNumericalInput("Enter the size of a shell.");
    //    If the size of a shell is less than 200
    if (shell <= 200)
    {
      //         Tell the user that the size of the shell is too small to be seen AND...
      MessageBox.showMessage("The shell is too small to be seen.");
      //         Ask the user to enter a updated size of shell - HINT: Use a Message Box
      MessageBox.askForNumericalInput("Enter another size for the shell.");
    }
    //    Otherwise, Do the following the "shell size" number of times
    else
    {
      for (int i = 1; i <= shell; i++)
      {
        //          Change the color of the line the tortoise draws to a random color
        Tortoise.setPenColor(Colors.getRandomColor());
        //          Set the value of the large length to the size of the shell divided by 100
        int largelength = shell / 100;
        //          Add the value of the large length to the current length
        //      If the value of the large length is less than zero
        if (largelength <= 0)
        {
          //      Set the value of the length to the length plus 3
          length = length + 3;
        }
      }
      //         Otherwise, Call the drawTriangle method (recipe below)      
      drawTriangle();
      //          Set the value of the number of rotations to 6
      //          Turn the tortoise 360 times the number of rotations, then divide that by the size of the shell 
      //    Repeat 
    }
  }
  private static void drawTriangle()
  {
    for (int i = 1; i <= 2.5; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3.5);
    }
  }
}
