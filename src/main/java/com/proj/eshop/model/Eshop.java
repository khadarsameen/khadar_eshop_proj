package com.proj.eshop.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "shop")
public class Eshop {
		
	@Id
    private long id;	
    private String productId;
    private String stockId;
    private String orderId;
    
    public Eshop(long id, String productId, String stockId, String orderId) {
		super();
		this.id = id;
		this.productId = productId;
		this.stockId = stockId;
		this.orderId = orderId;
	}
    
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}	
	
	@Override
	public String toString() {
		return "Eshop [id=" + id + ", productId=" + productId + ", stockId=" + stockId + ", orderId=" + orderId + "]";
	}
}
