Raffinement2 machine = new Raffinement2();

Button spawn_S = new Button("Spawn S", 50, 845, 100, 20);
Button spawn_NE = new Button("Spawn NE", 160, 845, 100, 20);
Button spawn_NW = new Button("Spawn NW", 270, 845, 100, 20);
Button spawn_SE = new Button("Spawn SE", 380, 845, 100, 20);
Button spawn_SW = new Button("Spawn SW", 490, 845, 100, 20);
Button spawn_center = new Button("Spawn center", 600, 845, 100, 20);
Button spawn_transit = new Button("Spawn transit", 710, 845, 100, 20);

Button avance_transit_to_center = new Button("Transit -> Center", 50, 890, 100, 20);
Button avance_center_to_transit = new Button("Center -> Transit", 160, 890, 100, 20);
Button avance_SW_to_transit = new Button("SW -> Transit", 270, 890, 100, 20);
Button avance_transit_to_SW = new Button("Transit -> SW", 380, 890, 100, 20);
Button avance_S_to_transit = new Button("S -> Transit", 490, 890, 100, 20);
Button avance_transit_to_S = new Button("Transit -> S", 600, 890, 100, 20);
Button avance_S_to_SW = new Button("S -> SW", 710, 890, 100, 20);
Button avance_SW_to_S = new Button("SW -> S", 820, 890, 100, 20);
Button avance_S_to_SE = new Button("S -> SE", 930, 890, 100, 20);
Button avance_SE_to_S = new Button("SE -> S", 1040, 890, 100, 20);
Button avance_NE_to_S = new Button("NE -> S", 1150, 890, 100, 20);
Button avance_S_to_NE = new Button("S -> NE", 1260, 890, 100, 20);
Button avance_center_to_NE = new Button("Center -> NE", 1370, 890, 100, 20);
Button avance_NE_to_center = new Button("NE -> Center", 1480, 890, 100, 20);
Button avance_center_to_S = new Button("Center -> S", 1590, 890, 100, 20);
Button avance_S_to_center = new Button("S -> Center", 1700, 890, 100, 20);

Button avance_NW_to_center = new Button("NW -> Center", 50, 925, 100, 20);
Button avance_center_to_NW = new Button("Center -> NW", 160, 925, 100, 20);
Button avance_NW_to_NE = new Button("NW -> NE", 270, 925, 100, 20);
Button avance_NE_to_NW = new Button("NE -> NW", 380, 925, 100, 20);
Button avance_NW_to_SW = new Button("NW -> SW", 490, 925, 100, 20);
Button avance_SW_to_NW = new Button("SW -> NW", 600, 925, 100, 20);

Button SW_to_transit_railway = new Button("SW-transit railw", 50, 970, 100, 20);
Button transit_to_SW_railway = new Button("transit-SW railw", 160, 970, 100, 20);
Button NW_to_NE_railway = new Button("NW-NE railway", 270, 970, 100, 20);
Button NE_to_NW_railway = new Button("NE-NW railway", 380, 970, 100, 20);
Button NW_to_SW_railway = new Button("NW-SW railway", 490, 970, 100, 20);
Button SW_to_NW_railway = new Button("SW-NW railway", 600, 970, 100, 20);
Button NW_to_center_railway = new Button("NW-Center railw", 710, 970, 100, 20);
Button center_to_NW_railway = new Button("Center-NW railw", 820, 970, 100, 20);
Button center_to_NE_railway = new Button("Center-NE railw", 930, 970, 100, 20);
Button NE_to_center_railway = new Button("NE-Center railw", 1040, 970, 100, 20);
Button NE_to_S_railway = new Button("NE-S railway", 1150, 970, 100, 20);
Button S_to_NE_railway = new Button("S-NE railway", 1260, 970, 100, 20);
Button S_to_SE_railway = new Button("S-SE railway", 1370, 970, 100, 20);
Button SE_to_S_railway = new Button("SE-S railway", 1480, 970, 100, 20);
Button SW_to_S_railway = new Button("SW-S railway", 1590, 970, 100, 20);
Button S_to_SW_railway = new Button("S-SW railway", 1700, 970, 100, 20);

Button center_to_S_railway = new Button("Center-S railway", 50, 1005, 100, 20);
Button S_to_center_railway = new Button("S-Center railway", 160, 1005, 100, 20);
Button transit_to_center_railway = new Button("transit-Center r", 270, 1005, 100, 20);
Button center_to_transit_railway = new Button("Center-transit r", 380, 1005, 100, 20);
Button transit_to_S_railway = new Button("transit-S railway", 490, 1005, 100, 20);
Button S_to_transit_railway = new Button("S-transit railway", 600, 1005, 100, 20);

Button in_out_station1 = new Button("In/out station 1", 550,120,100,60);
Button in_out_station2 = new Button("In/out station 2", 300,300,100,60);
Button in_out_station3 = new Button("In/out station 3", 800,300,100,60);
Button in_out_station4 = new Button("In/out station 4", 1050,450,100,60);
Button in_out_station5 = new Button("In/out station 5", 1300,750,100,60);
Button in_out_station6 = new Button("In/out station 6", 550,780,100,60);
Button in_out_station7 = new Button("In/out station 7", 50,450,100,60);
Button in_out_station8 = new Button("In/out station 8", 800,600,100,60);

BRelation<Integer,Integer> station_occupancy;
BRelation<Integer,Integer> secondary_occupancy;

BRelation<Integer, Integer> NE_to_S_occupancy;
BRelation<Integer, Integer> transit_to_center_occupancy;
BRelation<Integer, Integer> transit_to_S_occupancy;
BRelation<Integer, Integer> center_to_S_occupancy;
BRelation<Integer, Integer> SW_to_S_occupancy;
BRelation<Integer, Integer> center_to_NE_occupancy;
BRelation<Integer, Integer> S_to_SE_occupancy;
BRelation<Integer, Integer> NW_to_SW_occupancy;
BRelation<Integer, Integer> NW_to_center_occupancy;
BRelation<Integer, Integer> NW_to_NE_occupancy;
BRelation<Integer, Integer> SW_to_transit_occupancy;