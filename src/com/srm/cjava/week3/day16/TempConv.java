package com.srm.cjava.week3.day16;

import java.text.DecimalFormat;

 
 
public class TempConv {

	private static String temperatureScale;
    double tempt;
 
		public TempConv() {

 
		tempt = 0.0;

 
		temperatureScale = "C";

	}
 
	public TempConv(double temp) {

 
		tempt = temp;

	}
 
	public static void useFahrenheit() {

		temperatureScale = "F";
	}
 
	public static void useCelsius() {

		temperatureScale = "C";
	}
 
	public static void useKelvin() {
	
		temperatureScale = "K";
	}
 
	public void set(double value) {
		if (temperatureScale == "C"){
			tempt = value;
		}
		else if(temperatureScale == "F"){
			tempt = (value - 32) * 5/9.0;
 
		}else if (temperatureScale == "K"){
			tempt = (value - 273.15);
		}
 
	}
 
	public String toString(){
		String temperatureString;
 
		if(temperatureScale == "F"){
			tempt = tempt * 9/5.0 + 32;
 
		}else if (temperatureScale == "K"){
			tempt = tempt + 273.15;
		}
		DecimalFormat df = new DecimalFormat("#.##");
		temperatureString = df.format(tempt) + '\u00b0' + temperatureScale;
 
		return temperatureString;
	}
 
	public TempConv mean(TempConv otherTemperature) {
		double average = (tempt + otherTemperature.tempt) /2.0;
		TempConv mean = new TempConv (average);
 
		return mean;
	}	
}
