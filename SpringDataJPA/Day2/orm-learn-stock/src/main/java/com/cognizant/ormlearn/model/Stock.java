package com.cognizant.ormlearn.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stock")
public class Stock {

	@Id
	@Column(name="st_id")
	private int id;
	
	@Column(name="st_code")
	private String code;
	
	@Column(name="st_date")
	private Date date;
	
	@Column(name="st_open")
	private BigDecimal stockOpen;
	
	@Column(name="st_close")
	private BigDecimal stockClose;
	
	@Column(name="st_volume")
	private BigDecimal volume;

	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stock(int id, String code, Date date, BigDecimal stockOpen, BigDecimal stockClose, BigDecimal volume) {
		super();
		this.id = id;
		this.code = code;
		this.date = date;
		this.stockOpen = stockOpen;
		this.stockClose = stockClose;
		this.volume = volume;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BigDecimal getStockOpen() {
		return stockOpen;
	}

	public void setStockOpen(BigDecimal stockOpen) {
		this.stockOpen = stockOpen;
	}

	public BigDecimal getStockClose() {
		return stockClose;
	}

	public void setStockClose(BigDecimal stockClose) {
		this.stockClose = stockClose;
	}

	public BigDecimal getVolume() {
		return volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", code=" + code + ", date=" + date + ", stockOpen=" + stockOpen + ", stockClose="
				+ stockClose + ", volume=" + volume + "]";
	}
	
	
}
