package com.pirates.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pirates.entity.ProductInfoVO;
import com.pirates.service.ProductService;

@RestController
@RequestMapping("/product/*")
public class ProductRestController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/list")
	public ResponseEntity<List<ProductInfoVO>> getList(){
		return new ResponseEntity<List<ProductInfoVO>>(service.selectall(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<List<ProductInfoVO>> getRow(@PathVariable("id") long id){
		return new ResponseEntity<List<ProductInfoVO>>(service.selectone(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") long id){
		return service.delete(id)>0?new ResponseEntity<String>("success",HttpStatus.OK):
			new ResponseEntity<String>("fail",HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping("/insert")
	public ResponseEntity<String> insert(@RequestBody ProductInfoVO vo){
		return service.insert(vo)>0?new ResponseEntity<String>("success",HttpStatus.OK):
			new ResponseEntity<String>("fail",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
