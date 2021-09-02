package com.pirates.mapper;

import java.util.List;

import com.pirates.entity.ProductInfoVO;

public interface ProductMapper {
	
	public int insert(ProductInfoVO vo);
	public int delete(long id);
	public List<ProductInfoVO> selectall();
	public List<ProductInfoVO> selectone(long id);
}
