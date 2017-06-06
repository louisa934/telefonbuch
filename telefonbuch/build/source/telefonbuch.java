import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class telefonbuch extends PApplet {

String name1 = "Adam Apfel";
String number1 = "0171 1111 1111";

String name2 = "Bert Astmann";
String number2 = "0171 2222 2222";

String name3 = "Boris Becker";
String number3 = "0171 3333 3333";

public void setup(){
  
  background(255);
}

public void draw(){
  background(255);

  fill(0);
  textSize(18);
  text("Telefonbuch:", 20, 40);

  textSize(12);
  text(name1 + ": " + number1, 40, 80);

  textSize(12);
  text(name2 + ": " + number2, 40, 110);

  textSize(12);
  text(name3 + ": " + number3, 40, 140);

}
  public void settings() {  size(400, 800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "telefonbuch" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
