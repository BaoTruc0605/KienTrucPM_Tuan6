package iuh.fit.se.user.controller;

import iuh.fit.se.user.models.User;
import iuh.fit.se.user.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public User getUser(long id){
        return userService.getUser(id);
    }

}
