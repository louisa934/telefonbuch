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

ArrayList<String> names;
ArrayList<String> numbers;

JSONArray list;


public void setup(){
  
  background(255);

  names = new ArrayList<String>();
  numbers = new ArrayList<String>();

  list = loadJSONArray("json/list.json");

  for(int i = 0; i < list.size(); i++){
    JSONObject entry = list.getJSONObject(i);
    names.add(entry.getString("name"));
    numbers.add(entry.getString("number"));
  }
}

public void draw(){
  background(255);

  fill(0);
  textSize(18);
  text("Telefonbuch:", 20, 40);

  for(int i = 0; i < names.size(); i++){
    textSize(12);
    text(names.get(i) + ": " + numbers.get(i), 40, 80 + i * 30);
  }

}

public void mousePressed(){
  names = new ArrayList<String>();
  numbers = new ArrayList<String>();

  list = loadJSONArray("json/list.json");

  for(int i = 0; i < list.size(); i++){
    JSONObject entry = list.getJSONObject(i);
    names.add(entry.getString("name"));
    numbers.add(entry.getString("number"));
  }
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
