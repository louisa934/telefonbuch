String name1 = "Adam Apfel";
String number1 = "0171 1111 1111";

String name2 = "Bert Astmann";
String number2 = "0171 2222 2222";

String name3 = "Boris Becker";
String number3 = "0171 3333 3333";

void setup(){
  size(400, 800);
  background(255);
}

void draw(){
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
