public class S_to_center_enable{
	/*@ spec_public */ private Raffinement2 machine; // reference to the machine 

	/*@ public normal_behavior
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public S_to_center_enable(Raffinement2 m) {
		this.machine = m;
	}

	/*@ public normal_behavior
		requires true;
 		assignable \nothing;
		ensures \result <==> machine.get_center_S_available().apply(new Integer(2)).equals(false); */
	public /*@ pure */ boolean guard_S_to_center_enable() {
		return machine.get_center_S_available().apply(new Integer(2)).equals(false);
	}

	/*@ public normal_behavior
		requires guard_S_to_center_enable();
		assignable machine.center_S_available, machine.transit_S_available, machine.SW_S_available, machine.S_SE_available, machine.NE_S_available;
		ensures guard_S_to_center_enable() &&  machine.get_center_S_available().equals(\old((machine.get_center_S_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,true)))))) &&  machine.get_transit_S_available().equals(\old((machine.get_transit_S_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))))) &&  machine.get_SW_S_available().equals(\old((machine.get_SW_S_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))))) &&  machine.get_S_SE_available().equals(\old((machine.get_S_SE_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))))) &&  machine.get_NE_S_available().equals(\old((machine.get_NE_S_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))))); 
	 also
		requires !guard_S_to_center_enable();
		assignable \nothing;
		ensures true; */
	public void run_S_to_center_enable(){
		if(guard_S_to_center_enable()) {
			BRelation<Integer,Boolean> center_S_available_tmp = machine.get_center_S_available();
			BRelation<Integer,Boolean> transit_S_available_tmp = machine.get_transit_S_available();
			BRelation<Integer,Boolean> SW_S_available_tmp = machine.get_SW_S_available();
			BRelation<Integer,Boolean> S_SE_available_tmp = machine.get_S_SE_available();
			BRelation<Integer,Boolean> NE_S_available_tmp = machine.get_NE_S_available();

			machine.set_center_S_available((center_S_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,true)))));
			machine.set_transit_S_available((transit_S_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))));
			machine.set_SW_S_available((SW_S_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))));
			machine.set_S_SE_available((S_SE_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))));
			machine.set_NE_S_available((NE_S_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))));

			System.out.println("S_to_center_enable executed ");
		}
	}

}
