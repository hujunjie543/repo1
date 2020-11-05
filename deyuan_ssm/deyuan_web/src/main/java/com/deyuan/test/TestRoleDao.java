package com.deyuan.test;


import com.deyuan.dao.RoleDao;
import com.deyuan.dao.UserDao;
import com.deyuan.pojo.Role;
import com.deyuan.pojo.UserInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sound.midi.Soundbank;
import java.util.List;

public class TestRoleDao {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
 /*       RoleDao roleDao = context.getBean(RoleDao.class);
        List<Role> list = roleDao.findAll();
        for (Role role : list) {
            System.out.println(role.getRoleName());*/

    //}
        UserDao bean = context.getBean(UserDao.class);
        UserInfo userInfo = bean.findById("1");
        System.out.println(userInfo.getUsername());
        List<Role> list = userInfo.getRoles();
        for (Role role : list) {
            System.out.println(role.getRoleName());
        }

    }
}
