PImage i;

void setup()
{
  size(1000,1000);
  
  i = loadImage("https://upload.wikimedia.org/wikipedia/commons/0/05/Pacman_Guggenheim_%28cropped%29.jpg");
}


void draw()
{
  image(i,0,0);
}
