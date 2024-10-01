String signText = "UNDERGROUND"; 
void setup()
{
  frameRate(1); //frameRate set to 1 to save resources
  size(500, 500);  //setting size of canvas
  background(255, 255, 255);
  textAlign(CENTER, CENTER);
  textSize(36);
  stroke(200);
}

void draw()
{
  fill(255, 0, 0);
  circle(250, 250, 250);

  fill(255, 255, 255);
  circle(250, 250, 150);

  fill(#0514A7);
  rect(100, 225, 300, 50);

  fill(255, 255, 255);
  text(signText, 252, 250);
}
