package InfoTraffic_sequential; 

import eventb_prelude.*;
import Util.Utilities;

public class S_to_SW_enable{
	/*@ spec_public */ private Raffinement2 machine; // reference to the machine 

	/*@ 
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public S_to_SW_enable(Raffinement2 m) {
		this.machine = m;
	}

	/*@ 
		requires true;
 		assignable \nothing;
		ensures \result <==> machine.get_SW_S_available().apply(new Integer(1)).equals(false); */
	public boolean guard_S_to_SW_enable() {
		return machine.get_SW_S_available().apply(new Integer(1)).equals(false);
	}

	/*@ 
		requires guard_S_to_SW_enable();
		ensures guard_S_to_SW_enable() &&  machine.get_SW_S_available().equals(\old((machine.get_SW_S_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,true)))))) &&  machine.get_transit_S_available().equals(\old((machine.get_transit_S_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))))) &&  machine.get_center_S_available().equals(\old((machine.get_center_S_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))))) &&  machine.get_NE_S_available().equals(\old((machine.get_NE_S_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))))) &&  machine.get_S_SE_available().equals(\old((machine.get_S_SE_available().override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))))); 
	 also
		requires !guard_S_to_SW_enable();
		assignable \nothing;
		ensures true; */
	public void run_S_to_SW_enable(){
		if(guard_S_to_SW_enable()) {
			BRelation<Integer,Boolean> SW_S_available_tmp = machine.get_SW_S_available();
			BRelation<Integer,Boolean> transit_S_available_tmp = machine.get_transit_S_available();
			BRelation<Integer,Boolean> center_S_available_tmp = machine.get_center_S_available();
			BRelation<Integer,Boolean> NE_S_available_tmp = machine.get_NE_S_available();
			BRelation<Integer,Boolean> S_SE_available_tmp = machine.get_S_SE_available();

			machine.set_SW_S_available((SW_S_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,true)))));
			machine.set_transit_S_available((transit_S_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))));
			machine.set_center_S_available((center_S_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))));
			machine.set_NE_S_available((NE_S_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(2,false)))));
			machine.set_S_SE_available((S_SE_available_tmp.override(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false)))));

			System.out.println("S_to_SW_enable executed ");
		}
	}

}
