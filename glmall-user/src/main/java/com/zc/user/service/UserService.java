package com.zc.user.service;

import com.zc.user.bean.UmsMember;

import java.util.List;

/**
 * @author zc
 * @create 2021-04-01 17:00
 */
public interface UserService {
    List<UmsMember> getAllUser();

    //List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
