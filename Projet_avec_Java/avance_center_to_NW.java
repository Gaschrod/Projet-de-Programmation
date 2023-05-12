public class avance_center_to_NW{
	/*@ spec_public */ private Raffinement2 machine; // reference to the machine 

	/*@ requires true;
		assignable \everything;
		ensures this.machine == m; */
	public avance_center_to_NW(Raffinement2 m) {
		this.machine = m;
	}

	/*@ requires true;
 		assignable \nothing;
		ensures \result <==> (machine.Train.has(train) && !train.equals(machine.NOTHING) && new BSet<Integer>(machine.get_NW_to_center().apply(new Integer(1)),machine.get_NW_to_center().apply(new Integer(2)),machine.get_NW_to_center().apply(new Integer(3))).has(train) && ((machine.get_NW_to_center().apply(new Integer(1)).equals(machine.NOTHING)) ==> (first.equals(machine.get_NW_to_center().apply(new Integer(2))) && second.equals(machine.get_NW_to_center().apply(new Integer(3))) && third.equals(machine.NOTHING) && arrival_station.equals(machine.get_station_occupancy().apply(machine.NW)))) && ((!machine.get_NW_to_center().apply(new Integer(1)).equals(machine.NOTHING)) ==> (first.equals(machine.get_NW_to_center().apply(new Integer(2))) && second.equals(machine.get_NW_to_center().apply(new Integer(3))) && third.equals(machine.NOTHING) && arrival_station.equals(machine.get_NW_to_center().apply(new Integer(1))))) && ((machine.get_NW_to_center().apply(new Integer(3)).equals(train)) ==> (machine.get_station_occupancy().apply(machine.NW).equals(machine.NOTHING))) && ((!machine.get_NW_to_center().apply(new Integer(1)).equals(machine.NOTHING)) ==> (rail_value.equals(machine.NOTRAIN) && light_color.equals(machine.green))) && ((!machine.get_NW_to_center().apply(new Integer(2)).equals(machine.NOTHING)) ==> (rail_value.equals(machine.BUSY) && light_color.equals(machine.red))) && ((!machine.get_NW_to_center().apply(new Integer(3)).equals(machine.NOTHING)) ==> (rail_value.equals(machine.BUSY) && light_color.equals(machine.red))) && machine.get_stop_in_2().equals(false) && ((!machine.get_NW_to_center().apply(new Integer(1)).equals(machine.NOTHING)) ==> (machine.get_NW_center_available().apply(new Integer(2)).equals(true)))); */
	public boolean guard_avance_center_to_NW( Integer second, Integer third, Integer arrival_station, Integer first, Integer train, Integer rail_value, Integer light_color) {
		return (machine.Train.has(train) && !train.equals(machine.NOTHING) && new BSet<Integer>(machine.get_NW_to_center().apply(new Integer(1)),machine.get_NW_to_center().apply(new Integer(2)),machine.get_NW_to_center().apply(new Integer(3))).has(train) && BOOL.implication(machine.get_NW_to_center().apply(new Integer(1)).equals(machine.NOTHING),first.equals(machine.get_NW_to_center().apply(new Integer(2))) && second.equals(machine.get_NW_to_center().apply(new Integer(3))) && third.equals(machine.NOTHING) && arrival_station.equals(machine.get_station_occupancy().apply(machine.NW))) && BOOL.implication(!machine.get_NW_to_center().apply(new Integer(1)).equals(machine.NOTHING),first.equals(machine.get_NW_to_center().apply(new Integer(2))) && second.equals(machine.get_NW_to_center().apply(new Integer(3))) && third.equals(machine.NOTHING) && arrival_station.equals(machine.get_NW_to_center().apply(new Integer(1)))) && BOOL.implication(machine.get_NW_to_center().apply(new Integer(3)).equals(train),machine.get_station_occupancy().apply(machine.NW).equals(machine.NOTHING)) && BOOL.implication(!machine.get_NW_to_center().apply(new Integer(1)).equals(machine.NOTHING),rail_value.equals(machine.NOTRAIN) && light_color.equals(machine.green)) && BOOL.implication(!machine.get_NW_to_center().apply(new Integer(2)).equals(machine.NOTHING),rail_value.equals(machine.BUSY) && light_color.equals(machine.red)) && BOOL.implication(!machine.get_NW_to_center().apply(new Integer(3)).equals(machine.NOTHING),rail_value.equals(machine.BUSY) && light_color.equals(machine.red)) && machine.get_stop_in_2().equals(false) && BOOL.implication(!machine.get_NW_to_center().apply(new Integer(1)).equals(machine.NOTHING),machine.get_NW_center_available().apply(new Integer(2)).equals(true)));
	}

	/*@ requires guard_avance_center_to_NW(second,third,arrival_station,first,train,rail_value,light_color);
		ensures guard_avance_center_to_NW(second,third,arrival_station,first,train,rail_value,light_color) &&  machine.get_NW_to_center().equals(\old(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,first),new Pair<Integer,Integer>(2,second),new Pair<Integer,Integer>(3,third)))) &&  machine.get_station_occupancy().equals(\old((machine.get_station_occupancy().override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.NW,arrival_station)))))) &&  machine.get_rail().equals(\old((machine.get_rail().override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,rail_value)))))) &&  machine.get_Traffic_light_station().equals(\old((machine.get_Traffic_light_station().override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(10,light_color),new Pair<Integer,Integer>(13,light_color))))));
	 also
		requires !guard_avance_center_to_NW(second,third,arrival_station,first,train,rail_value,light_color);
		assignable \nothing;
		ensures true; */
	public void run_avance_center_to_NW( Integer second, Integer third, Integer arrival_station, Integer first, Integer train, Integer rail_value, Integer light_color){
		if(guard_avance_center_to_NW(second,third,arrival_station,first,train,rail_value,light_color)) {
			BRelation<Integer,Integer> NW_to_center_tmp = machine.get_NW_to_center();
			BRelation<Integer,Integer> station_occupancy_tmp = machine.get_station_occupancy();
			BRelation<Integer,Integer> rail_tmp = machine.get_rail();
			BRelation<Integer,Integer> Traffic_light_station_tmp = machine.get_Traffic_light_station();

			machine.set_NW_to_center(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,first),new Pair<Integer,Integer>(2,second),new Pair<Integer,Integer>(3,third)));
			machine.set_station_occupancy((station_occupancy_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(machine.NW,arrival_station)))));
			machine.set_rail((rail_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,rail_value)))));
			machine.set_Traffic_light_station((Traffic_light_station_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(10,light_color),new Pair<Integer,Integer>(13,light_color)))));

			System.out.println("avance_center_to_NW executed second: " + second + " third: " + third + " arrival_station: " + arrival_station + " first: " + first + " train: " + train + " rail_value: " + rail_value + " light_color: " + light_color + " ");
		}
	}

}
