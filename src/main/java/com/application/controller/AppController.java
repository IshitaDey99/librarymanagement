package com.application.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.model.AppModel;
import com.application.repository.AppRepository;


@RestController
public class AppController {
	@Autowired
	AppRepository repo;
	
	@PostMapping("/saveBook")
	public void addBook(@RequestBody AppModel id)
	{
		repo.save(id);
		System.out.println(id);
	}
	
	@PostMapping("/editBook")
	public String updateBook(@RequestBody AppModel id, @RequestParam("bookId") int bookId) {
		if(repo.findByBookId(bookId)!=null) {
			//int id1= repo.findAllByBookId(bookId);
			repo.deleteById(bookId);
			id.setBookId(bookId);
			repo.save(id);
			System.out.println(bookId);
			System.out.println(id);
			return "Successfully updated";
		}
		else {
			return "No book found to Update";
		}
	}
	
	@PostMapping("/deleteBook")
	public String deleteBook(@RequestParam int bookId) {
		if(repo.findByBookId(bookId)!=null) {
			//int id=repo.findAllByBookId(bookId);
			repo.deleteById(bookId);
			return "Deleted Successfully";
		}
		else {
			return "No book found to delete";
		}
	}
	
	@GetMapping("/getBooks")
	public List<AppModel> getAllBook(){
		return (List<AppModel>)repo.findAll();
	}
	
	@PostMapping("/getByType")
	public List<AppModel> getBookGne(@RequestParam("genre")String genre){
		return (List<AppModel>)repo.findByGenre(genre);
	}
}
