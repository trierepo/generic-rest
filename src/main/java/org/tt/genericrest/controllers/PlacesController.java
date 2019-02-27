package org.tt.genericrest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tt.genericrest.model.PlaceModel;
import org.tt.genericrest.repository.PlaceRepository;


@Controller
@RequestMapping("/rest/places")
public class PlacesController extends AbstractController<PlaceModel, Long> {

    @Autowired
     repo;

    public PlacesController(PlaceRepository repo) {
        super(repo);
    }
}
