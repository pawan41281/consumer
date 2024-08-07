package com.transaction.consumer.service;

import org.springframework.stereotype.Service;

import com.transaction.consumer.dao.TrandactionDao;
import com.transaction.consumer.dto.TransactionDto;
import com.transaction.consumer.util.VoDtoConvertor;
import com.transaction.producer.vo.TransactionVo;

@Service
public class TransactionServiceImpl implements TransactionService {

	private final TrandactionDao trandactionDao;
	private final VoDtoConvertor voDtoConvertor;

	public TransactionServiceImpl(TrandactionDao trandactionDao, VoDtoConvertor voDtoConvertor) {
		super();
		this.trandactionDao = trandactionDao;
		this.voDtoConvertor = voDtoConvertor;
	}

	@Override
	public TransactionVo updateTransaction(TransactionVo transactionVo) {
		transactionVo.setStatus("X");// Status flag for transaction set as X means completed
		TransactionDto transactionDto = voDtoConvertor.convert(transactionVo);
		transactionDto = trandactionDao.save(transactionDto);
		transactionVo = voDtoConvertor.convert(transactionDto);
		
		return transactionVo;
	}

}
