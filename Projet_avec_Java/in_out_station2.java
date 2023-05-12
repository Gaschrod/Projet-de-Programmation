public class in_out_station2{
	/*@ spec_public */ private Raffinement2 machine; // reference to the machine 

	/*@ 
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public in_out_station2(Raffinement2 m) {
		this.machine = m;
	}

	/*@ 
		requires true;
 		assignable \nothing;
		ensures \result <==> (machine.get_secondary_occupancy().apply(machine.station2).equals(machine.NOTHING) && !machine.get_NW_to_center().apply(new Integer(2)).equals(machine.NOTHING) || !machine.get_secondary_occupancy().apply(machine.station2).equals(machine.NOTHING) && machine.get_NW_to_center().apply(new Integer(2)).equals(machine.NOTHING) && ((!machine.get_secondary_occupancy().apply(machine.station2).equals(machine.NOTHING)) ==> (machine.get_NW_to_center().apply(new Integer(2)).equals(machine.NOTHING))) && temporary.equals(machine.get_secondary_occupancy().apply(machine.station2)) && ((machine.get_secondary_occupancy().apply(machine.station2).equals(machine.NOTHING) && machine.get_NW_to_center().apply(new Integer(1)).equals(machine.NOTHING) && machine.get_NW_to_center().apply(new Integer(3)).equals(machine.NOTHING)) ==> (rail_value.equals(machine.NOTRAIN) && light_color.equals(machine.green))) && ((!machine.get_secondary_occupancy().apply(machine.station2).equals(machine.NOTHING)) ==> (rail_value.equals(machine.BUSY) && light_color.equals(machine.red))) && ((machine.get_secondary_occupancy().apply(machine.station2).equals(machine.NOTHING) && !machine.get_NW_to_center().apply(new Integer(1)).equals(machine.NOTHING) || !machine.get_NW_to_center().apply(new Integer(3)).equals(machine.NOTHING)) ==> (rail_value.equals(machine.BUSY) && light_color.equals(machine.red))) && ((machine.get_secondary_occupancy().apply(machine.station2).equals(machine.NOTHING)) ==> (secondary_lights.equals(machine.red))) && ((!machine.get_secondary_occupancy().apply(machine.station2).equals(machine.NOTHING)) ==> (secondary_lights.equals(machine.green))) && machine.get_stop_in_2().equals(true)); */
	public boolean guard_in_out_station2( Integer temporary, Integer rail_value, Integer light_color, Integer secondary_lights) {
		return (machine.get_secondary_occupancy().apply(machine.station2).equals(machine.NOTHING) && !machine.get_NW_to_center().apply(new Integer(2)).equals(machine.NOTHING) || !machine.get_secondary_occupancy().apply(machine.station2).equals(machine.NOTHING) && machine.get_NW_to_center().apply(new Integer(2)).equals(machine.NOTHING) && BOOL.implication(!machine.get_secondary_occupancy().apply(machine.station2).equals(machine.NOTHING),machine.get_NW_to_center().apply(new Integer(2)).equals(machine.NOTHING)) && temporary.equals(machine.get_secondary_occupancy().apply(machine.station2)) && BOOL.implication(machine.get_secondary_occupancy().apply(machine.station2).equals(machine.NOTHING) && machine.get_NW_to_center().apply(new Integer(1)).equals(machine.NOTHING) && machine.get_NW_to_center().apply(new Integer(3)).equals(machine.NOTHING),rail_value.equals(machine.NOTRAIN) && light_color.equals(machine.green)) && BOOL.implication(!machine.get_secondary_occupancy().apply(machine.station2).equals(machine.NOTHING),rail_value.equals(machine.BUSY) && light_color.equals(machine.red)) && BOOL.implication(machine.get_secondary_occupancy().apply(machine.station2).equals(machine.NOTHING) && !machine.get_NW_to_center().apply(new Integer(1)).equals(machine.NOTHING) || !machine.get_NW_to_center().apply(new Integer(3)).equals(machine.NOTHING),rail_value.equals(machine.BUSY) && light_color.equals(machine.red)) && BOOL.implication(machine.get_secondary_occupancy().apply(machine.station2).equals(machine.NOTHING),secondary_lights.equals(machine.red)) && BOOL.implication(!machine.get_secondary_occupancy().apply(machine.station2).equals(machine.NOTHING),secondary_lights.equals(machine.green)) && machine.get_stop_in_2().equals(true));
	}

	/*@ 
		requires guard_in_out_station2(temporary,rail_value,light_color,secondary_lights);
		ensures guard_in_out_station2(temporary,rail_value,light_color,secondary_lights) &&  machine.get_secondary_occupancy().equals(\old((machine.get_secondary_occupancy().override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.station2,machine.get_NW_to_center().apply(2))))))) &&  machine.get_NW_to_center().equals(\old((machine.get_NW_to_center().override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,temporary)))))) &&  machine.get_rail().equals(\old((machine.get_rail().override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,rail_value)))))) &&  machine.get_Traffic_light_station().equals(\old((machine.get_Traffic_light_station().override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,secondary_lights),new Pair<Integer,Integer>(10,light_color),new Pair<Integer,Integer>(13,light_color)))))); 
	 also
		requires !guard_in_out_station2(temporary,rail_value,light_color,secondary_lights);
		assignable \nothing;
		ensures true; */
	public void run_in_out_station2( Integer temporary, Integer rail_value, Integer light_color, Integer secondary_lights){
		if(guard_in_out_station2(temporary,rail_value,light_color,secondary_lights)) {
			BRelation<Integer,Integer> secondary_occupancy_tmp = machine.get_secondary_occupancy();
			BRelation<Integer,Integer> NW_to_center_tmp = machine.get_NW_to_center();
			BRelation<Integer,Integer> rail_tmp = machine.get_rail();
			BRelation<Integer,Integer> Traffic_light_station_tmp = machine.get_Traffic_light_station();

			machine.set_secondary_occupancy((secondary_occupancy_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.station2,NW_to_center_tmp.apply(2))))));
			machine.set_NW_to_center((NW_to_center_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,temporary)))));
			machine.set_rail((rail_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,rail_value)))));
			machine.set_Traffic_light_station((Traffic_light_station_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,secondary_lights),new Pair<Integer,Integer>(10,light_color),new Pair<Integer,Integer>(13,light_color)))));

			System.out.println("in_out_station2 executed temporary: " + temporary + " rail_value: " + rail_value + " light_color: " + light_color + " secondary_lights: " + secondary_lights + " ");
		}
	}

}
