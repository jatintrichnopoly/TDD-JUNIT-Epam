package com.epam.ttdjunitdemo;

public class RemoveA {

	public String remove(String s) {
		String res=s;
		if(s.equals("")) res="";
		else if(s.length()==1) {
			if(s.charAt(0)=='A') res="";
			else res=s;
		}
		else {
		    res=s;
		    boolean f1=false,f2=false;
		    if(s.charAt(0)=='A') f1=true;
		    if(s.charAt(1)=='A') f2=true;
		    if(f1 && f2) res=s.substring(2);
		    else if(f1) res=s.substring(1);
		    else if(f2) res=s.charAt(0)+s.substring(2);   
		}
		return res;
	}
	
}
