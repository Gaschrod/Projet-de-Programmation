package InfoTraffic_sequential; 

import eventb_prelude.*;
import Util.Utilities;

public class center_to_transit_railway{
	/*@ spec_public */ private Raffinement2 machine; // reference to the machine 

	/*@ 
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public center_to_transit_railway(Raffinement2 m) {
		this.machine = m;
	}

	/*@ 
		requires true;
 		assignable \nothing;
		ensures \result <==> (!machine.get_station_occupancy().apply(machine.center).equals(machine.NOTHING) && (machine.get_number_train()).compareTo(new Integer(0)) > 0 && machine.get_transit_to_center().apply(new Integer(3)).equals(machine.NOTHING) && ((machine.get_Traffic_light_station().apply(new Integer(26)).equals(machine.green) && machine.get_transit_to_center().equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(1),machine.NOTHING),new Pair<Integer,Integer>(new Integer(2),machine.NOTHING),new Pair<Integer,Integer>(new Integer(3),machine.NOTHING)))) ==> (light_color.equals(machine.red))) && ((machine.get_Traffic_light_station().apply(new Integer(26)).equals(machine.red)) ==> (light_color.equals(machine.red))) && machine.get_transit_center_available().apply(new Integer(1)).equals(true)); */
	public boolean guard_center_to_transit_railway( Integer light_color) {
		return (!machine.get_station_occupancy().apply(machine.center).equals(machine.NOTHING) && (machine.get_number_train()).compareTo(new Integer(0)) > 0 && machine.get_transit_to_center().apply(new Integer(3)).equals(machine.NOTHING) && BOOL.implication(machine.get_Traffic_light_station().apply(new Integer(26)).equals(machine.green) && machine.get_transit_to_center().equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(1),machine.NOTHING),new Pair<Integer,Integer>(new Integer(2),machine.NOTHING),new Pair<Integer,Integer>(new Integer(3),machine.NOTHING))),light_color.equals(machine.red)) && BOOL.implication(machine.get_Traffic_light_station().apply(new Integer(26)).equals(machine.red),light_color.equals(machine.red)) && machine.get_transit_center_available().apply(new Integer(1)).equals(true));
	}

	/*@ 
		requires guard_center_to_transit_railway(light_color);
	 also
		requires !guard_center_to_transit_railway(light_color);
		assignable \nothing;
		ensures true; */
	public void run_center_to_transit_railway( Integer light_color){
		if(guard_center_to_transit_railway(light_color)) {
			BRelation<Integer,Integer> transit_to_center_tmp = machine.get_transit_to_center();
			BRelation<Integer,Integer> station_occupancy_tmp = machine.get_station_occupancy();
			BRelation<Integer,Integer> rail_tmp = machine.get_rail();
			BRelation<Integer,Integer> Traffic_light_station_tmp = machine.get_Traffic_light_station();

			machine.set_transit_to_center((transit_to_center_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(3,station_occupancy_tmp.apply(machine.center))))));
			machine.set_station_occupancy((station_occupancy_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.center,machine.NOTHING)))));
			machine.set_Traffic_light_station((Traffic_light_station_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(14,light_color),new Pair<Integer,Integer>(26,light_color)))));

			System.out.println("center_to_transit_railway executed light_color: " + light_color + " ");
		}
	}

}
