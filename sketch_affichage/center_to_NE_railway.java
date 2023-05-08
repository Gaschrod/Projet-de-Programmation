package InfoTraffic_sequential; 

import eventb_prelude.*;
import Util.Utilities;

public class center_to_NE_railway{
	/*@ spec_public */ private Raffinement2 machine; // reference to the machine 

	/*@ 
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public center_to_NE_railway(Raffinement2 m) {
		this.machine = m;
	}

	/*@ 
		requires true;
 		assignable \nothing;
		ensures \result <==> (!machine.get_station_occupancy().apply(machine.center).equals(machine.NOTHING) && (machine.get_number_train()).compareTo(new Integer(0)) > 0 && machine.get_center_to_NE().apply(new Integer(1)).equals(machine.NOTHING) && ((machine.get_Traffic_light_station().apply(new Integer(16)).equals(machine.green) && machine.get_center_to_NE().equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(1),machine.NOTHING),new Pair<Integer,Integer>(new Integer(2),machine.NOTHING),new Pair<Integer,Integer>(new Integer(3),machine.NOTHING)))) ==> (light_color.equals(machine.red))) && ((machine.get_Traffic_light_station().apply(new Integer(16)).equals(machine.red)) ==> (light_color.equals(machine.red))) && machine.get_center_NE_available().apply(new Integer(1)).equals(true)); */
	public boolean guard_center_to_NE_railway( Integer light_color) {
		return (!machine.get_station_occupancy().apply(machine.center).equals(machine.NOTHING) && (machine.get_number_train()).compareTo(new Integer(0)) > 0 && machine.get_center_to_NE().apply(new Integer(1)).equals(machine.NOTHING) && BOOL.implication(machine.get_Traffic_light_station().apply(new Integer(16)).equals(machine.green) && machine.get_center_to_NE().equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(1),machine.NOTHING),new Pair<Integer,Integer>(new Integer(2),machine.NOTHING),new Pair<Integer,Integer>(new Integer(3),machine.NOTHING))),light_color.equals(machine.red)) && BOOL.implication(machine.get_Traffic_light_station().apply(new Integer(16)).equals(machine.red),light_color.equals(machine.red)) && machine.get_center_NE_available().apply(new Integer(1)).equals(true));
	}

	/*@ 
		requires guard_center_to_NE_railway(light_color);
	 also
		requires !guard_center_to_NE_railway(light_color);
		assignable \nothing;
		ensures true; */
	public void run_center_to_NE_railway( Integer light_color){
		if(guard_center_to_NE_railway(light_color)) {
			BRelation<Integer,Integer> center_to_NE_tmp = machine.get_center_to_NE();
			BRelation<Integer,Integer> station_occupancy_tmp = machine.get_station_occupancy();
			BRelation<Integer,Integer> rail_tmp = machine.get_rail();
			BRelation<Integer,Integer> Traffic_light_station_tmp = machine.get_Traffic_light_station();

			machine.set_center_to_NE((center_to_NE_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,station_occupancy_tmp.apply(machine.center))))));
			machine.set_station_occupancy((station_occupancy_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.center,machine.NOTHING)))));
			machine.set_Traffic_light_station((Traffic_light_station_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(16,light_color),new Pair<Integer,Integer>(18,light_color)))));

			System.out.println("center_to_NE_railway executed light_color: " + light_color + " ");
		}
	}

}
