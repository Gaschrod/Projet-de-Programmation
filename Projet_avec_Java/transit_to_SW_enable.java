
public class transit_to_SW_enable{
	/*@ spec_public */ private Raffinement2 machine; // reference to the machine 

	/*@
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public transit_to_SW_enable(Raffinement2 m) {
		this.machine = m;
	}

	/*@
		requires true;
 		assignable \nothing;
		ensures \result <==> machine.get_SW_transit_available().apply(new Integer(2)).equals(false); */
	public boolean guard_transit_to_SW_enable() {
		return machine.get_SW_transit_available().apply(new Integer(2)).equals(false);
	}

	/*@
		requires guard_transit_to_SW_enable();
		ensures guard_transit_to_SW_enable() &&  machine.get_SW_transit_available().equals(\old((machine.get_SW_transit_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,true)))))) &&  machine.get_transit_S_available().equals(\old((machine.get_transit_S_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))))) &&  machine.get_transit_center_available().equals(\old((machine.get_transit_center_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))))); 
	 also
		requires !guard_transit_to_SW_enable();
		assignable \nothing;
		ensures true; */
	public void run_transit_to_SW_enable(){
		if(guard_transit_to_SW_enable()) {
			BRelation<Integer,Boolean> SW_transit_available_tmp = machine.get_SW_transit_available();
			BRelation<Integer,Boolean> transit_S_available_tmp = machine.get_transit_S_available();
			BRelation<Integer,Boolean> transit_center_available_tmp = machine.get_transit_center_available();

			machine.set_SW_transit_available((SW_transit_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,true)))));
			machine.set_transit_S_available((transit_S_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))));
			machine.set_transit_center_available((transit_center_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))));

			System.out.println("transit_to_SW_enable executed ");
		}
	}

}
