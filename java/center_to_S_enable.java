

public class center_to_S_enable{
	/*@ spec_public */ private Raffinement2 machine; // reference to the machine 

	/*@ 
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public center_to_S_enable(Raffinement2 m) {
		this.machine = m;
	}

	/*@ 
		requires true;
 		assignable \nothing;
		ensures \result <==> machine.get_center_S_available().apply(new Integer(1)).equals(false); */
	public boolean guard_center_to_S_enable() {
		return machine.get_center_S_available().apply(new Integer(1)).equals(false);
	}

	/*@ 
		requires guard_center_to_S_enable();
		ensures guard_center_to_S_enable() &&  machine.get_center_S_available().equals(\old((machine.get_center_S_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,true)))))) &&  machine.get_transit_center_available().equals(\old((machine.get_transit_center_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))))) &&  machine.get_NW_center_available().equals(\old((machine.get_NW_center_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))))) &&  machine.get_center_NE_available().equals(\old((machine.get_center_NE_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))))); 
	 also
		requires !guard_center_to_S_enable();
		assignable \nothing;
		ensures true; */
	public void run_center_to_S_enable(){
		if(guard_center_to_S_enable()) {
			BRelation<Integer,Boolean> center_S_available_tmp = machine.get_center_S_available();
			BRelation<Integer,Boolean> transit_center_available_tmp = machine.get_transit_center_available();
			BRelation<Integer,Boolean> NW_center_available_tmp = machine.get_NW_center_available();
			BRelation<Integer,Boolean> center_NE_available_tmp = machine.get_center_NE_available();

			machine.set_center_S_available((center_S_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,true)))));
			machine.set_transit_center_available((transit_center_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))));
			machine.set_NW_center_available((NW_center_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))));
			machine.set_center_NE_available((center_NE_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))));

			System.out.println("center_to_S_enable executed ");
		}
	}

}
