import java.util.Iterator;
import java.util.List;

public void setup() {
  size(1900, 1400);
  strokeWeight(2);
}

public void draw() {
  background(255); // Effacer l'écran
  
  noFill();
  strokeWeight(3);
  stroke(0);
  // Dessiner un rectangle de 150x120 en position (900, 150) : gares primaires 
  rect(100, 150, 100, 60); // NW
  rect(1000, 150, 100, 60); // NE
  rect(100, 750, 100,60); // SW
  rect(1000, 750,100,60); // S
  rect(550,450,100,60); // center
  rect(1600, 750 , 100 ,60); // SE
  rect(300,600,100,60); // Transit

  stroke(0);
  //gares secondaires
  rect(550,120,100,60); // Secondary 1
  rect(550,780,100,60); // Secondary 6
  rect(50,450,100,60); // Secondary 7
  rect(1050,450,100,60); // Secondary 4
  rect(1300, 750 , 100 ,60); // Secondary 5
  rect(300,300,100,60); // Secondary 2
  rect(800,300,100,60); // Secondary 3
  rect(800,600,100,60); // Secondary 8
  
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
  spawn_S.update();
  spawn_S.draw();

  spawn_NE.update();
  spawn_NE.draw();

  spawn_NW.update();
  spawn_NW.draw();

  spawn_SE.update();
  spawn_SE.draw();

  spawn_SW.update();
  spawn_SW.draw();

  spawn_center.update();
  spawn_center.draw();

  spawn_transit.update();
  spawn_transit.draw();

  //NW_to_SW_enable.update();
  //NW_to_SW_enable.draw();

  button9.update();
  button9.draw();

  button10.update();
  button10.draw();

  button11.update();
  button11.draw();

  button12.update();
  button12.draw();

  button13.update();
  button13.draw();

  button14.update();
  button14.draw();

  button15.update();
  button15.draw();

  button16.update();
  button16.draw();

  button17.update();
  button17.draw();

  button18.update();
  button18.draw();

  button19.update();
  button19.draw();

  button20.update();
  button20.draw();

  button21.update();
  button21.draw();

  button22.update();
  button22.draw();

  button23.update();
  button23.draw();  

  button24.update();
  button24.draw();

  button25.update();
  button25.draw();

  avance_NW_to_NE.update();
  avance_NW_to_NE.draw();

  avance_NE_to_NW.update();
  avance_NE_to_NW.draw();

  button28.update();
  button28.draw();

  button29.update();
  button29.draw();

  button30.update();
  button30.draw();

  button31.update();
  button31.draw();

  NW_to_NE_railway.update();
  NW_to_NE_railway.draw();

  NE_to_NW_railway.update();
  NE_to_NW_railway.draw();

  button34.update();
  button34.draw();

  button35.update();
  button35.draw();

  button36.update();
  button36.draw();

  button37.update();
  button37.draw();

  button38.update();
  button38.draw();

  button39.update();
  button39.draw();

  button40.update();
  button40.draw();

  button41.update();
  button41.draw();

  button42.update();
  button42.draw();

  button43.update();
  button43.draw();

  button44.update();
  button44.draw();

  button45.update();
  button45.draw();

  button46.update();
  button46.draw();

  button47.update();
  button47.draw();

  button48.update();
  button48.draw();

  button49.update();
  button49.draw();

  button50.update();
  button50.draw();

  button51.update();
  button51.draw();

  button52.update();
  button52.draw();

  button53.update();
  button53.draw();


  //pushMatrix();
  //translate(0, 0);
  //fill(255);
  //angle(0);
  //rect(0, 0, 150, 100);
  //popMatrix();
  drawGare();
 
}

void drawGare() {

  station_occupancy = machine.get_station_occupancy();
  int i;
  for (i = 10; i <= 70; i=i+10) {
    int station = station_occupancy.apply(i);
    
    if (i == 10 && station > 0) { // S
      rect(1030,770,50,20);
    } else if (i == 20 && station > 0) { // NE
      rect(1030,170,50, 20);
    } else if (i == 30 && station > 0) { // NW
      rect(130,170,50,20);
    } else if (i == 40 && station > 0) { // SE
      rect(1630,770,50,20);
    } else if (i == 50 && station > 0) { // SW
      rect(130,770,50,20);
    } else if (i == 60 && station > 0) { // center
      rect(580,470,50,20);
    } else if (i == 70 && station > 0) { // transit
      rect(330,620,50,20);
    }

    secondary_occupancy = machine.get_secondary_occupancy();
    int y;
    for (y = 111; y <= 888; y=y+111) {
      int secondary_station = secondary_occupancy.apply(y);
      if (y == 111 && secondary_station > 0) { // 1
        rect(580,140,50,20);
      } else if (y == 222 && secondary_station > 0) { // 2
        rect(330,320,50,20);
      } else if (y == 333 && secondary_station > 0) { // 3
        rect(830,320,50,20);
      } else if (y == 444 && secondary_station > 0) { // 4
        rect(1080,470,50,20);
      } else if (y == 555 && secondary_station > 0) { // 5
        rect(1330,770,50,20);
      } else if (y == 666 && secondary_station > 0) { // 6
        rect(580,800,50,20);
      } else if (y == 777 && secondary_station > 0) { // 7
        rect(80,470,50,20);
      } else if (y == 888 && secondary_station > 0) { // 8
        rect(830,620,50,20);
      }
    }
  }
}

void mouseClicked() {
    if (spawn_S.clic(mouseX, mouseY)) {
      spawn_S.button_spawn_train(10);
    } else if (spawn_NE.clic(mouseX, mouseY)) {
      spawn_NE.button_spawn_train(20);
      }
    else if (spawn_NW.clic(mouseX, mouseY)){
      spawn_NW.button_spawn_train(30);
      }
    else if (spawn_SE.clic(mouseX, mouseY)) {
    spawn_SE.button_spawn_train(40);
    } 
    else if (spawn_SW.clic(mouseX, mouseY)) {
    spawn_SW.button_spawn_train(50);
    } 
    else if (spawn_center.clic(mouseX, mouseY)) {
    spawn_center.button_spawn_train(60);
    }   
    else if (spawn_transit.clic(mouseX, mouseY)) {
    spawn_transit.button_spawn_train(70);
    }
    else if(NW_to_NE_railway.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_NW_NE = machine.get_NW_to_NE();
      Iterator<Pair<Integer, Integer>> it = rail_NW_NE.iterator();
      List<Integer> elements_NW_NE = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_NW_NE.add(snd);
      }

      if (elements_NW_NE.get(0) != 0){
        return; //There is already a train
      }
      NW_to_NE_railway.button_NW_to_NE_railway();
    }
    else if (avance_NW_to_NE.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_NW_NE = machine.get_NW_to_NE();
      Iterator<Pair<Integer, Integer>> it = rail_NW_NE.iterator();
      List<Integer> elements_NW_NE = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_NW_NE.add(snd);}

      BRelation <Integer, Integer> stationOccupancy = machine.get_station_occupancy();
      Iterator<Pair<Integer, Integer>> at = stationOccupancy.iterator();
      List<Integer> occupancyList = new ArrayList<>();

      while (at.hasNext()) {
        Pair<Integer, Integer> pair = at.next();
        Integer snd = pair.snd();
        occupancyList.add(snd);}

      Integer station_NE = occupancyList.get(1);

      if(station_NE == 0 && elements_NW_NE.get(2) != 0){
        Integer neStationOccupancy = elements_NW_NE.get(2);
        BRelation<Integer,Integer> updatedStationOccupancy = stationOccupancy.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.NE, neStationOccupancy)));
        machine.set_station_occupancy(updatedStationOccupancy);
      }
      else if (station_NE != 0 && elements_NW_NE.get(2) != 0){
        return;
      }
      avance_NW_to_NE.button_avance_NW_to_NE(elements_NW_NE);
  }

    else if(NE_to_NW_railway.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_NW_NE = machine.get_NW_to_NE(); //Watch out, here it must be inverted
      Iterator<Pair<Integer, Integer>> it = rail_NW_NE.iterator();
      List<Integer> elements_NW_NE = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_NW_NE.add(snd);
      }

      if (elements_NW_NE.get(2) != 0){ //We check the last element, has NE is 'at the end' of the railway
        return; //There is already a train
      }
      NE_to_NW_railway.button_NE_to_NW_railway();
    }

    else if (avance_NE_to_NW.clic(mouseX,mouseY)){
      BRelation<Integer, Integer> rail_NE_NW = machine.get_NW_to_NE();
      Iterator<Pair<Integer, Integer>> it = rail_NE_NW.iterator();
      List<Integer> elements_NE_NW = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_NE_NW.add(snd);}

      BRelation <Integer, Integer> stationOccupancy = machine.get_station_occupancy();
      Iterator<Pair<Integer, Integer>> at = stationOccupancy.iterator();
      List<Integer> occupancyList = new ArrayList<>();

      while (at.hasNext()) {
        Pair<Integer, Integer> pair = at.next();
        Integer snd = pair.snd();
        occupancyList.add(snd);}

      Integer station_NW = occupancyList.get(2);

      if(station_NW == 0 && elements_NE_NW.get(0) != 0){
        Integer neStationOccupancy = elements_NE_NW.get(0);
        BRelation<Integer,Integer> updatedStationOccupancy = stationOccupancy.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.NW, neStationOccupancy)));
        machine.set_station_occupancy(updatedStationOccupancy);
      }
      else if (station_NW != 0 && elements_NE_NW.get(0) != 0){
        return;
      }
      avance_NE_to_NW.button_avance_NE_to_NW(elements_NE_NW);

    }

  println("Stations occupancy = " + machine.get_station_occupancy());
  println("NW_to_NE" + machine.get_NW_to_NE());
}