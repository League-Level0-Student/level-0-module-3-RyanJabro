void setup() {
size(800, 800);
}
int xTwo = 550;
int x = 250; 
int speed = 1;
int speedTwo = -1;
void draw() {
background(#FFFFFF);
int w = 250;
int h = 250;
int wTwo = 250;
int hTwo = 250;
 for(int i = 0; i < 17; i++) {
   noFill();
   ellipse(x, 400, w, h);
   h -= 15;
   w -= 15;

 }

   x = x + speed;

  
if(x > 749) {
    speed = -speed;
}
if(x < 50) {
}
 for(int i = 0; i < 17; i++) {
   noFill();
   ellipse(xTwo, 400, wTwo, hTwo);
   hTwo -= 15;
   wTwo -= 15;
 
 } 

   xTwo = xTwo + speedTwo;

if(xTwo < 49) {
    speedTwo = -speedTwo;
}
}
  