package InfoTraffic_sequential;
import java.util.Random;
import Util.Utilities;
import eventb_prelude.*;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Test_Raffinement2{

	public static Integer random_Thomas_the_tank;
	public static Integer random_Orient_Express;
	public static Integer random_NW;
	public static BSet<Integer> random_Secondary_station;
	public static Integer random_red;
	public static Integer random_station8;
	public static Integer random_SE;
	public static Integer random_S;
	public static Integer random_station4;
	public static Integer random_station5;
	public static Integer random_station6;
	public static Integer random_station7;
	public static BSet<Integer> random_Main_station;
	public static Integer random_Tchou_tchou;
	public static Integer random_The_Whistling_Limited;
	public static Integer random_NOTHING;
	public static Integer random_green;
	public static Integer random_SW;
	public static Integer random_BUSY;
	public static Integer random_center;
	public static Integer random_station1;
	public static Integer random_The_Orient_Express;
	public static Integer random_station2;
	public static Integer random_station3;
	public static Integer random_transit;
	public static Integer random_The_Steamy_Express;
	public static Integer random_NE;
	public static Integer random_NOTRAIN;
	public static Integer random_Kozma_Minin;

	static Random rnd = new Random();
	static Integer max_size_BSet = 10;
	Integer min_integer = Utilities.min_integer;
	Integer max_integer = Utilities.max_integer;

	public Integer GenerateRandomInteger(){
		BSet<Integer> S =  new BSet<Integer>(
				new Enumerated(min_integer, max_integer)
				);
		/** User defined code that reflects axioms and theorems: Begin **/

		/** User defined code that reflects axioms and theorems: End **/

		return (Integer) S.toArray()[rnd.nextInt(S.size())];
	}

	public boolean GenerateRandomBoolean(){
		boolean res = (Boolean) BOOL.instance.toArray()[rnd.nextInt(2)];

		/** User defined code that reflects axioms and theorems: Begin **/

		/** User defined code that reflects axioms and theorems: End **/

		return res;
	}


	public BSet<Integer> GenerateRandomIntegerBSet(){
		int size = rnd.nextInt(max_size_BSet);
		BSet<Integer> S = new BSet<Integer>();
		while (S.size() != size){
			S.add(GenerateRandomInteger());
		}

		/** User defined code that reflects axioms and theorems: Begin **/

		/** User defined code that reflects axioms and theorems: End **/

		return S;
	}

	public BSet<Boolean> GenerateRandomBooleanBSet(){
		int size = rnd.nextInt(2);
		BSet<Boolean> res = new BSet<Boolean>();
		if (size == 0){
			res = new BSet<Boolean>(GenerateRandomBoolean());
		}else{
			res = new BSet<Boolean>(true,false);
		}

		/** User defined code that reflects axioms and theorems: Begin **/

		/** User defined code that reflects axioms and theorems: End **/

		return res;
	}

	public BRelation<Integer,Integer> GenerateRandomBRelation(){
		BRelation<Integer,Integer> res = new BRelation<Integer,Integer>();
		int size = rnd.nextInt(max_size_BSet);
		while (res.size() != size){
			res.add(
					new Pair<Integer, Integer>(GenerateRandomInteger(), GenerateRandomInteger()));
		}
		/** User defined code that reflects axioms and theorems: Begin **/

		/** User defined code that reflects axioms and theorems: End **/

		return res;
	}

	public static void main(String[] args){
		Test_Raffinement2 test = new Test_Raffinement2();

		/** User defined code that reflects axioms and theorems: Begin **/
		random_Thomas_the_tank = test.GenerateRandomInteger();
		random_Orient_Express = test.GenerateRandomInteger();
		random_NW = test.GenerateRandomInteger();
		random_Secondary_station = test.GenerateRandomIntegerBSet();
		random_red = test.GenerateRandomInteger();
		random_station8 = test.GenerateRandomInteger();
		random_SE = test.GenerateRandomInteger();
		random_S = test.GenerateRandomInteger();
		random_station4 = test.GenerateRandomInteger();
		random_station5 = test.GenerateRandomInteger();
		random_station6 = test.GenerateRandomInteger();
		random_station7 = test.GenerateRandomInteger();
		random_Main_station = test.GenerateRandomIntegerBSet();
		random_Tchou_tchou = test.GenerateRandomInteger();
		random_The_Whistling_Limited = test.GenerateRandomInteger();
		random_NOTHING = test.GenerateRandomInteger();
		random_green = test.GenerateRandomInteger();
		random_SW = test.GenerateRandomInteger();
		random_BUSY = test.GenerateRandomInteger();
		random_center = test.GenerateRandomInteger();
		random_station1 = test.GenerateRandomInteger();
		random_The_Orient_Express = test.GenerateRandomInteger();
		random_station2 = test.GenerateRandomInteger();
		random_station3 = test.GenerateRandomInteger();
		random_transit = test.GenerateRandomInteger();
		random_The_Steamy_Express = test.GenerateRandomInteger();
		random_NE = test.GenerateRandomInteger();
		random_NOTRAIN = test.GenerateRandomInteger();
		random_Kozma_Minin = test.GenerateRandomInteger();
		/** User defined code that reflects axioms and theorems: End **/

		Raffinement2 machine = new Raffinement2();
		int n = 82; //the number of events in the machine
		//Init values for parameters in event: spawn_train
		Integer point_of_spawn = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		Integer train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: NW_to_SW_railway
		Integer light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: SW_to_NW_railway

		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: NW_to_NE_railway
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: NE_to_NW_railway
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: NW_to_center_railway
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: center_to_NW_railway
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: SW_to_transit_railway
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: transit_to_SW_railway
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: transit_to_center_railway
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: center_to_transit_railway
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: center_to_NE_railway
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: NE_to_center_railway
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: NE_to_S_railway
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: S_to_NE_railway
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: S_to_SE_railway
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: SE_to_S_railway
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: center_to_S_railway
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: S_to_center_railway
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: transit_to_S_railway
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: S_to_transit_railway
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: SW_to_S_railway
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: S_to_SW_railway
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: avance_S_to_NE
		Integer second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		Integer third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		Integer arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		Integer first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		Integer rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: avance_S_to_SE
		second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: avance_SE_to_S
		second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: avance_NW_to_SW
		second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: avance_SW_to_NW
		second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: avance_SW_to_transit
		second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: avance_transit_to_SW
		second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: avance_SW_to_S
		second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: avance_S_to_SW
		second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: avance_NW_to_center
		second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: avance_center_to_NW
		second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: avance_NW_to_NE
		second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: avance_NE_to_NW
		second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: avance_center_to_NE
		second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: avance_NE_to_center
		second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: avance_transit_to_center
		second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: avance_center_to_transit
		second = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		third = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		arrival_station = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		first = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		train = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: avance_transit_to_S
		second = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		third = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		arrival_station = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		first = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		train = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: avance_S_to_transit
		second = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		third = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		arrival_station = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		first = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		train = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: avance_center_to_S
		second = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		third = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		arrival_station = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		first = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		train = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: avance_S_to_center
		second = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		third = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		arrival_station = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		first = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		train = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: avance_NE_to_S
		second = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		third = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		arrival_station = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		first = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		train = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: in_out_station1
		Integer temporary = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		Integer secondary_lights = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: in_out_station2
		temporary = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		secondary_lights = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: in_out_station3
		temporary = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		secondary_lights = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: in_out_station4
		temporary = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		secondary_lights = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: in_out_station5
		temporary = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		secondary_lights = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: in_out_station6
		temporary = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		secondary_lights = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: in_out_station7
		temporary = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		secondary_lights = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: in_out_station8
		temporary = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		rail_value = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		light_color = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));
		secondary_lights = Utilities.someVal(new BSet<>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: station1_switch
		Boolean change_value = Utilities.someVal(new BSet<Boolean>((TreeSet<Boolean>) Set.of(true, false)));

		//Init values for parameters in event: station2_switch
		change_value = Utilities.someVal(new BSet<Boolean>((TreeSet<Boolean>) Set.of(true,false)));

		//Init values for parameters in event: station3_switch
		change_value = Utilities.someVal(new BSet<Boolean>((TreeSet<Boolean>) Set.of(true,false)));

		//Init values for parameters in event: station4_switch
		change_value = Utilities.someVal(new BSet<Boolean>((TreeSet<Boolean>) Set.of(true,false)));

		//Init values for parameters in event: station5_switch
		change_value = Utilities.someVal(new BSet<Boolean>((TreeSet<Boolean>) Set.of(true,false)));

		//Init values for parameters in event: station6_switch
		change_value = Utilities.someVal(new BSet<Boolean>((TreeSet<Boolean>) Set.of(true,false)));

		//Init values for parameters in event: station7_switch
		change_value = Utilities.someVal(new BSet<Boolean>((TreeSet<Boolean>) Set.of(true,false)));

		//Init values for parameters in event: station8_switch
		change_value = Utilities.someVal(new BSet<Boolean>((TreeSet<Boolean>) Set.of(true,false)));

		while (true){
			switch (rnd.nextInt(n)){
			case 0: if (machine.evt_spawn_train.guard_spawn_train(point_of_spawn,train))
				machine.evt_spawn_train.run_spawn_train(point_of_spawn,train); break;
			case 1: if (machine.evt_NW_to_SW_railway.guard_NW_to_SW_railway(light_color))
				machine.evt_NW_to_SW_railway.run_NW_to_SW_railway(light_color); break;
			case 2: if (machine.evt_SW_to_NW_railway.guard_SW_to_NW_railway(light_color))
				machine.evt_SW_to_NW_railway.run_SW_to_NW_railway(light_color); break;
			case 3: if (machine.evt_NW_to_NE_railway.guard_NW_to_NE_railway(light_color))
				machine.evt_NW_to_NE_railway.run_NW_to_NE_railway(light_color); break;
			case 4: if (machine.evt_NE_to_NW_railway.guard_NE_to_NW_railway(light_color))
				machine.evt_NE_to_NW_railway.run_NE_to_NW_railway(light_color); break;
			case 5: if (machine.evt_NW_to_center_railway.guard_NW_to_center_railway(light_color))
				machine.evt_NW_to_center_railway.run_NW_to_center_railway(light_color); break;
			case 6: if (machine.evt_center_to_NW_railway.guard_center_to_NW_railway(light_color))
				machine.evt_center_to_NW_railway.run_center_to_NW_railway(light_color); break;
			case 7: if (machine.evt_SW_to_transit_railway.guard_SW_to_transit_railway(light_color))
				machine.evt_SW_to_transit_railway.run_SW_to_transit_railway(light_color); break;
			case 8: if (machine.evt_transit_to_SW_railway.guard_transit_to_SW_railway(light_color))
				machine.evt_transit_to_SW_railway.run_transit_to_SW_railway(light_color); break;
			case 9: if (machine.evt_transit_to_center_railway.guard_transit_to_center_railway(light_color))
				machine.evt_transit_to_center_railway.run_transit_to_center_railway(light_color); break;
			case 10: if (machine.evt_center_to_transit_railway.guard_center_to_transit_railway(light_color))
				machine.evt_center_to_transit_railway.run_center_to_transit_railway(light_color); break;
			case 11: if (machine.evt_center_to_NE_railway.guard_center_to_NE_railway(light_color))
				machine.evt_center_to_NE_railway.run_center_to_NE_railway(light_color); break;
			case 12: if (machine.evt_NE_to_center_railway.guard_NE_to_center_railway(light_color))
				machine.evt_NE_to_center_railway.run_NE_to_center_railway(light_color); break;
			case 13: if (machine.evt_NE_to_S_railway.guard_NE_to_S_railway(light_color))
				machine.evt_NE_to_S_railway.run_NE_to_S_railway(light_color); break;
			case 14: if (machine.evt_S_to_NE_railway.guard_S_to_NE_railway(light_color))
				machine.evt_S_to_NE_railway.run_S_to_NE_railway(light_color); break;
			case 15: if (machine.evt_S_to_SE_railway.guard_S_to_SE_railway(light_color))
				machine.evt_S_to_SE_railway.run_S_to_SE_railway(light_color); break;
			case 16: if (machine.evt_SE_to_S_railway.guard_SE_to_S_railway(light_color))
				machine.evt_SE_to_S_railway.run_SE_to_S_railway(light_color); break;
			case 17: if (machine.evt_center_to_S_railway.guard_center_to_S_railway(light_color))
				machine.evt_center_to_S_railway.run_center_to_S_railway(light_color); break;
			case 18: if (machine.evt_S_to_center_railway.guard_S_to_center_railway(light_color))
				machine.evt_S_to_center_railway.run_S_to_center_railway(light_color); break;
			case 19: if (machine.evt_transit_to_S_railway.guard_transit_to_S_railway(light_color))
				machine.evt_transit_to_S_railway.run_transit_to_S_railway(light_color); break;
			case 20: if (machine.evt_S_to_transit_railway.guard_S_to_transit_railway(light_color))
				machine.evt_S_to_transit_railway.run_S_to_transit_railway(light_color); break;
			case 21: if (machine.evt_SW_to_S_railway.guard_SW_to_S_railway(light_color))
				machine.evt_SW_to_S_railway.run_SW_to_S_railway(light_color); break;
			case 22: if (machine.evt_S_to_SW_railway.guard_S_to_SW_railway(light_color))
				machine.evt_S_to_SW_railway.run_S_to_SW_railway(light_color); break;
			case 23: if (machine.evt_avance_S_to_NE.guard_avance_S_to_NE(second,third,arrival_station,first,train,rail_value,light_color))
				machine.evt_avance_S_to_NE.run_avance_S_to_NE(second,third,arrival_station,first,train,rail_value,light_color); break;
			case 24: if (machine.evt_avance_S_to_SE.guard_avance_S_to_SE(second,third,arrival_station,first,train,rail_value,light_color))
				machine.evt_avance_S_to_SE.run_avance_S_to_SE(second,third,arrival_station,first,train,rail_value,light_color); break;
			case 25: if (machine.evt_avance_SE_to_S.guard_avance_SE_to_S(second,third,arrival_station,first,train,rail_value,light_color))
				machine.evt_avance_SE_to_S.run_avance_SE_to_S(second,third,arrival_station,first,train,rail_value,light_color); break;
			case 26: if (machine.evt_avance_NW_to_SW.guard_avance_NW_to_SW(second,third,arrival_station,first,train,rail_value,light_color))
				machine.evt_avance_NW_to_SW.run_avance_NW_to_SW(second,third,arrival_station,first,train,rail_value,light_color); break;
			case 27: if (machine.evt_avance_SW_to_NW.guard_avance_SW_to_NW(second,third,arrival_station,first,train,rail_value,light_color))
				machine.evt_avance_SW_to_NW.run_avance_SW_to_NW(second,third,arrival_station,first,train,rail_value,light_color); break;
			case 28: if (machine.evt_avance_SW_to_transit.guard_avance_SW_to_transit(second,third,arrival_station,first,train,rail_value,light_color))
				machine.evt_avance_SW_to_transit.run_avance_SW_to_transit(second,third,arrival_station,first,train,rail_value,light_color); break;
			case 29: if (machine.evt_avance_transit_to_SW.guard_avance_transit_to_SW(second,third,arrival_station,first,train,rail_value,light_color))
				machine.evt_avance_transit_to_SW.run_avance_transit_to_SW(second,third,arrival_station,first,train,rail_value,light_color); break;
			case 30: if (machine.evt_avance_SW_to_S.guard_avance_SW_to_S(second,third,arrival_station,first,train,rail_value,light_color))
				machine.evt_avance_SW_to_S.run_avance_SW_to_S(second,third,arrival_station,first,train,rail_value,light_color); break;
			case 31: if (machine.evt_avance_S_to_SW.guard_avance_S_to_SW(second,third,arrival_station,first,train,rail_value,light_color))
				machine.evt_avance_S_to_SW.run_avance_S_to_SW(second,third,arrival_station,first,train,rail_value,light_color); break;
			case 32: if (machine.evt_avance_NW_to_center.guard_avance_NW_to_center(second,third,arrival_station,first,train,rail_value,light_color))
				machine.evt_avance_NW_to_center.run_avance_NW_to_center(second,third,arrival_station,first,train,rail_value,light_color); break;
			case 33: if (machine.evt_avance_center_to_NW.guard_avance_center_to_NW(second,third,arrival_station,first,train,rail_value,light_color))
				machine.evt_avance_center_to_NW.run_avance_center_to_NW(second,third,arrival_station,first,train,rail_value,light_color); break;
			case 34: if (machine.evt_avance_NW_to_NE.guard_avance_NW_to_NE(second,third,arrival_station,first,train,rail_value,light_color))
				machine.evt_avance_NW_to_NE.run_avance_NW_to_NE(second,third,arrival_station,first,train,rail_value,light_color); break;
			case 35: if (machine.evt_avance_NE_to_NW.guard_avance_NE_to_NW(second,third,arrival_station,first,train,rail_value,light_color))
				machine.evt_avance_NE_to_NW.run_avance_NE_to_NW(second,third,arrival_station,first,train,rail_value,light_color); break;
			case 36: if (machine.evt_avance_center_to_NE.guard_avance_center_to_NE(second,third,arrival_station,first,train,rail_value,light_color))
				machine.evt_avance_center_to_NE.run_avance_center_to_NE(second,third,arrival_station,first,train,rail_value,light_color); break;
			case 37: if (machine.evt_avance_NE_to_center.guard_avance_NE_to_center(second,third,arrival_station,first,train,rail_value,light_color))
				machine.evt_avance_NE_to_center.run_avance_NE_to_center(second,third,arrival_station,first,train,rail_value,light_color); break;
			case 38: if (machine.evt_avance_transit_to_center.guard_avance_transit_to_center(second,third,arrival_station,first,train,rail_value,light_color))
				machine.evt_avance_transit_to_center.run_avance_transit_to_center(second,third,arrival_station,first,train,rail_value,light_color); break;
			case 39: if (machine.evt_avance_center_to_transit.guard_avance_center_to_transit(second,third,arrival_station,first,train,rail_value,light_color))
				machine.evt_avance_center_to_transit.run_avance_center_to_transit(second,third,arrival_station,first,train,rail_value,light_color); break;
			case 40: if (machine.evt_avance_transit_to_S.guard_avance_transit_to_S(second,third,arrival_station,first,train,rail_value,light_color))
				machine.evt_avance_transit_to_S.run_avance_transit_to_S(second,third,arrival_station,first,train,rail_value,light_color); break;
			case 41: if (machine.evt_avance_S_to_transit.guard_avance_S_to_transit(second,third,arrival_station,first,train,rail_value,light_color))
				machine.evt_avance_S_to_transit.run_avance_S_to_transit(second,third,arrival_station,first,train,rail_value,light_color); break;
			case 42: if (machine.evt_avance_center_to_S.guard_avance_center_to_S(second,third,arrival_station,first,train,rail_value,light_color))
				machine.evt_avance_center_to_S.run_avance_center_to_S(second,third,arrival_station,first,train,rail_value,light_color); break;
			case 43: if (machine.evt_avance_S_to_center.guard_avance_S_to_center(second,third,arrival_station,first,train,rail_value,light_color))
				machine.evt_avance_S_to_center.run_avance_S_to_center(second,third,arrival_station,first,train,rail_value,light_color); break;
			case 44: if (machine.evt_avance_NE_to_S.guard_avance_NE_to_S(second,third,arrival_station,first,train,rail_value,light_color))
				machine.evt_avance_NE_to_S.run_avance_NE_to_S(second,third,arrival_station,first,train,rail_value,light_color); break;
			case 45: if (machine.evt_in_out_station1.guard_in_out_station1(temporary,rail_value,light_color,secondary_lights))
				machine.evt_in_out_station1.run_in_out_station1(temporary,rail_value,light_color,secondary_lights); break;
			case 46: if (machine.evt_in_out_station2.guard_in_out_station2(temporary,rail_value,light_color,secondary_lights))
				machine.evt_in_out_station2.run_in_out_station2(temporary,rail_value,light_color,secondary_lights); break;
			case 47: if (machine.evt_in_out_station3.guard_in_out_station3(temporary,rail_value,light_color,secondary_lights))
				machine.evt_in_out_station3.run_in_out_station3(temporary,rail_value,light_color,secondary_lights); break;
			case 48: if (machine.evt_in_out_station4.guard_in_out_station4(temporary,rail_value,light_color,secondary_lights))
				machine.evt_in_out_station4.run_in_out_station4(temporary,rail_value,light_color,secondary_lights); break;
			case 49: if (machine.evt_in_out_station5.guard_in_out_station5(temporary,rail_value,light_color,secondary_lights))
				machine.evt_in_out_station5.run_in_out_station5(temporary,rail_value,light_color,secondary_lights); break;
			case 50: if (machine.evt_in_out_station6.guard_in_out_station6(temporary,rail_value,light_color,secondary_lights))
				machine.evt_in_out_station6.run_in_out_station6(temporary,rail_value,light_color,secondary_lights); break;
			case 51: if (machine.evt_in_out_station7.guard_in_out_station7(temporary,rail_value,light_color,secondary_lights))
				machine.evt_in_out_station7.run_in_out_station7(temporary,rail_value,light_color,secondary_lights); break;
			case 52: if (machine.evt_in_out_station8.guard_in_out_station8(temporary,rail_value,light_color,secondary_lights))
				machine.evt_in_out_station8.run_in_out_station8(temporary,rail_value,light_color,secondary_lights); break;
			case 53: if (machine.evt_NW_to_SW_enable.guard_NW_to_SW_enable())
				machine.evt_NW_to_SW_enable.run_NW_to_SW_enable(); break;
			case 54: if (machine.evt_SW_to_NW_enable.guard_SW_to_NW_enable())
				machine.evt_SW_to_NW_enable.run_SW_to_NW_enable(); break;
			case 55: if (machine.evt_NW_to_NE_enable.guard_NW_to_NE_enable())
				machine.evt_NW_to_NE_enable.run_NW_to_NE_enable(); break;
			case 56: if (machine.evt_NE_to_NW_enable.guard_NE_to_NW_enable())
				machine.evt_NE_to_NW_enable.run_NE_to_NW_enable(); break;
			case 57: if (machine.evt_NW_to_center_enable.guard_NW_to_center_enable())
				machine.evt_NW_to_center_enable.run_NW_to_center_enable(); break;
			case 58: if (machine.evt_center_to_NW_enable.guard_center_to_NW_enable())
				machine.evt_center_to_NW_enable.run_center_to_NW_enable(); break;
			case 59: if (machine.evt_SW_to_transit_enable.guard_SW_to_transit_enable())
				machine.evt_SW_to_transit_enable.run_SW_to_transit_enable(); break;
			case 60: if (machine.evt_transit_to_SW_enable.guard_transit_to_SW_enable())
				machine.evt_transit_to_SW_enable.run_transit_to_SW_enable(); break;
			case 61: if (machine.evt_transit_to_center_enable.guard_transit_to_center_enable())
				machine.evt_transit_to_center_enable.run_transit_to_center_enable(); break;
			case 62: if (machine.evt_center_to_transit_enable.guard_center_to_transit_enable())
				machine.evt_center_to_transit_enable.run_center_to_transit_enable(); break;
			case 63: if (machine.evt_center_to_NE_enable.guard_center_to_NE_enable())
				machine.evt_center_to_NE_enable.run_center_to_NE_enable(); break;
			case 64: if (machine.evt_NE_to_center_enable.guard_NE_to_center_enable())
				machine.evt_NE_to_center_enable.run_NE_to_center_enable(); break;
			case 65: if (machine.evt_NE_to_S_enable.guard_NE_to_S_enable())
				machine.evt_NE_to_S_enable.run_NE_to_S_enable(); break;
			case 66: if (machine.evt_S_to_NE_enable.guard_S_to_NE_enable())
				machine.evt_S_to_NE_enable.run_S_to_NE_enable(); break;
			case 67: if (machine.evt_S_to_SE_enable.guard_S_to_SE_enable())
				machine.evt_S_to_SE_enable.run_S_to_SE_enable(); break;
			case 68: if (machine.evt_center_to_S_enable.guard_center_to_S_enable())
				machine.evt_center_to_S_enable.run_center_to_S_enable(); break;
			case 69: if (machine.evt_S_to_center_enable.guard_S_to_center_enable())
				machine.evt_S_to_center_enable.run_S_to_center_enable(); break;
			case 70: if (machine.evt_transit_to_S_enable.guard_transit_to_S_enable())
				machine.evt_transit_to_S_enable.run_transit_to_S_enable(); break;
			case 71: if (machine.evt_S_to_transit_enable.guard_S_to_transit_enable())
				machine.evt_S_to_transit_enable.run_S_to_transit_enable(); break;
			case 72: if (machine.evt_SW_to_S_enable.guard_SW_to_S_enable())
				machine.evt_SW_to_S_enable.run_SW_to_S_enable(); break;
			case 73: if (machine.evt_S_to_SW_enable.guard_S_to_SW_enable())
				machine.evt_S_to_SW_enable.run_S_to_SW_enable(); break;
			case 74: if (machine.evt_station1_switch.guard_station1_switch(change_value))
				machine.evt_station1_switch.run_station1_switch(change_value); break;
			case 75: if (machine.evt_station2_switch.guard_station2_switch(change_value))
				machine.evt_station2_switch.run_station2_switch(change_value); break;
			case 76: if (machine.evt_station3_switch.guard_station3_switch(change_value))
				machine.evt_station3_switch.run_station3_switch(change_value); break;
			case 77: if (machine.evt_station4_switch.guard_station4_switch(change_value))
				machine.evt_station4_switch.run_station4_switch(change_value); break;
			case 78: if (machine.evt_station5_switch.guard_station5_switch(change_value))
				machine.evt_station5_switch.run_station5_switch(change_value); break;
			case 79: if (machine.evt_station6_switch.guard_station6_switch(change_value))
				machine.evt_station6_switch.run_station6_switch(change_value); break;
			case 80: if (machine.evt_station7_switch.guard_station7_switch(change_value))
				machine.evt_station7_switch.run_station7_switch(change_value); break;
			case 81: if (machine.evt_station8_switch.guard_station8_switch(change_value))
				machine.evt_station8_switch.run_station8_switch(change_value); break;
			}
			point_of_spawn = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			second = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			third = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			arrival_station = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			first = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			train = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			temporary = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			secondary_lights = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			temporary = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			secondary_lights = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			temporary = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			secondary_lights = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			temporary = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			secondary_lights = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			temporary = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			secondary_lights = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			temporary = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			secondary_lights = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			temporary = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			secondary_lights = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			temporary = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rail_value = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			light_color = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			secondary_lights = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			change_value = Utilities.someVal(new BSet<Boolean>((TreeSet<Boolean>) Set.of(true,false)));
			change_value = Utilities.someVal(new BSet<Boolean>((TreeSet<Boolean>) Set.of(true,false)));
			change_value = Utilities.someVal(new BSet<Boolean>((TreeSet<Boolean>) Set.of(true,false)));
			change_value = Utilities.someVal(new BSet<Boolean>((TreeSet<Boolean>) Set.of(true,false)));
			change_value = Utilities.someVal(new BSet<Boolean>((TreeSet<Boolean>) Set.of(true,false)));
			change_value = Utilities.someVal(new BSet<Boolean>((TreeSet<Boolean>) Set.of(true,false)));
			change_value = Utilities.someVal(new BSet<Boolean>((TreeSet<Boolean>) Set.of(true,false)));
			change_value = Utilities.someVal(new BSet<Boolean>((TreeSet<Boolean>) Set.of(true,false)));
		}
	}

}
