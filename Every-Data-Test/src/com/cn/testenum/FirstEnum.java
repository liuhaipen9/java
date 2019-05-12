package com.cn.testenum;



public class FirstEnum {
	Color color=Color.BLANK;
	Color2 color2=Color2.RED;
	public void test(){
		switch (color) {
		case RED:
			System.out.println("红色");
			break;
		case BLANK:
		System.out.println("黑色");
		break;
		default:
			System.out.println("其它颜色");
			break;
		}
	}
	public void test2(){
		System.out.println(color2.getName());
		System.out.println(Color2.getName(2));
		System.out.println("==========toString==========="+color2.toString());
		switch (color2.getName()) {
		case "红色":
			System.out.println("红色");
			break;
		case "黑色":
		System.out.println("黑色");
		break;
		default:
			System.out.println("其它颜色");
			break;
		}
	}
	public static void main(String[] args) {
		FirstEnum firstEnum=new FirstEnum();
		firstEnum.test();
		firstEnum.test2();
		System.out.println("当前线程为:"+Thread.currentThread().getName());;
	}
}
