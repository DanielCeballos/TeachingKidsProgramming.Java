package org.teachingkidsprogramming.recipes;

public class FizzBuzz
{
  public static String convert(int i)
  {
    //If the number is a multiple of three give Fizz
    //If the number is 5 give buzz
    //otherwise everything else
    if (i == 15)
    {
      return "Fizz" + "Buzz";
    }
    else if (i % 3 == 0)
    {
      return "Fizz";
    }
    else if (i % 5 == 0)
    {
      return "Buzz";
    }
    else
    {
      return "" + i;
    }
  }
}
