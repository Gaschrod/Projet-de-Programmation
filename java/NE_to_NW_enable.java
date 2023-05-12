

public class NE_to_NW_enable{
	/*@ spec_public */ private Raffinement2 machine; // reference to the machine 

	/*@ 
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public NE_to_NW_enable(Raffinement2 m) {
		this.machine = m;
	}

	/*@ 
		requires true;
 		assignable \nothing;
		ensures \result <==> machine.get_NW_NE_available().apply(new Integer(2)).equals(false); */
	public boolean guard_NE_to_NW_enable() {
		return machine.get_NW_NE_available().apply(new Integer(2)).equals(false);
	}

	/*@ 
		requires guard_NE_to_NW_enable();
		ensures guard_NE_to_NW_enable() &&  machine.get_NW_NE_available().equals(\old((machine.get_NW_NE_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,true)))))) &&  machine.get_center_NE_available().equals(\old((machine.get_center_NE_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))))) &&  machine.get_NE_S_available().equals(\old((machine.get_NE_S_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))))); 
	 also
		requires !guard_NE_to_NW_enable();
		assignable \nothing;
		ensures true; */
	public void run_NE_to_NW_enable(){
		if(guard_NE_to_NW_enable()) {
			BRelation<Integer,Boolean> NW_NE_available_tmp = machine.get_NW_NE_available();
			BRelation<Integer,Boolean> center_NE_available_tmp = machine.get_center_NE_available();
			BRelation<Integer,Boolean> NE_S_available_tmp = machine.get_NE_S_available();

			machine.set_NW_NE_available((NW_NE_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,true)))));
			machine.set_center_NE_available((center_NE_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))));
			machine.set_NE_S_available((NE_S_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))));

			System.out.println("NE_to_NW_enable executed ");
		}
	}

}
