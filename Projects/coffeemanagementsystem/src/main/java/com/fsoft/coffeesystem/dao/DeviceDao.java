package com.fsoft.coffeesystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsoft.coffeesystem.entity.Device;

public interface DeviceDao extends JpaRepository<Device, Integer>{

}
