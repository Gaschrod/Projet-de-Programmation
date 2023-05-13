class Button
{
  String label;
  float x;
  float y;
  float w;
  float h;
  color fill_color;
  color border_color;
  color hover_color = #3C63D5;
  
  Button(String label, float x, float y, float w, float h)
  {
    this.label = label;
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    border_color = #000000;
    fill_color = #FFFFFF;
  }

  void update()
  {
    if (contains(mouseX, mouseY))
    {
      if (mousePressed && mouseButton == LEFT)
      {
        fill_color = #FFFFFF;
      }
      else
      {
        fill_color = lerpColor(fill_color, hover_color, 0.5);
      }
    }
    else
    {
      fill_color = #FFFFFF;
    }
  }
  

  void draw()
  {
    push();
    
    fill(fill_color);
    stroke(border_color);
    rect(x, y, w, h);
    
    fill(border_color);
    textSize(h - 6);
    text(label, x + 2, y + 2, w, h);
    
    pop();
  }
  
  boolean contains(float x, float y)
  {
    return x >= this.x && y >= this.y && x < this.x + w && y < this.y + h;
  }

  boolean clic(int mouseX, int mouseY) { // return true if the button is clicked
    if (mouseX >= this.x && mouseX <= this.x + w && mouseY >= this.y && mouseY <= this.y + h) {
     return true;
      } else {
       return false;
      }
    }

  void button_spawn_train(int station) {
    int train_number = machine.get_number_train() + 1;
    machine.get_spawn_train().run_spawn_train(station, train_number);
  }

  void button_NW_to_NE_railway() {
    machine.get_NW_to_NE_railway().run_NW_to_NE_railway();
  }

  void button_avance_NW_to_NE(List<Integer> args, Integer stationOccupancy){
    machine.get_avance_NW_to_NE().run_avance_NW_to_NE(args.get(0), args.get(1), stationOccupancy, 0);
  }
}
