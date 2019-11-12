package com.itheima.test;

import com.itheima.pojo.NewUser;
import com.itheima.pojo.User;
import org.springframework.beans.BeanUtils;

/**
 * @author:yangyang
 * @date:2019/10/31
 * @descriptiom:
 */
public class Test {
    public static void main(String[] args) {
        User user = new User();
//        user.setName("yang");
        NewUser newUser = new NewUser();
        BeanUtils.copyProperties(user,newUser);
        System.out.println(newUser);
    }
}
