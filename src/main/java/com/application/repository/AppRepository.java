package com.application.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.application.model.AppModel;

@Repository
public interface AppRepository extends JpaRepository<AppModel,Integer>  {

	public List<AppModel> findByBookId(int bookId);


	public List<AppModel> findByGenre(String genre);
	
}
