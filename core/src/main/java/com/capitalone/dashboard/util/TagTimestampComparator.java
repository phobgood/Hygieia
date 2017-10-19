package com.capitalone.dashboard.util;

import java.util.Comparator;

import com.capitalone.dashboard.model.Tag;

public class TagTimestampComparator implements Comparator<Tag>{

	@Override
	public int compare(Tag arg0, Tag arg1) {
		if (arg0 == null) {
			return -1;
		}
		if (arg1 == null) {
			return 1;
		}
		return Long.valueOf(arg0.getTimestamp()).compareTo(Long.valueOf(arg1.getTimestamp()));
	}

}
