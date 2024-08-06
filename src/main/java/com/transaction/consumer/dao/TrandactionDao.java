package com.transaction.consumer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transaction.consumer.dto.TransactionDto;

@Repository
public interface TrandactionDao extends JpaRepository<TransactionDto, Long>{

}
