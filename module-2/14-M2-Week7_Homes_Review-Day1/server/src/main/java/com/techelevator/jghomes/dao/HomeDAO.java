package com.techelevator.jghomes.dao;

import java.util.List;

import com.techelevator.jghomes.exception.HomeNotFoundException;
import com.techelevator.jghomes.model.Home;


public interface HomeDAO {
	
    List<Home> retrieveHomesForSale();
    void addHome(Home home);
    Home retrieveHomeByMLSId(String mlsId) throws HomeNotFoundException;
    boolean deleteHome(String mlsId) throws HomeNotFoundException;
	
}
