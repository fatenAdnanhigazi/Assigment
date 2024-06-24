package com.niq.activate.service;

import com.niq.activate.controller.ShopperShelfRequest;
import com.niq.activate.entity.ShopperShelves;
import com.niq.activate.repository.ShopperShelfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ShopperShelfService {

    @Autowired
    private ShopperShelfRepository shopperShelfRepository;


    public void saveShopperShelves(ShopperShelfRequest request) {
        for (ShopperShelfRequest.ShelfItem item : request.getShelf()) {
            ShopperShelves shelf = new ShopperShelves();
            shelf.setShopperId(request.getShopperId());
            shelf.setProductId(item.getProductId());
            shelf.setRelevancyScore(item.getRelevancyScore());
            shopperShelfRepository.save(shelf);
        }
    }
}
