import java.util.Set;
import java.util.HashSet;
public class spawn_train{
	/*@ spec_public */ private Raffinement2 machine; // reference to the machine 

	/*@ 
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public spawn_train(Raffinement2 m) {
		this.machine = m;
	}

	/*@ 
		requires true;
 		assignable \nothing;
		ensures \result <==> ((machine.get_number_train()).compareTo(new Integer(7)) < 0 && machine.Train.has(train) && !train.equals(machine.NOTHING) && machine.Main_station.has(point_of_spawn) && machine.get_station_occupancy().apply(point_of_spawn).equals(machine.NOTHING) && !machine.get_station_occupancy().range().has(train)); */
	public boolean guard_spawn_train( Integer point_of_spawn, Integer train) {

		return (((machine.get_number_train()).compareTo(new Integer(7)) < 0) && ((machine.Train.contains(train) && !train.equals(machine.NOTHING))) && (machine.Main_station.contains(point_of_spawn)) && (machine.Main_station.contains(point_of_spawn)) && (machine.get_station_occupancy().apply(point_of_spawn).equals(machine.NOTHING)));

		//(!Raffinement2.secondaryStation.contains(train))
	}

	/*@ 
		requires guard_spawn_train(point_of_spawn,train);
		ensures guard_spawn_train(point_of_spawn,train) &&  machine.get_number_train() == \old(new Integer(machine.get_number_train() + 1)) &&  machine.get_station_occupancy().equals(\old((machine.get_station_occupancy().override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(point_of_spawn,train)))))); 
	 also
		requires !guard_spawn_train(point_of_spawn,train);
		assignable \nothing;
		ensures true; */
	public void run_spawn_train( Integer point_of_spawn, Integer train){
		if(guard_spawn_train(point_of_spawn,train)) {
			Integer number_train_tmp = machine.get_number_train();
			BRelation<Integer,Integer> station_occupancy_tmp = machine.get_station_occupancy();

			machine.set_number_train(new Integer(number_train_tmp + 1));
			machine.set_station_occupancy((station_occupancy_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(point_of_spawn,train)))));

		}
	}

}