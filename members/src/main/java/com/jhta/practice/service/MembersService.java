package com.jhta.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.practice.mybatis.MembersMapper;
import com.jhta.practice.vo.MembersVo;

@Service
public class MembersService {
	@Autowired private MembersMapper mapper;
	
	public int insert(MembersVo vo) {
		return mapper.insert(vo);
	}
	public List<MembersVo> selectAll(){
		return mapper.selectAll();
	}
}
