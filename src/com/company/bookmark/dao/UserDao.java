package com.company.bookmark.dao;

import com.company.bookmark.DataStore;
import com.company.bookmark.entities.User;

import java.util.List;

public class UserDao {
    public List<User> getUsers(){

       return DataStore.getUsers();
    }
}
