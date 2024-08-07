package com.transaction.consumer.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.transaction.consumer.service.TransactionService;
import com.transaction.producer.vo.TransactionVo;

@Service
public class KafkaConsumer {

	private final TransactionService transactionService;

	public KafkaConsumer(TransactionService transactionService) {
		super();
		this.transactionService = transactionService;
	}

	@KafkaListener(topics = "TransactionsTopic", groupId = "transaction_cc")
	public void subscribeMessage(TransactionVo transactionVo) {

		transactionVo = transactionService.updateTransaction(transactionVo);
		
		System.out.println(transactionVo);
	}

}
