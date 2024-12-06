package com.demo.dao;


import org.springframework.stereotype.Repository;
import com.demo.beans.MyUser;

@Repository
public interface LoginDao {
	
	MyUser validateuser(String unm, String passwd);

		
}
