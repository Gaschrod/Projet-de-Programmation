import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Raffinement2{
	private static final Integer max_integer = Utilities.max_integer;
	private static final Integer min_integer = Utilities.min_integer;

	SE_to_S_railway evt_SE_to_S_railway = new SE_to_S_railway(this);
	SW_to_NW_enable evt_SW_to_NW_enable = new SW_to_NW_enable(this);
	center_to_NW_railway evt_center_to_NW_railway = new center_to_NW_railway(this);
	NE_to_S_railway evt_NE_to_S_railway = new NE_to_S_railway(this);
	center_to_NE_enable evt_center_to_NE_enable = new center_to_NE_enable(this);
	S_to_SE_railway evt_S_to_SE_railway = new S_to_SE_railway(this);
	avance_S_to_NE evt_avance_S_to_NE = new avance_S_to_NE(this);
	avance_transit_to_S evt_avance_transit_to_S = new avance_transit_to_S(this);
	avance_center_to_NE evt_avance_center_to_NE = new avance_center_to_NE(this);
	avance_NE_to_S evt_avance_NE_to_S = new avance_NE_to_S(this);
	transit_to_S_railway evt_transit_to_S_railway = new transit_to_S_railway(this);
	NE_to_center_railway evt_NE_to_center_railway = new NE_to_center_railway(this);
	NE_to_center_enable evt_NE_to_center_enable = new NE_to_center_enable(this);
	in_out_station8 evt_in_out_station8 = new in_out_station8(this);
	SW_to_S_enable evt_SW_to_S_enable = new SW_to_S_enable(this);
	in_out_station7 evt_in_out_station7 = new in_out_station7(this);
	in_out_station6 evt_in_out_station6 = new in_out_station6(this);
	in_out_station5 evt_in_out_station5 = new in_out_station5(this);
	in_out_station4 evt_in_out_station4 = new in_out_station4(this);
	in_out_station3 evt_in_out_station3 = new in_out_station3(this);
	NW_to_NE_railway evt_NW_to_NE_railway = new NW_to_NE_railway(this);
	avance_center_to_NW evt_avance_center_to_NW = new avance_center_to_NW(this);
	in_out_station2 evt_in_out_station2 = new in_out_station2(this);
	NE_to_S_enable evt_NE_to_S_enable = new NE_to_S_enable(this);
	in_out_station1 evt_in_out_station1 = new in_out_station1(this);
	station8_switch evt_station8_switch = new station8_switch(this);
	S_to_center_enable evt_S_to_center_enable = new S_to_center_enable(this);
	transit_to_SW_enable evt_transit_to_SW_enable = new transit_to_SW_enable(this);
	SW_to_transit_enable evt_SW_to_transit_enable = new SW_to_transit_enable(this);
	transit_to_S_enable evt_transit_to_S_enable = new transit_to_S_enable(this);
	NW_to_SW_railway evt_NW_to_SW_railway = new NW_to_SW_railway(this);
	NW_to_NE_enable evt_NW_to_NE_enable = new NW_to_NE_enable(this);
	S_to_NE_enable evt_S_to_NE_enable = new S_to_NE_enable(this);
	center_to_transit_enable evt_center_to_transit_enable = new center_to_transit_enable(this);
	NW_to_center_enable evt_NW_to_center_enable = new NW_to_center_enable(this);
	avance_NW_to_SW evt_avance_NW_to_SW = new avance_NW_to_SW(this);
	station4_switch evt_station4_switch = new station4_switch(this);
	SW_to_S_railway evt_SW_to_S_railway = new SW_to_S_railway(this);
	center_to_S_railway evt_center_to_S_railway = new center_to_S_railway(this);
	avance_transit_to_center evt_avance_transit_to_center = new avance_transit_to_center(this);
	NE_to_NW_railway evt_NE_to_NW_railway = new NE_to_NW_railway(this);
	station2_switch evt_station2_switch = new station2_switch(this);
	station6_switch evt_station6_switch = new station6_switch(this);
	avance_S_to_SE evt_avance_S_to_SE = new avance_S_to_SE(this);
	avance_S_to_center evt_avance_S_to_center = new avance_S_to_center(this);
	S_to_SW_railway evt_S_to_SW_railway = new S_to_SW_railway(this);
	avance_SW_to_transit evt_avance_SW_to_transit = new avance_SW_to_transit(this);
	S_to_transit_enable evt_S_to_transit_enable = new S_to_transit_enable(this);
	avance_SW_to_S evt_avance_SW_to_S = new avance_SW_to_S(this);
	S_to_SW_enable evt_S_to_SW_enable = new S_to_SW_enable(this);
	center_to_transit_railway evt_center_to_transit_railway = new center_to_transit_railway(this);
	avance_NW_to_center evt_avance_NW_to_center = new avance_NW_to_center(this);
	NW_to_SW_enable evt_NW_to_SW_enable = new NW_to_SW_enable(this);
	avance_S_to_SW evt_avance_S_to_SW = new avance_S_to_SW(this);
	avance_center_to_S evt_avance_center_to_S = new avance_center_to_S(this);
	transit_to_center_railway evt_transit_to_center_railway = new transit_to_center_railway(this);
	avance_NW_to_NE evt_avance_NW_to_NE = new avance_NW_to_NE(this);
	center_to_NW_enable evt_center_to_NW_enable = new center_to_NW_enable(this);
	avance_SW_to_NW evt_avance_SW_to_NW = new avance_SW_to_NW(this);
	spawn_train evt_spawn_train = new spawn_train(this);
	center_to_NE_railway evt_center_to_NE_railway = new center_to_NE_railway(this);
	avance_center_to_transit evt_avance_center_to_transit = new avance_center_to_transit(this);
	transit_to_center_enable evt_transit_to_center_enable = new transit_to_center_enable(this);
	avance_NE_to_NW evt_avance_NE_to_NW = new avance_NE_to_NW(this);
	avance_S_to_transit evt_avance_S_to_transit = new avance_S_to_transit(this);
	avance_SE_to_S evt_avance_SE_to_S = new avance_SE_to_S(this);
	S_to_transit_railway evt_S_to_transit_railway = new S_to_transit_railway(this);
	S_to_SE_enable evt_S_to_SE_enable = new S_to_SE_enable(this);
	S_to_center_railway evt_S_to_center_railway = new S_to_center_railway(this);
	station1_switch evt_station1_switch = new station1_switch(this);
	NW_to_center_railway evt_NW_to_center_railway = new NW_to_center_railway(this);
	avance_NE_to_center evt_avance_NE_to_center = new avance_NE_to_center(this);
	NE_to_NW_enable evt_NE_to_NW_enable = new NE_to_NW_enable(this);
	S_to_NE_railway evt_S_to_NE_railway = new S_to_NE_railway(this);
	SW_to_NW_railway evt_SW_to_NW_railway = new SW_to_NW_railway(this);
	avance_transit_to_SW evt_avance_transit_to_SW = new avance_transit_to_SW(this);
	station5_switch evt_station5_switch = new station5_switch(this);
	center_to_S_enable evt_center_to_S_enable = new center_to_S_enable(this);
	SW_to_transit_railway evt_SW_to_transit_railway = new SW_to_transit_railway(this);
	transit_to_SW_railway evt_transit_to_SW_railway = new transit_to_SW_railway(this);
	station3_switch evt_station3_switch = new station3_switch(this);
	station7_switch evt_station7_switch = new station7_switch(this);


	/******Set definitions******/
	public static final BSet<Integer> Train = new Enumerated(min_integer,max_integer);

	public static final BSet<Integer> Station = new Enumerated(min_integer,max_integer);

	public static final BSet<Integer> trafficlight = new Enumerated(min_integer,max_integer);

	public static final BSet<Integer> railway = new Enumerated(min_integer,max_integer);


	/******Constant definitions******/
	public static final Integer Tchou_tchou = 1;
	public static final Integer Kozma_Minin = 2;

	public static final Integer NOTHING = 0;

	public static final Integer The_Whistling_Limited = 3;

	public static final Integer The_Orient_Express = 4;

	public static final Integer The_Steamy_Express = 5;

	public static final Integer Orient_Express = 6;

	public static final Integer Thomas_the_tank = 7;

	public static final Integer S = 10;

	public static final Integer red = 8;

	public static final Set<Integer> secondaryStation = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

	public static final Integer NOTRAIN = 100;

	public static final Integer NE = 20;

	public static final Integer NW = 30;

	public static final Integer BUSY = 1000;

	public static final Integer SE = 40;

	public static final Integer SW = 50;

	public static final Integer green = 9;

	public static final Integer center = 60;

	public static final Integer station8 = 888;

	public static final Integer station4 = 444;

	public static final Integer station5 = 555;

	public static final Integer station6 = 666;

	public static final Integer station7 = 777;

	public static final Integer station1 = 111;

	public static final Integer station2 = 222;

	public static final Integer station3 = 333;

	public static final Integer transit = 70;

	public static final Set<Integer> Main_station = new HashSet<>(Arrays.asList(30,50,60,20,70,10,40));


	/******Axiom definitions******/
	/*@ public static invariant BSet.partition(Train,new BSet<Integer>(NOTHING),new BSet<Integer>(Orient_Express),new BSet<Integer>(Thomas_the_tank),new BSet<Integer>(Tchou_tchou),new BSet<Integer>(The_Steamy_Express),new BSet<Integer>(The_Orient_Express),new BSet<Integer>(The_Whistling_Limited),new BSet<Integer>(Kozma_Minin)); */
	/*@ public static invariant BSet.partition(Station,new BSet<Integer>(NW),new BSet<Integer>(SW),new BSet<Integer>(center),new BSet<Integer>(NE),new BSet<Integer>(transit),new BSet<Integer>(S),new BSet<Integer>(SE),new BSet<Integer>(station1),new BSet<Integer>(station2),new BSet<Integer>(station3),new BSet<Integer>(station4),new BSet<Integer>(station5),new BSet<Integer>(station6),new BSet<Integer>(station7),new BSet<Integer>(station8)); */
	/*@ public static invariant Main_station.isSubset(Station); */
	/*@ public static invariant Main_station.equals(new BSet<Integer>(NW,SW,center,NE,transit,S,SE)); */
	/*@ public static invariant Secondary_station.isSubset(Station); */
	/*@ public static invariant Secondary_station.equals(new BSet<Integer>(station1,station2,station3,station4,station5,station6,station7,station8)); */
	/*@ public static invariant BSet.partition(trafficlight,new BSet<Integer>(green),new BSet<Integer>(red)); */
	/*@ public static invariant BSet.partition(railway,new BSet<Integer>(NOTRAIN),new BSet<Integer>(BUSY)); */


	/******Variable definitions******/
	/*@ spec_public */ private BRelation<Integer,Integer> station_occupancy;

	/*@ spec_public */ private BRelation<Integer,Boolean> center_NE_available;

	/*@ spec_public */ private BRelation<Integer,Boolean> NE_S_available;

	/*@ spec_public */ private BRelation<Integer,Integer> NE_to_S;

	/*@ spec_public */ private BRelation<Integer,Boolean> transit_center_available;

	/*@ spec_public */ private BRelation<Integer,Boolean> NW_SW_available;

	/*@ spec_public */ private BRelation<Integer,Boolean> S_SE_available;

	/*@ spec_public */ private BRelation<Integer,Integer> transit_to_center;

	/*@ spec_public */ private BRelation<Integer,Boolean> transit_S_available;

	/*@ spec_public */ private BRelation<Integer,Integer> transit_to_S;

	/*@ spec_public */ private BRelation<Integer,Boolean> SW_S_available;

	/*@ spec_public */ private BRelation<Integer,Integer> center_to_S;

	/*@ spec_public */ private BRelation<Integer,Integer> rail;

	/*@ spec_public */ private BRelation<Integer,Boolean> SW_transit_available;

	/*@ spec_public */ private BRelation<Integer,Integer> SW_to_S;

	/*@ spec_public */ private BRelation<Integer,Integer> center_to_NE;

	/*@ spec_public */ private Boolean stop_in_1;

	/*@ spec_public */ private Boolean stop_in_2;

	/*@ spec_public */ private Boolean stop_in_3;

	/*@ spec_public */ private Boolean stop_in_4;

	/*@ spec_public */ private Boolean stop_in_5;

	/*@ spec_public */ private Boolean stop_in_6;

	/*@ spec_public */ private Boolean stop_in_7;

	/*@ spec_public */ private Boolean stop_in_8;

	/*@ spec_public */ private BRelation<Integer,Integer> S_to_SE;

	/*@ spec_public */ private BRelation<Integer,Integer> NW_to_SW;

	/*@ spec_public */ private BRelation<Integer,Integer> Traffic_light_station;

	/*@ spec_public */ private BRelation<Integer,Integer> NW_to_center;

	/*@ spec_public */ private BRelation<Integer,Integer> NW_to_NE;

	/*@ spec_public */ private BRelation<Integer,Boolean> center_S_available;

	/*@ spec_public */ private BRelation<Integer,Integer> SW_to_transit;

	/*@ spec_public */ private Integer number_train;

	/*@ spec_public */ private BRelation<Integer,Boolean> NW_center_available;

	/*@ spec_public */ private BRelation<Integer,Integer> secondary_occupancy;

	/*@ spec_public */ private BRelation<Integer,Boolean> NW_NE_available;




	/******Invariant definition******/
	/*
	@ public invariant
	 	 NW_to_NE.domain().equals(new Enumerated(new Integer(1),new Integer(3))) && NW_to_NE.range().isSubset(Train) && NW_to_NE.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(3)),Train).has(NW_to_NE) &&
	 	 NW_to_center.domain().equals(new Enumerated(new Integer(1),new Integer(3))) && NW_to_center.range().isSubset(Train) && NW_to_center.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(3)),Train).has(NW_to_center) &&
	 	 NW_to_SW.domain().equals(new Enumerated(new Integer(1),new Integer(3))) && NW_to_SW.range().isSubset(Train) && NW_to_SW.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(3)),Train).has(NW_to_SW) &&
	 	 SW_to_transit.domain().equals(new Enumerated(new Integer(1),new Integer(3))) && SW_to_transit.range().isSubset(Train) && SW_to_transit.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(3)),Train).has(SW_to_transit) &&
	 	 SW_to_S.domain().equals(new Enumerated(new Integer(1),new Integer(3))) && SW_to_S.range().isSubset(Train) && SW_to_S.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(3)),Train).has(SW_to_S) &&
	 	 center_to_NE.domain().equals(new Enumerated(new Integer(1),new Integer(3))) && center_to_NE.range().isSubset(Train) && center_to_NE.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(3)),Train).has(center_to_NE) &&
	 	 transit_to_center.domain().equals(new Enumerated(new Integer(1),new Integer(3))) && transit_to_center.range().isSubset(Train) && transit_to_center.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(3)),Train).has(transit_to_center) &&
	 	 S_to_SE.domain().equals(new Enumerated(new Integer(1),new Integer(3))) && S_to_SE.range().isSubset(Train) && S_to_SE.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(3)),Train).has(S_to_SE) &&
	 	 center_to_S.domain().equals(new Enumerated(new Integer(1),new Integer(3))) && center_to_S.range().isSubset(Train) && center_to_S.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(3)),Train).has(center_to_S) &&
	 	 transit_to_S.domain().equals(new Enumerated(new Integer(1),new Integer(3))) && transit_to_S.range().isSubset(Train) && transit_to_S.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(3)),Train).has(transit_to_S) &&
	 	 NE_to_S.domain().equals(new Enumerated(new Integer(1),new Integer(3))) && NE_to_S.range().isSubset(Train) && NE_to_S.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(3)),Train).has(NE_to_S) &&
	 	 station_occupancy.domain().equals(Main_station) && station_occupancy.range().isSubset(Train) && station_occupancy.isaFunction() && BRelation.cross(Main_station,Train).has(station_occupancy) &&
	 	(number_train).compareTo(new Integer(7)) <= 0 &&
	 	 secondary_occupancy.domain().equals(Secondary_station) && secondary_occupancy.range().isSubset(Train) && secondary_occupancy.isaFunction() && BRelation.cross(Secondary_station,Train).has(secondary_occupancy) &&
	 	 rail.domain().equals(new Enumerated(new Integer(1),new Integer(11))) && rail.range().isSubset(railway) && rail.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(11)),railway).has(rail) &&
	 	 Traffic_light_station.domain().equals(new Enumerated(new Integer(1),new Integer(31))) && Traffic_light_station.range().isSubset(trafficlight) && Traffic_light_station.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(31)),trafficlight).has(Traffic_light_station) &&
	 	BOOL.instance.has(stop_in_1) &&
	 	BOOL.instance.has(stop_in_2) &&
	 	BOOL.instance.has(stop_in_3) &&
	 	BOOL.instance.has(stop_in_4) &&
	 	BOOL.instance.has(stop_in_5) &&
	 	BOOL.instance.has(stop_in_6) &&
	 	BOOL.instance.has(stop_in_7) &&
	 	BOOL.instance.has(stop_in_8) &&
	 	 NW_NE_available.domain().equals(new Enumerated(new Integer(1),new Integer(2))) && NW_NE_available.range().isSubset(BOOL.instance) && NW_NE_available.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(2)),BOOL.instance).has(NW_NE_available) &&
	 	 NW_center_available.domain().equals(new Enumerated(new Integer(1),new Integer(2))) && NW_center_available.range().isSubset(BOOL.instance) && NW_center_available.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(2)),BOOL.instance).has(NW_center_available) &&
	 	 NW_SW_available.domain().equals(new Enumerated(new Integer(1),new Integer(2))) && NW_SW_available.range().isSubset(BOOL.instance) && NW_SW_available.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(2)),BOOL.instance).has(NW_SW_available) &&
	 	 SW_transit_available.domain().equals(new Enumerated(new Integer(1),new Integer(2))) && SW_transit_available.range().isSubset(BOOL.instance) && SW_transit_available.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(2)),BOOL.instance).has(SW_transit_available) &&
	 	 SW_S_available.domain().equals(new Enumerated(new Integer(1),new Integer(2))) && SW_S_available.range().isSubset(BOOL.instance) && SW_S_available.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(2)),BOOL.instance).has(SW_S_available) &&
	 	 center_NE_available.domain().equals(new Enumerated(new Integer(1),new Integer(2))) && center_NE_available.range().isSubset(BOOL.instance) && center_NE_available.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(2)),BOOL.instance).has(center_NE_available) &&
	 	 transit_center_available.domain().equals(new Enumerated(new Integer(1),new Integer(2))) && transit_center_available.range().isSubset(BOOL.instance) && transit_center_available.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(2)),BOOL.instance).has(transit_center_available) &&
	 	 S_SE_available.domain().equals(new Enumerated(new Integer(1),new Integer(2))) && S_SE_available.range().isSubset(BOOL.instance) && S_SE_available.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(2)),BOOL.instance).has(S_SE_available) &&
	 	 center_S_available.domain().equals(new Enumerated(new Integer(1),new Integer(2))) && center_S_available.range().isSubset(BOOL.instance) && center_S_available.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(2)),BOOL.instance).has(center_S_available) &&
	 	 transit_S_available.domain().equals(new Enumerated(new Integer(1),new Integer(2))) && transit_S_available.range().isSubset(BOOL.instance) && transit_S_available.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(2)),BOOL.instance).has(transit_S_available) &&
	 	 NE_S_available.domain().equals(new Enumerated(new Integer(1),new Integer(2))) && NE_S_available.range().isSubset(BOOL.instance) && NE_S_available.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(2)),BOOL.instance).has(NE_S_available);
	*/


	/******Getter and Mutator methods definition******/
	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.transit_S_available;*/
	public  BRelation<Integer,Boolean> get_transit_S_available(){
		return this.transit_S_available;
	}

	/*@
	    requires true;
	    assignable this.transit_S_available;
	    ensures this.transit_S_available == transit_S_available;*/
	public void set_transit_S_available(BRelation<Integer,Boolean> transit_S_available){
		this.transit_S_available = transit_S_available;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.SW_to_S;*/
	public  BRelation<Integer,Integer> get_SW_to_S(){
		return this.SW_to_S;
	}

	/*@
	    requires true;
	    assignable this.SW_to_S;
	    ensures this.SW_to_S == SW_to_S;*/
	public void set_SW_to_S(BRelation<Integer,Integer> SW_to_S){
		this.SW_to_S = SW_to_S;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.NE_to_S;*/
	public  BRelation<Integer,Integer> get_NE_to_S(){
		return this.NE_to_S;
	}

	/*@
	    requires true;
	    assignable this.NE_to_S;
	    ensures this.NE_to_S == NE_to_S;*/
	public void set_NE_to_S(BRelation<Integer,Integer> NE_to_S){
		this.NE_to_S = NE_to_S;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.NW_to_center;*/
	public  BRelation<Integer,Integer> get_NW_to_center(){
		return this.NW_to_center;
	}

	/*@
	    requires true;
	    assignable this.NW_to_center;
	    ensures this.NW_to_center == NW_to_center;*/
	public void set_NW_to_center(BRelation<Integer,Integer> NW_to_center){
		this.NW_to_center = NW_to_center;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.center_S_available;*/
	public  BRelation<Integer,Boolean> get_center_S_available(){
		return this.center_S_available;
	}

	/*@
	    requires true;
	    assignable this.center_S_available;
	    ensures this.center_S_available == center_S_available;*/
	public void set_center_S_available(BRelation<Integer,Boolean> center_S_available){
		this.center_S_available = center_S_available;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.SW_S_available;*/
	public  BRelation<Integer,Boolean> get_SW_S_available(){
		return this.SW_S_available;
	}

	/*@
	    requires true;
	    assignable this.SW_S_available;
	    ensures this.SW_S_available == SW_S_available;*/
	public void set_SW_S_available(BRelation<Integer,Boolean> SW_S_available){
		this.SW_S_available = SW_S_available;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.NW_SW_available;*/
	public  BRelation<Integer,Boolean> get_NW_SW_available(){
		return this.NW_SW_available;
	}

	/*@
	    requires true;
	    assignable this.NW_SW_available;
	    ensures this.NW_SW_available == NW_SW_available;*/
	public void set_NW_SW_available(BRelation<Integer,Boolean> NW_SW_available){
		this.NW_SW_available = NW_SW_available;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.NW_to_NE;*/
	public  BRelation<Integer,Integer> get_NW_to_NE(){
		return this.NW_to_NE;
	}

	/*@
		requires true;
		assignable \nothing;
		ensures \result == this.NW_to_NE;*/
	public  BRelation<Integer,Integer> get_transit_to_center(){
		return this.transit_to_center;
	}

	/*@
	    requires true;
	    assignable this.NW_to_NE;
	    ensures this.NW_to_NE == NW_to_NE;*/
	public void set_NW_to_NE(BRelation<Integer,Integer> NW_to_NE){
		this.NW_to_NE = NW_to_NE;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.NW_center_available;*/
	public  BRelation<Integer,Boolean> get_NW_center_available(){
		return this.NW_center_available;
	}

	/*@
	    requires true;
	    assignable this.NW_center_available;
	    ensures this.NW_center_available == NW_center_available;*/
	public void set_NW_center_available(BRelation<Integer,Boolean> NW_center_available){
		this.NW_center_available = NW_center_available;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.S_SE_available;*/
	public  BRelation<Integer,Boolean> get_S_SE_available(){
		return this.S_SE_available;
	}

	/*@
	    requires true;
	    assignable this.S_SE_available;
	    ensures this.S_SE_available == S_SE_available;*/
	public void set_S_SE_available(BRelation<Integer,Boolean> S_SE_available){
		this.S_SE_available = S_SE_available;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.center_to_S;*/
	public  BRelation<Integer,Integer> get_center_to_S(){
		return this.center_to_S;
	}

	/*@
	    requires true;
	    assignable this.center_to_S;
	    ensures this.center_to_S == center_to_S;*/
	public void set_center_to_S(BRelation<Integer,Integer> center_to_S){
		this.center_to_S = center_to_S;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.stop_in_1;*/
	public  Boolean get_stop_in_1(){
		return this.stop_in_1;
	}

	/*@
	    requires true;
	    assignable this.stop_in_1;
	    ensures this.stop_in_1 == stop_in_1;*/
	public void set_stop_in_1(Boolean stop_in_1){
		this.stop_in_1 = stop_in_1;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.stop_in_2;*/
	public  Boolean get_stop_in_2(){
		return this.stop_in_2;
	}

	/*@
	    requires true;
	    assignable this.stop_in_2;
	    ensures this.stop_in_2 == stop_in_2;*/
	public void set_stop_in_2(Boolean stop_in_2){
		this.stop_in_2 = stop_in_2;
	}

	/*@
	    requires true;
	    assignable this.transit_to_center;
	    ensures this.transit_to_center == transit_to_center;*/
	public void set_transit_to_center(BRelation<Integer,Integer> transit_to_center){
		this.transit_to_center = transit_to_center;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.stop_in_3;*/
	public  Boolean get_stop_in_3(){
		return this.stop_in_3;
	}

	/*@
	    requires true;
	    assignable this.stop_in_3;
	    ensures this.stop_in_3 == stop_in_3;*/
	public void set_stop_in_3(Boolean stop_in_3){
		this.stop_in_3 = stop_in_3;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.stop_in_4;*/
	public  Boolean get_stop_in_4(){
		return this.stop_in_4;
	}

	/*@
	    requires true;
	    assignable this.stop_in_4;
	    ensures this.stop_in_4 == stop_in_4;*/
	public void set_stop_in_4(Boolean stop_in_4){
		this.stop_in_4 = stop_in_4;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.secondary_occupancy;*/
	public  BRelation<Integer,Integer> get_secondary_occupancy(){
		return this.secondary_occupancy;
	}

	/*@
	    requires true;
	    assignable this.secondary_occupancy;
	    ensures this.secondary_occupancy == secondary_occupancy;*/
	public void set_secondary_occupancy(BRelation<Integer,Integer> secondary_occupancy){
		this.secondary_occupancy = secondary_occupancy;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.NW_NE_available;*/
	public  BRelation<Integer,Boolean> get_NW_NE_available(){
		return this.NW_NE_available;
	}

	/*@
	    requires true;
	    assignable this.NW_NE_available;
	    ensures this.NW_NE_available == NW_NE_available;*/
	public void set_NW_NE_available(BRelation<Integer,Boolean> NW_NE_available){
		this.NW_NE_available = NW_NE_available;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.stop_in_5;*/
	public  Boolean get_stop_in_5(){
		return this.stop_in_5;
	}

	/*@
	    requires true;
	    assignable this.stop_in_5;
	    ensures this.stop_in_5 == stop_in_5;*/
	public void set_stop_in_5(Boolean stop_in_5){
		this.stop_in_5 = stop_in_5;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.stop_in_6;*/
	public  Boolean get_stop_in_6(){
		return this.stop_in_6;
	}

	/*@
	    requires true;
	    assignable this.stop_in_6;
	    ensures this.stop_in_6 == stop_in_6;*/
	public void set_stop_in_6(Boolean stop_in_6){
		this.stop_in_6 = stop_in_6;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.station_occupancy;*/
	public  BRelation<Integer,Integer> get_station_occupancy(){
		return this.station_occupancy;
	}

	/*@
	    requires true;
	    assignable this.station_occupancy;
	    ensures this.station_occupancy == station_occupancy;*/
	public void set_station_occupancy(BRelation<Integer,Integer> station_occupancy){
		this.station_occupancy = station_occupancy;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.stop_in_7;*/
	public  Boolean get_stop_in_7(){
		return this.stop_in_7;
	}

	/*@
	    requires true;
	    assignable this.stop_in_7;
	    ensures this.stop_in_7 == stop_in_7;*/
	public void set_stop_in_7(Boolean stop_in_7){
		this.stop_in_7 = stop_in_7;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.center_to_NE;*/
	public  BRelation<Integer,Integer> get_center_to_NE(){
		return this.center_to_NE;
	}

	/*@
	    requires true;
	    assignable this.center_to_NE;
	    ensures this.center_to_NE == center_to_NE;*/
	public void set_center_to_NE(BRelation<Integer,Integer> center_to_NE){
		this.center_to_NE = center_to_NE;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.stop_in_8;*/
	public  Boolean get_stop_in_8(){
		return this.stop_in_8;
	}

	/*@
	    requires true;
	    assignable this.stop_in_8;
	    ensures this.stop_in_8 == stop_in_8;*/
	public void set_stop_in_8(Boolean stop_in_8){
		this.stop_in_8 = stop_in_8;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.rail;*/
	public  BRelation<Integer,Integer> get_rail(){
		return this.rail;
	}

	/*@
	    requires true;
	    assignable this.rail;
	    ensures this.rail == rail;*/
	public void set_rail(BRelation<Integer,Integer> rail){
		this.rail = rail;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.center_NE_available;*/
	public  BRelation<Integer,Boolean> get_center_NE_available(){
		return this.center_NE_available;
	}

	/*@
	    requires true;
	    assignable this.center_NE_available;
	    ensures this.center_NE_available == center_NE_available;*/
	public void set_center_NE_available(BRelation<Integer,Boolean> center_NE_available){
		this.center_NE_available = center_NE_available;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.SW_to_transit;*/
	public  BRelation<Integer,Integer> get_SW_to_transit(){
		return this.SW_to_transit;
	}

	/*@
	    requires true;
	    assignable this.SW_to_transit;
	    ensures this.SW_to_transit == SW_to_transit;*/
	public void set_SW_to_transit(BRelation<Integer,Integer> SW_to_transit){
		this.SW_to_transit = SW_to_transit;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.NE_S_available;*/
	public  BRelation<Integer,Boolean> get_NE_S_available(){
		return this.NE_S_available;
	}

	/*@
	    requires true;
	    assignable this.NE_S_available;
	    ensures this.NE_S_available == NE_S_available;*/
	public void set_NE_S_available(BRelation<Integer,Boolean> NE_S_available){
		this.NE_S_available = NE_S_available;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.transit_to_S;*/
	public  BRelation<Integer,Integer> get_transit_to_S(){
		return this.transit_to_S;
	}

	/*@
	    requires true;
	    assignable this.transit_to_S;
	    ensures this.transit_to_S == transit_to_S;*/
	public void set_transit_to_S(BRelation<Integer,Integer> transit_to_S){
		this.transit_to_S = transit_to_S;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.number_train;*/
	public  Integer get_number_train(){
		return this.number_train;
	}

	/*@
	    requires true;
	    assignable this.number_train;
	    ensures this.number_train == number_train;*/
	public void set_number_train(Integer number_train){
		this.number_train = number_train;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.S_to_SE;*/
	public  BRelation<Integer,Integer> get_S_to_SE(){
		return this.S_to_SE;
	}

	/*@
	    requires true;
	    assignable this.S_to_SE;
	    ensures this.S_to_SE == S_to_SE;*/
	public void set_S_to_SE(BRelation<Integer,Integer> S_to_SE){
		this.S_to_SE = S_to_SE;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.transit_center_available;*/
	public  BRelation<Integer,Boolean> get_transit_center_available(){
		return this.transit_center_available;
	}

	/*@
	    requires true;
	    assignable this.transit_center_available;
	    ensures this.transit_center_available == transit_center_available;*/
	public void set_transit_center_available(BRelation<Integer,Boolean> transit_center_available){
		this.transit_center_available = transit_center_available;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.SW_transit_available;*/
	public  BRelation<Integer,Boolean> get_SW_transit_available(){
		return this.SW_transit_available;
	}

	/*@
	    requires true;
	    assignable this.SW_transit_available;
	    ensures this.SW_transit_available == SW_transit_available;*/
	public void set_SW_transit_available(BRelation<Integer,Boolean> SW_transit_available){
		this.SW_transit_available = SW_transit_available;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.NW_to_SW;*/
	public  BRelation<Integer,Integer> get_NW_to_SW(){
		return this.NW_to_SW;
	}

	/*@
	    requires true;
	    assignable this.NW_to_SW;
	    ensures this.NW_to_SW == NW_to_SW;*/
	public void set_NW_to_SW(BRelation<Integer,Integer> NW_to_SW){
		this.NW_to_SW = NW_to_SW;
	}

	/*@
	    requires true;
	    assignable \nothing;
	    ensures \result == this.Traffic_light_station;*/
	public  BRelation<Integer,Integer> get_Traffic_light_station(){
		return this.Traffic_light_station;
	}

	/*@
	    requires true;
	    assignable this.Traffic_light_station;
	    ensures this.Traffic_light_station == Traffic_light_station;*/
	public void set_Traffic_light_station(BRelation<Integer,Integer> Traffic_light_station){
		this.Traffic_light_station = Traffic_light_station;
	}


	public SE_to_S_railway get_SE_to_S_railway(){
		return this.evt_SE_to_S_railway;
	}

	public SW_to_NW_enable get_SW_to_NW_enable(){
		return this.evt_SW_to_NW_enable;
	}

	public center_to_NW_railway get_center_to_NW_railway(){
		return this.evt_center_to_NW_railway;
	}

	public NE_to_S_railway get_NE_to_S_railway(){
		return this.evt_NE_to_S_railway;
	}

	public center_to_NE_enable get_center_to_NE_enable(){
		return this.evt_center_to_NE_enable;
	}

	public S_to_SE_railway get_S_to_SE_railway(){
		return this.evt_S_to_SE_railway;
	}

	public avance_S_to_NE get_avance_S_to_NE(){
		return this.evt_avance_S_to_NE;
	}

	public avance_transit_to_S get_avance_transit_to_S(){
		return this.evt_avance_transit_to_S;
	}

	public avance_center_to_NE get_avance_center_to_NE(){
		return this.evt_avance_center_to_NE;
	}

	public avance_NE_to_S get_avance_NE_to_S(){
		return this.evt_avance_NE_to_S;
	}

	public transit_to_S_railway get_transit_to_S_railway(){
		return this.evt_transit_to_S_railway;
	}

	public NE_to_center_railway get_NE_to_center_railway(){
		return this.evt_NE_to_center_railway;
	}

	public NE_to_center_enable get_NE_to_center_enable(){
		return this.evt_NE_to_center_enable;
	}

	public in_out_station8 get_in_out_station8(){
		return this.evt_in_out_station8;
	}

	public SW_to_S_enable get_SW_to_S_enable(){
		return this.evt_SW_to_S_enable;
	}

	public in_out_station7 get_in_out_station7(){
		return this.evt_in_out_station7;
	}

	public in_out_station6 get_in_out_station6(){
		return this.evt_in_out_station6;
	}

	public in_out_station5 get_in_out_station5(){
		return this.evt_in_out_station5;
	}

	public in_out_station4 get_in_out_station4(){
		return this.evt_in_out_station4;
	}

	public in_out_station3 get_in_out_station3(){
		return this.evt_in_out_station3;
	}

	public NW_to_NE_railway get_NW_to_NE_railway(){
		return this.evt_NW_to_NE_railway;
	}

	public avance_center_to_NW get_avance_center_to_NW(){
		return this.evt_avance_center_to_NW;
	}

	public in_out_station2 get_in_out_station2(){
		return this.evt_in_out_station2;
	}

	public NE_to_S_enable get_NE_to_S_enable(){
		return this.evt_NE_to_S_enable;
	}

	public in_out_station1 get_in_out_station1(){
		return this.evt_in_out_station1;
	}

	public station8_switch get_station8_switch(){
		return this.evt_station8_switch;
	}

	public S_to_center_enable get_S_to_center_enable(){
		return this.evt_S_to_center_enable;
	}

	public transit_to_SW_enable get_transit_to_SW_enable(){
		return this.evt_transit_to_SW_enable;
	}

	public SW_to_transit_enable get_SW_to_transit_enable(){
		return this.evt_SW_to_transit_enable;
	}

	public transit_to_S_enable get_transit_to_S_enable(){
		return this.evt_transit_to_S_enable;
	}

	public NW_to_SW_railway get_NW_to_SW_railway(){
		return this.evt_NW_to_SW_railway;
	}

	public NW_to_NE_enable get_NW_to_NE_enable(){
		return this.evt_NW_to_NE_enable;
	}

	public S_to_NE_enable get_S_to_NE_enable(){
		return this.evt_S_to_NE_enable;
	}

	public center_to_transit_enable get_center_to_transit_enable(){
		return this.evt_center_to_transit_enable;
	}

	public NW_to_center_enable get_NW_to_center_enable(){
		return this.evt_NW_to_center_enable;
	}

	public avance_NW_to_SW get_avance_NW_to_SW(){
		return this.evt_avance_NW_to_SW;
	}

	public station4_switch get_station4_switch(){
		return this.evt_station4_switch;
	}

	public SW_to_S_railway get_SW_to_S_railway(){
		return this.evt_SW_to_S_railway;
	}

	public center_to_S_railway get_center_to_S_railway(){
		return this.evt_center_to_S_railway;
	}

	public avance_transit_to_center get_avance_transit_to_center(){
		return this.evt_avance_transit_to_center;
	}

	public NE_to_NW_railway get_NE_to_NW_railway(){
		return this.evt_NE_to_NW_railway;
	}

	public station2_switch get_station2_switch(){
		return this.evt_station2_switch;
	}

	public station6_switch get_station6_switch(){
		return this.evt_station6_switch;
	}

	public avance_S_to_SE get_avance_S_to_SE(){
		return this.evt_avance_S_to_SE;
	}

	public avance_S_to_center get_avance_S_to_center(){
		return this.evt_avance_S_to_center;
	}

	public S_to_SW_railway get_S_to_SW_railway(){
		return this.evt_S_to_SW_railway;
	}

	public avance_SW_to_transit get_avance_SW_to_transit(){
		return this.evt_avance_SW_to_transit;
	}

	public S_to_transit_enable get_S_to_transit_enable(){
		return this.evt_S_to_transit_enable;
	}

	public avance_SW_to_S get_avance_SW_to_S(){
		return this.evt_avance_SW_to_S;
	}

	public S_to_SW_enable get_S_to_SW_enable(){
		return this.evt_S_to_SW_enable;
	}

	public center_to_transit_railway get_center_to_transit_railway(){
		return this.evt_center_to_transit_railway;
	}

	public avance_NW_to_center get_avance_NW_to_center(){
		return this.evt_avance_NW_to_center;
	}

	public NW_to_SW_enable get_NW_to_SW_enable(){
		return this.evt_NW_to_SW_enable;
	}

	public avance_S_to_SW get_avance_S_to_SW(){
		return this.evt_avance_S_to_SW;
	}

	public avance_center_to_S get_avance_center_to_S(){
		return this.evt_avance_center_to_S;
	}

	public transit_to_center_railway get_transit_to_center_railway(){
		return this.evt_transit_to_center_railway;
	}

	public avance_NW_to_NE get_avance_NW_to_NE(){
		return this.evt_avance_NW_to_NE;
	}

	public center_to_NW_enable get_center_to_NW_enable(){
		return this.evt_center_to_NW_enable;
	}


	public avance_SW_to_NW get_avance_SW_to_NW(){
		return this.evt_avance_SW_to_NW;
	}

	public spawn_train get_spawn_train(){
    	return this.evt_spawn_train;
	}

	public center_to_NE_railway get_center_to_NE_railway(){
		return this.evt_center_to_NE_railway;
	}

	public avance_center_to_transit get_avance_center_to_transit(){
		return this.evt_avance_center_to_transit;
	}

	public transit_to_center_enable get_transit_to_center_enable(){
		return this.evt_transit_to_center_enable;
	}

	public avance_NE_to_NW get_avance_NE_to_NW(){
		return this.evt_avance_NE_to_NW;
	}

	public avance_S_to_transit get_avance_S_to_transit(){
		return this.evt_avance_S_to_transit;
	}

	public avance_SE_to_S get_avance_SE_to_S(){
		return this.evt_avance_SE_to_S;
	}

	public S_to_transit_railway get_S_to_transit_railway(){
		return this.evt_S_to_transit_railway;
	}

	public S_to_SE_enable get_S_to_SE_enable(){
		return this.evt_S_to_SE_enable;
	}

	public S_to_center_railway get_S_to_center_railway(){
		return this.evt_S_to_center_railway;
	}

	public station1_switch get_station1_switch(){
		return this.evt_station1_switch;
	}

	public NW_to_center_railway get_NW_to_center_railway(){
		return this.evt_NW_to_center_railway;
	}

	public avance_NE_to_center get_avance_NE_to_center(){
		return this.evt_avance_NE_to_center;
	}

	public NE_to_NW_enable get_NE_to_NW_enable(){
		return this.evt_NE_to_NW_enable;
	}

	public S_to_NE_railway get_S_to_NE_railway(){
		return this.evt_S_to_NE_railway;
	}

	public SW_to_NW_railway get_SW_to_NW_railway(){
		return this.evt_SW_to_NW_railway;
	}

	public avance_transit_to_SW get_avance_transit_to_SW(){
		return this.evt_avance_transit_to_SW;
	}

	public station5_switch get_station5_switch(){
		return this.evt_station5_switch;
	}

	public center_to_S_enable get_center_to_S_enable(){
		return this.evt_center_to_S_enable;
	}

	public SW_to_transit_railway get_SW_to_transit_railway(){
		return this.evt_SW_to_transit_railway;
	}

	public transit_to_SW_railway get_transit_to_SW_railway(){
		return this.evt_transit_to_SW_railway;
	}

	public station3_switch get_station3_switch(){
		return this.evt_station3_switch;
	}

	public station7_switch get_station7_switch(){
		return this.evt_station7_switch;
	}


	/*@
	    requires true;
	    assignable \everything;
	    ensures
		NW_to_NE.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,NOTHING),new Pair<Integer,Integer>(2,NOTHING),new Pair<Integer,Integer>(3,NOTHING))) &&
		NW_to_SW.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,NOTHING),new Pair<Integer,Integer>(2,NOTHING),new Pair<Integer,Integer>(3,NOTHING))) &&
		SW_to_transit.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,NOTHING),new Pair<Integer,Integer>(2,NOTHING),new Pair<Integer,Integer>(3,NOTHING))) &&
		SW_to_S.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,NOTHING),new Pair<Integer,Integer>(2,NOTHING),new Pair<Integer,Integer>(3,NOTHING))) &&
		center_to_NE.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,NOTHING),new Pair<Integer,Integer>(2,NOTHING),new Pair<Integer,Integer>(3,NOTHING))) &&
		transit_to_center.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,NOTHING),new Pair<Integer,Integer>(2,NOTHING),new Pair<Integer,Integer>(3,NOTHING))) &&
		S_to_SE.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,NOTHING),new Pair<Integer,Integer>(2,NOTHING),new Pair<Integer,Integer>(3,NOTHING))) &&
		transit_to_S.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,NOTHING),new Pair<Integer,Integer>(2,NOTHING),new Pair<Integer,Integer>(3,NOTHING))) &&
		NE_to_S.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,NOTHING),new Pair<Integer,Integer>(2,NOTHING),new Pair<Integer,Integer>(3,NOTHING))) &&
		NW_to_center.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,NOTHING),new Pair<Integer,Integer>(2,NOTHING),new Pair<Integer,Integer>(3,NOTHING))) &&
		center_to_S.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,NOTHING),new Pair<Integer,Integer>(2,NOTHING),new Pair<Integer,Integer>(3,NOTHING))) &&
		station_occupancy.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(NW,NOTHING),new Pair<Integer,Integer>(SW,NOTHING),new Pair<Integer,Integer>(center,NOTHING),new Pair<Integer,Integer>(NE,NOTHING),new Pair<Integer,Integer>(transit,NOTHING),new Pair<Integer,Integer>(S,NOTHING),new Pair<Integer,Integer>(SE,NOTHING))) &&
		number_train == 0 &&
		secondary_occupancy.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(station1,NOTHING),new Pair<Integer,Integer>(station2,NOTHING),new Pair<Integer,Integer>(station3,NOTHING),new Pair<Integer,Integer>(station4,NOTHING),new Pair<Integer,Integer>(station5,NOTHING),new Pair<Integer,Integer>(station6,NOTHING),new Pair<Integer,Integer>(station7,NOTHING),new Pair<Integer,Integer>(station8,NOTHING))) &&
		//Traffic_light_station == new no_type(new JMLObjectSet {Integer i | (\exists no_type e; (new Enumerated(1,31).has(null)); e.equals(new Pair<Integer,ERROR>(null,green)))}) &&
		stop_in_1 == false &&
		stop_in_2 == false &&
		stop_in_3 == false &&
		stop_in_4 == false &&
		stop_in_5 == false &&
		stop_in_6 == false &&
		stop_in_7 == false &&
		stop_in_8 == false &&
		NW_NE_available.equals(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,true),new Pair<Integer,Boolean>(2,true))) &&
		NW_center_available.equals(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,true),new Pair<Integer,Boolean>(2,false))) &&
		NW_SW_available.equals(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false),new Pair<Integer,Boolean>(2,true))) &&
		SW_transit_available.equals(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false),new Pair<Integer,Boolean>(2,true))) &&
		SW_S_available.equals(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,true),new Pair<Integer,Boolean>(2,false))) &&
		center_NE_available.equals(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false),new Pair<Integer,Boolean>(2,false))) &&
		transit_center_available.equals(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false),new Pair<Integer,Boolean>(2,false))) &&
		S_SE_available.equals(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false),new Pair<Integer,Boolean>(2,true))) &&
		center_S_available.equals(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false),new Pair<Integer,Boolean>(2,false))) &&
		transit_S_available.equals(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false),new Pair<Integer,Boolean>(2,false))) &&
		NE_S_available.equals(new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false),new Pair<Integer,Boolean>(2,false)));*/
	public Raffinement2(){
		NW_to_NE = (new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,NOTHING),new Pair<Integer,Integer>(2,NOTHING),new Pair<Integer,Integer>(3,NOTHING)));
		NW_to_SW = (new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,NOTHING),new Pair<Integer,Integer>(2,NOTHING),new Pair<Integer,Integer>(3,NOTHING)));
		SW_to_transit = (new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,NOTHING),new Pair<Integer,Integer>(2,NOTHING),new Pair<Integer,Integer>(3,NOTHING)));
		SW_to_S = (new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,NOTHING),new Pair<Integer,Integer>(2,NOTHING),new Pair<Integer,Integer>(3,NOTHING)));
		center_to_NE = (new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,NOTHING),new Pair<Integer,Integer>(2,NOTHING),new Pair<Integer,Integer>(3,NOTHING)));
		transit_to_center = (new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,NOTHING),new Pair<Integer,Integer>(2,NOTHING),new Pair<Integer,Integer>(3,NOTHING)));
		S_to_SE = (new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,NOTHING),new Pair<Integer,Integer>(2,NOTHING),new Pair<Integer,Integer>(3,NOTHING)));
		transit_to_S = (new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,NOTHING),new Pair<Integer,Integer>(2,NOTHING),new Pair<Integer,Integer>(3,NOTHING)));
		NE_to_S = (new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,NOTHING),new Pair<Integer,Integer>(2,NOTHING),new Pair<Integer,Integer>(3,NOTHING)));
		NW_to_center = (new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,NOTHING),new Pair<Integer,Integer>(2,NOTHING),new Pair<Integer,Integer>(3,NOTHING)));
		center_to_S = (new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,NOTHING),new Pair<Integer,Integer>(2,NOTHING),new Pair<Integer,Integer>(3,NOTHING)));
		station_occupancy = (new BRelation<Integer,Integer>(new Pair<Integer,Integer>(NW,NOTHING),new Pair<Integer,Integer>(SW,NOTHING),new Pair<Integer,Integer>(center,NOTHING),new Pair<Integer,Integer>(NE,NOTHING),new Pair<Integer,Integer>(transit,NOTHING),new Pair<Integer,Integer>(S,NOTHING),new Pair<Integer,Integer>(SE,NOTHING)));
		number_train = 0;
		secondary_occupancy = (new BRelation<Integer,Integer>(new Pair<Integer,Integer>(station1,NOTHING),new Pair<Integer,Integer>(station2,NOTHING),new Pair<Integer,Integer>(station3,NOTHING),new Pair<Integer,Integer>(station4,NOTHING),new Pair<Integer,Integer>(station5,NOTHING),new Pair<Integer,Integer>(station6,NOTHING),new Pair<Integer,Integer>(station7,NOTHING),new Pair<Integer,Integer>(station8,NOTHING)));
		//Traffic_light_station = new no_type(new JMLObjectSet {Integer i | (\exists no_type e; (new Enumerated(1,31).has(null)); e.equals(new Pair<Integer,ERROR>(null,green)))});
		stop_in_1 = false;
		stop_in_2 = false;
		stop_in_3 = false;
		stop_in_4 = false;
		stop_in_5 = false;
		stop_in_6 = false;
		stop_in_7 = false;
		stop_in_8 = false;
		NW_NE_available = (new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,true),new Pair<Integer,Boolean>(2,true)));
		NW_center_available = (new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,true),new Pair<Integer,Boolean>(2,false)));
		NW_SW_available = (new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false),new Pair<Integer,Boolean>(2,true)));
		SW_transit_available = (new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false),new Pair<Integer,Boolean>(2,true)));
		SW_S_available = (new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,true),new Pair<Integer,Boolean>(2,false)));
		center_NE_available = (new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false),new Pair<Integer,Boolean>(2,false)));
		transit_center_available = (new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false),new Pair<Integer,Boolean>(2,false)));
		S_SE_available = (new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false),new Pair<Integer,Boolean>(2,true)));
		center_S_available = (new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false),new Pair<Integer,Boolean>(2,false)));
		transit_S_available = (new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false),new Pair<Integer,Boolean>(2,false)));
		NE_S_available = (new BRelation<Integer,Boolean>(new Pair<Integer,Boolean>(1,false),new Pair<Integer,Boolean>(2,false)));

	}
}