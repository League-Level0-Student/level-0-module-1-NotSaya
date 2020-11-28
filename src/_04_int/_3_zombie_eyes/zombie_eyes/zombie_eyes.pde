
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

if( mouseX > 300 && mouseX < 400 ) {
  if(mouseY > 100 && mouseY < 200){
    fill(#27B2B1);
  ellipse(350,154,100,80);
  }
}
if (mouseX > 90 && mouseX < 190){
  if(mouseY > 110 && mouseY < 210){
    fill(#27B2B1);
    ellipse(143, 168, 90, 80);
  }
}
fill(#010101);
ellipse(350,154, 25, 20);
 ellipse(143, 168, 18, 16);

}
