package com.fsoft.coffeesystem.utilites;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fsoft.coffeesystem.entity.Customer;
import com.fsoft.coffeesystem.entity.Desk;
import com.fsoft.coffeesystem.entity.OrderDetail;
import com.fsoft.coffeesystem.entity.Orders;
import com.fsoft.coffeesystem.entity.Product;
import com.fsoft.coffeesystem.entity.Ward;
import com.fsoft.coffeesystem.entity.Warehouse;
import com.fsoft.coffeesystem.model.AddressModel;
import com.fsoft.coffeesystem.model.CustomerModel;
import com.fsoft.coffeesystem.model.DeskModel;
import com.fsoft.coffeesystem.model.OrderDetailModel;
import com.fsoft.coffeesystem.model.OrdersModel;
import com.fsoft.coffeesystem.model.ProductGroup;
import com.fsoft.coffeesystem.model.ProductGroupDetail;
import com.fsoft.coffeesystem.model.ProductModel;
import com.fsoft.coffeesystem.model.WarehouseModel;

// TODO: Auto-generated Javadoc
/**
 * The Class Convert.
 */
public class Convert {

	/**
	 * Convert to address.
	 *
	 * @param listWards
	 *            the list wards
	 * @return the list
	 */
	public static List<AddressModel> convertToAddress(List<Ward> listWards) {
		List<AddressModel> listAddress = new ArrayList<>();
		AddressModel address;
		for (Ward ward : listWards) {
			address = new AddressModel();
			address.setWardName(ward.getName());
			address.setDistrictName(ward.getDistrict().getName());
			address.setCityName(ward.getDistrict().getCity().getName());
			listAddress.add(address);
		}
		return listAddress;
	}

	public static List<DeskModel> convertToDeskModel(List<Desk> listDesks) {
		List<DeskModel> listDesk = new ArrayList<>();
		DeskModel desk;
		for (Desk deskmodel : listDesks) {
			desk = new DeskModel();
			desk.setDeskName(deskmodel.getName());
			desk.setDeviceId(deskmodel.getDevice().getId());
			desk.setGroupDeskName(deskmodel.getGroupDesk().getName());
			desk.setStoreName(deskmodel.getStore().getName());
			desk.setQuantityOfSeats(deskmodel.getQuantityOfSeats());
			desk.setDescription(deskmodel.getDescription());
			listDesk.add(desk);
		}
		DeskModel deskModel;
		for (Desk deskEntity : listDesks) {
			deskModel = new DeskModel();
			deskModel.setDeskId(deskEntity.getId());
			deskModel.setGroupDeskId(deskEntity.getGroupDesk().getId());
			deskModel.setGroupDeskName(deskEntity.getGroupDesk().getName());
			deskModel.setDeviceId(deskEntity.getDevice().getId());
			deskModel.setQuantityOfSeats(deskEntity.getQuantityOfSeats());
			deskModel.setDeskName(deskEntity.getName());
			deskModel.setDescription(deskEntity.getDescription() == null ? "" : deskEntity.getDescription());
			listDesk.add(deskModel);
		}
		return listDesk;
	}

	/**
	 * Convert to product group.
	 *
	 * @param list
	 *            the list
	 * @return the list
	 */
	public static List<ProductGroup> convertToProductGroup(List<com.fsoft.coffeesystem.entity.ProductGroup> list) {
		List<ProductGroup> result = new ArrayList<>();
		for (com.fsoft.coffeesystem.entity.ProductGroup pg : list) {
			
				result.add(new ProductGroup(pg.getId(), pg.getName()));
		}
		for (com.fsoft.coffeesystem.entity.ProductGroup pg : list) {
			if (!pg.getIsDelete())
				result.add(new ProductGroup(pg.getId(), pg.getName()));
		}
		return result;
	}

//	public static List<GroupDeskModel> convertToDeskGroup(List<com.fsoft.coffeesystem.entity.GroupDesk> list) {
//		List<GroupDeskModel> result = new ArrayList<>();
//		for (com.fsoft.coffeesystem.entity.GroupDesk pg : list) {
//			if (!pg.getIsDelete())
//				result.add(new GroupDeskModel(pg.getId(), pg.getName()));
//		}
//		return result;
//	}

	/**
	 * Convert to product group detail.
	 *
	 * @param list
	 *            the list
	 * @return the list
	 */
	public static List<ProductGroupDetail> convertToProductGroupDetail(
			List<com.fsoft.coffeesystem.entity.ProductGroup> list) {
		List<ProductGroupDetail> result = new ArrayList<>();
		for (com.fsoft.coffeesystem.entity.ProductGroup pg : list) {
			
				result.add(new ProductGroupDetail(pg.getId(), pg.getName(), pg.getDescription()));
		}
		for (com.fsoft.coffeesystem.entity.ProductGroup pg : list) {
			if (!pg.getIsDelete())
				result.add(new ProductGroupDetail(pg.getId(), pg.getName(), pg.getDescription()));
		}
		return result;
	}

	/**
	 * Convert to customer.
	 *
	 * @param listCustomer
	 * @return the list
	 */
	public static List<CustomerModel> convertCustomer(List<Customer> customer) {
		List<CustomerModel> listCustomer = new ArrayList<>();
		for (Customer cust : customer) {
			CustomerModel customerModel = new CustomerModel();
			customerModel.setId(cust.getId());
			customerModel.setName(cust.getName());
			customerModel.setPhoneNumber(cust.getPhoneNumber());
			customerModel.setBirthday(cust.getBirthday());
			customerModel.setEmail(cust.getEmail());
			customerModel.setGender(cust.getGender());
			customerModel.setPoint(cust.getPoint());
			listCustomer.add(customerModel);
		}
		return listCustomer;
	}

	public static List<ProductModel> convertToProductModel(List<Product> listProduct) {
		List<ProductModel> listProductModel = new ArrayList<>();
		ProductModel product;
		for (Product productEntity : listProduct) {
			product = new ProductModel();
			product.setId(productEntity.getId());
			product.setName(productEntity.getName());
			product.setProductGroupName((productEntity.getProductGroup().getName()));
			product.setProductGroupId(productEntity.getProductGroup().getId());
			product.setDescription(productEntity.getDescription() == null ? "" : productEntity.getDescription());
			product.setPrice(productEntity.getPrice());
			listProductModel.add(product);
		}
		return listProductModel;
	}

	public static List<WarehouseModel> convertWarehouse(List<Warehouse> warehouses) {
		List<WarehouseModel> listWHModel = new ArrayList<>();
		for (Warehouse wh : warehouses) {
			WarehouseModel whModel = new WarehouseModel();
			whModel.setId(wh.getId());
			whModel.setName(wh.getMaterial().getName());
			whModel.setMaterialType(wh.getMaterial().getMaterialType().getName());
			whModel.setPrice(wh.getMaterial().getPrice());
			whModel.setQuantity(wh.getQuantity());
			listWHModel.add(whModel);
		}
		return listWHModel;
	}

	public static List<OrdersModel> convertToOrderModel(List<Orders> listOrder) {
		List<OrdersModel> list = new ArrayList<>();
		OrdersModel orderModel;
		CustomerModel customerModel;
		ProductModel productModel;
		Product product;
		OrderDetailModel orderDetailModel;
		Customer c;
		int quantity;
		int tmpQuantity;
		Set<OrderDetail> orderDetails;
		Set<OrderDetailModel> orderDetailModels;
		for (Orders item : listOrder) {
			orderModel = new OrdersModel();
			customerModel = new CustomerModel();
			orderModel.setId(item.getId());
			c = item.getCustomer();
			customerModel.setId(c.getId());
			customerModel.setName(c.getName());
			customerModel.setBirthday(c.getBirthday());
			customerModel.setEmail(c.getEmail());
			customerModel.setGender(c.getGender());
			customerModel.setPhoneNumber(c.getPhoneNumber());
			customerModel.setPoint(c.getPoint());
			orderModel.setCustomerModel(customerModel);
			orderModel.setDate(item.getDate());
			orderModel.setTotalBill(item.getTotalBill());
			orderModel.setDesk(item.getDesk().getName());
			orderDetails = item.getOrderDetails();
			quantity = 0;
			orderDetailModels = new HashSet<OrderDetailModel>(0);
			for (OrderDetail orderDetail : orderDetails) {
				orderDetailModel = new OrderDetailModel();
				orderDetailModel.setId(orderDetail.getId());
				tmpQuantity = orderDetail.getQuantity();
				orderDetailModel.setQuantity(tmpQuantity);
				quantity += tmpQuantity;
				productModel = new ProductModel();
				product = orderDetail.getProduct();
				productModel.setId(product.getId());
				productModel.setPrice(product.getPrice());
				productModel.setName(product.getName());
				orderDetailModel.setProductModel(productModel);
				orderDetailModels.add(orderDetailModel);
				tmpQuantity = 0;
			}
			orderModel.setQuantityProduct(quantity);
			orderModel.setOrderDetailsModel(orderDetailModels);
			list.add(orderModel);
		}
		return list;
	}

}
