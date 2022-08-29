package com.abc;

import java.util.Date;
import java.util.logging.Logger;

public class Garbadge {
	static Logger logger=Logger.getLogger(Garbadge.class.getName());
	
	public static void main(String[] args) {
        Runtime r=Runtime.getRuntime();
        
        System.out.println(r.freeMemory());
        logger.info("ffvv");
        //logger.info(r.totalMemory());
        for (int i = 0; i < 1000; i++) {
            Date d=new Date();
            d=null;
            
        }
        System.out.println(r.freeMemory());
        r.gc();
        
    }



}
