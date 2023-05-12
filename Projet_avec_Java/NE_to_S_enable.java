public class NE_to_S_enable{
	/*@ spec_public */ private Raffinement2 machine; // reference to the machine 

	/*@ 
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public NE_to_S_enable(Raffinement2 m) {
		this.machine = m;
	}

	/*@ 
		requires true;
 		assignable \nothing;
		ensures \result <==> machine.get_NE_S_available().apply(new Integer(1)).equals(false); */
	public boolean guard_NE_to_S_enable() {
		return machine.get_NE_S_available().apply(new Integer(1)).equals(false);
	}

	/*@ 
		requires guard_NE_to_S_enable();
		ensures guard_NE_to_S_enable() &&  machine.get_NE_S_available().equals(\old((machine.get_NE_S_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,true)))))) &&  machine.get_NW_NE_available().equals(\old((machine.get_NW_NE_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))))) &&  machine.get_center_NE_available().equals(\old((machine.get_center_NE_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))))); 
	 also
		requires !guard_NE_to_S_enable();
		assignable \nothing;
		ensures true; */
	public void run_NE_to_S_enable(){
		if(guard_NE_to_S_enable()) {
			BRelation<Integer,Boolean> NE_S_available_tmp = machine.get_NE_S_available();
			BRelation<Integer,Boolean> NW_NE_available_tmp = machine.get_NW_NE_available();
			BRelation<Integer,Boolean> center_NE_available_tmp = machine.get_center_NE_available();

			machine.set_NE_S_available((NE_S_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,true)))));
			machine.set_NW_NE_available((NW_NE_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))));
			machine.set_center_NE_available((center_NE_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))));

			System.out.println("NE_to_S_enable executed ");
		}
	}

}
