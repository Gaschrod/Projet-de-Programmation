public class SW_to_transit_enable{
	/*@ spec_public */ private Raffinement2 machine; // reference to the machine 

	/*@ requires true;
		assignable \everything;
		ensures this.machine == m; */
	public SW_to_transit_enable(Raffinement2 m) {
		this.machine = m;
	}

	/*@ requires true;
 		assignable \nothing;
		ensures \result <==> machine.get_SW_transit_available().apply(new Integer(1)).equals(false); */
	public boolean guard_SW_to_transit_enable() {
		return machine.get_SW_transit_available().apply(new Integer(1)).equals(false);
	}

	/*@ requires guard_SW_to_transit_enable();
		ensures guard_SW_to_transit_enable() &&  machine.get_SW_transit_available().equals(\old((machine.get_SW_transit_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,true)))))) &&  machine.get_NW_SW_available().equals(\old((machine.get_NW_SW_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))))) &&  machine.get_SW_S_available().equals(\old((machine.get_SW_S_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))))); 
	 also
		requires !guard_SW_to_transit_enable();
		assignable \nothing;
		ensures true; */
	public void run_SW_to_transit_enable(){
		if(guard_SW_to_transit_enable()) {
			BRelation<Integer,Boolean> SW_transit_available_tmp = machine.get_SW_transit_available();
			BRelation<Integer,Boolean> NW_SW_available_tmp = machine.get_NW_SW_available();
			BRelation<Integer,Boolean> SW_S_available_tmp = machine.get_SW_S_available();

			machine.set_SW_transit_available((SW_transit_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,true)))));
			machine.set_NW_SW_available((NW_SW_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))));
			machine.set_SW_S_available((SW_S_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))));

			System.out.println("SW_to_transit_enable executed ");
		}
	}

}
