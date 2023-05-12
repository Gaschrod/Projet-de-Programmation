

public class avance_S_to_NE{
	/*@ spec_public */ private Raffinement2 machine; // reference to the machine 

	/*@ 
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public avance_S_to_NE(Raffinement2 m) {
		this.machine = m;
	}

	/*@ 
		requires true;
 		assignable \nothing;
		ensures \result <==> (machine.Train.has(train) && !train.equals(machine.NOTHING) && new BSet<Integer>(machine.get_NE_to_S().apply(new Integer(1)),machine.get_NE_to_S().apply(new Integer(2)),machine.get_NE_to_S().apply(new Integer(3))).has(train) && ((machine.get_NE_to_S().apply(new Integer(1)).equals(machine.NOTHING)) ==> (first.equals(machine.get_NE_to_S().apply(new Integer(2))) && second.equals(machine.get_NE_to_S().apply(new Integer(3))) && third.equals(machine.NOTHING) && arrival_station.equals(machine.get_station_occupancy().apply(machine.NE)))) && ((!machine.get_NE_to_S().apply(new Integer(1)).equals(machine.NOTHING)) ==> (first.equals(machine.get_NE_to_S().apply(new Integer(2))) && second.equals(machine.get_NE_to_S().apply(new Integer(3))) && third.equals(machine.NOTHING) && arrival_station.equals(machine.get_NE_to_S().apply(new Integer(1))))) && ((machine.get_NE_to_S().apply(new Integer(3)).equals(train)) ==> (machine.get_station_occupancy().apply(machine.NE).equals(machine.NOTHING))) && ((!machine.get_NE_to_S().apply(new Integer(1)).equals(machine.NOTHING)) ==> (rail_value.equals(machine.NOTRAIN) && light_color.equals(machine.green))) && ((!machine.get_NE_to_S().apply(new Integer(2)).equals(machine.NOTHING)) ==> (rail_value.equals(machine.BUSY) && light_color.equals(machine.red))) && ((!machine.get_NE_to_S().apply(new Integer(3)).equals(machine.NOTHING)) ==> (rail_value.equals(machine.BUSY) && light_color.equals(machine.red))) && machine.get_stop_in_4().equals(false) && ((!machine.get_NE_to_S().apply(new Integer(1)).equals(machine.NOTHING)) ==> (machine.get_NE_S_available().apply(new Integer(1)).equals(true)))); */
	public boolean guard_avance_S_to_NE( Integer second, Integer third, Integer arrival_station, Integer first, Integer train, Integer rail_value, Integer light_color) {
		return (machine.Train.has(train) && !train.equals(machine.NOTHING) && new BSet<Integer>(machine.get_NE_to_S().apply(new Integer(1)),machine.get_NE_to_S().apply(new Integer(2)),machine.get_NE_to_S().apply(new Integer(3))).has(train) && BOOL.implication(machine.get_NE_to_S().apply(new Integer(1)).equals(machine.NOTHING),first.equals(machine.get_NE_to_S().apply(new Integer(2))) && second.equals(machine.get_NE_to_S().apply(new Integer(3))) && third.equals(machine.NOTHING) && arrival_station.equals(machine.get_station_occupancy().apply(machine.NE))) && BOOL.implication(!machine.get_NE_to_S().apply(new Integer(1)).equals(machine.NOTHING),first.equals(machine.get_NE_to_S().apply(new Integer(2))) && second.equals(machine.get_NE_to_S().apply(new Integer(3))) && third.equals(machine.NOTHING) && arrival_station.equals(machine.get_NE_to_S().apply(new Integer(1)))) && BOOL.implication(machine.get_NE_to_S().apply(new Integer(3)).equals(train),machine.get_station_occupancy().apply(machine.NE).equals(machine.NOTHING)) && BOOL.implication(!machine.get_NE_to_S().apply(new Integer(1)).equals(machine.NOTHING),rail_value.equals(machine.NOTRAIN) && light_color.equals(machine.green)) && BOOL.implication(!machine.get_NE_to_S().apply(new Integer(2)).equals(machine.NOTHING),rail_value.equals(machine.BUSY) && light_color.equals(machine.red)) && BOOL.implication(!machine.get_NE_to_S().apply(new Integer(3)).equals(machine.NOTHING),rail_value.equals(machine.BUSY) && light_color.equals(machine.red)) && machine.get_stop_in_4().equals(false) && BOOL.implication(!machine.get_NE_to_S().apply(new Integer(1)).equals(machine.NOTHING),machine.get_NE_S_available().apply(new Integer(1)).equals(true)));
	}

	/*@ 
		requires guard_avance_S_to_NE(second,third,arrival_station,first,train,rail_value,light_color);
		ensures guard_avance_S_to_NE(second,third,arrival_station,first,train,rail_value,light_color) &&  machine.get_NE_to_S().equals(\old(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,first),new Pair<Integer,Integer>(2,second),new Pair<Integer,Integer>(3,third)))) &&  machine.get_station_occupancy().equals(\old((machine.get_station_occupancy().override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.S,arrival_station)))))) &&  machine.get_rail().equals(\old((machine.get_rail().override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(4,rail_value)))))) &&  machine.get_Traffic_light_station().equals(\old((machine.get_Traffic_light_station().override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(19,light_color),new Pair<Integer,Integer>(20,light_color)))))); 
	 also
		requires !guard_avance_S_to_NE(second,third,arrival_station,first,train,rail_value,light_color);
		assignable \nothing;
		ensures true; */
	public void run_avance_S_to_NE( Integer second, Integer third, Integer arrival_station, Integer first, Integer train, Integer rail_value, Integer light_color){
		if(guard_avance_S_to_NE(second,third,arrival_station,first,train,rail_value,light_color)) {
			BRelation<Integer,Integer> NE_to_S_tmp = machine.get_NE_to_S();
			BRelation<Integer,Integer> station_occupancy_tmp = machine.get_station_occupancy();
			BRelation<Integer,Integer> rail_tmp = machine.get_rail();
			BRelation<Integer,Integer> Traffic_light_station_tmp = machine.get_Traffic_light_station();

			machine.set_NE_to_S(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,first),new Pair<Integer,Integer>(2,second),new Pair<Integer,Integer>(3,third)));
			machine.set_station_occupancy((station_occupancy_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.S,arrival_station)))));
			machine.set_rail((rail_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(4,rail_value)))));
			machine.set_Traffic_light_station((Traffic_light_station_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(19,light_color),new Pair<Integer,Integer>(20,light_color)))));

			System.out.println("avance_S_to_NE executed second: " + second + " third: " + third + " arrival_station: " + arrival_station + " first: " + first + " train: " + train + " rail_value: " + rail_value + " light_color: " + light_color + " ");
		}
	}

}
