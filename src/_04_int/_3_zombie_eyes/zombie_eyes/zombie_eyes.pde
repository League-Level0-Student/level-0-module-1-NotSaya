
void setup() {
 size (500,500);
PImage face = loadImage("Zombie.png");
face.resize(500,500);
background(face);
}
void draw() {
  fill(#FF0000);
ellipse(350,154,100,80);
ellipse(143, 168, 90, 80);
fill(#010101);
ellipse(350,154, 25, 20);


if( mouseX > 140 && mouseX < 147 ) {
  if(mouseY < 175 && mouseY > 165) {
    fill(#27B2B1);
  ellipse(143, 168, 18, 16);
} else {
  ellipse(143, 168, 18, 16);
}
}
}
