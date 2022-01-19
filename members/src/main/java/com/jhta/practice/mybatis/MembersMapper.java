package com.jhta.practice.mybatis;

import java.util.List;

import com.jhta.practice.vo.MembersVo;

public interface MembersMapper {
	int insert(MembersVo vo);
	List<MembersVo> selectAll();
}
