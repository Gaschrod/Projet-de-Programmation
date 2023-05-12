// Entities
Entity[] entities;
Raffinement2 machine = new Raffinement2();

public void setup() {
  size(1900, 1400);
  strokeWeight(2);
}

public void draw() {
  background(255); // Effacer l'écran
  
  noFill();
  strokeWeight(3);
  stroke(0);
  rect(100, 150, 100, 60); // Dessiner un rectangle de 150x120 en position (900, 150) gare primaire 
  rect(1000, 150, 100, 60);
  rect(100, 750, 100,60);
  rect(1000, 750,100,60);
  rect(550,450,100,60);
  rect(1600, 750 , 100 ,60);

  stroke(0);
  rect(550,120,100,60);//gare secondaire
  rect(550,780,100,60);
  rect(50,450,100,60);
  rect(1050,450,100,60);
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
  ellipse(530, 150, 20, 20);
  ellipse(670, 150, 20, 20);
  ellipse(980, 160, 20, 20);  
  
  stroke(0);
   ellipse(220, 800, 20, 20);//bas
   ellipse(530, 810, 20, 20);
   ellipse(670, 810, 20, 20);
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
   ellipse(1080, 230, 20, 20); //droite
   ellipse(1080, 430, 20, 20); 
   ellipse(1080, 530, 20, 20); 
   ellipse(1080, 730, 20, 20); 

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
  
  strokeWeight(5);
  stroke(255, 0, 200); // Définit la couleur rose
  line(150,210,150,240); // Dessine aiguillage 30px
  line(150,720,150,750); // si mettre normalement 150 
  line(150,420,140,450); //gauche
  line(140,510,150,540);
  
  line(1050,210,1050,240); // Dessine aiguillage 30px
  line(1050,720,1050,750); // si mettre normalement 150 
  line(1050,420,1060,450); // droite 
  line(1060,510,1050,540);
  
                         // Dessine aiguillage 30px
  line(650,170,680,180); // si mettre normalement 150 
  line(520,180,550,170); //haut


                          // Dessine aiguillage 30px
  line(650,790,680,780); // si mettre normalement 150 
  line(520,780,550,790); //bas
 
  
  line(1270,780,1300,770); //celle sud 
  line(1400,770,1430,780);
  line(1570,780,1600,780);
  
  line(520,432,550,450);//central
  
  line(350,360,430,378);//haut gauche 
  line(278,280,300,325);
  
  line(278,680,300,660);//transit
  
  line(770,378,850,360);//haut droit 
  line(900,325,930,274);
  
  line(770,580,850,600);//bas droite
  line(900,625,930,685);
  

  // Buttons
  Button spawnButton = new Button("Spawn train NW", 50, 845, 100, 20);
  spawnButton.update();
  spawnButton.draw();
  if (spawnButton.contains(mouseX, mouseY) && mousePressed && mouseButton == LEFT) {
    machine.get_spawn_train().run_spawn_train(1, 10);
  }

  /*Button button2 = new Button("2", 50, 880, 100, 20);
  button2.update();
  button2.draw();
  
  Button button3 = new Button("2", 160, 880, 100, 20);
  button3.update();
  button3.draw();
  
  Button button4 = new Button("2", 270, 880, 100, 20);
  button4.update();
  button4.draw();
  
  Button button5 = new Button("2", 380, 880, 100, 20);
  button5.update();
  button5.draw();
  
  Button button6 = new Button("2", 490, 880, 100, 20);
  button6.update();
  button6.draw();
  
  Button button7 = new Button("2", 600, 880, 100, 20);
  button7.update();
  button7.draw();
  
  Button button8 = new Button("2", 710, 880, 100, 20);
  button8.update();
  button8.draw();
  
  Button button9 = new Button("2", 820, 880, 100, 20);
  button9.update();
  button9.draw();
  
  Button button10 = new Button("2", 930, 880, 100, 20);
  button10.update();
  button10.draw();
  
  Button button11 = new Button("2", 1040, 880, 100, 20);
  button11.update();
  button11.draw();
  
  Button button12 = new Button("2", 1150, 880, 100, 20);
  button12.update();
  button12.draw();
  
  Button button13 = new Button("2", 50, 910, 100, 20);
  button13.update();
  button13.draw();
  
  Button button14 = new Button("2", 160, 910, 100, 20);
  button14.update();
  button14.draw();
  
  Button button15 = new Button("2", 270, 910, 100, 20);
  button15.update();
  button15.draw();
  
  Button button16 = new Button("2", 380, 910, 100, 20);
  button16.update();
  button16.draw();
  
  Button button17 = new Button("2", 490, 910, 100, 20);
  button17.update();
  button17.draw();
  
  Button button18 = new Button("2", 600, 910, 100, 20);
  button18.update();
  button18.draw();
  
  Button button19 = new Button("2", 710, 910, 100, 20);
  button19.update();
  button19.draw();
  
  Button button20 = new Button("2", 820, 910, 100, 20);
  button20.update();
  button20.draw();
  
    Button button21 = new Button("2", 930, 910, 100, 20);
  button21.update();
  button21.draw();
  
  Button button22 = new Button("2", 1040, 910, 100, 20);
  button22.update();
  button22.draw();
  
  Button button23 = new Button("2", 1150, 910, 100, 20);
  button23.update();
  button23.draw();  
  
  Button button24 = new Button("2", 50, 945, 100, 20);
  button24.update();
  button24.draw();
  
  Button button25 = new Button("2", 160, 945, 100, 20);
  button25.update();
  button25.draw();
  
  Button button26 = new Button("2", 270, 945, 100, 20);
  button26.update();
  button26.draw();
  
  Button button27 = new Button("2", 380, 945, 100, 20);
  button27.update();
  button27.draw();
  
  Button button28 = new Button("2", 490, 945, 100, 20);
  button28.update();
  button28.draw();
  
  Button button29 = new Button("2", 600, 945, 100, 20);
  button29.update();
  button29.draw();
  
  Button button30 = new Button("2", 710, 945, 100, 20);
  button30.update();
  button30.draw();
  
  Button button31 = new Button("2", 820, 945, 100, 20);
  button31.update();
  button31.draw();
  
  Button button32 = new Button("2", 930, 945, 100, 20);
  button32.update();
  button32.draw();
  
  Button button33 = new Button("2", 1040, 945, 100, 20);
  button33.update();
  button33.draw();
  
  Button button34 = new Button("2", 1150, 945, 100, 20);
  button34.update();
  button34.draw();
  
  Button button35 = new Button("2", 50, 975, 100, 20);
  button35.update();
  button35.draw();
  
  Button button36 = new Button("2", 160, 975, 100, 20);
  button36.update();
  button36.draw();
  
  Button button37 = new Button("2", 270, 975, 100, 20);
  button37.update();
  button37.draw();
  
  Button button38 = new Button("2", 380, 975, 100, 20);
  button38.update();
  button38.draw();
  
  Button button39 = new Button("2", 490, 975, 100, 20);
  button39.update();
  button39.draw();
  
  Button button40 = new Button("2", 600, 975, 100, 20);
  button40.update();
  button40.draw();
  
  Button button41 = new Button("2", 710, 975, 100, 20);
  button41.update();
  button41.draw();
  
  Button button42 = new Button("2", 820, 975, 100, 20);
  button42.update();
  button42.draw();
  
  Button button43 = new Button("2", 930, 975, 100, 20);
  button43.update();
  button43.draw();
  
  Button button44 = new Button("2", 1040, 975, 100, 20);
  button44.update();
  button44.draw();
  
  Button button45 = new Button("2", 1150, 975, 100, 20);
  button45.update();
  button45.draw();
  
  Button button46 = new Button("1", 1300, 880, 100, 20);
  button46.update();
  button46.draw();
  
  Button button47 = new Button("2", 1300, 910, 100, 20);
  button47.update();
  button47.draw();
  
  Button button48 = new Button("3", 1300, 945, 100, 20);
  button48.update();
  button48.draw();
  
  Button button49 = new Button("4", 1300, 975, 100, 20);
  button49.update();
  button49.draw();
  
  Button button50 = new Button("1", 1410, 880, 100, 20);
  button50.update();
  button50.draw();
  
  Button button51 = new Button("2", 1410, 910, 100, 20);
  button51.update();
  button51.draw();
  
  Button button52 = new Button("3", 1410, 945, 100, 20);
  button52.update();
  button52.draw();
  
  Button button53 = new Button("4", 1410, 975, 100, 20);
  button53.update();
  button53.draw();*/
}
