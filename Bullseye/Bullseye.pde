int w = 250;
int h = 250;
void setup() {
size(500, 500);
for(int i = 0; i < 17; i++) {
  noFill();
  ellipse(250, 250, w, h);
  h -= 15;
  w -= 15;
}

}