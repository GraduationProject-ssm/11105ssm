package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschanpinzixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschanpinzixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschanpinzixunView;


/**
 * 产品资讯评论表
 *
 * @author 
 * @email 
 * @date 2021-04-12 10:46:16
 */
public interface DiscusschanpinzixunService extends IService<DiscusschanpinzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschanpinzixunVO> selectListVO(Wrapper<DiscusschanpinzixunEntity> wrapper);
   	
   	DiscusschanpinzixunVO selectVO(@Param("ew") Wrapper<DiscusschanpinzixunEntity> wrapper);
   	
   	List<DiscusschanpinzixunView> selectListView(Wrapper<DiscusschanpinzixunEntity> wrapper);
   	
   	DiscusschanpinzixunView selectView(@Param("ew") Wrapper<DiscusschanpinzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschanpinzixunEntity> wrapper);
   	
}

