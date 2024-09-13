package com.dao;

import com.entity.ChanpinzixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChanpinzixunVO;
import com.entity.view.ChanpinzixunView;


/**
 * 产品资讯
 * 
 * @author 
 * @email 
 * @date 2021-04-12 10:46:16
 */
public interface ChanpinzixunDao extends BaseMapper<ChanpinzixunEntity> {
	
	List<ChanpinzixunVO> selectListVO(@Param("ew") Wrapper<ChanpinzixunEntity> wrapper);
	
	ChanpinzixunVO selectVO(@Param("ew") Wrapper<ChanpinzixunEntity> wrapper);
	
	List<ChanpinzixunView> selectListView(@Param("ew") Wrapper<ChanpinzixunEntity> wrapper);

	List<ChanpinzixunView> selectListView(Pagination page,@Param("ew") Wrapper<ChanpinzixunEntity> wrapper);
	
	ChanpinzixunView selectView(@Param("ew") Wrapper<ChanpinzixunEntity> wrapper);
	
}
