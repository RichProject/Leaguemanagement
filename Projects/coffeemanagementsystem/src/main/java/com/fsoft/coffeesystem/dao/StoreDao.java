package com.fsoft.coffeesystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsoft.coffeesystem.entity.Store;

public interface StoreDao extends JpaRepository<Store, Integer> {

}
