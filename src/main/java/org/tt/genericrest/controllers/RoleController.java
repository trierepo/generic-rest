package org.tt.genericrest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tt.genericrest.entity.RoleEntity;
import org.tt.genericrest.service.IRoleService;

@Controller
@RequestMapping("/rest/role")
public class RoleController extends AbstractController<RoleEntity> {

	@Autowired
	public RoleController(IRoleService service) {
		super(service);
	}
}
