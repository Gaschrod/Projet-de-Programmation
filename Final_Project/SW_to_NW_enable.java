public class SW_to_NW_enable{
	/*@ spec_public */ private Raffinement2 machine; // reference to the machine 

	/*@ public normal_behavior
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public SW_to_NW_enable(Raffinement2 m) {
		this.machine = m;
	}

	/*@ public normal_behavior
		requires true;
 		assignable \nothing;
		ensures \result <==> machine.get_NW_SW_available().apply(new Integer(2)).equals(false); */
	public boolean guard_SW_to_NW_enable() {
		return machine.get_NW_SW_available().apply(new Integer(2)).equals(false);
	}

	/*@ public normal_behavior
		requires guard_SW_to_NW_enable();
		assignable machine.NW_SW_available, machine.SW_transit_available, machine.SW_S_available;
		ensures guard_SW_to_NW_enable() &&  machine.get_NW_SW_available().equals(\old((machine.get_NW_SW_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,true)))))) &&  machine.get_SW_transit_available().equals(\old((machine.get_SW_transit_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))))) &&  machine.get_SW_S_available().equals(\old((machine.get_SW_S_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))))); 
	 also
		requires !guard_SW_to_NW_enable();
		assignable \nothing;
		ensures true; */
	public void run_SW_to_NW_enable(){
		if(guard_SW_to_NW_enable()) {
			BRelation<Integer,Boolean> NW_SW_available_tmp = machine.get_NW_SW_available();
			BRelation<Integer,Boolean> SW_transit_available_tmp = machine.get_SW_transit_available();
			BRelation<Integer,Boolean> SW_S_available_tmp = machine.get_SW_S_available();

			machine.set_NW_SW_available((NW_SW_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,true)))));
			machine.set_SW_transit_available((SW_transit_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))));
			machine.set_SW_S_available((SW_S_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))));

			System.out.println("SW_to_NW_enable executed ");
		}
	}

}
