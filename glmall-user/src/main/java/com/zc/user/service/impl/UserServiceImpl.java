package com.zc.user.service.impl;

import com.zc.user.bean.UmsMember;
import com.zc.user.mapper.UserMapper;
import com.zc.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zc
 * @create 2021-04-01 17:01
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
   private UserMapper userMapper;

//    @Autowired
//    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMemberList = userMapper.selectAllUser1();//userMapper.selectAllUser();

        return umsMemberList;
    }

//    @Override
//    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
//
//        // 封装的参数对象
//        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
//        umsMemberReceiveAddress.setMemberId(memberId);
//        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
//
//
////        Example example = new Example(UmsMemberReceiveAddress.class);
////        example.createCriteria().andEqualTo("memberId",memberId);
////        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(example);
//
//        return umsMemberReceiveAddresses;
//    }
}
