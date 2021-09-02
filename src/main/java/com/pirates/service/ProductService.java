package com.pirates.service;

import java.util.List;

import com.pirates.entity.ProductInfoVO;

public interface ProductService {
	
	public int insert(ProductInfoVO vo);
	public int delete(long id);
	public List<ProductInfoVO> selectall();
	public List<ProductInfoVO> selectone(long id);
}
