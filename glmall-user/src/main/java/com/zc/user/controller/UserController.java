package com.zc.user.controller;

import com.zc.user.bean.UmsMember;
import com.zc.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zc
 * @create 2021-04-01 16:59
 */

@Controller
public class UserController {

    @Autowired
    UserService userService;
//
//    @RequestMapping("getReceiveAddressByMemberId")
//    @ResponseBody
//    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
//        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getReceiveAddressByMemberId(memberId);
//        return umsMemberReceiveAddresses;
//    }


    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "hello user";

    }
}