

public class station5_switch{
	/*@ spec_public */ private Raffinement2 machine; // reference to the machine 

	/*@ public normal_behavior
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public station5_switch(Raffinement2 m) {
		this.machine = m;
	}

	/*@ public normal_behavior
		requires true;
 		assignable \nothing;
		ensures \result <==> (BOOL.instance.has(change_value) && ((machine.get_stop_in_5().equals(true)) ==> (change_value.equals(false))) && ((machine.get_stop_in_5().equals(false)) ==> (change_value.equals(true)))); */
	public /*@ pure */ boolean guard_station5_switch( Boolean change_value) {
		return (BOOL.instance.has(change_value) && BOOL.implication(machine.get_stop_in_5().equals(true),change_value.equals(false)) && BOOL.implication(machine.get_stop_in_5().equals(false),change_value.equals(true)));
	}

	/*@ public normal_behavior
		requires guard_station5_switch(change_value);
		assignable machine.stop_in_5;
		ensures guard_station5_switch(change_value) &&  machine.get_stop_in_5() == \old(change_value); 
	 also
		requires !guard_station5_switch(change_value);
		assignable \nothing;
		ensures true; */
	public void run_station5_switch( Boolean change_value){
		if(guard_station5_switch(change_value)) {
			Boolean stop_in_5_tmp = machine.get_stop_in_5();

			machine.set_stop_in_5(change_value);

			System.out.println("station5_switch executed change_value: " + change_value + " ");
		}
	}

}
