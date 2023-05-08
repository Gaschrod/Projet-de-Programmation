class Button implements Entity
{
  String label;
  float x;
  float y;
  float w;
  float h;
  color fill_color;
  color border_color;
  
  Button(String label, float x, float y, float w)
  {
    this.label = label;
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = 16;
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
      }
      else
      {
        fill_color = #FFFFFF;
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
    stroke(#000000); // Couleur de contour noire
    rect(x, y, w, h);
    
    fill(#000000);
    textSize(h - 4);
    text(label, x + 2, y + 2, w, h);
    
    pop();
  }
  
  boolean contains(float x, float y)
  {
    return x >= this.x && y >= this.y && x < this.x + w && y < this.y + h;
  }
}
