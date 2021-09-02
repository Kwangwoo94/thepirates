package com.pirates.entity;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Delivery {
	
	@Id
	private long id;
	
	private String type;
	
	private String closing;
}
