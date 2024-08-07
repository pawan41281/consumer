package com.transaction.consumer.service;

import com.transaction.producer.vo.TransactionVo;

public interface TransactionService {
	
	public TransactionVo updateTransaction(TransactionVo transactionVo);
}
