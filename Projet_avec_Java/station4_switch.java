
public class station4_switch{
	/*@ spec_public */ private Raffinement2 machine; // reference to the machine 

	/*@ public normal_behavior
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public station4_switch(Raffinement2 m) {
		this.machine = m;
	}

	/*@ public normal_behavior
		requires true;
 		assignable \nothing;
		ensures \result <==> (BOOL.instance.has(change_value) && ((machine.get_stop_in_4().equals(true)) ==> (change_value.equals(false))) && ((machine.get_stop_in_4().equals(false)) ==> (change_value.equals(true)))); */
	public /*@ pure */ boolean guard_station4_switch( Boolean change_value) {
		return (BOOL.instance.has(change_value) && BOOL.implication(machine.get_stop_in_4().equals(true),change_value.equals(false)) && BOOL.implication(machine.get_stop_in_4().equals(false),change_value.equals(true)));
	}

	/*@ public normal_behavior
		requires guard_station4_switch(change_value);
		assignable machine.stop_in_4;
		ensures guard_station4_switch(change_value) &&  machine.get_stop_in_4() == \old(change_value); 
	 also
		requires !guard_station4_switch(change_value);
		assignable \nothing;
		ensures true; */
	public void run_station4_switch( Boolean change_value){
		if(guard_station4_switch(change_value)) {
			Boolean stop_in_4_tmp = machine.get_stop_in_4();

			machine.set_stop_in_4(change_value);

			System.out.println("station4_switch executed change_value: " + change_value + " ");
		}
	}

}
