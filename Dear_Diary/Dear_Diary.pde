int[] dogData = {0, 1, 2, 3, 0, 1, 5, 3, 0, 6, 2, 1, 0, 2, 7, 3}; 
int graphWidth = 600;
int graphHeight = 400;

void setup() {
  size(600, 400);
  background(255);
  stroke(0);
  fill(0);
  
  line(50, graphHeight - 50, graphWidth - 50, graphHeight - 50);
  line(50, graphHeight - 50, 50, 50);
  
  textSize(12);
  textAlign(CENTER, CENTER);
  text("Days", graphWidth / 2, graphHeight - 20);
  textAlign(CENTER, CENTER);
  text("Number of Dogs", 20, graphHeight / 2);
  
  for (int i = 0; i < dogData.length; i++) {
    float x = map(i, 0, dogData.length - 1, 50, graphWidth - 50);
    float y = map(dogData[i], 0, 7, graphHeight - 50, 50);
    ellipse(x, y, 10, 10);
  }
}
