PImage backgroundImage;

import ddf.minim.*;  
Minim minim;
AudioSample sound;
int bx = 600;
int by = 400;
int r = 0;
int g = 50;
int b = 255;
boolean right = true;
int yspd = 10;
int speed = 10;
void setup() {
  size(1200, 800);
  minim = new Minim (this);
  backgroundImage = loadImage("drums.jpg");
  backgroundImage.resize(width,height);
  //sound = minim.loadSample("pong.wav", 128);
}

void draw() {
  r=r+2;
  r=r%255;
  g=g+3;
  g=g%255;
  b=b-1;
  b=b%255;
  background(backgroundImage);
  fill(r, g, b);
  stroke(0, 0, 0);
  ellipse(bx, by, 50, 50);
  if (right==true) {
    bx=bx+speed;
  } else {
    bx=bx-speed;
  }
  if (bx<=85&&bx>=75&&mouseY+50>by&&mouseY-50<by) {
    right=true;
  } else if (bx>width-25) {
    right=false;
  }
  if (by>height-25) {
    yspd=-yspd;
  } else if (by<25) {
    yspd=-yspd;
    //sound.trigger();
  }
  by=by+yspd;
  rect(50, mouseY-50, 10, 100);
}