void setup()
{
  size(500,500);
  frameRate(2);
  
}
void draw()
{
  background(0,0,0); //background color
  drawCircle();
  drawRandomShit();
}
void drawCircle() //draws random circles
{
  noStroke();
  fill(random(0,255),random(0,255),random(0,255),95);
  ellipse(random(0,500),random(0,500),169,159);
}
void drawRandomShit() //draw random quadralaterals 
{
  noStroke();
  fill(255,247,0,95);
  quad(random(0,500),random(0,500)/*1*/,random(0,500),random(0,500)/*2*/,random(0,500),random(0,500)/*3*/,random(0,500),random(0,500)/*4*/);
}
