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


import com.dao.JiaruwomenDao;
import com.entity.JiaruwomenEntity;
import com.service.JiaruwomenService;
import com.entity.vo.JiaruwomenVO;
import com.entity.view.JiaruwomenView;

@Service("jiaruwomenService")
public class JiaruwomenServiceImpl extends ServiceImpl<JiaruwomenDao, JiaruwomenEntity> implements JiaruwomenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaruwomenEntity> page = this.selectPage(
                new Query<JiaruwomenEntity>(params).getPage(),
                new EntityWrapper<JiaruwomenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaruwomenEntity> wrapper) {
		  Page<JiaruwomenView> page =new Query<JiaruwomenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaruwomenVO> selectListVO(Wrapper<JiaruwomenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaruwomenVO selectVO(Wrapper<JiaruwomenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaruwomenView> selectListView(Wrapper<JiaruwomenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaruwomenView selectView(Wrapper<JiaruwomenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
