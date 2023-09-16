package com.Service;

import com.Mapper.UserMapperr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component

public class UserService {
    @Autowired
    private UserMapperr userMapperr;
    public void add(){
        userMapperr.add();
    }
}
