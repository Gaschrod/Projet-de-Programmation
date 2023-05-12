public class S_to_SE_railway{
	/*@ spec_public */ private Raffinement2 machine; // reference to the machine 

	/*@ 
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public S_to_SE_railway(Raffinement2 m) {
		this.machine = m;
	}

	/*@ 
		requires true;
 		assignable \nothing;
		ensures \result <==> (!machine.get_station_occupancy().apply(machine.S).equals(machine.NOTHING) && (machine.get_number_train()).compareTo(new Integer(0)) > 0 && machine.get_S_to_SE().apply(new Integer(1)).equals(machine.NOTHING) && ((machine.get_Traffic_light_station().apply(new Integer(24)).equals(machine.green) && machine.get_S_to_SE().equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(1),machine.NOTHING),new Pair<Integer,Integer>(new Integer(2),machine.NOTHING),new Pair<Integer,Integer>(new Integer(3),machine.NOTHING)))) ==> (light_color.equals(machine.red))) && ((machine.get_Traffic_light_station().apply(new Integer(24)).equals(machine.red)) ==> (light_color.equals(machine.red))) && machine.get_S_SE_available().apply(new Integer(1)).equals(true)); */
	public boolean guard_S_to_SE_railway( Integer light_color) {
		return (!machine.get_station_occupancy().apply(machine.S).equals(machine.NOTHING) && (machine.get_number_train()).compareTo(new Integer(0)) > 0 && machine.get_S_to_SE().apply(new Integer(1)).equals(machine.NOTHING) && BOOL.implication(machine.get_Traffic_light_station().apply(new Integer(24)).equals(machine.green) && machine.get_S_to_SE().equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(1),machine.NOTHING),new Pair<Integer,Integer>(new Integer(2),machine.NOTHING),new Pair<Integer,Integer>(new Integer(3),machine.NOTHING))),light_color.equals(machine.red)) && BOOL.implication(machine.get_Traffic_light_station().apply(new Integer(24)).equals(machine.red),light_color.equals(machine.red)) && machine.get_S_SE_available().apply(new Integer(1)).equals(true));
	}

	/*@ 
		requires guard_S_to_SE_railway(light_color);
	 also
		requires !guard_S_to_SE_railway(light_color);
		assignable \nothing;
		ensures true; */
	public void run_S_to_SE_railway( Integer light_color){
		if(guard_S_to_SE_railway(light_color)) {
			BRelation<Integer,Integer> S_to_SE_tmp = machine.get_S_to_SE();
			BRelation<Integer,Integer> station_occupancy_tmp = machine.get_station_occupancy();
			BRelation<Integer,Integer> rail_tmp = machine.get_rail();
			BRelation<Integer,Integer> Traffic_light_station_tmp = machine.get_Traffic_light_station();

			machine.set_S_to_SE((S_to_SE_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,station_occupancy_tmp.apply(machine.S))))));
			machine.set_station_occupancy((station_occupancy_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.S,machine.NOTHING)))));
			machine.set_Traffic_light_station((Traffic_light_station_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(24,light_color),new Pair<Integer,Integer>(25,light_color)))));

			System.out.println("S_to_SE_railway executed light_color: " + light_color + " ");
		}
	}

}
