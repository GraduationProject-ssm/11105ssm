package com.entity.view;

import com.entity.JiaruwomenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 加入我们
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-12 10:46:16
 */
@TableName("jiaruwomen")
public class JiaruwomenView  extends JiaruwomenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaruwomenView(){
	}
 
 	public JiaruwomenView(JiaruwomenEntity jiaruwomenEntity){
 	try {
			BeanUtils.copyProperties(this, jiaruwomenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
