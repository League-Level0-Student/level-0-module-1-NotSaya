PImage pepperoni;
PImage olive;
PImage mushroom;

void setup() {
     size(500,500);
  PImage pizzaBox = loadImage("pizzaBox.png");
   pizzaBox.resize(500,500);
   background(pizzaBox);
    olive = loadImage("olive.png");
    olive.resize(80,80);
    pepperoni = loadImage("pepperoni.png");
    pepperoni.resize(80,80);
    mushroom = loadImage("mushroom.png");
    mushroom.resize(80,80);
}
void draw() {
  noStroke();
  fill(#FCE694);
    ellipse(250,250,400,400);
    fill(#F54939);
    ellipse(250,250,330,330);
    image(pepperoni, 100, 200);
    image(olive,300,150);
    if (mousePressed && (mouseButton == RIGHT)) {
      image(mushroom, 250,330);
    }
}
