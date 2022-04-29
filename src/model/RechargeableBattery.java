package model;

public class RechargeableBattery extends Battery implements Rechargeable{

	public static final char BATTERY_LITIO = 'l';
	public static final char BATTERY_NIQUEL_CADIO = 'n';
	public static final double FACTOR_LITIO = 0.92;
	public static final double FACTOR_NIQUEL_CADIO = 0.80;

	private int chargerNumber;
	private char type;

	public RechargeableBattery(String name, double voltage, double cost, double capacity, int chargerNumber, char type){

		super(name, voltage, cost, capacity);
		this.chargerNumber = chargerNumber;	
		this.type = type;
	}

	@Override
	public String toString(){
		return "Bateria recargable \n" +
		"Nombre: " + name +"\n" + 
		"Costo de vida util: " + calculateUsefulLifeCost(); 
	}

	@Override
	public double calculateUsefulLifeCost(){

		double usefulLifeCost1 = 0;

		if(type == 'l'){
			usefulLifeCost = (cost*voltage*capacity)/(1000*chargerNumber*FACTOR_LITIO);
		} else if(type == 'n'){
			usefulLifeCost = (cost*voltage*capacity)/(1000*chargerNumber*FACTOR_NIQUEL_CADIO);
		}

		return usefulLifeCost1;
	}




}