package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChanpinzixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChanpinzixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChanpinzixunView;


/**
 * 产品资讯
 *
 * @author 
 * @email 
 * @date 2021-04-12 10:46:16
 */
public interface ChanpinzixunService extends IService<ChanpinzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChanpinzixunVO> selectListVO(Wrapper<ChanpinzixunEntity> wrapper);
   	
   	ChanpinzixunVO selectVO(@Param("ew") Wrapper<ChanpinzixunEntity> wrapper);
   	
   	List<ChanpinzixunView> selectListView(Wrapper<ChanpinzixunEntity> wrapper);
   	
   	ChanpinzixunView selectView(@Param("ew") Wrapper<ChanpinzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChanpinzixunEntity> wrapper);
   	
}

