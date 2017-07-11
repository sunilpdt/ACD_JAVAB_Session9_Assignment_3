package com.acadgild;

import java.util.Comparator;

public class HDTVComparator implements Comparator<HDTV> {

@Override
public int compare(HDTV o1, HDTV o2) {
	// TODO Auto-generated method stub
	if(o1.size>o2.size)
		return 1;
		else if (o1.size< o2.size)
			return -1;
		else
			return 1;
					
}

}
