package net.nomagic.pos.api;

import net.nomagic.pos.api.models.Product;
import net.nomagic.pos.api.models.Error;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/v1")
public interface ProductsApi  {
    @GET
    @Path("/products")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Response getProducts(@QueryParam("filter") String filter,
    @QueryParam("top") Integer top,
    @QueryParam("skip") Integer skip,
    @QueryParam("select") String select,
    @QueryParam("orderby") String orderby);
}

