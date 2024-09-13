package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusschanpinzixunDao;
import com.entity.DiscusschanpinzixunEntity;
import com.service.DiscusschanpinzixunService;
import com.entity.vo.DiscusschanpinzixunVO;
import com.entity.view.DiscusschanpinzixunView;

@Service("discusschanpinzixunService")
public class DiscusschanpinzixunServiceImpl extends ServiceImpl<DiscusschanpinzixunDao, DiscusschanpinzixunEntity> implements DiscusschanpinzixunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschanpinzixunEntity> page = this.selectPage(
                new Query<DiscusschanpinzixunEntity>(params).getPage(),
                new EntityWrapper<DiscusschanpinzixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschanpinzixunEntity> wrapper) {
		  Page<DiscusschanpinzixunView> page =new Query<DiscusschanpinzixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusschanpinzixunVO> selectListVO(Wrapper<DiscusschanpinzixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschanpinzixunVO selectVO(Wrapper<DiscusschanpinzixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschanpinzixunView> selectListView(Wrapper<DiscusschanpinzixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschanpinzixunView selectView(Wrapper<DiscusschanpinzixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
