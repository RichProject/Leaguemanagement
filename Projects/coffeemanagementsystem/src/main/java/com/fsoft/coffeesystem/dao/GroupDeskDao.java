package com.fsoft.coffeesystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fsoft.coffeesystem.entity.GroupDesk;

//TODO: Auto-generated Javadoc
/**
* The Interface GroupDeskDao.
*/
public interface GroupDeskDao extends JpaRepository<GroupDesk, Integer> {
	/**
	 * views group desk.
	 *
	 * @param groupDeskName the group desk name
	 * @return the list
	 */
	@Query("select g from GroupDesk g where g.isDelete='false'")
    List<GroupDesk> listGroupDesks();
}
