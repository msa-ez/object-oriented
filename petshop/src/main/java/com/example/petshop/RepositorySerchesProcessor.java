// restful api 란 Chapter .6, Chapter .7

package com.example.petshop;

import com.example.petshop.domain.Cat;
import com.example.petshop.domain.Pet;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class RepositorySerchesProcessor implements RepresentationModelProcessor<EntityModel<Pet>> {

    @Override
    public EntityModel<Pet> process(EntityModel<Pet> model) {
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/feed").withRel("feed"));

        if(model.getContent() instanceof Cat)
            model.add(Link.of(model.getRequiredLink("self").getHref() + "/groom").withRel("groom"));
        return model;
    }
}
