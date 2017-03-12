package com.fsoft.coffeesystem.entity;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

// TODO: Auto-generated Javadoc
/**
 * Promotion generated by hbm2java.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "promotion")
public class Promotion implements java.io.Serializable {

	/** The id. */
	private int id;
	
	/** The store. */
	private Store store;
	
	/** The name. */
	private String name;
	
	/** The start date. */
	private Date startDate;
	
	/** The end date. */
	private Date endDate;
	
	/** The is delete. */
	private Boolean isDelete;
	
	/** The description. */
	private String description;
	
	/** The promotion details. */
	private Set<PromotionDetail> promotionDetails = new HashSet<PromotionDetail>(0);

	/**
	 * Instantiates a new promotion.
	 */
	public Promotion() {
	}

	/**
	 * Instantiates a new promotion.
	 *
	 * @param id the id
	 * @param startDate the start date
	 * @param endDate the end date
	 */
	public Promotion(int id, Date startDate, Date endDate) {
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	/**
	 * Instantiates a new promotion.
	 *
	 * @param id the id
	 * @param store the store
	 * @param name the name
	 * @param startDate the start date
	 * @param endDate the end date
	 * @param isDelete the is delete
	 * @param description the description
	 * @param promotionDetails the promotion details
	 */
	public Promotion(int id, Store store, String name, Date startDate, Date endDate, Boolean isDelete,
			String description, Set<PromotionDetail> promotionDetails) {
		this.id = id;
		this.store = store;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isDelete = isDelete;
		this.description = description;
		this.promotionDetails = promotionDetails;
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
	 * Gets the store.
	 *
	 * @return the store
	 */
	@ManyToOne
	@JoinColumn(name = "storeId")
	public Store getStore() {
		return this.store;
	}

	/**
	 * Sets the store.
	 *
	 * @param store the new store
	 */
	public void setStore(Store store) {
		this.store = store;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	@Column(name = "name")
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
	 * Gets the start date.
	 *
	 * @return the start date
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "startDate", nullable = false, length = 10)
	public Date getStartDate() {
		return this.startDate;
	}

	/**
	 * Sets the start date.
	 *
	 * @param startDate the new start date
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * Gets the end date.
	 *
	 * @return the end date
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "endDate", nullable = false, length = 10)
	public Date getEndDate() {
		return this.endDate;
	}

	/**
	 * Sets the end date.
	 *
	 * @param endDate the new end date
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
	 * Gets the promotion details.
	 *
	 * @return the promotion details
	 */
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "promotion")
	public Set<PromotionDetail> getPromotionDetails() {
		return this.promotionDetails;
	}

	/**
	 * Sets the promotion details.
	 *
	 * @param promotionDetails the new promotion details
	 */
	public void setPromotionDetails(Set<PromotionDetail> promotionDetails) {
		this.promotionDetails = promotionDetails;
	}

}