package com.pirates.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pirates.entity.ProductInfoVO;
import com.pirates.mapper.ProductMapper;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductMapper mapper;
	
	@Override
	public int insert(ProductInfoVO vo) {
		return mapper.insert(vo);
	}

	@Override
	public int delete(long id) {
		return mapper.delete(id);
	}

	@Override
	public List<ProductInfoVO> selectall() {
		return mapper.selectall();
	}

	@Override
	public List<ProductInfoVO> selectone(long id) {
		return mapper.selectone(id);
	}

}
