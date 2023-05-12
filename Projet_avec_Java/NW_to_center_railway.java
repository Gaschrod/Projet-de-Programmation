public class NW_to_center_railway{
	/*@ spec_public */ private Raffinement2 machine; // reference to the machine 

	/*@ 
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public NW_to_center_railway(Raffinement2 m) {
		this.machine = m;
	}

	/*@ 
		requires true;
 		assignable \nothing;
		ensures \result <==> (!machine.get_station_occupancy().apply(machine.NW).equals(machine.NOTHING) && (machine.get_number_train()).compareTo(new Integer(0)) > 0 && machine.get_NW_to_center().apply(new Integer(1)).equals(machine.NOTHING) && ((machine.get_Traffic_light_station().apply(new Integer(10)).equals(machine.green) && machine.get_NW_to_center().equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(1),machine.NOTHING),new Pair<Integer,Integer>(new Integer(2),machine.NOTHING),new Pair<Integer,Integer>(new Integer(3),machine.NOTHING)))) ==> (light_color.equals(machine.red))) && ((machine.get_Traffic_light_station().apply(new Integer(10)).equals(machine.red)) ==> (light_color.equals(machine.red))) && machine.get_NW_center_available().apply(new Integer(2)).equals(true)); */
	public boolean guard_NW_to_center_railway( Integer light_color) {
		return (!machine.get_station_occupancy().apply(machine.NW).equals(machine.NOTHING) && (machine.get_number_train()).compareTo(new Integer(0)) > 0 && machine.get_NW_to_center().apply(new Integer(1)).equals(machine.NOTHING) && BOOL.implication(machine.get_Traffic_light_station().apply(new Integer(10)).equals(machine.green) && machine.get_NW_to_center().equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(1),machine.NOTHING),new Pair<Integer,Integer>(new Integer(2),machine.NOTHING),new Pair<Integer,Integer>(new Integer(3),machine.NOTHING))),light_color.equals(machine.red)) && BOOL.implication(machine.get_Traffic_light_station().apply(new Integer(10)).equals(machine.red),light_color.equals(machine.red)) && machine.get_NW_center_available().apply(new Integer(2)).equals(true));
	}

	/*@ 
		requires guard_NW_to_center_railway(light_color);
	 also
		requires !guard_NW_to_center_railway(light_color);
		assignable \nothing;
		ensures true; */
	public void run_NW_to_center_railway( Integer light_color){
		if(guard_NW_to_center_railway(light_color)) {
			BRelation<Integer,Integer> NW_to_center_tmp = machine.get_NW_to_center();
			BRelation<Integer,Integer> station_occupancy_tmp = machine.get_station_occupancy();
			BRelation<Integer,Integer> rail_tmp = machine.get_rail();
			BRelation<Integer,Integer> Traffic_light_station_tmp = machine.get_Traffic_light_station();

			machine.set_NW_to_center((NW_to_center_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,station_occupancy_tmp.apply(machine.NW))))));
			machine.set_station_occupancy((station_occupancy_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.NW,machine.NOTHING)))));
			machine.set_Traffic_light_station((Traffic_light_station_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(10,light_color),new Pair<Integer,Integer>(13,light_color)))));

			System.out.println("NW_to_center_railway executed light_color: " + light_color + " ");
		}
	}

}
