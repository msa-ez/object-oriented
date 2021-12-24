// restful api 란 Chapter .6, Chapter .7

package com.example.petshop;


import com.example.petshop.domain.CartItem;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class RepositorySerchesProcessor implements RepresentationModelProcessor<EntityModel<CartItem>> {

    @Override
    public EntityModel<CartItem> process(EntityModel<CartItem> model) {
        model.add(Link.of(model.getContent().getPet()).withRel("pet"));

        return model;
    }
}
