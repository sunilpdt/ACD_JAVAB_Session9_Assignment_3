package com.acadgild;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class HDTVMain {

	public static void main(String[] args) {
		
		HDTV h1=new HDTV();
		HDTV h2=new HDTV();
		HDTV h3=new HDTV();
		h1.setSize(20);
		h1.setBrandName("Videocon");
		h2.setSize(30);
		h2.setBrandName("Sony");
		h3.setSize(40);
		h3.setBrandName("Toshiba");
		ArrayList<HDTV> hdtvLst=new ArrayList<HDTV>();
		hdtvLst.add(h1);
		hdtvLst.add(h2);
		hdtvLst.add(h3);
		
		Iterator<HDTV> listIter=hdtvLst.listIterator();
		System.out.println("Before sorting ArrayList");
		while(listIter.hasNext()){
		HDTV hdtv=listIter.next();
		System.out.println(hdtv.size);
		System.out.println(hdtv.brandName);
		}
		
		
		hdtvLst.sort(new HDTVComparator());
		System.out.println("After sorting ArrayList");
		while(listIter.hasNext()){
			System.out.println(listIter.next());
		}
		
		
		
		

	}

}
