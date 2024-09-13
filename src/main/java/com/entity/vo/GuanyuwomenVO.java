package com.entity.vo;

import com.entity.GuanyuwomenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 关于我们
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-12 10:46:16
 */
public class GuanyuwomenVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 公司地址
	 */
	
	private String gongsidizhi;
		
	/**
	 * 公司简介
	 */
	
	private String gongsijianjie;
		
	/**
	 * 企业宗旨
	 */
	
	private String qiyezongzhi;
		
	/**
	 * 公司动态
	 */
	
	private String gongsidongtai;
		
	/**
	 * 客户须知
	 */
	
	private String kehuxuzhi;
		
	/**
	 * 版权声明
	 */
	
	private String banquanshengming;
		
	/**
	 * 客服热线
	 */
	
	private String kefurexian;
		
	/**
	 * 图文
	 */
	
	private String tuwen;
				
	
	/**
	 * 设置：公司地址
	 */
	 
	public void setGongsidizhi(String gongsidizhi) {
		this.gongsidizhi = gongsidizhi;
	}
	
	/**
	 * 获取：公司地址
	 */
	public String getGongsidizhi() {
		return gongsidizhi;
	}
				
	
	/**
	 * 设置：公司简介
	 */
	 
	public void setGongsijianjie(String gongsijianjie) {
		this.gongsijianjie = gongsijianjie;
	}
	
	/**
	 * 获取：公司简介
	 */
	public String getGongsijianjie() {
		return gongsijianjie;
	}
				
	
	/**
	 * 设置：企业宗旨
	 */
	 
	public void setQiyezongzhi(String qiyezongzhi) {
		this.qiyezongzhi = qiyezongzhi;
	}
	
	/**
	 * 获取：企业宗旨
	 */
	public String getQiyezongzhi() {
		return qiyezongzhi;
	}
				
	
	/**
	 * 设置：公司动态
	 */
	 
	public void setGongsidongtai(String gongsidongtai) {
		this.gongsidongtai = gongsidongtai;
	}
	
	/**
	 * 获取：公司动态
	 */
	public String getGongsidongtai() {
		return gongsidongtai;
	}
				
	
	/**
	 * 设置：客户须知
	 */
	 
	public void setKehuxuzhi(String kehuxuzhi) {
		this.kehuxuzhi = kehuxuzhi;
	}
	
	/**
	 * 获取：客户须知
	 */
	public String getKehuxuzhi() {
		return kehuxuzhi;
	}
				
	
	/**
	 * 设置：版权声明
	 */
	 
	public void setBanquanshengming(String banquanshengming) {
		this.banquanshengming = banquanshengming;
	}
	
	/**
	 * 获取：版权声明
	 */
	public String getBanquanshengming() {
		return banquanshengming;
	}
				
	
	/**
	 * 设置：客服热线
	 */
	 
	public void setKefurexian(String kefurexian) {
		this.kefurexian = kefurexian;
	}
	
	/**
	 * 获取：客服热线
	 */
	public String getKefurexian() {
		return kefurexian;
	}
				
	
	/**
	 * 设置：图文
	 */
	 
	public void setTuwen(String tuwen) {
		this.tuwen = tuwen;
	}
	
	/**
	 * 获取：图文
	 */
	public String getTuwen() {
		return tuwen;
	}
			
}
