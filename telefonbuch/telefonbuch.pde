ArrayList<String> names;
ArrayList<String> numbers;

JSONArray list;


void setup(){
  size(400, 800);
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

void draw(){
  background(255);

  fill(0);
  textSize(18);
  text("Telefonbuch:", 20, 40);

  for(int i = 0; i < names.size(); i++){
    textSize(12);
    text(names.get(i) + ": " + numbers.get(i), 40, 80 + i * 30);
  }

}

// void mousePressed(){
//   names = new ArrayList<String>();
//   numbers = new ArrayList<String>();
//
//   list = loadJSONArray("json/list.json");
//
//   for(int i = 0; i < list.size(); i++){
//     JSONObject entry = list.getJSONObject(i);
//     names.add(entry.getString("name"));
//     numbers.add(entry.getString("number"));
//   }
// }
