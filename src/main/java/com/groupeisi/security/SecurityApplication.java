package com.groupeisi.security;

import com.groupeisi.security.dao.AppRoleImpl;
import com.groupeisi.security.dao.IAppRole;
import com.groupeisi.security.entities.AppRole;

public class SecurityApplication {
    public static void main(String[] args){
        IAppRole roledao = new AppRoleImpl();
        AppRole role = new AppRole();
        role.setName("ROLE_ADMIN");
        int result = roledao.save(role);
        System.out.println(result);
    }
}
