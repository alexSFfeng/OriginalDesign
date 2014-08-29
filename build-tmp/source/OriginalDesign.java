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

//Feng,ShanFeng(Alex) 3 blk Mr.simon Original Assignment Raindrop
int circleSize = 80;
int raindropY = 50;
boolean rain = true;
public void setup()
{
 size(600,600);
 background(0);
}
public void draw()
{  	
  background(0);
  
  if(rain == true)
  {
  	raindrop();
  }
  else 
  {
  	ripple();
  }

}
public void raindrop()
{
  fill(0,0,200);
  strokeWeight(1);
  bezier(300,raindropY-50,280,raindropY-20,280,raindropY-5,300,raindropY);
  bezier(300,raindropY-50,320,raindropY-20,320,raindropY-5,300,raindropY);
  raindropY = raindropY + 2;
  if(raindropY > 300)
  {
  	rain = false;
  	raindropY = 50;
  }
}
public void ripple()
{
  noFill();
  strokeWeight(3.5f);
  stroke(128,128,128,100);
  ellipse(300,300,circleSize,circleSize-15);
  stroke(128,128,128,80);
  ellipse(300,300,circleSize-35,circleSize-50);
  stroke(128,128,128,60);
  ellipse(300,300,circleSize-70,circleSize-80);
  circleSize = circleSize +2;
  if (circleSize > 400)
  {
  	rain = true;
  	circleSize = 80;
  }
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
