package com.hw.service.impl;

import com.hw.dao.AdminMapper;
import com.hw.entity.Admin;
import com.hw.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public boolean login(String username, String password) {
        Admin admin = adminMapper.selectByUsername(username);
        if(admin==null)return  false;
        else{
            if(admin.getPassword().equals(password)){//登陆成功
                return true;
            }else{
                return false;
            }
        }

    }

    @Override
    public boolean regist(Admin admin) {
        Admin a = adminMapper.selectByUsername(admin.getUsername());
        if(a==null){
            int i = adminMapper.insert(admin);
            if(i==1)
                return true;
        }else{
            return false;
        }
        return false;

    }
}
