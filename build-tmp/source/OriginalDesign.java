import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{
  size(1000,1000);
  background(255,0,238);
}
public void draw()
{
  drawCircle();
  drawRandomShit();
}
public void drawCircle()
{
  noStroke();
  fill(random(0,255),random(0,255),random(0,255));
  ellipse(random(0,1000),random(0,1000),169,159);
}
public void drawRandomShit()
{
  noStroke();
  fill(255,115,0,50);
  quad(random(0,1000),random(0,1000)/*1*/,random(0,1000),random(0,1000)/*2*/,random(0,1000),random(0,1000)/*3*/,random(0,1000),random(0,1000)/*4*/);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
