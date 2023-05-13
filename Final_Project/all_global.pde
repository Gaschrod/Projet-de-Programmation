Raffinement2 machine = new Raffinement2();

Button spawn_S = new Button("Spawn S", 50, 845, 100, 20);
Button spawn_NE = new Button("Spawn NE", 50, 880, 100, 20);
Button spawn_NW = new Button("Spawn NW", 160, 880, 100, 20);
Button spawn_SE = new Button("Spawn SE", 270, 880, 100, 20);
Button spawn_SW = new Button("Spawn SW", 380, 880, 100, 20);
Button spawn_center = new Button("Spawn center", 490, 880, 100, 20);
Button spawn_transit = new Button("Spawn transit", 600, 880, 100, 20);
Button button8 = new Button("Transit -> Center", 710, 880, 100, 20);
Button button9 = new Button("Center -> Transit", 820, 880, 100, 20);
Button button10 = new Button("SW -> Transit", 930, 880, 100, 20);
Button button11 = new Button("Transit -> SW", 1040, 880, 100, 20);
Button button12 = new Button("S -> Transit", 1150, 880, 100, 20);
Button button13 = new Button("Transit -> S", 50, 910, 100, 20);
Button avance_S_to_SW = new Button("S -> SW", 160, 910, 100, 20);
Button avance_SW_to_S = new Button("SW -> S", 270, 910, 100, 20);
Button avance_S_to_SE = new Button("S -> SE", 380, 910, 100, 20);
Button avance_SE_to_S = new Button("SE -> S", 490, 910, 100, 20);
Button avance_NE_to_S = new Button("NE -> S", 600, 910, 100, 20);
Button avance_S_to_NE = new Button("S -> NE", 710, 910, 100, 20);
Button avance_center_to_NE = new Button("Center -> NE", 820, 910, 100, 20);
Button avance_NE_to_center = new Button("NE -> Center", 930, 910, 100, 20);
Button button22 = new Button("Center -> S", 1040, 910, 100, 20);
Button button23 = new Button("S -> Center", 1150, 910, 100, 20);
Button avance_NW_to_center = new Button("NW -> Center", 50, 945, 100, 20);
Button avance_center_to_NW = new Button("Center -> NW", 160, 945, 100, 20);
Button avance_NW_to_NE = new Button("NW -> NE", 270, 945, 100, 20);
Button avance_NE_to_NW = new Button("NE -> NW", 380, 945, 100, 20);
Button avance_NW_to_SW = new Button("NW -> SW", 490, 945, 100, 20);
Button avance_SW_to_NW = new Button("SW -> NW", 600, 945, 100, 20);
Button button30 = new Button("button30", 710, 945, 100, 20);
Button button31 = new Button("button31", 820, 945, 100, 20);
Button NW_to_NE_railway = new Button("NW-NE railway", 930, 945, 100, 20);
Button NE_to_NW_railway = new Button("NE-NW railway", 1040, 945, 100, 20);
Button NW_to_SW_railway = new Button("NW-SW railway", 1150, 945, 100, 20);
Button SW_to_NW_railway = new Button("SW-NW railway", 50, 975, 100, 20);
Button NW_to_center_railway = new Button("NW-Center railway", 160, 975, 100, 20);
Button center_to_NW_railway = new Button("Center-NW railway", 270, 975, 100, 20);
Button center_to_NE_railway = new Button("Center-NE railway", 380, 975, 100, 20);
Button NE_to_center_railway = new Button("NE-Center railway", 490, 975, 100, 20);
Button NE_to_S_railway = new Button("NE-S railway", 600, 975, 100, 20);
Button S_to_NE_railway = new Button("S-NE railway", 710, 975, 100, 20);
Button S_to_SE_railway = new Button("S-SE railway", 820, 975, 100, 20);
Button SE_to_S_railway = new Button("SE-S railway", 930, 975, 100, 20);
Button SW_to_S_railway = new Button("SW-S railway", 1040, 975, 100, 20);
Button S_to_SW_railway = new Button("S-SW_railway", 1150, 975, 100, 20);
Button button46 = new Button("1", 1300, 880, 100, 20);
Button button47 = new Button("2", 1300, 910, 100, 20);
Button button48 = new Button("3", 1300, 945, 100, 20);
Button button49 = new Button("4", 1300, 975, 100, 20);
Button button50 = new Button("1", 1410, 880, 100, 20);
Button button51 = new Button("2", 1410, 910, 100, 20);
Button button52 = new Button("3", 1410, 945, 100, 20);
Button button53 = new Button("4", 1410, 975, 100, 20);

BRelation<Integer,Integer> station_occupancy;
BRelation<Integer,Integer> secondary_occupancy;