package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class DigiFlower
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setColor(Colors.Grays.Silver);
    Tortoise.setPenWidth(3);
    for (int i = 1; i <= 15; i++)
    {
      createColorPalette();
      drawOctagon();
      Tortoise.turn(360 / 15);
    }
  }
  private static void drawOctagon()
  {
    for (int i = 1; i <= 8; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(50);
      Tortoise.turn(360 / 8);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(Colors.Reds.Red);
    ColorWheel.addColor(Colors.Oranges.DarkOrange);
    ColorWheel.addColor(Colors.Yellows.Gold);
    ColorWheel.addColor(Colors.Yellows.Yellow);
    ColorWheel.addColor(Colors.Yellows.Yellow);
    ColorWheel.addColor(Colors.Yellows.Gold);
    ColorWheel.addColor(Colors.Oranges.DarkOrange);
    ColorWheel.addColor(Colors.Reds.Red);
  }
}
