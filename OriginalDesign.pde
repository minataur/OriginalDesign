void setup()
{
  size(1000,1000);
  background(255,0,238);
}
void draw()
{
  drawCircle();
  drawRandomShit();
}
void drawCircle()
{
  noStroke();
  fill(random(0,255),random(0,255),random(0,255));
  ellipse(random(0,1000),random(0,1000),169,159);
}
void drawRandomShit()
{
  noStroke();
  fill(255,115,0,50);
  quad(random(0,1000),random(0,1000)/*1*/,random(0,1000),random(0,1000)/*2*/,random(0,1000),random(0,1000)/*3*/,random(0,1000),random(0,1000)/*4*/);
}
