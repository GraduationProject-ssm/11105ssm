package com.entity.model;

import com.entity.JiaruwomenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 加入我们
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-12 10:46:16
 */
public class JiaruwomenModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 招聘人数
	 */
	
	private Integer zhaopinrenshu;
		
	/**
	 * 职位要求
	 */
	
	private String zhiweiyaoqiu;
		
	/**
	 * 工资待遇
	 */
	
	private String gongzidaiyu;
		
	/**
	 * 投递邮箱
	 */
	
	private String toudiyouxiang;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：招聘人数
	 */
	 
	public void setZhaopinrenshu(Integer zhaopinrenshu) {
		this.zhaopinrenshu = zhaopinrenshu;
	}
	
	/**
	 * 获取：招聘人数
	 */
	public Integer getZhaopinrenshu() {
		return zhaopinrenshu;
	}
				
	
	/**
	 * 设置：职位要求
	 */
	 
	public void setZhiweiyaoqiu(String zhiweiyaoqiu) {
		this.zhiweiyaoqiu = zhiweiyaoqiu;
	}
	
	/**
	 * 获取：职位要求
	 */
	public String getZhiweiyaoqiu() {
		return zhiweiyaoqiu;
	}
				
	
	/**
	 * 设置：工资待遇
	 */
	 
	public void setGongzidaiyu(String gongzidaiyu) {
		this.gongzidaiyu = gongzidaiyu;
	}
	
	/**
	 * 获取：工资待遇
	 */
	public String getGongzidaiyu() {
		return gongzidaiyu;
	}
				
	
	/**
	 * 设置：投递邮箱
	 */
	 
	public void setToudiyouxiang(String toudiyouxiang) {
		this.toudiyouxiang = toudiyouxiang;
	}
	
	/**
	 * 获取：投递邮箱
	 */
	public String getToudiyouxiang() {
		return toudiyouxiang;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
