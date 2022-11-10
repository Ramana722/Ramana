package com.hrms.utility;

import java.util.logging.Logger;

public class log {
	
		//Initialize Log4j logs
		private static Logger log = Logger.getLogger(log.class.getName());
		// Need to create these methods, so that they can be called 
		public static void info(String message) {
		log.info(message);
		
		}
		
		}

	

