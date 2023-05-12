
public class NW_to_NE_enable{
	/*@ spec_public */ private Raffinement2 machine; // reference to the machine 

	/*@ 
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public NW_to_NE_enable(Raffinement2 m) {
		this.machine = m;
	}

	/*@ 
		requires true;
 		assignable \nothing;
		ensures \result <==> machine.get_NW_NE_available().apply(new Integer(2)).equals(false); */
	public boolean guard_NW_to_NE_enable() {
		return machine.get_NW_NE_available().apply(new Integer(2)).equals(false);
	}

	/*@ 
		requires guard_NW_to_NE_enable();
	 also
		requires !guard_NW_to_NE_enable();
		assignable \nothing;
		ensures true; */
	public void run_NW_to_NE_enable(){
		if(guard_NW_to_NE_enable()) {
			BRelation<Integer,Boolean> NW_NE_available_tmp = machine.get_NW_NE_available();
			BRelation<Integer,Boolean> NW_SW_available_tmp = machine.get_NW_SW_available();
			BRelation<Integer,Boolean> NW_center_available_tmp = machine.get_NW_center_available();

			machine.set_NW_NE_available((NW_NE_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,true)))));
			machine.set_NW_SW_available((NW_SW_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))));
			machine.set_NW_center_available((NW_center_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))));

			System.out.println("NW_to_NE_enable executed ");
		}
	}

}
