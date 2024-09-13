package com.dao;

import com.entity.DiscusschanpinzixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschanpinzixunVO;
import com.entity.view.DiscusschanpinzixunView;


/**
 * 产品资讯评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-12 10:46:16
 */
public interface DiscusschanpinzixunDao extends BaseMapper<DiscusschanpinzixunEntity> {
	
	List<DiscusschanpinzixunVO> selectListVO(@Param("ew") Wrapper<DiscusschanpinzixunEntity> wrapper);
	
	DiscusschanpinzixunVO selectVO(@Param("ew") Wrapper<DiscusschanpinzixunEntity> wrapper);
	
	List<DiscusschanpinzixunView> selectListView(@Param("ew") Wrapper<DiscusschanpinzixunEntity> wrapper);

	List<DiscusschanpinzixunView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschanpinzixunEntity> wrapper);
	
	DiscusschanpinzixunView selectView(@Param("ew") Wrapper<DiscusschanpinzixunEntity> wrapper);
	
}
