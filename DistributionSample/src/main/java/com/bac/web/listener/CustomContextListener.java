package com.bac.web.listener;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.io.IOUtils;

public class CustomContextListener implements ServletContextListener {
	
	private static final String resource_path = "/custom/"; 
	private List<InputStream> is_list = null;
	private Set<String> resources = null;

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("inside contextInitialized");
		resources = (Set<String>)sce.getServletContext().getResourcePaths(resource_path);
		is_list = new ArrayList<InputStream>();
		for(String a : resources) {
			System.out.println(a);
			try {
				is_list.add(IOUtils.toInputStream(a, "UTF-8"));
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		/*try {
			if(null != is) {
			System.out.println("InputStream loaded :"+is.available());
			}else {
				System.out.println("InputStream not loaded");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

	@SuppressWarnings("deprecation")
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		for(InputStream r : is_list) {
			IOUtils.closeQuietly(r);;
		}
	}

}
