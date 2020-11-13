
void setup() {
  size(600,400);
  noFill();
}
int x=450;
int speed=-1;
int ospeed=1;
int X=200;
void draw() {
  background(#CECECE);
  //   shapes     x , y, width, height
for(int i=0; i<28; i++){
    ellipse(x,250, i*10, i*10 );
   }
   if(x<200){
      speed=-speed;
}
else if(x>450){
speed=-speed;
}
    x+=speed;
  
  for(int o=0; o<28; o++){
    ellipse(X, 250, o*10, o*10); 
    
}
X+=ospeed;
if(X>450){
ospeed=-ospeed;
}
if(X<200){
ospeed=-ospeed;
}
}
  // Go to the; recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
