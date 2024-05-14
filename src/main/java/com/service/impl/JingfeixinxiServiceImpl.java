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


import com.dao.JingfeixinxiDao;
import com.entity.JingfeixinxiEntity;
import com.service.JingfeixinxiService;
import com.entity.vo.JingfeixinxiVO;
import com.entity.view.JingfeixinxiView;

@Service("jingfeixinxiService")
public class JingfeixinxiServiceImpl extends ServiceImpl<JingfeixinxiDao, JingfeixinxiEntity> implements JingfeixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingfeixinxiEntity> page = this.selectPage(
                new Query<JingfeixinxiEntity>(params).getPage(),
                new EntityWrapper<JingfeixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingfeixinxiEntity> wrapper) {
		  Page<JingfeixinxiView> page =new Query<JingfeixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingfeixinxiVO> selectListVO(Wrapper<JingfeixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingfeixinxiVO selectVO(Wrapper<JingfeixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingfeixinxiView> selectListView(Wrapper<JingfeixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingfeixinxiView selectView(Wrapper<JingfeixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
