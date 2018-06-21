package com.ellenchia.springio.web.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/api/user")
public class UserCouponApi {

   /* @Autowired
    private UserService userService;*/

    /*@PreAuthorize("isAuthenticated()")*/
    @RequestMapping(value = "/me",method = GET)
    public Map<String,String> me() {
        return new HashMap<>();
    }

}
