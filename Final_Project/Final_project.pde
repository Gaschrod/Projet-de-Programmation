import java.util.Iterator;
import java.util.List;

public void setup() {
  size(1920, 1080);
  strokeWeight(2);
}

public void draw() {
  background(255); // Effacer l'écran
  
  noFill();
  strokeWeight(3);
  stroke(0);
  // Dessiner un rectangle de 150x120 en position (900, 150) : gares primaires 
  rect(100, 150, 100, 60); // NW

  textSize(32); // set the text size to 32
  fill(0); // set the text color to black
  text("NW", 125, 135); // draw the text "NW" at position (100, 50)
  fill(255); // set the fill color back to white

  rect(1000, 150, 100, 60); // NE
  fill(0);
  text("NE", 1025, 135);
  fill(255);

  rect(100, 750, 100,60); // SW
  fill(0);
  text("SW", 125, 735);
  fill(255);

  rect(1000, 750,100,60); // S
  fill(0);
  text("S", 1025, 735);
  fill(255);

  rect(550,450,100,60); // center
  fill(0);
  text("center", 575, 435);
  fill(255);

  rect(1600, 750 , 100 ,60); // SE
  fill(0);
  text("SE", 1625, 735);
  fill(255);

  rect(300,600,100,60); // Transit
  fill(0);
  text("Transit", 325, 585);
  fill(255);

  stroke(0);
  //gares secondaires
  rect(550,120,100,60); // Secondary 1
  fill(0);
  text("Secondary 1", 575, 105);
  fill(255);

  rect(550,780,100,60); // Secondary 6
  fill(0);
  text("Secondary 6", 575, 765);
  fill(255);

  rect(50,450,100,60); // Secondary 7
  fill(0);
  text("Secondary 7", 75, 435);
  fill(255);

  rect(1050,450,100,60); // Secondary 4
  fill(0);
  text("Secondary 4", 1075, 435);
  fill(255);

  rect(1300, 750 , 100 ,60); // Secondary 5
  fill(0);
  text("Secondary 5", 1325, 735);
  fill(255);

  rect(300,300,100,60); // Secondary 2
  fill(0);
  text("Secondary 2", 325, 285);
  fill(255);

  rect(800,300,100,60); // Secondary 3
  fill(0);
  text("Secondary 3", 825, 285);
  fill(255);

  rect(800,600,100,60); // Secondary 8
  fill(0);
  text("Secondary 8", 825, 585);
  fill(255);
  
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

  avance_transit_to_center.update();
  avance_transit_to_center.draw();

  avance_center_to_transit.update();
  avance_center_to_transit.draw();

  avance_SW_to_transit.update();
  avance_SW_to_transit.draw();

  avance_transit_to_SW.update();
  avance_transit_to_SW.draw();

  avance_S_to_transit.update();
  avance_S_to_transit.draw();

  avance_transit_to_S.update();
  avance_transit_to_S.draw();

  avance_S_to_SW.update();
  avance_S_to_SW.draw();

  avance_SW_to_S.update();
  avance_SW_to_S.draw();

  avance_S_to_SE.update();
  avance_S_to_SE.draw();

  avance_SE_to_S.update();
  avance_SE_to_S.draw();

  avance_NE_to_S.update();
  avance_NE_to_S.draw();

  avance_S_to_NE.update();
  avance_S_to_NE.draw();

  avance_center_to_NE.update();
  avance_center_to_NE.draw();

  avance_NE_to_center.update();
  avance_NE_to_center.draw();

  avance_center_to_S.update();
  avance_center_to_S.draw();

  avance_S_to_center.update();
  avance_S_to_center.draw();  

  avance_NW_to_center.update();
  avance_NW_to_center.draw();

  avance_center_to_NW.update();
  avance_center_to_NW.draw();

  avance_NW_to_NE.update();
  avance_NW_to_NE.draw();

  avance_NE_to_NW.update();
  avance_NE_to_NW.draw();

  avance_NW_to_SW.update();
  avance_NW_to_SW.draw();

  avance_SW_to_NW.update();
  avance_SW_to_NW.draw();

  SW_to_transit_railway.update();
  SW_to_transit_railway.draw();

  transit_to_SW_railway.update();
  transit_to_SW_railway.draw();

  NW_to_NE_railway.update();
  NW_to_NE_railway.draw();

  NE_to_NW_railway.update();
  NE_to_NW_railway.draw();

  NW_to_SW_railway.update();
  NW_to_SW_railway.draw();

  SW_to_NW_railway.update();
  SW_to_NW_railway.draw();

  NW_to_center_railway.update();
  NW_to_center_railway.draw();

  center_to_NW_railway.update();
  center_to_NW_railway.draw();

  center_to_NE_railway.update();
  center_to_NE_railway.draw();

  NE_to_center_railway.update();
  NE_to_center_railway.draw();

  NE_to_S_railway.update();
  NE_to_S_railway.draw();

  S_to_NE_railway.update();
  S_to_NE_railway.draw();

  S_to_SE_railway.update();
  S_to_SE_railway.draw();

  SE_to_S_railway.update();
  SE_to_S_railway.draw();

  SW_to_S_railway.update();
  SW_to_S_railway.draw();

  S_to_SW_railway.update();
  S_to_SW_railway.draw();

  center_to_S_railway.update();
  center_to_S_railway.draw();

  S_to_center_railway.update();
  S_to_center_railway.draw();

  transit_to_center_railway.update();
  transit_to_center_railway.draw();

  center_to_transit_railway.update();
  center_to_transit_railway.draw();

  transit_to_S_railway.update();
  transit_to_S_railway.draw();

  S_to_transit_railway.update();
  S_to_transit_railway.draw();

  /*button52.update();
  button52.draw();

  button53.update();
  button53.draw();*/


  //pushMatrix();
  //translate(0, 0);
  //fill(255);
  //angle(0);
  //rect(0, 0, 150, 100);
  //popMatrix();
  drawGare();
 
}

void drawGare() {

  // Draw the station occupancy
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

    // Draw the secondary station occupancy
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

    // Draw the rails occupancy
    NE_to_S_occupancy = machine.get_NE_to_S();
    print_train_on_rails(NE_to_S_occupancy, 1030, 270, 1030, 370, 1030, 620);
    transit_to_center_occupancy = machine.get_transit_to_center();
    print_train_on_rails(transit_to_center_occupancy, 390, 570, 430, 550, 470, 530);
    transit_to_S_occupancy = machine.get_transit_to_S();
    print_train_on_rails(transit_to_S_occupancy, 480, 670, 670, 700, 770, 710);
    center_to_S_occupancy = machine.get_center_to_S();
    print_train_on_rails(center_to_S_occupancy, 680, 520, 730, 570, 930, 700);
    SW_to_S_occupancy = machine.get_SW_to_S();
    print_train_on_rails(SW_to_S_occupancy, 280, 770, 380, 770, 780, 770);
    center_to_NE_occupancy = machine.get_center_to_NE();
    print_train_on_rails(center_to_NE_occupancy, 680, 420, 720, 380, 920, 230);
    S_to_SE_occupancy = machine.get_S_to_SE();
    print_train_on_rails(S_to_SE_occupancy, 1150, 770, 1220, 770, 1470, 770);
    NW_to_SW_occupancy = machine.get_NW_to_SW();
    print_train_on_rails(NW_to_SW_occupancy, 130, 270, 130, 370, 130, 640);
    NW_to_center_occupancy = machine.get_NW_to_center();
    print_train_on_rails(NW_to_center_occupancy, 230, 220, 230, 270, 440, 390);
    NW_to_NE_occupancy = machine.get_NW_to_NE();
    print_train_on_rails(NW_to_NE_occupancy, 330, 170, 430, 170, 830, 170);
    SW_to_transit_occupancy = machine.get_SW_to_transit();
    print_train_on_rails(SW_to_transit_occupancy, 200, 700, 230, 670, 430, 540);
  }
}

void print_train_on_rails(BRelation<Integer, Integer> occupancy, int x1, int y1, int x2, int y2, int x3, int y3) {
  if (occupancy.apply(1) > 0) {
    rect(x1, y1, 50, 20);
  }
  if (occupancy.apply(2) > 0) {
    rect(x2, y2, 50, 20);
  }
  if (occupancy.apply(3) > 0) {
    rect(x3, y3, 50, 20);
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
    else if(NW_to_SW_railway.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_NW_SW = machine.get_NW_to_SW();
      Iterator<Pair<Integer, Integer>> it = rail_NW_SW.iterator();
      List<Integer> elements_NW_SW = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_NW_SW.add(snd);
      }
      if (elements_NW_SW.get(2) != 0){ //We check the last element, has NE is 'at the end' of the railway
        return; //There is already a train
      }
      NW_to_SW_railway.button_NW_to_SW_railway();}

    else if (avance_NW_to_SW.clic(mouseX,mouseY)){
      BRelation<Integer, Integer> rail_NW_SW = machine.get_NW_to_SW();
      Iterator<Pair<Integer, Integer>> it = rail_NW_SW.iterator();
      List<Integer> elements_NW_SW = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_NW_SW.add(snd);}

      BRelation <Integer, Integer> stationOccupancy = machine.get_station_occupancy();
      Iterator<Pair<Integer, Integer>> at = stationOccupancy.iterator();
      List<Integer> occupancyList = new ArrayList<>();

      while (at.hasNext()) {
        Pair<Integer, Integer> pair = at.next();
        Integer snd = pair.snd();
        occupancyList.add(snd);}

      Integer station_SW = occupancyList.get(4);

      if(station_SW == 0 && elements_NW_SW.get(2) != 0){
        Integer neStationOccupancy = elements_NW_SW.get(2);
        BRelation<Integer,Integer> updatedStationOccupancy = stationOccupancy.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.SW, neStationOccupancy)));
        machine.set_station_occupancy(updatedStationOccupancy);
      }
      else if (station_SW != 0 && elements_NW_SW.get(2) != 0){
        return;
      }
      avance_NW_to_SW.button_avance_NW_to_SW(elements_NW_SW);
    }
    
    else if(SW_to_NW_railway.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_SW_NW = machine.get_NW_to_SW();
      Iterator<Pair<Integer, Integer>> it = rail_SW_NW.iterator();
      List<Integer> elements_SW_NW = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_SW_NW.add(snd);
      }
      if (elements_SW_NW.get(0) != 0){ //We check the last element, has NE is 'at the end' of the railway
        return; //There is already a train
      }
      SW_to_NW_railway.button_SW_to_NW_railway();}
    
    else if (avance_SW_to_NW.clic(mouseX,mouseY)){
      BRelation<Integer, Integer> rail_SW_NW = machine.get_NW_to_SW();
      Iterator<Pair<Integer, Integer>> it = rail_SW_NW.iterator();
      List<Integer> elements_SW_NW = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_SW_NW.add(snd);}

      BRelation <Integer, Integer> stationOccupancy = machine.get_station_occupancy();
      Iterator<Pair<Integer, Integer>> at = stationOccupancy.iterator();
      List<Integer> occupancyList = new ArrayList<>();

      while (at.hasNext()) {
        Pair<Integer, Integer> pair = at.next();
        Integer snd = pair.snd();
        occupancyList.add(snd);}

      Integer station_NW = occupancyList.get(2);

      if(station_NW == 0 && elements_SW_NW.get(0) != 0){
        Integer neStationOccupancy = elements_SW_NW.get(0);
        BRelation<Integer,Integer> updatedStationOccupancy = stationOccupancy.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.NW, neStationOccupancy)));
        machine.set_station_occupancy(updatedStationOccupancy);
      }
      else if (station_NW != 0 && elements_SW_NW.get(0) != 0){
        return;
      }
      avance_SW_to_NW.button_avance_SW_to_NW(elements_SW_NW);
    }

    else if (NW_to_center_railway.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_NW_center = machine.get_NW_to_center();
      Iterator<Pair<Integer, Integer>> it = rail_NW_center.iterator();
      List<Integer> elements_NW_center = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_NW_center.add(snd);
      }
      if (elements_NW_center.get(2) != 0){ //We check the last element, has NE is 'at the end' of the railway
        return; //There is already a train
      }
      NW_to_center_railway.button_NW_to_center_railway();
    }

    else if (avance_NW_to_center.clic(mouseX,mouseY)){
      BRelation<Integer, Integer> rail_NW_center = machine.get_NW_to_center();
      Iterator<Pair<Integer, Integer>> it = rail_NW_center.iterator();
      List<Integer> elements_NW_center = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_NW_center.add(snd);}

      BRelation <Integer, Integer> stationOccupancy = machine.get_station_occupancy();
      Iterator<Pair<Integer, Integer>> at = stationOccupancy.iterator();
      List<Integer> occupancyList = new ArrayList<>();

      while (at.hasNext()) {
        Pair<Integer, Integer> pair = at.next();
        Integer snd = pair.snd();
        occupancyList.add(snd);}

      Integer station_center = occupancyList.get(5);

      if(station_center == 0 && elements_NW_center.get(2) != 0){
        Integer neStationOccupancy = elements_NW_center.get(2);
        BRelation<Integer,Integer> updatedStationOccupancy = stationOccupancy.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.center, neStationOccupancy)));
        machine.set_station_occupancy(updatedStationOccupancy);
      }
      else if (station_center != 0 && elements_NW_center.get(2) != 0){
        return;
      }
      avance_NW_to_center.button_avance_NW_to_center(elements_NW_center);
    }

    else if (center_to_NW_railway.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_center_NW = machine.get_NW_to_center();
      Iterator<Pair<Integer, Integer>> it = rail_center_NW.iterator();
      List<Integer> elements_center_NW = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_center_NW.add(snd);
      }
      if (elements_center_NW.get(0) != 0){ //We check the last element, has NE is 'at the end' of the railway
        return; //There is already a train
      }
      center_to_NW_railway.button_center_to_NW_railway();
    }

    else if (avance_center_to_NW.clic(mouseX,mouseY)){
      BRelation<Integer, Integer> rail_center_NW = machine.get_NW_to_center();
      Iterator<Pair<Integer, Integer>> it = rail_center_NW.iterator();
      List<Integer> elements_center_NW = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_center_NW.add(snd);}

      BRelation <Integer, Integer> stationOccupancy = machine.get_station_occupancy();
      Iterator<Pair<Integer, Integer>> at = stationOccupancy.iterator();
      List<Integer> occupancyList = new ArrayList<>();

      while (at.hasNext()) {
        Pair<Integer, Integer> pair = at.next();
        Integer snd = pair.snd();
        occupancyList.add(snd);}

      Integer station_NW = occupancyList.get(2);

      if(station_NW == 0 && elements_center_NW.get(0) != 0){
        Integer neStationOccupancy = elements_center_NW.get(0);
        BRelation<Integer,Integer> updatedStationOccupancy = stationOccupancy.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.NW, neStationOccupancy)));
        machine.set_station_occupancy(updatedStationOccupancy);
      }
      else if (station_NW != 0 && elements_center_NW.get(0) != 0){
        return;
      }
      avance_center_to_NW.button_avance_center_to_NW(elements_center_NW);
    }

    else if (center_to_NE_railway.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_center_NE = machine.get_center_to_NE();
      Iterator<Pair<Integer, Integer>> it = rail_center_NE.iterator();
      List<Integer> elements_center_NE = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_center_NE.add(snd);
      }
      if (elements_center_NE.get(2) != 0){ //We check the last element, has NE is 'at the end' of the railway
        return; //There is already a train
      }
      center_to_NE_railway.button_center_to_NE_railway();
    }

    else if (avance_center_to_NE.clic(mouseX,mouseY)){
      BRelation<Integer, Integer> rail_center_NE = machine.get_center_to_NE();
      Iterator<Pair<Integer, Integer>> it = rail_center_NE.iterator();
      List<Integer> elements_center_NE = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_center_NE.add(snd);}

      BRelation <Integer, Integer> stationOccupancy = machine.get_station_occupancy();
      Iterator<Pair<Integer, Integer>> at = stationOccupancy.iterator();
      List<Integer> occupancyList = new ArrayList<>();

      while (at.hasNext()) {
        Pair<Integer, Integer> pair = at.next();
        Integer snd = pair.snd();
        occupancyList.add(snd);}

      Integer station_NE = occupancyList.get(1);

      if(station_NE == 0 && elements_center_NE.get(2) != 0){
        Integer neStationOccupancy = elements_center_NE.get(2);
        BRelation<Integer,Integer> updatedStationOccupancy = stationOccupancy.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.NE, neStationOccupancy)));
        machine.set_station_occupancy(updatedStationOccupancy);
      }
      else if (station_NE != 0 && elements_center_NE.get(2) != 0){
        return;
      }
      avance_center_to_NE.button_avance_center_to_NE(elements_center_NE);
    }

    else if (NE_to_center_railway.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_NE_center = machine.get_center_to_NE();
      Iterator<Pair<Integer, Integer>> it = rail_NE_center.iterator();
      List<Integer> elements_NE_center = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_NE_center.add(snd);
      }
      if (elements_NE_center.get(0) != 0){ //We check the last element, has NE is 'at the end' of the railway
        return; //There is already a train
      }
      NE_to_center_railway.button_NE_to_center_railway();
    }

    else if (avance_NE_to_center.clic(mouseX,mouseY)){
      BRelation<Integer, Integer> rail_NE_center = machine.get_center_to_NE();
      Iterator<Pair<Integer, Integer>> it = rail_NE_center.iterator();
      List<Integer> elements_NE_center = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_NE_center.add(snd);}

      BRelation <Integer, Integer> stationOccupancy = machine.get_station_occupancy();
      Iterator<Pair<Integer, Integer>> at = stationOccupancy.iterator();
      List<Integer> occupancyList = new ArrayList<>();

      while (at.hasNext()) {
        Pair<Integer, Integer> pair = at.next();
        Integer snd = pair.snd();
        occupancyList.add(snd);}

      Integer station_center = occupancyList.get(5);

      if(station_center == 0 && elements_NE_center.get(0) != 0){
        Integer neStationOccupancy = elements_NE_center.get(0);
        BRelation<Integer,Integer> updatedStationOccupancy = stationOccupancy.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.center, neStationOccupancy)));
        machine.set_station_occupancy(updatedStationOccupancy);
      }
      else if (station_center != 0 && elements_NE_center.get(0) != 0){
        return;
      }
      avance_NE_to_center.button_avance_NE_to_center(elements_NE_center);
    }

    else if (NE_to_S_railway.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_NE_S = machine.get_NE_to_S();
      Iterator<Pair<Integer, Integer>> it = rail_NE_S.iterator();
      List<Integer> elements_NE_S = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_NE_S.add(snd);
      }
      if (elements_NE_S.get(2) != 0){ //We check the last element, has NE is 'at the end' of the railway
        return; //There is already a train
      }
      NE_to_S_railway.button_NE_to_S_railway();
    }

    else if (avance_NE_to_S.clic(mouseX,mouseY)){
      BRelation<Integer, Integer> rail_NE_S = machine.get_NE_to_S();
      Iterator<Pair<Integer, Integer>> it = rail_NE_S.iterator();
      List<Integer> elements_NE_S = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_NE_S.add(snd);}

      BRelation <Integer, Integer> stationOccupancy = machine.get_station_occupancy();
      Iterator<Pair<Integer, Integer>> at = stationOccupancy.iterator();
      List<Integer> occupancyList = new ArrayList<>();

      while (at.hasNext()) {
        Pair<Integer, Integer> pair = at.next();
        Integer snd = pair.snd();
        occupancyList.add(snd);}

      Integer station_S = occupancyList.get(0);

      if(station_S == 0 && elements_NE_S.get(2) != 0){
        Integer neStationOccupancy = elements_NE_S.get(2);
        BRelation<Integer,Integer> updatedStationOccupancy = stationOccupancy.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.S, neStationOccupancy)));
        machine.set_station_occupancy(updatedStationOccupancy);
      }
      else if (station_S != 0 && elements_NE_S.get(2) != 0){
        return;
      }
      avance_NE_to_S.button_avance_NE_to_S(elements_NE_S);
    }

    else if (S_to_NE_railway.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_S_NE = machine.get_NE_to_S();
      Iterator<Pair<Integer, Integer>> it = rail_S_NE.iterator();
      List<Integer> elements_S_NE = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_S_NE.add(snd);
      }
      if (elements_S_NE.get(0) != 0){ //We check the last element, has NE is 'at the end' of the railway
        return; //There is already a train
      }
      S_to_NE_railway.button_S_to_NE_railway();
    }

    else if (avance_S_to_NE.clic(mouseX,mouseY)){
      BRelation<Integer, Integer> rail_S_NE = machine.get_NE_to_S();
      Iterator<Pair<Integer, Integer>> it = rail_S_NE.iterator();
      List<Integer> elements_S_NE = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_S_NE.add(snd);}

      BRelation <Integer, Integer> stationOccupancy = machine.get_station_occupancy();
      Iterator<Pair<Integer, Integer>> at = stationOccupancy.iterator();
      List<Integer> occupancyList = new ArrayList<>();

      while (at.hasNext()) {
        Pair<Integer, Integer> pair = at.next();
        Integer snd = pair.snd();
        occupancyList.add(snd);}

      Integer station_NE = occupancyList.get(1);

      if(station_NE == 0 && elements_S_NE.get(0) != 0){
        Integer neStationOccupancy = elements_S_NE.get(0);
        BRelation<Integer,Integer> updatedStationOccupancy = stationOccupancy.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.NE, neStationOccupancy)));
        machine.set_station_occupancy(updatedStationOccupancy);
      }
      else if (station_NE != 0 && elements_S_NE.get(0) != 0){
        return;
      }
      avance_S_to_NE.button_avance_S_to_NE(elements_S_NE);
    }

    else if (S_to_SE_railway.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_S_SE = machine.get_S_to_SE();
      Iterator<Pair<Integer, Integer>> it = rail_S_SE.iterator();
      List<Integer> elements_S_SE = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_S_SE.add(snd);
      }
      if (elements_S_SE.get(2) != 0){ //We check the last element, has NE is 'at the end' of the railway
        return; //There is already a train
      }
      S_to_SE_railway.button_S_to_SE_railway();
    }

    else if (avance_S_to_SE.clic(mouseX,mouseY)){
      BRelation<Integer, Integer> rail_S_SE = machine.get_S_to_SE();
      Iterator<Pair<Integer, Integer>> it = rail_S_SE.iterator();
      List<Integer> elements_S_SE = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_S_SE.add(snd);}

      BRelation <Integer, Integer> stationOccupancy = machine.get_station_occupancy();
      Iterator<Pair<Integer, Integer>> at = stationOccupancy.iterator();
      List<Integer> occupancyList = new ArrayList<>();
      
      while (at.hasNext()) {
        Pair<Integer, Integer> pair = at.next();
        Integer snd = pair.snd();
        occupancyList.add(snd);}
      
      Integer station_SE = occupancyList.get(3);
      
      if(station_SE == 0 && elements_S_SE.get(2) != 0){
        Integer neStationOccupancy = elements_S_SE.get(2);
        BRelation<Integer,Integer> updatedStationOccupancy = stationOccupancy.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.SE, neStationOccupancy)));
        machine.set_station_occupancy(updatedStationOccupancy);
      }
      else if (station_SE != 0 && elements_S_SE.get(2) != 0){
        return;
      }
      avance_S_to_SE.button_avance_S_to_SE(elements_S_SE);
    }

    else if (SE_to_S_railway.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_SE_S = machine.get_S_to_SE();
      Iterator<Pair<Integer, Integer>> it = rail_SE_S.iterator();
      List<Integer> elements_SE_S = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_SE_S.add(snd);
      }
      if (elements_SE_S.get(0) != 0){ //We check the last element, has NE is 'at the end' of the railway
        return; //There is already a train
      }
      SE_to_S_railway.button_SE_to_S_railway();
    }

    else if (avance_SE_to_S.clic(mouseX,mouseY)){
      BRelation<Integer, Integer> rail_SE_S = machine.get_S_to_SE();
      Iterator<Pair<Integer, Integer>> it = rail_SE_S.iterator();
      List<Integer> elements_SE_S = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_SE_S.add(snd);}

      BRelation <Integer, Integer> stationOccupancy = machine.get_station_occupancy();
      Iterator<Pair<Integer, Integer>> at = stationOccupancy.iterator();
      List<Integer> occupancyList = new ArrayList<>();
      
      while (at.hasNext()) {
        Pair<Integer, Integer> pair = at.next();
        Integer snd = pair.snd();
        occupancyList.add(snd);}
      
      Integer station_S = occupancyList.get(0);
      
      if(station_S == 0 && elements_SE_S.get(0) != 0){
        Integer neStationOccupancy = elements_SE_S.get(0);
        BRelation<Integer,Integer> updatedStationOccupancy = stationOccupancy.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.S, neStationOccupancy)));
        machine.set_station_occupancy(updatedStationOccupancy);
      }
      else if (station_S != 0 && elements_SE_S.get(0) != 0){
        return;
      }
      avance_SE_to_S.button_avance_SE_to_S(elements_SE_S);
    }
    else if (SW_to_S_railway.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_SW_S = machine.get_SW_to_S();
      Iterator<Pair<Integer, Integer>> it = rail_SW_S.iterator();
      List<Integer> elements_SW_S = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_SW_S.add(snd);
      }
      if (elements_SW_S.get(0) != 0){ //We check the last element, has NE is 'at the end' of the railway
        return; //There is already a train
      }
      SW_to_S_railway.button_SW_to_S_railway();
    }

    else if (avance_SW_to_S.clic(mouseX,mouseY)){
      BRelation<Integer, Integer> rail_SW_S = machine.get_SW_to_S();
      Iterator<Pair<Integer, Integer>> it = rail_SW_S.iterator();
      List<Integer> elements_SW_S = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_SW_S.add(snd);}

      BRelation <Integer, Integer> stationOccupancy = machine.get_station_occupancy();
      Iterator<Pair<Integer, Integer>> at = stationOccupancy.iterator();
      List<Integer> occupancyList = new ArrayList<>();
      
      while (at.hasNext()) {
        Pair<Integer, Integer> pair = at.next();
        Integer snd = pair.snd();
        occupancyList.add(snd);}
      
      Integer station_S = occupancyList.get(0);
      
      if(station_S == 0 && elements_SW_S.get(2) != 0){
        Integer neStationOccupancy = elements_SW_S.get(2);
        BRelation<Integer,Integer> updatedStationOccupancy = stationOccupancy.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.S, neStationOccupancy)));
        machine.set_station_occupancy(updatedStationOccupancy);
      }
      else if (station_S != 0 && elements_SW_S.get(2) != 0){
        return;
      }
      avance_SW_to_S.button_avance_SW_to_S(elements_SW_S);
    }

    else if (S_to_SW_railway.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_S_SW = machine.get_SW_to_S();
      Iterator<Pair<Integer, Integer>> it = rail_S_SW.iterator();
      List<Integer> elements_S_SW = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_S_SW.add(snd);
      }
      if (elements_S_SW.get(2) != 0){ //We check the last element, has NE is 'at the end' of the railway
        return; //There is already a train
      }
      S_to_SW_railway.button_S_to_SW_railway();
    }

    else if (avance_S_to_SW.clic(mouseX,mouseY)){
      BRelation<Integer, Integer> rail_S_SW = machine.get_SW_to_S();
      Iterator<Pair<Integer, Integer>> it = rail_S_SW.iterator();
      List<Integer> elements_S_SW = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_S_SW.add(snd);}

      BRelation <Integer, Integer> stationOccupancy = machine.get_station_occupancy();
      Iterator<Pair<Integer, Integer>> at = stationOccupancy.iterator();
      List<Integer> occupancyList = new ArrayList<>();
      
      while (at.hasNext()) {
        Pair<Integer, Integer> pair = at.next();
        Integer snd = pair.snd();
        occupancyList.add(snd);}
      
      Integer station_SW = occupancyList.get(4);
      
      if(station_SW == 0 && elements_S_SW.get(0) != 0){
        Integer neStationOccupancy = elements_S_SW.get(0);
        BRelation<Integer,Integer> updatedStationOccupancy = stationOccupancy.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.SW, neStationOccupancy)));
        machine.set_station_occupancy(updatedStationOccupancy);
      }
      else if (station_SW != 0 && elements_S_SW.get(0) != 0){
        return;
      }
      avance_S_to_SW.button_avance_S_to_SW(elements_S_SW);
    }

    else if (SW_to_transit_railway.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_SW_transit = machine.get_SW_to_transit();
      Iterator<Pair<Integer, Integer>> it = rail_SW_transit.iterator();
      List<Integer> elements_SW_transit = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_SW_transit.add(snd);
      }
      if (elements_SW_transit.get(0) != 0){
        return; //There is already a train
      }
      SW_to_transit_railway.button_SW_to_transit_railway();
    }

    else if (avance_SW_to_transit.clic(mouseX,mouseY)){
      BRelation<Integer, Integer> rail_SW_transit = machine.get_SW_to_transit();
      Iterator<Pair<Integer, Integer>> it = rail_SW_transit.iterator();
      List<Integer> elements_SW_transit = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_SW_transit.add(snd);}

      BRelation <Integer, Integer> stationOccupancy = machine.get_station_occupancy();
      Iterator<Pair<Integer, Integer>> at = stationOccupancy.iterator();
      List<Integer> occupancyList = new ArrayList<>();
      
      while (at.hasNext()) {
        Pair<Integer, Integer> pair = at.next();
        Integer snd = pair.snd();
        occupancyList.add(snd);}
      
      Integer station_transit = occupancyList.get(6);
      
      if(station_transit == 0 && elements_SW_transit.get(2) != 0){
        Integer neStationOccupancy = elements_SW_transit.get(2);
        BRelation<Integer,Integer> updatedStationOccupancy = stationOccupancy.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.transit, neStationOccupancy)));
        machine.set_station_occupancy(updatedStationOccupancy);
      }
      else if (station_transit != 0 && elements_SW_transit.get(2) != 0){
        return;
      }
      avance_SW_to_transit.button_avance_SW_to_transit(elements_SW_transit);
    }

    else if (transit_to_SW_railway.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_transit_SW = machine.get_SW_to_transit();
      Iterator<Pair<Integer, Integer>> it = rail_transit_SW.iterator();
      List<Integer> elements_transit_SW = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_transit_SW.add(snd);
      }
      if (elements_transit_SW.get(2) != 0){
        return; //There is already a train
      }
      transit_to_SW_railway.button_transit_to_SW_railway();
    }

    else if (avance_transit_to_SW.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_transit_SW = machine.get_SW_to_transit();
      Iterator<Pair<Integer, Integer>> it = rail_transit_SW.iterator();
      List<Integer> elements_transit_SW = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_transit_SW.add(snd);}

      BRelation <Integer, Integer> stationOccupancy = machine.get_station_occupancy();
      Iterator<Pair<Integer, Integer>> at = stationOccupancy.iterator();
      List<Integer> occupancyList = new ArrayList<>();
      
      while (at.hasNext()) {
        Pair<Integer, Integer> pair = at.next();
        Integer snd = pair.snd();
        occupancyList.add(snd);}
      
      Integer station_SW = occupancyList.get(4);
      
      if(station_SW == 0 && elements_transit_SW.get(0) != 0){
        Integer neStationOccupancy = elements_transit_SW.get(0);
        BRelation<Integer,Integer> updatedStationOccupancy = stationOccupancy.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.SW, neStationOccupancy)));
        machine.set_station_occupancy(updatedStationOccupancy);
      }
      else if (station_SW != 0 && elements_transit_SW.get(0) != 0){
        return;
      }
      avance_transit_to_SW.button_avance_transit_to_SW(elements_transit_SW);
    }

    else if (center_to_S_railway.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_center_S = machine.get_center_to_S();
      Iterator<Pair<Integer, Integer>> it = rail_center_S.iterator();
      List<Integer> elements_center_S = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_center_S.add(snd);
      }
      if (elements_center_S.get(2) != 0){
        return; //There is already a train
      }
      center_to_S_railway.button_center_to_S_railway();
    }

    else if (avance_center_to_S.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_center_S = machine.get_center_to_S();
      Iterator<Pair<Integer, Integer>> it = rail_center_S.iterator();
      List<Integer> elements_center_S = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_center_S.add(snd);}

      BRelation <Integer, Integer> stationOccupancy = machine.get_station_occupancy();
      Iterator<Pair<Integer, Integer>> at = stationOccupancy.iterator();
      List<Integer> occupancyList = new ArrayList<>();
      
      while (at.hasNext()) {
        Pair<Integer, Integer> pair = at.next();
        Integer snd = pair.snd();
        occupancyList.add(snd);}
      
      Integer station_S = occupancyList.get(0);
      
      if(station_S == 0 && elements_center_S.get(2) != 0){
        Integer neStationOccupancy = elements_center_S.get(2);
        BRelation<Integer,Integer> updatedStationOccupancy = stationOccupancy.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.S, neStationOccupancy)));
        machine.set_station_occupancy(updatedStationOccupancy);
      }
      else if (station_S != 0 && elements_center_S.get(2) != 0){
        return;
      }
      avance_center_to_S.button_avance_center_to_S(elements_center_S);
    }

    else if (S_to_center_railway.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_S_center = machine.get_center_to_S();
      Iterator<Pair<Integer, Integer>> it = rail_S_center.iterator();
      List<Integer> elements_S_center = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_S_center.add(snd);
      }
      if (elements_S_center.get(0) != 0){
        return; //There is already a train
      }
      S_to_center_railway.button_S_to_center_railway();
    }

    else if (avance_S_to_center.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_S_center = machine.get_center_to_S();
      Iterator<Pair<Integer, Integer>> it = rail_S_center.iterator();
      List<Integer> elements_S_center = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_S_center.add(snd);}

      BRelation <Integer, Integer> stationOccupancy = machine.get_station_occupancy();
      Iterator<Pair<Integer, Integer>> at = stationOccupancy.iterator();
      List<Integer> occupancyList = new ArrayList<>();
      
      while (at.hasNext()) {
        Pair<Integer, Integer> pair = at.next();
        Integer snd = pair.snd();
        occupancyList.add(snd);}
      
      Integer station_center = occupancyList.get(5);
      
      if(station_center == 0 && elements_S_center.get(0) != 0){
        Integer neStationOccupancy = elements_S_center.get(0);
        BRelation<Integer,Integer> updatedStationOccupancy = stationOccupancy.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.center, neStationOccupancy)));
        machine.set_station_occupancy(updatedStationOccupancy);
      }
      else if (station_center != 0 && elements_S_center.get(0) != 0){
        return;
      }
      avance_S_to_center.button_avance_S_to_center(elements_S_center);
    }

    else if (transit_to_center_railway.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_transit_center = machine.get_transit_to_center();
      Iterator<Pair<Integer, Integer>> it = rail_transit_center.iterator();
      List<Integer> elements_transit_center = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_transit_center.add(snd);
      }
      if (elements_transit_center.get(0) != 0){
        return; //There is already a train
      }
      transit_to_center_railway.button_transit_to_center_railway();
    }

    else if (avance_transit_to_center.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_transit_center = machine.get_transit_to_center();
      Iterator<Pair<Integer, Integer>> it = rail_transit_center.iterator();
      List<Integer> elements_transit_center = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_transit_center.add(snd);}

      BRelation <Integer, Integer> stationOccupancy = machine.get_station_occupancy();
      Iterator<Pair<Integer, Integer>> at = stationOccupancy.iterator();
      List<Integer> occupancyList = new ArrayList<>();
      
      while (at.hasNext()) {
        Pair<Integer, Integer> pair = at.next();
        Integer snd = pair.snd();
        occupancyList.add(snd);}
      
      Integer station_center = occupancyList.get(5);
      
      if(station_center == 0 && elements_transit_center.get(2) != 0){
        Integer neStationOccupancy = elements_transit_center.get(2);
        BRelation<Integer,Integer> updatedStationOccupancy = stationOccupancy.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.center, neStationOccupancy)));
        machine.set_station_occupancy(updatedStationOccupancy);
      }
      else if (station_center != 0 && elements_transit_center.get(2) != 0){
        return;
      }
      avance_transit_to_center.button_avance_transit_to_center(elements_transit_center);
    }

    else if (center_to_transit_railway.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_center_transit = machine.get_transit_to_center();
      Iterator<Pair<Integer, Integer>> it = rail_center_transit.iterator();
      List<Integer> elements_center_transit = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_center_transit.add(snd);
      }
      if (elements_center_transit.get(2) != 0){
        return; //There is already a train
      }
      center_to_transit_railway.button_center_to_transit_railway();
    }

    else if(avance_center_to_transit.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_center_transit = machine.get_transit_to_center();
      Iterator<Pair<Integer, Integer>> it = rail_center_transit.iterator();
      List<Integer> elements_center_transit = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_center_transit.add(snd);}

      BRelation <Integer, Integer> stationOccupancy = machine.get_station_occupancy();
      Iterator<Pair<Integer, Integer>> at = stationOccupancy.iterator();
      List<Integer> occupancyList = new ArrayList<>();
      
      while (at.hasNext()) {
        Pair<Integer, Integer> pair = at.next();
        Integer snd = pair.snd();
        occupancyList.add(snd);}
      
      Integer station_transit = occupancyList.get(6);
      
      if(station_transit == 0 && elements_center_transit.get(0) != 0){
        Integer neStationOccupancy = elements_center_transit.get(0);
        BRelation<Integer,Integer> updatedStationOccupancy = stationOccupancy.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.transit, neStationOccupancy)));
        machine.set_station_occupancy(updatedStationOccupancy);
      }
      else if (station_transit != 0 && elements_center_transit.get(0) != 0){
        return;
      }
      avance_center_to_transit.button_avance_center_to_transit(elements_center_transit);
    }

    else if (transit_to_S_railway.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_transit_S = machine.get_transit_to_S();
      Iterator<Pair<Integer, Integer>> it = rail_transit_S.iterator();
      List<Integer> elements_transit_S = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_transit_S.add(snd);
      }
      if (elements_transit_S.get(0) != 0){
        return; //There is already a train
      }
      transit_to_S_railway.button_transit_to_S_railway();
    }

    else if (avance_transit_to_S.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_transit_S = machine.get_transit_to_S();
      Iterator<Pair<Integer, Integer>> it = rail_transit_S.iterator();
      List<Integer> elements_transit_S = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_transit_S.add(snd);}

      BRelation <Integer, Integer> stationOccupancy = machine.get_station_occupancy();
      Iterator<Pair<Integer, Integer>> at = stationOccupancy.iterator();
      List<Integer> occupancyList = new ArrayList<>();
      
      while (at.hasNext()) {
        Pair<Integer, Integer> pair = at.next();
        Integer snd = pair.snd();
        occupancyList.add(snd);}
      
      Integer station_S = occupancyList.get(0);
      
      if(station_S == 0 && elements_transit_S.get(2) != 0){
        Integer neStationOccupancy = elements_transit_S.get(2);
        BRelation<Integer,Integer> updatedStationOccupancy = stationOccupancy.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.S, neStationOccupancy)));
        machine.set_station_occupancy(updatedStationOccupancy);
      }
      else if (station_S != 0 && elements_transit_S.get(2) != 0){
        return;
      }
      avance_transit_to_S.button_avance_transit_to_S(elements_transit_S);
    }

    else if (S_to_transit_railway.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_S_transit = machine.get_transit_to_S();
      Iterator<Pair<Integer, Integer>> it = rail_S_transit.iterator();
      List<Integer> elements_S_transit = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_S_transit.add(snd);
      }
      if (elements_S_transit.get(2) != 0){
        return; //There is already a train
      }
      S_to_transit_railway.button_S_to_transit_railway();
    }

    else if (avance_S_to_transit.clic(mouseX, mouseY)){
      BRelation<Integer, Integer> rail_S_transit = machine.get_transit_to_S();
      Iterator<Pair<Integer, Integer>> it = rail_S_transit.iterator();
      List<Integer> elements_S_transit = new ArrayList<>();

      while (it.hasNext()) {
        Pair<Integer, Integer> pair = it.next();
        Integer snd = pair.snd();
        elements_S_transit.add(snd);}

      BRelation <Integer, Integer> stationOccupancy = machine.get_station_occupancy();
      Iterator<Pair<Integer, Integer>> at = stationOccupancy.iterator();
      List<Integer> occupancyList = new ArrayList<>();
      
      while (at.hasNext()) {
        Pair<Integer, Integer> pair = at.next();
        Integer snd = pair.snd();
        occupancyList.add(snd);}
      
      Integer station_transit = occupancyList.get(6);
      
      if(station_transit == 0 && elements_S_transit.get(0) != 0){
        Integer neStationOccupancy = elements_S_transit.get(0);
        BRelation<Integer,Integer> updatedStationOccupancy = stationOccupancy.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.transit, neStationOccupancy)));
        machine.set_station_occupancy(updatedStationOccupancy);
      }
      else if (station_transit != 0 && elements_S_transit.get(0) != 0){
        return;
      }
      avance_S_to_transit.button_avance_S_to_transit(elements_S_transit);
    }

}