package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 关于我们
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-12 10:46:16
 */
@TableName("guanyuwomen")
public class GuanyuwomenEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GuanyuwomenEntity() {
		
	}
	
	public GuanyuwomenEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 公司名称
	 */
					
	private String gongsimingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：公司名称
	 */
	public void setGongsimingcheng(String gongsimingcheng) {
		this.gongsimingcheng = gongsimingcheng;
	}
	/**
	 * 获取：公司名称
	 */
	public String getGongsimingcheng() {
		return gongsimingcheng;
	}
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
