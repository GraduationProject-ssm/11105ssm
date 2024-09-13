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


import com.dao.ChanpinzixunDao;
import com.entity.ChanpinzixunEntity;
import com.service.ChanpinzixunService;
import com.entity.vo.ChanpinzixunVO;
import com.entity.view.ChanpinzixunView;

@Service("chanpinzixunService")
public class ChanpinzixunServiceImpl extends ServiceImpl<ChanpinzixunDao, ChanpinzixunEntity> implements ChanpinzixunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChanpinzixunEntity> page = this.selectPage(
                new Query<ChanpinzixunEntity>(params).getPage(),
                new EntityWrapper<ChanpinzixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChanpinzixunEntity> wrapper) {
		  Page<ChanpinzixunView> page =new Query<ChanpinzixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChanpinzixunVO> selectListVO(Wrapper<ChanpinzixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChanpinzixunVO selectVO(Wrapper<ChanpinzixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChanpinzixunView> selectListView(Wrapper<ChanpinzixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChanpinzixunView selectView(Wrapper<ChanpinzixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
