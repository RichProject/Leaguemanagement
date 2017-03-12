package com.fsoft.coffeesystem.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fsoft.coffeesystem.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	@Query("select e from Employee e where" + " e.name LIKE '%'||:name||'%' and "
			+ "e.address LIKE '%'||:address||'%' and " + "e.idCard LIKE '%'||:idCard||'%' and "
			+ "e.position LIKE '%'||:position||'%' and " + "e.phone LIKE '%'||:phone||'%' and "
			+ " ( :minSalary = 0 or e.salary > :minSalary )" + " and ( :maxSalary = 0 or e.salary < :maxSalary )")
	List<Employee> searchNormal(@Param("name") String name, @Param("address") String address,
			@Param("idCard") String idCard, @Param("phone") String phone, @Param("position") String position,
			@Param("minSalary") BigDecimal minSalary, @Param("maxSalary") BigDecimal maxSalary);

	@Query("select e from Employee e where" + " e.name LIKE '%'||:name||'%' and "
			+ "e.address LIKE '%'||:address||'%' and " + "e.idCard LIKE '%'||:idCard||'%' and "
			+ "e.position LIKE '%'||:position||'%' and " + "e.phone LIKE '%'||:phone||'%' and "
			+ " ( :minSalary = 0 or e.salary > :minSalary )" + " and ( :maxSalary = 0 or e.salary < :maxSalary )"
			+ " and e.ward.district.city.id = :city")
	List<Employee> searchFromCity(@Param("name") String name, @Param("address") String address,
			@Param("idCard") String idCard, @Param("phone") String phone, @Param("position") String position,
			@Param("minSalary") BigDecimal minSalary, @Param("maxSalary") BigDecimal maxSalary,
			@Param("city") String city);

	@Query("select e from Employee e where" + " e.name LIKE '%'||:name||'%' and "
			+ "e.address LIKE '%'||:address||'%' and " + "e.idCard LIKE '%'||:idCard||'%' and "
			+ "e.position LIKE '%'||:position||'%' and " + "e.phone LIKE '%'||:phone||'%' and "
			+ " ( :minSalary = 0 or e.salary > :minSalary )" + " and ( :maxSalary = 0 or e.salary < :maxSalary )"
			+ " and e.ward.district.id = :district")
	List<Employee> searchFromDistrict(@Param("name") String name, @Param("address") String address,
			@Param("idCard") String idCard, @Param("phone") String phone, @Param("position") String position,
			@Param("minSalary") BigDecimal minSalary, @Param("maxSalary") BigDecimal maxSalary,
			@Param("district") String district);
	@Query("select e from Employee e where" + " e.name LIKE '%'||:name||'%' and "
			+ "e.address LIKE '%'||:address||'%' and " + "e.idCard LIKE '%'||:idCard||'%' and "
			+ "e.position LIKE '%'||:position||'%' and " + "e.phone LIKE '%'||:phone||'%' and "
			+ " ( :minSalary = 0 or e.salary > :minSalary )" + " and ( :maxSalary = 0 or e.salary < :maxSalary )"
			+ " and e.ward.district.id = :ward")
	List<Employee> searchFromWard(@Param("name") String name, @Param("address") String address,
			@Param("idCard") String idCard, @Param("phone") String phone, @Param("position") String position,
			@Param("minSalary") BigDecimal minSalary, @Param("maxSalary") BigDecimal maxSalary,
			@Param("ward") String ward);

}
