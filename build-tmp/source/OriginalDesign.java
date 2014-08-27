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
  size(500,500);
  frameRate(2);
  
}
public void draw()
{
  background(0,0,0); //background color
  drawCircle();
  drawRandomShit();
}
public void drawCircle() //draws random circles
{
  noStroke();
  fill(random(0,255),random(0,255),random(0,255),95);
  ellipse(random(0,500),random(0,500),169,159);
}
public void drawRandomShit() //draw random quadralaterals 
{
  noStroke();
  fill(255,247,0,95);
  quad(random(0,500),random(0,500)/*1*/,random(0,500),random(0,500)/*2*/,random(0,500),random(0,500)/*3*/,random(0,500),random(0,500)/*4*/);
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
