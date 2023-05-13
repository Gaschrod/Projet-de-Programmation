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

  void button_avance_NW_to_NE(List<Integer> args){
    machine.get_avance_NW_to_NE().run_avance_NW_to_NE(args.get(0), args.get(1), 0);
  }

  void button_NE_to_NW_railway(){
    machine.get_NE_to_NW_railway().run_NE_to_NW_railway();
  }

  void button_avance_NE_to_NW(List<Integer> args){
    machine.get_avance_NE_to_NW().run_avance_NE_to_NW(args.get(2), 0, args.get(1));
  }

  void button_NW_to_SW_railway(){
    machine.get_NW_to_SW_railway().run_NW_to_SW_railway();
  }

  void button_avance_NW_to_SW(List<Integer> args){
    machine.get_avance_NW_to_SW().run_avance_NW_to_SW(args.get(0), args.get(1), 0);
  }

  void button_SW_to_NW_railway(){
    machine.get_SW_to_NW_railway().run_SW_to_NW_railway();
  }

  void button_avance_SW_to_NW(List<Integer> args){
    machine.get_avance_SW_to_NW().run_avance_SW_to_NW(args.get(2), 0, args.get(1));
  }

  void button_NW_to_center_railway(){
    machine.get_NW_to_center_railway().run_NW_to_center_railway();
  }

  void button_avance_NW_to_center(List<Integer> args){
    machine.get_avance_NW_to_center().run_avance_NW_to_center(args.get(0), args.get(1), 0);
  }

  void button_center_to_NW_railway(){
    machine.get_center_to_NW_railway().run_center_to_NW_railway();
  }

  void button_avance_center_to_NW(List<Integer> args){
    machine.get_avance_center_to_NW().run_avance_center_to_NW(args.get(2), 0, args.get(1));
  }

  void button_center_to_NE_railway(){
    machine.get_center_to_NE_railway().run_center_to_NE_railway();
  }

  void button_avance_center_to_NE(List<Integer> args){
    machine.get_avance_center_to_NE().run_avance_center_to_NE(args.get(0), args.get(1), 0);
  }

  void button_NE_to_center_railway(){
    machine.get_NE_to_center_railway().run_NE_to_center_railway();
  }

  void button_avance_NE_to_center(List<Integer> args){
    machine.get_avance_NE_to_center().run_avance_NE_to_center(args.get(2), 0, args.get(1));
  }

  void button_NE_to_S_railway(){
    machine.get_NE_to_S_railway().run_NE_to_S_railway();
  }

  void button_avance_NE_to_S(List<Integer> args){
    machine.get_avance_NE_to_S().run_avance_NE_to_S(args.get(0), args.get(1), 0);
  }

  void button_S_to_NE_railway(){
    machine.get_S_to_NE_railway().run_S_to_NE_railway();
  }

  void button_avance_S_to_NE(List<Integer> args){
    machine.get_avance_S_to_NE().run_avance_S_to_NE(args.get(2), 0, args.get(1));
  }

  void button_S_to_SE_railway(){
    machine.get_S_to_SE_railway().run_S_to_SE_railway();
  }

  void button_avance_S_to_SE(List<Integer> args){
    machine.get_avance_S_to_SE().run_avance_S_to_SE(args.get(0), args.get(1), 0);
  }

  void button_SE_to_S_railway(){
    machine.get_SE_to_S_railway().run_SE_to_S_railway();
  }

  void button_avance_SE_to_S(List<Integer> args){
    machine.get_avance_SE_to_S().run_avance_SE_to_S(args.get(2), 0, args.get(1));
  }

  void button_SW_to_S_railway(){
    machine.get_SW_to_S_railway().run_SW_to_S_railway();
  }

  void button_avance_SW_to_S(List<Integer> args){
    machine.get_avance_SW_to_S().run_avance_SW_to_S(args.get(0), args.get(1), 0);
  }

  void button_S_to_SW_railway(){
    machine.get_S_to_SW_railway().run_S_to_SW_railway();
  }

  void button_avance_S_to_SW(List<Integer> args){
    machine.get_avance_S_to_SW().run_avance_S_to_SW(args.get(2), 0, args.get(1));
  }

  void button_SW_to_transit_railway(){
    machine.get_SW_to_transit_railway().run_SW_to_transit_railway();
  }

  void button_avance_SW_to_transit(List<Integer> args){
    machine.get_avance_SW_to_transit().run_avance_SW_to_transit(args.get(0), args.get(1), 0);
  }

  void button_transit_to_SW_railway(){
    machine.get_transit_to_SW_railway().run_transit_to_SW_railway();
  }

  void button_avance_transit_to_SW(List<Integer> args){
    machine.get_avance_transit_to_SW().run_avance_transit_to_SW(args.get(2), 0, args.get(1));
  }

  void button_center_to_S_railway(){
    machine.get_center_to_S_railway().run_center_to_S_railway();
  }

  void button_avance_center_to_S(List<Integer> args){
    machine.get_avance_center_to_S().run_avance_center_to_S(args.get(0), args.get(1), 0);
  }

  void button_S_to_center_railway(){
    machine.get_S_to_center_railway().run_S_to_center_railway();
  }

  void button_avance_S_to_center(List<Integer> args){
    machine.get_avance_S_to_center().run_avance_S_to_center(args.get(2), 0, args.get(1));
  }

  void button_transit_to_center_railway(){
    machine.get_transit_to_center_railway().run_transit_to_center_railway();
  }

  void button_avance_transit_to_center(List<Integer> args){
    machine.get_avance_transit_to_center().run_avance_transit_to_center(args.get(0), args.get(1), 0);
  }

  void button_center_to_transit_railway(){
    machine.get_center_to_transit_railway().run_center_to_transit_railway();
  }

  void button_avance_center_to_transit(List<Integer> args){
    machine.get_avance_center_to_transit().run_avance_center_to_transit(args.get(2), 0, args.get(1));
  }

  void button_transit_to_S_railway(){
    machine.get_transit_to_S_railway().run_transit_to_S_railway();
  }

  void button_avance_transit_to_S(List<Integer> args){
    machine.get_avance_transit_to_S().run_avance_transit_to_S(args.get(0), args.get(1), 0);
  }

  void button_S_to_transit_railway(){
    machine.get_S_to_transit_railway().run_S_to_transit_railway();
  }

  void button_avance_S_to_transit(List<Integer> args){
    machine.get_avance_S_to_transit().run_avance_S_to_transit(args.get(2), 0, args.get(1));
  }

}
