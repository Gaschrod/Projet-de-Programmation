public class transit_to_S_railway{
	/*@ spec_public */ private Raffinement2 machine; // reference to the machine 

	/*@
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public transit_to_S_railway(Raffinement2 m) {
		this.machine = m;
	}

	/*@
		requires true;
 		assignable \nothing;
		ensures \result <==> (!machine.get_station_occupancy().apply(machine.transit).equals(machine.NOTHING) && (machine.get_number_train()).compareTo(new Integer(0)) > 0 && machine.get_transit_to_S().apply(new Integer(1)).equals(machine.NOTHING) && ((machine.get_Traffic_light_station().apply(new Integer(27)).equals(machine.green) && machine.get_transit_to_S().equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(1),machine.NOTHING),new Pair<Integer,Integer>(new Integer(2),machine.NOTHING),new Pair<Integer,Integer>(new Integer(3),machine.NOTHING)))) ==> (light_color.equals(machine.red))) && ((machine.get_Traffic_light_station().apply(new Integer(27)).equals(machine.red)) ==> (light_color.equals(machine.red))) && machine.get_transit_S_available().apply(new Integer(2)).equals(true)); */
	public boolean guard_transit_to_S_railway( Integer light_color) {
		return (!machine.get_station_occupancy().apply(machine.transit).equals(machine.NOTHING) && (machine.get_number_train()).compareTo(new Integer(0)) > 0 && machine.get_transit_to_S().apply(new Integer(1)).equals(machine.NOTHING) && BOOL.implication(machine.get_Traffic_light_station().apply(new Integer(27)).equals(machine.green) && machine.get_transit_to_S().equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(1),machine.NOTHING),new Pair<Integer,Integer>(new Integer(2),machine.NOTHING),new Pair<Integer,Integer>(new Integer(3),machine.NOTHING))),light_color.equals(machine.red)) && BOOL.implication(machine.get_Traffic_light_station().apply(new Integer(27)).equals(machine.red),light_color.equals(machine.red)) && machine.get_transit_S_available().apply(new Integer(2)).equals(true));
	}

	/* @	requires guard_transit_to_S_railway(light_color); */

	public void run_transit_to_S_railway( /*Integer light_color*/){
		//if(guard_transit_to_S_railway(light_color)) {
			BRelation<Integer,Integer> transit_to_S_tmp = machine.get_transit_to_S();
			BRelation<Integer,Integer> station_occupancy_tmp = machine.get_station_occupancy();
			BRelation<Integer,Integer> rail_tmp = machine.get_rail();
			//BRelation<Integer,Integer> Traffic_light_station_tmp = machine.get_Traffic_light_station();

			machine.set_transit_to_S((transit_to_S_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,station_occupancy_tmp.apply(machine.transit))))));
			machine.set_station_occupancy((station_occupancy_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.transit,machine.NOTHING)))));
			//machine.set_Traffic_light_station((Traffic_light_station_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(22,light_color),new Pair<Integer,Integer>(27,light_color)))));

			//System.out.println("transit_to_S_railway executed light_color: " + light_color + " ");
		//}
	}

}
