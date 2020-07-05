package com.company.bookmark.dao;

import com.company.bookmark.DataStore;
import com.company.bookmark.entities.User;

public class UserDao {
    public User[] getUsers(){

       return DataStore.getUsers();
    }
}
