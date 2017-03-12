package com.fsoft.coffeesystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fsoft.coffeesystem.entity.Desk;

public interface DeskDao extends JpaRepository<Desk, Integer> {

	@Query("SELECT d.id, d.groupDesk.name, d.device.id, d.quantityOfSeats,"
			+ " d.name, d.description FROM Desk d WHERE (d.id = :id OR :id IS NULL) AND d.name LIKE '%'||:name||'%'"
			+ " AND (d.device.id = :did OR :did IS NULL)" + " AND (d.quantityOfSeats = :quan OR :quan IS NULL)")
	List<Desk> searchDesks(@Param("id") Integer id, @Param("name") String name, @Param("did") Integer deviceId,
			@Param("quan") Integer quantity);

	// @Query("SELECT d.id, d.name, d.device.id, d.groupDesk.name,
	// d.quantityOfSeats, d.description "+
	// "FROM Desk d WHERE d.id = :maBan AND d.name LIKE '%'||:tenBan||'%'"+
	// "AND d.device.id = :maTB AND d.groupDesk.name LIKE '%'||:tenNB||'%'"+
	// "AND d.quantityOfSeats = :soLG")
	// List<Desk> searchDesks(@Param("wardName") String wardName);
	//
	// @Query("select w from Ward w where w.name LIKE '%'||:wardName||'%'")
	// List<Ward> searchWards(@Param("wardName") String wardName);

	@Query("select d from Desk d where d.name LIKE '%'||:deskName||'%'")
	List<Desk> searchDesks(@Param("deskName") String deskName);

	@Query("SELECT d.id, d.groupDesk.name, d.device.id, d.quantityOfSeats,"
			+ " d.name, d.description FROM Desk d WHERE (d.id = :id OR :id IS NULL) AND d.name LIKE '%'||:name||'%'"
			+ " AND (d.device.id = :did OR :did IS NULL) AND d.groupDesk.id = :gid"
			+ " AND (d.quantityOfSeats = :quan OR :quan IS NULL)")
	List<Desk> searchDesks(@Param("id") Integer id, @Param("name") String name, @Param("did") Integer deviceId,
			@Param("gid") Integer groupname, @Param("quan") Integer quantity);
}
