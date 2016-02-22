package net.nomagic.pos.api;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class PosApplication extends Application {

	   private Set<Object> singletons = new HashSet<Object>();
	   private Set<Class<?>> empty = new HashSet<Class<?>>();

	   public PosApplication() {
	      singletons.add(new CustomersApiImpl());
	   }

	   @Override
	   public Set<Class<?>> getClasses() {
	      return empty;
	   }

	   @Override
	   public Set<Object> getSingletons() {
	      return singletons;
	   }	
	
}
