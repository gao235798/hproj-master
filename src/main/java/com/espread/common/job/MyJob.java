package com.espread.common.job;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Schedule - MyJob 
 * @author itdragons 2016-11-6 17:54:28
 *
 */
public class MyJob {
	
	private Logger LOGGER = LoggerFactory.getLogger(MyJob.class);
	
	public void work(){
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		LOGGER.debug("run MyJob Method work," + dateFormat.format(new Date()));
		
	}

}
