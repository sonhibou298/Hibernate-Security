package com.groupeisi.security.dao;

import com.groupeisi.security.entities.AppRole;

import java.util.List;

public interface IAppRole {
    public int save(AppRole appRole);
    public AppRole get(int id);
    public int update(AppRole appRole);
    public int remove(int id);
    public List<AppRole> getAll();
}
