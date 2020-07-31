package com.smart.rest.service;

import com.smart.rest.domain.entity.Member;
import org.apache.catalina.User;

public interface MemberService {
    Member login(String kw, String password);
    int register();

}
