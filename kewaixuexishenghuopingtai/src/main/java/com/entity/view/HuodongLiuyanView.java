package com.entity.view;

import com.entity.HuodongLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 线下活动留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("huodong_liuyan")
public class HuodongLiuyanView extends HuodongLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 huodong
			/**
			* 线下活动 的 老师
			*/
			private Integer huodongLaoshiId;
			/**
			* 线下活动名称
			*/
			private String huodongName;
			/**
			* 线下活动照片
			*/
			private String huodongPhoto;
			/**
			* 线下活动类型
			*/
			private Integer huodongTypes;
				/**
				* 线下活动类型的值
				*/
				private String huodongValue;
			/**
			* 点击次数
			*/
			private Integer huodongClicknum;
			/**
			* 逻辑删除
			*/
			private Integer huodongDelete;
			/**
			* 线下活动介绍
			*/
			private String huodongContent;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;

		//级联表 yonghu
			/**
			* 学号
			*/
			private String yonghuUuidNumber;
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 班级
			*/
			private Integer banjiTypes;
				/**
				* 班级的值
				*/
				private String banjiValue;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public HuodongLiuyanView() {

	}

	public HuodongLiuyanView(HuodongLiuyanEntity huodongLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, huodongLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




























				//级联表的get和set huodong
					/**
					* 获取：线下活动 的 老师
					*/
					public Integer getHuodongLaoshiId() {
						return huodongLaoshiId;
					}
					/**
					* 设置：线下活动 的 老师
					*/
					public void setHuodongLaoshiId(Integer huodongLaoshiId) {
						this.huodongLaoshiId = huodongLaoshiId;
					}

					/**
					* 获取： 线下活动名称
					*/
					public String getHuodongName() {
						return huodongName;
					}
					/**
					* 设置： 线下活动名称
					*/
					public void setHuodongName(String huodongName) {
						this.huodongName = huodongName;
					}
					/**
					* 获取： 线下活动照片
					*/
					public String getHuodongPhoto() {
						return huodongPhoto;
					}
					/**
					* 设置： 线下活动照片
					*/
					public void setHuodongPhoto(String huodongPhoto) {
						this.huodongPhoto = huodongPhoto;
					}
					/**
					* 获取： 线下活动类型
					*/
					public Integer getHuodongTypes() {
						return huodongTypes;
					}
					/**
					* 设置： 线下活动类型
					*/
					public void setHuodongTypes(Integer huodongTypes) {
						this.huodongTypes = huodongTypes;
					}


						/**
						* 获取： 线下活动类型的值
						*/
						public String getHuodongValue() {
							return huodongValue;
						}
						/**
						* 设置： 线下活动类型的值
						*/
						public void setHuodongValue(String huodongValue) {
							this.huodongValue = huodongValue;
						}
					/**
					* 获取： 点击次数
					*/
					public Integer getHuodongClicknum() {
						return huodongClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setHuodongClicknum(Integer huodongClicknum) {
						this.huodongClicknum = huodongClicknum;
					}
					/**
					* 获取： 逻辑删除
					*/
					public Integer getHuodongDelete() {
						return huodongDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setHuodongDelete(Integer huodongDelete) {
						this.huodongDelete = huodongDelete;
					}
					/**
					* 获取： 线下活动介绍
					*/
					public String getHuodongContent() {
						return huodongContent;
					}
					/**
					* 设置： 线下活动介绍
					*/
					public void setHuodongContent(String huodongContent) {
						this.huodongContent = huodongContent;
					}
					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

























				//级联表的get和set yonghu
					/**
					* 获取： 学号
					*/
					public String getYonghuUuidNumber() {
						return yonghuUuidNumber;
					}
					/**
					* 设置： 学号
					*/
					public void setYonghuUuidNumber(String yonghuUuidNumber) {
						this.yonghuUuidNumber = yonghuUuidNumber;
					}
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 班级
					*/
					public Integer getBanjiTypes() {
						return banjiTypes;
					}
					/**
					* 设置： 班级
					*/
					public void setBanjiTypes(Integer banjiTypes) {
						this.banjiTypes = banjiTypes;
					}


						/**
						* 获取： 班级的值
						*/
						public String getBanjiValue() {
							return banjiValue;
						}
						/**
						* 设置： 班级的值
						*/
						public void setBanjiValue(String banjiValue) {
							this.banjiValue = banjiValue;
						}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}



}
