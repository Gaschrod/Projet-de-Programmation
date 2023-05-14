class LightButton {
  float x, y, r;
  boolean isOn;

  LightButton(float x, float y, float r) {
    this.x = x;
    this.y = y;
    this.r = r;
    this.isOn = false;
  }

  void handleClick() {
    isOn = !isOn; // toggle isOn between true and false
  }

  void draw() {
    if (isOn) {
      fill(255, 0, 0); // red if on
    } else {
      fill(0, 255, 0); // green if off
    }
    ellipse(x, y, r, r);
  }

  boolean contains(float x, float y) {
    float d = dist(x, y, this.x, this.y);
    return d <= r / 2;
  }
}