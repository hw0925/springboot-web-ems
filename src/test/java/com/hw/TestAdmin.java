package com.hw;

import com.hw.dao.AdminMapper;
import com.hw.entity.Admin;
import com.hw.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAdmin {
    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private AdminService adminService;

    @Test
    public void testInsert(){
        Admin admin=new Admin(0,"hw","和我","123456",0);
        int insert = adminMapper.insert(admin);
        System.out.println(insert);
    }

    @Test
    public void testselect(){

      // Admin admin = adminMapper.selectByUsername("hw");
       //System.out.println(admin);

    }

    @Test
    public void testselect111(){

        boolean login = adminService.login("hw", "123456");

        System.out.println(login);
    }
}
