package com.transaction.consumer.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.transaction.consumer.vo.TransactionVo;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "TransactionsTopic", groupId = "transaction_cc")
	public void subscribeMessage(TransactionVo transactionVo) {
		System.out.println(transactionVo.getTrandactionId());
	}

}
