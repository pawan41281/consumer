package com.transaction.consumer.dto;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "transaction_cc")
public class TransactionDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "trans_id", nullable = true)
	private Long trandactionId;

	@Column(name = "card_number", nullable = true)
	private String cardNumber;

	@Column(name = "amount", nullable = true)
	private Double amount;

	@Column(name = "tr_ts", nullable = true)
	private Timestamp timestamp;// transaction timestamp

	@Column(name = "merc_id", nullable = true)
	private String merchantId;

	@Column(name = "status")
	private String status;

	public TransactionDto() {
		super();
	}

	public TransactionDto(Long id, Long trandactionId, String cardNumber, Double amount, Timestamp timestamp,
			String merchantId, String status) {
		super();
		this.id = id;
		this.trandactionId = trandactionId;
		this.cardNumber = cardNumber;
		this.amount = amount;
		this.timestamp = timestamp;
		this.merchantId = merchantId;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTrandactionId() {
		return trandactionId;
	}

	public void setTrandactionId(Long trandactionId) {
		this.trandactionId = trandactionId;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TransactionDto [id=" + id + ", trandactionId=" + trandactionId + ", cardNumber=" + cardNumber
				+ ", amount=" + amount + ", timestamp=" + timestamp + ", merchantId=" + merchantId + ", status="
				+ status + "]";
	}

}
