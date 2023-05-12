
public class NW_to_center_enable{
	/*@ spec_public */ private Raffinement2 machine; // reference to the machine 

	/*@ 
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public NW_to_center_enable(Raffinement2 m) {
		this.machine = m;
	}

	/*@ 
		requires true;
 		assignable \nothing;
		ensures \result <==> machine.get_NW_center_available().apply(new Integer(2)).equals(false); */
	public boolean guard_NW_to_center_enable() {
		return machine.get_NW_center_available().apply(new Integer(2)).equals(false);
	}

	/*@ 
		requires guard_NW_to_center_enable();
		ensures guard_NW_to_center_enable() &&  machine.get_NW_center_available().equals(\old((machine.get_NW_center_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,true)))))) &&  machine.get_NW_NE_available().equals(\old((machine.get_NW_NE_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))))) &&  machine.get_NW_SW_available().equals(\old((machine.get_NW_SW_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))))); 
	 also
		requires !guard_NW_to_center_enable();
		assignable \nothing;
		ensures true; */
	public void run_NW_to_center_enable(){
		if(guard_NW_to_center_enable()) {
			BRelation<Integer,Boolean> NW_center_available_tmp = machine.get_NW_center_available();
			BRelation<Integer,Boolean> NW_NE_available_tmp = machine.get_NW_NE_available();
			BRelation<Integer,Boolean> NW_SW_available_tmp = machine.get_NW_SW_available();

			machine.set_NW_center_available((NW_center_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,true)))));
			machine.set_NW_NE_available((NW_NE_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))));
			machine.set_NW_SW_available((NW_SW_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))));

			System.out.println("NW_to_center_enable executed ");
		}
	}

}
