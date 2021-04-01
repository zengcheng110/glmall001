package com.zc.user.mapper;

import com.zc.user.bean.UmsMember;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zc
 * @create 2021-04-01 17:01
 */
public interface UserMapper  {

    List<UmsMember> selectAllUser();
    @Select(" select t.*  from ums_member t")
    List<UmsMember> selectAllUser1();

}
