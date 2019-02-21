package com.hw.service;

import com.hw.entity.Admin;


public interface AdminService {
    public boolean login(String username,String password);

    public boolean regist(Admin admin);


}
