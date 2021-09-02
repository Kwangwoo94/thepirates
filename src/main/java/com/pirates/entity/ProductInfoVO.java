package com.pirates.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductInfoVO {
	
	@Id
	private long id;
	
	private String name;
	
	private String description;
	
	private List<Delivery> delivery;
	
	private List<Options> options;
	
	private Date regDate;
	
}
