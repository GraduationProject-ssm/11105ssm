package com.dao;

import com.entity.JiaruwomenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaruwomenVO;
import com.entity.view.JiaruwomenView;


/**
 * 加入我们
 * 
 * @author 
 * @email 
 * @date 2021-04-12 10:46:16
 */
public interface JiaruwomenDao extends BaseMapper<JiaruwomenEntity> {
	
	List<JiaruwomenVO> selectListVO(@Param("ew") Wrapper<JiaruwomenEntity> wrapper);
	
	JiaruwomenVO selectVO(@Param("ew") Wrapper<JiaruwomenEntity> wrapper);
	
	List<JiaruwomenView> selectListView(@Param("ew") Wrapper<JiaruwomenEntity> wrapper);

	List<JiaruwomenView> selectListView(Pagination page,@Param("ew") Wrapper<JiaruwomenEntity> wrapper);
	
	JiaruwomenView selectView(@Param("ew") Wrapper<JiaruwomenEntity> wrapper);
	
}
