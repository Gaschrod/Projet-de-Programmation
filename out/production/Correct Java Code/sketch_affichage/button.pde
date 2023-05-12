class Button implements Entity
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
 
  @Override
  void update()
  {
    if (contains(mouseX, mouseY))
    {
      if (mousePressed && mouseButton == LEFT)
      {
        fill_color = #FFFFFF;
        if (mouseX == 50 && mouseY == 845)
        {
          run_spawn_train(Station NW, Train Tchou_tchou);
        }
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
  
  @Override
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
}
