package com.fsoft.coffeesystem.entity;


// Generated 11-Jan-2017 22:33:33 by Hibernate Tools 5.2.0.Beta1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
// TODO: Auto-generated Javadoc

/**
 * District generated by hbm2java.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "district")
public class District implements java.io.Serializable {

	/** The id. */
	private int id;
	
	/** The city. */
	private City city;
	
	/** The name. */
	private String name;
	
	/** The description. */
	private String description;
	
	/** The is delete. */
	private Boolean isDelete;
	
	/** The wards. */
	private Set<Ward> wards = new HashSet<Ward>(0);

	/**
	 * Instantiates a new district.
	 */
	public District() {
	}

	/**
	 * Instantiates a new district.
	 *
	 * @param id the id
	 * @param city the city
	 * @param name the name
	 */
	public District(int id, City city, String name) {
		this.id = id;
		this.city = city;
		this.name = name;
	}

	/**
	 * Instantiates a new district.
	 *
	 * @param id the id
	 * @param city the city
	 * @param name the name
	 * @param description the description
	 * @param isDelete the is delete
	 * @param wards the wards
	 */
	public District(int id, City city, String name, String description, Boolean isDelete, Set<Ward> wards) {
		this.id = id;
		this.city = city;
		this.name = name;
		this.description = description;
		this.isDelete = isDelete;
		this.wards = wards;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	@ManyToOne
	@JoinColumn(name = "cityId", nullable = false)
	public City getCity() {
		return this.city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(City city) {
		this.city = city;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the checks if is delete.
	 *
	 * @return the checks if is delete
	 */
	@Column(name = "isDelete")
	public Boolean getIsDelete() {
		return this.isDelete;
	}

	/**
	 * Sets the checks if is delete.
	 *
	 * @param isDelete the new checks if is delete
	 */
	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}

	/**
	 * Gets the wards.
	 *
	 * @return the wards
	 */
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "district")
	public Set<Ward> getWards() {
		return this.wards;
	}

	/**
	 * Sets the wards.
	 *
	 * @param wards the new wards
	 */
	public void setWards(Set<Ward> wards) {
		this.wards = wards;
	}

}
