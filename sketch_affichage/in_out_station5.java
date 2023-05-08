package InfoTraffic_sequential; 

import eventb_prelude.*;
import Util.Utilities;

public class in_out_station5{
	/*@ spec_public */ private Raffinement2 machine; // reference to the machine 

	/*@ 
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public in_out_station5(Raffinement2 m) {
		this.machine = m;
	}

	/*@ 
		requires true;
 		assignable \nothing;
		ensures \result <==> (machine.get_secondary_occupancy().apply(machine.station5).equals(machine.NOTHING) && !machine.get_S_to_SE().apply(new Integer(2)).equals(machine.NOTHING) || !machine.get_secondary_occupancy().apply(machine.station5).equals(machine.NOTHING) && machine.get_S_to_SE().apply(new Integer(2)).equals(machine.NOTHING) && ((!machine.get_secondary_occupancy().apply(machine.station5).equals(machine.NOTHING)) ==> (machine.get_S_to_SE().apply(new Integer(2)).equals(machine.NOTHING))) && temporary.equals(machine.get_secondary_occupancy().apply(machine.station5)) && ((machine.get_secondary_occupancy().apply(machine.station5).equals(machine.NOTHING) && machine.get_S_to_SE().apply(new Integer(1)).equals(machine.NOTHING) && machine.get_S_to_SE().apply(new Integer(3)).equals(machine.NOTHING)) ==> (rail_value.equals(machine.NOTRAIN) && light_color.equals(machine.green))) && ((!machine.get_secondary_occupancy().apply(machine.station5).equals(machine.NOTHING)) ==> (rail_value.equals(machine.BUSY) && light_color.equals(machine.red))) && ((machine.get_secondary_occupancy().apply(machine.station5).equals(machine.NOTHING) && !machine.get_S_to_SE().apply(new Integer(1)).equals(machine.NOTHING) || !machine.get_S_to_SE().apply(new Integer(3)).equals(machine.NOTHING)) ==> (rail_value.equals(machine.BUSY) && light_color.equals(machine.red))) && ((machine.get_secondary_occupancy().apply(machine.station5).equals(machine.NOTHING)) ==> (secondary_lights.equals(machine.red))) && ((!machine.get_secondary_occupancy().apply(machine.station5).equals(machine.NOTHING)) ==> (secondary_lights.equals(machine.green))) && machine.get_stop_in_5().equals(true)); */
	public boolean guard_in_out_station5( Integer temporary, Integer rail_value, Integer light_color, Integer secondary_lights) {
		return (machine.get_secondary_occupancy().apply(machine.station5).equals(machine.NOTHING) && !machine.get_S_to_SE().apply(new Integer(2)).equals(machine.NOTHING) || !machine.get_secondary_occupancy().apply(machine.station5).equals(machine.NOTHING) && machine.get_S_to_SE().apply(new Integer(2)).equals(machine.NOTHING) && BOOL.implication(!machine.get_secondary_occupancy().apply(machine.station5).equals(machine.NOTHING),machine.get_S_to_SE().apply(new Integer(2)).equals(machine.NOTHING)) && temporary.equals(machine.get_secondary_occupancy().apply(machine.station5)) && BOOL.implication(machine.get_secondary_occupancy().apply(machine.station5).equals(machine.NOTHING) && machine.get_S_to_SE().apply(new Integer(1)).equals(machine.NOTHING) && machine.get_S_to_SE().apply(new Integer(3)).equals(machine.NOTHING),rail_value.equals(machine.NOTRAIN) && light_color.equals(machine.green)) && BOOL.implication(!machine.get_secondary_occupancy().apply(machine.station5).equals(machine.NOTHING),rail_value.equals(machine.BUSY) && light_color.equals(machine.red)) && BOOL.implication(machine.get_secondary_occupancy().apply(machine.station5).equals(machine.NOTHING) && !machine.get_S_to_SE().apply(new Integer(1)).equals(machine.NOTHING) || !machine.get_S_to_SE().apply(new Integer(3)).equals(machine.NOTHING),rail_value.equals(machine.BUSY) && light_color.equals(machine.red)) && BOOL.implication(machine.get_secondary_occupancy().apply(machine.station5).equals(machine.NOTHING),secondary_lights.equals(machine.red)) && BOOL.implication(!machine.get_secondary_occupancy().apply(machine.station5).equals(machine.NOTHING),secondary_lights.equals(machine.green)) && machine.get_stop_in_5().equals(true));
	}

	/*@ 
		requires guard_in_out_station5(temporary,rail_value,light_color,secondary_lights);
		ensures guard_in_out_station5(temporary,rail_value,light_color,secondary_lights) &&  machine.get_secondary_occupancy().equals(\old((machine.get_secondary_occupancy().override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.station5,machine.get_S_to_SE().apply(2))))))) &&  machine.get_S_to_SE().equals(\old((machine.get_S_to_SE().override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,temporary)))))) &&  machine.get_rail().equals(\old((machine.get_rail().override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(5,rail_value)))))) &&  machine.get_Traffic_light_station().equals(\old((machine.get_Traffic_light_station().override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(5,secondary_lights),new Pair<Integer,Integer>(24,light_color),new Pair<Integer,Integer>(25,light_color)))))); 
	 also
		requires !guard_in_out_station5(temporary,rail_value,light_color,secondary_lights);
		assignable \nothing;
		ensures true; */
	public void run_in_out_station5( Integer temporary, Integer rail_value, Integer light_color, Integer secondary_lights){
		if(guard_in_out_station5(temporary,rail_value,light_color,secondary_lights)) {
			BRelation<Integer,Integer> secondary_occupancy_tmp = machine.get_secondary_occupancy();
			BRelation<Integer,Integer> S_to_SE_tmp = machine.get_S_to_SE();
			BRelation<Integer,Integer> rail_tmp = machine.get_rail();
			BRelation<Integer,Integer> Traffic_light_station_tmp = machine.get_Traffic_light_station();

			machine.set_secondary_occupancy((secondary_occupancy_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.station5,S_to_SE_tmp.apply(2))))));
			machine.set_S_to_SE((S_to_SE_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,temporary)))));
			machine.set_rail((rail_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(5,rail_value)))));
			machine.set_Traffic_light_station((Traffic_light_station_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(5,secondary_lights),new Pair<Integer,Integer>(24,light_color),new Pair<Integer,Integer>(25,light_color)))));

			System.out.println("in_out_station5 executed temporary: " + temporary + " rail_value: " + rail_value + " light_color: " + light_color + " secondary_lights: " + secondary_lights + " ");
		}
	}

}
