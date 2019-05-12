package com.cn.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class RemoveList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("333");
		list.add("333");
		list.remove("333");
		list.forEach(item->{System.out.println(item);});
	     List<String> linkList=new LinkedList<String>();
	    linkList.add("sadf");
	}

}
