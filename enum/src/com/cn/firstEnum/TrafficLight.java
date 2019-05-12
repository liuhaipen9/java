package com.cn.firstEnum;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Single;

enum Signal{GREEN,YELLOW,RED}
public class TrafficLight {
	Signal color=Signal.RED;
	public void change(){
		switch (color) {
		case RED:
			color=Signal.GREEN;
			break;
		case YELLOW:
			color=Signal.RED;
			break;
		default:
			color=Signal.YELLOW;
			break;
		}
	}
	public String toString(){
		return "color:"+color;
	}
	public static void main(String[] args) {
		TrafficLight trafficLight=new TrafficLight();
		for (int i = 0; i < 7; i++) {
			System.out.println(trafficLight);
			trafficLight.change();
		}
		
	
	}
}
