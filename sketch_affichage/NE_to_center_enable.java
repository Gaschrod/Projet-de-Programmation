

public class NE_to_center_enable{
	/*@ spec_public */ private Raffinement2 machine; // reference to the machine 

	/*@ public normal_behavior
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public NE_to_center_enable(Raffinement2 m) {
		this.machine = m;
	}

	/*@ public normal_behavior
		requires true;
 		assignable \nothing;
		ensures \result <==> machine.get_center_NE_available().apply(new Integer(2)).equals(false); */
	public /*@ pure */ boolean guard_NE_to_center_enable() {
		return machine.get_center_NE_available().apply(new Integer(2)).equals(false);
	}

	/*@ public normal_behavior
		requires guard_NE_to_center_enable();
		assignable machine.center_NE_available, machine.NW_NE_available, machine.NE_S_available;
		ensures guard_NE_to_center_enable() &&  machine.get_center_NE_available().equals(\old((machine.get_center_NE_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,true)))))) &&  machine.get_NW_NE_available().equals(\old((machine.get_NW_NE_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))))) &&  machine.get_NE_S_available().equals(\old((machine.get_NE_S_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))))); 
	 also
		requires !guard_NE_to_center_enable();
		assignable \nothing;
		ensures true; */
	public void run_NE_to_center_enable(){
		if(guard_NE_to_center_enable()) {
			BRelation<Integer,Boolean> center_NE_available_tmp = machine.get_center_NE_available();
			BRelation<Integer,Boolean> NW_NE_available_tmp = machine.get_NW_NE_available();
			BRelation<Integer,Boolean> NE_S_available_tmp = machine.get_NE_S_available();

			machine.set_center_NE_available((center_NE_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,true)))));
			machine.set_NW_NE_available((NW_NE_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))));
			machine.set_NE_S_available((NE_S_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))));

			System.out.println("NE_to_center_enable executed ");
		}
	}

}
