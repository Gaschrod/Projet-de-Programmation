
public class NW_to_SW_enable{
	/*@ spec_public */ private Raffinement2 machine; // reference to the machine 

	/*@ 
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public NW_to_SW_enable(Raffinement2 m) {
		this.machine = m;
	}

	/*@ 
		requires true;
 		assignable \nothing;
		ensures \result <==> machine.get_NW_SW_available().apply(new Integer(1)).equals(false); */
	public boolean guard_NW_to_SW_enable() {
		return machine.get_NW_SW_available().apply(new Integer(1)).equals(false);
	}

	/*@ 
		requires guard_NW_to_SW_enable();
		ensures guard_NW_to_SW_enable() &&  machine.get_NW_SW_available().equals(\old((machine.get_NW_SW_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,true)))))) &&  machine.get_NW_NE_available().equals(\old((machine.get_NW_NE_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))))); 
	 also
		requires !guard_NW_to_SW_enable();
		assignable \nothing;
		ensures true; */
	public void run_NW_to_SW_enable(){
		if(guard_NW_to_SW_enable()) {
			BRelation<Integer,Boolean> NW_SW_available_tmp = machine.get_NW_SW_available();
			BRelation<Integer,Boolean> NW_NE_available_tmp = machine.get_NW_NE_available();

			machine.set_NW_SW_available((NW_SW_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,true)))));
			machine.set_NW_NE_available((NW_NE_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))));

			System.out.println("NW_to_SW_enable executed ");
		}
	}

}
