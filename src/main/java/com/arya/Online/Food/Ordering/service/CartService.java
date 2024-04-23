package com.arya.Online.Food.Ordering.service;

import com.arya.Online.Food.Ordering.model.Cart;
import com.arya.Online.Food.Ordering.model.CartItem;
import com.arya.Online.Food.Ordering.request.AddCartItemRequest;

public interface CartService {
    public CartItem addItemToCart(AddCartItemRequest req, String jwt)throws Exception;
    public CartItem updateCartItemQuantity(Long cartItemId,int quantity)throws Exception;
    public Cart removeItemFromCart(Long cartItemId,String jwt)throws Exception;
    public Long calculateCartTotal(Cart cart)throws Exception;
    public Cart findCartById(Long id)throws Exception;
    public Cart findCartByUserId(String jwt)throws Exception;
    public Cart clearCart(String jwt)throws Exception;
}
