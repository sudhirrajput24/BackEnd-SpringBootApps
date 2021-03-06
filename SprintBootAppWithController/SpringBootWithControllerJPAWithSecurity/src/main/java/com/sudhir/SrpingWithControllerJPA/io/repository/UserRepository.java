package com.sudhir.SrpingWithControllerJPA.io.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sudhir.SrpingWithControllerJPA.io.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long>{
	
	UserEntity findByEmail(String email);

	
}
