float circleX;
float circleY;
float rectX;
float rectY;
boolean inCircle;

void setup()
{
  background(#909090);
  size(200, 300);
  circleX = random(200);
  circleY = random(300);

  rectX = circleX - 65;
  rectY = circleY - 10;
}

void draw()
{
  circle(circleX, circleY, 50);
  rect(rectX, rectY, 130, 20);

  // Check mouse positions to see if it is in the bounds of the rectangle

  if (dist(circleX, circleY, mouseX, mouseY) < 25)
  {
    inCircle = true;
    fill(255, 0, 0);
    circle(circleX, circleY, 50);
  } else
  {
    inCircle = false;
    fill(255, 255, 255);
    circle(circleX, circleY, 50);
  }


  if (mouseX > rectX && mouseX < (rectX + 130))
  {
    if (mouseY > rectY && mouseY < (rectY + 20))
    {
      fill(255, 255, 255);
      circle(circleX, circleY, 50);
      fill(0, 0, 255);
      rect(rectX, rectY, 130, 20);
    } else
      fill(255, 255, 255);
    rect(rectX, rectY, 130, 20);
  }
}
