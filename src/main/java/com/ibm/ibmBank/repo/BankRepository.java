package com.ibm.ibmBank.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.ibmBank.entity.Bank;

public interface BankRepository extends MongoRepository<Bank, String> {

}
