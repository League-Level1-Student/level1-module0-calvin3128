int score = 0;
int x = 400;
float y = 50;

void setup(){
  size(800,800);
}

void draw(){
  background(100,100,100);
  fill(150,150,255);
  stroke(255,255,255);
  ellipse(x,y,25,50);
  y=1.05*y;
  rect(mouseX-25,750,50,75);
if(y>800){
 if(mouseX>(x-25)&&mouseX<(x+25)){
  score++; 

 }
 else if(score>0){
   score--;
 }
   y=50;
    x=(int) random(width);
}
fill(255,255,255);
textSize(16);
text("Score: "+score,20,20);
}