//Feng,ShanFeng(Alex) 3 blk Mr.simon Original Assignment Raindrop
int circleSize = 80;
int raindropY = 50;
boolean rain = true;
void setup()
{
 size(600,600);
 background(0);
}
void draw()
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
void raindrop()
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
void ripple()
{
  noFill();
  strokeWeight(3.5);
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


