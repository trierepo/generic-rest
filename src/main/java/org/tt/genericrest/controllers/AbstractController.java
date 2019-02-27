package org.tt.genericrest.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.tt.genericrest.service.IGenericService;

public abstract class AbstractController<T> {

    private Logger logger = LoggerFactory.getLogger(AbstractController.class);
    String[] s = {"A", "B"};
    
    private IGenericService<T> service;

    public AbstractController(IGenericService<T> service) {
        this.service = service;
    }

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody List<T> listAll() {
    	logger.info("Inside generic rest listAll");
        return this.service.find();
    }

    @RequestMapping(value="id/{id}", method=RequestMethod.GET)
    public @ResponseBody T search(@PathVariable("id") Long id) {
    	logger.info("Inside generic rest by id");
        return this.service.find(id);
    }

    @RequestMapping(value="id/{id}", method=RequestMethod.DELETE)
    public @ResponseBody Map<String, Boolean> delete(@PathVariable("id") Long id) {
    	logger.info("Inside generic rest delete by id");
        Map<String, Boolean> res = new HashMap<String, Boolean>();
        this.service.delete(id);
    	res.put("deleted", true);
    	return res;
    }

    @RequestMapping(method=RequestMethod.POST)
    public @ResponseBody T save(@RequestBody() T payload) {
    	logger.info("Inside generic rest listAll");
        return this.service.save(payload);
    }
}
