package com.pirates.entity;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Options {
	
	@Id
	private long id;
	
	private String name;
	
	private String price;
	
	private int stock;
}
