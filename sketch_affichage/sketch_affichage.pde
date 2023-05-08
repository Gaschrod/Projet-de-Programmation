// Entities
Entity[] entities;

public void setup() {
  size(1900, 1400);
  strokeWeight(2);
}

public void draw() {
  background(255); // Effacer l'écran
  
  noFill();
  stroke(0);
  rect(100, 150, 100, 60); // Dessiner un rectangle de 150x120 en position (900, 150) gare primaire 
  rect(1000, 150, 100, 60);
  rect(100, 750, 100,60);
  rect(1000, 750,100,60);
  rect(550,450,100,60);
  rect(1600, 750 , 100 ,60);

  stroke(0);
  rect(550,150,100,60);//gare secondaire
  rect(550,750,100,60);
  rect(100,450,100,60);
  rect(1000,450,100,60);
  rect(1300, 750 , 100 ,60);
  rect(300,600,100,60);
  rect(300,300,100,60);
  rect(800,300,100,60);
  rect(800,600,100,60);
  
  stroke(0);
  line(200, 180, 550, 180); //ligne haut et bas 
  line(650, 180, 1000, 180);
  line(200, 780, 550, 780); 
  line(650, 780, 1000, 780);
  line(1100,780,1300,780);
  line(1400,780,1600,780);
  stroke(0);
  
  line(150,210,150,450);//ligne gauche et droite 
  line(150,510,150,750);
  line(1050,210,1050,450);
  line(1050,510,1050,750);
  
  stroke(0);
  line(200,210,300,300);//ligne diag 
  line(400,360,550,450);
  line(650,510,800,600);
  line(900,660,1000,750);
  line(300,660,200,750);
  line(550,510,400,600);
  line(650,450,800,360);
  line(900,300,1000,210);
  line(400,660,1000,750);
  
  stroke(0);
  fill(0, 255, 0); // Définir la couleur de remplissage en vert
  ellipse(220, 160, 20, 20);//haut
  ellipse(530, 160, 20, 20);
  ellipse(670, 160, 20, 20);
  ellipse(980, 160, 20, 20);  
  
  stroke(0);
   ellipse(220, 800, 20, 20);//bas
   ellipse(530, 800, 20, 20);
   ellipse(670, 800, 20, 20);
   ellipse(980, 800, 20, 20); 
   ellipse(1120, 800, 20, 20); 
   ellipse(1280, 800, 20, 20); 
   ellipse(1420, 800, 20, 20); 
   ellipse(1580, 800, 20, 20); 
   
   stroke(0);
   ellipse(120, 230, 20, 20); //gauche
   ellipse(120, 430, 20, 20); 
   ellipse(120, 530, 20, 20); 
   ellipse(120, 730, 20, 20); 
   
   stroke(0);
   ellipse(1070, 230, 20, 20); //droite
   ellipse(1070, 430, 20, 20); 
   ellipse(1070, 530, 20, 20); 
   ellipse(1070, 730, 20, 20); 

   stroke(0);
   ellipse(220, 210, 20, 20);//diag haut gauche
   ellipse(300,280,20,20);
   ellipse(420,350,20,20);
   ellipse(530,420,20,20);
   
   stroke(0);
   ellipse(220, 750, 20, 20);//diag bas gauche 
   ellipse(300,680,20,20);
   ellipse(420,610,20,20);
   ellipse(530,545,20,20);
   
   stroke(0);
   ellipse(420,680,20,20); //transit to s 
   ellipse(980, 760, 20, 20); 
   
   stroke(0);
   ellipse(670, 420, 20, 20);//diag haut droite 
   ellipse(780, 350 , 20, 20); 
   ellipse(900,280,20,20);
   ellipse(1000,230,20,20);
   
   stroke(0); 
   ellipse(670, 545, 20, 20);//diag bas droite 
   ellipse(780, 610 , 20, 20);
   ellipse(900,680,20,20);
   ellipse(1000,730,20,20);
  
  stroke(255, 0, 200); // Définit la couleur orange
  line(150,210,150,240); // Dessine la ligne
  
  // Buttons
  Button myButton = new Button("Button test", 1300, 50, 100);
  myButton.update();
  myButton.draw();
}
