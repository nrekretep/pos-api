package net.nomagic.pos.api;

import net.nomagic.pos.api.models.Customer;
import net.nomagic.pos.api.models.Error;
import java.io.File;
import java.io.InputStream;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/v1")
public interface CustomersApi  {
    @GET
    @Path("/customers")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Response getCustomers();
    
    @POST
    @Path("/customers")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Response postCustomers(Customer customer);
    @GET
    @Path("/customers/{customer-id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Response getCustomersCustomerId(@PathParam("customer-id") Long customerId);
    @PUT
    @Path("/customers/{customer-id}/image")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    public Response putCustomerImage(@PathParam("customer-id") Long customerId,InputStream imageInputStream);
}

