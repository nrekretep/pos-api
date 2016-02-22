package net.nomagic.pos.api;

import net.nomagic.pos.api.models.ShoppingCart;
import net.nomagic.pos.api.models.Customer;
import net.nomagic.pos.api.models.Error;
import net.nomagic.pos.api.models.ShoppingCartNewLineItem;
import net.nomagic.pos.api.models.ShoppingCartUpdateLineItem;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/v1")
public interface ShoppingCartApi  {
    @GET
    @Path("/shopping-carts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Response getShoppingCarts(@QueryParam("filter") String filter,
    @QueryParam("top") Integer top,
    @QueryParam("skip") Integer skip,
    @QueryParam("select") String select,
    @QueryParam("orderby") String orderby);
    @POST
    @Path("/shopping-carts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Response postShoppingCarts(Customer customer);
    @GET
    @Path("/shopping-carts/{cart-id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Response getShoppingCartsCartId(@PathParam("cart-id") Long cartId,
    @QueryParam("expand") String expand);
    @POST
    @Path("/shopping-carts/{cart-id}/line-items")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Response postShoppingCartsCartIdLineItems(@PathParam("cart-id") Long cartId,
    ShoppingCartNewLineItem lineItem);
    @PUT
    @Path("/shopping-carts/{cart-id}/line-items/{line-item-id}")
    @Consumes({ "application/merge-patch+json" })
    @Produces({ "application/json" })
    public Response putShoppingCartsCartIdLineItemsLineItemId(@PathParam("cart-id") Long cartId,
    @PathParam("line-item-id") Long lineItemId,
    ShoppingCartUpdateLineItem lineItem);
}

