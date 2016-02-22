package net.nomagic.pos.api;

import java.io.InputStream;

import javax.ws.rs.core.Response;

import net.nomagic.pos.api.models.Customer;

public class CustomersApiImpl implements CustomersApi {

	@Override
	public Response getCustomers() {
		// TODO Auto-generated method stub
		
		return Response.ok("hello").build();
	}

	@Override
	public Response postCustomers(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getCustomersCustomerId(Long customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response putCustomerImage(Long customerId, InputStream imageInputStream) {
		// TODO Auto-generated method stub
		return null;
	}

}
