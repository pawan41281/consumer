package com.transaction.consumer.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.transaction.consumer.dto.TransactionDto;
import com.transaction.consumer.vo.TransactionVo;

@Component
public class VoDtoConvertor {

	public TransactionVo convert(TransactionDto transactionDto) {

		TransactionVo transactionVo = new TransactionVo();
		BeanUtils.copyProperties(transactionDto, transactionVo);
		return transactionVo;
	}
	
	public TransactionDto convert(TransactionVo transactionVo) {

		TransactionDto transactionDto = new TransactionDto();
		BeanUtils.copyProperties(transactionVo, transactionDto);
		return transactionDto;
	}

	
}
