package com.subodh.collection;

import java.util.HashMap;

public class BranchMap {

	private static HashMap<String,Integer> branchMap;
	
	static {
		branchMap=new HashMap<>();
		branchMap.put("AMEERPET", 1);
		branchMap.put("SRNAGAR", 2);
		branchMap.put("HITECHCITY", 3);
		branchMap.put("KPHB", 4);
		branchMap.put("PANJAGOTTA", 5);
	}
	
	public static int getBranchId(String branch) {
		return branchMap.get(branch.toUpperCase());
	}
}
