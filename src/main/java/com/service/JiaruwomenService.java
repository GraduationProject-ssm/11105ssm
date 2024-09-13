package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaruwomenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaruwomenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaruwomenView;


/**
 * 加入我们
 *
 * @author 
 * @email 
 * @date 2021-04-12 10:46:16
 */
public interface JiaruwomenService extends IService<JiaruwomenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaruwomenVO> selectListVO(Wrapper<JiaruwomenEntity> wrapper);
   	
   	JiaruwomenVO selectVO(@Param("ew") Wrapper<JiaruwomenEntity> wrapper);
   	
   	List<JiaruwomenView> selectListView(Wrapper<JiaruwomenEntity> wrapper);
   	
   	JiaruwomenView selectView(@Param("ew") Wrapper<JiaruwomenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaruwomenEntity> wrapper);
   	
}

