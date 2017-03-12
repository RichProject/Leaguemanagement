package com.fsoft.coffeesystem.entity;

// Generated 11-Jan-2017 22:33:33 by Hibernate Tools 5.2.0.Beta1

import java.math.BigDecimal;


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
 * Order generated by hbm2java.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "orders")
public class Order implements java.io.Serializable {

	/** The id. */
	private int id;
	
	/** The customer. */
	private Customer customer;
	
	/** The desk. */
	private Desk desk;
	
	/** The date. */
	private Date date;
	
	/** The total bill. */
	private BigDecimal totalBill;
	
	/** The is delete. */
	private Boolean isDelete;
	
	/** The order details. */
	private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>(0);

	/**
	 * Instantiates a new order.
	 */
	public Order() {
	}

	/**
	 * Instantiates a new order.
	 *
	 * @param id the id
	 * @param customer the customer
	 * @param desk the desk
	 * @param totalBill the total bill
	 */
	public Order(int id, Customer customer, Desk desk, BigDecimal totalBill) {
		this.id = id;
		this.customer = customer;
		this.desk = desk;
		this.totalBill = totalBill;
	}

	/**
	 * Instantiates a new order.
	 *
	 * @param id the id
	 * @param customer the customer
	 * @param desk the desk
	 * @param date the date
	 * @param totalBill the total bill
	 * @param isDelete the is delete
	 * @param orderDetails the order details
	 */
	public Order(int id, Customer customer, Desk desk, Date date, BigDecimal totalBill, Boolean isDelete,
			Set<OrderDetail> orderDetails) {
		this.id = id;
		this.customer = customer;
		this.desk = desk;
		this.date = date;
		this.totalBill = totalBill;
		this.isDelete = isDelete;
		this.orderDetails = orderDetails;
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
	 * Gets the customer.
	 *
	 * @return the customer
	 */
	@ManyToOne
	@JoinColumn(name = "customerId", nullable = false)
	public Customer getCustomer() {
		return this.customer;
	}

	/**
	 * Sets the customer.
	 *
	 * @param customer the new customer
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * Gets the desk.
	 *
	 * @return the desk
	 */
	@ManyToOne
	@JoinColumn(name = "deskId", nullable = false)
	public Desk getDesk() {
		return this.desk;
	}

	/**
	 * Sets the desk.
	 *
	 * @param desk the new desk
	 */
	public void setDesk(Desk desk) {
		this.desk = desk;
	}

	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "date", length = 10)
	public Date getDate() {
		return this.date;
	}

	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * Gets the total bill.
	 *
	 * @return the total bill
	 */
	@Column(name = "totalBill", nullable = false, scale = 4)
	public BigDecimal getTotalBill() {
		return this.totalBill;
	}

	/**
	 * Sets the total bill.
	 *
	 * @param totalBill the new total bill
	 */
	public void setTotalBill(BigDecimal totalBill) {
		this.totalBill = totalBill;
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
	 * Gets the order details.
	 *
	 * @return the order details
	 */
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "order")
	public Set<OrderDetail> getOrderDetails() {
		return this.orderDetails;
	}

	/**
	 * Sets the order details.
	 *
	 * @param orderDetails the new order details
	 */
	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

}
