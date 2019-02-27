package org.tt.genericrest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tt.genericrest.entity.UserEntity;
import org.tt.genericrest.service.IUserService;


@Controller
@RequestMapping("/rest/user")
public class UserController extends AbstractController<UserEntity> {

	@Autowired
	public UserController(IUserService service) {
		super(service);
	}
}
