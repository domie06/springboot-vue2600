package com.entity.model;

import com.entity.HuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 线下活动
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HuodongModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 老师
     */
    private Integer laoshiId;


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
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：老师
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }


    /**
	 * 设置：老师
	 */
    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 获取：线下活动名称
	 */
    public String getHuodongName() {
        return huodongName;
    }


    /**
	 * 设置：线下活动名称
	 */
    public void setHuodongName(String huodongName) {
        this.huodongName = huodongName;
    }
    /**
	 * 获取：线下活动照片
	 */
    public String getHuodongPhoto() {
        return huodongPhoto;
    }


    /**
	 * 设置：线下活动照片
	 */
    public void setHuodongPhoto(String huodongPhoto) {
        this.huodongPhoto = huodongPhoto;
    }
    /**
	 * 获取：线下活动类型
	 */
    public Integer getHuodongTypes() {
        return huodongTypes;
    }


    /**
	 * 设置：线下活动类型
	 */
    public void setHuodongTypes(Integer huodongTypes) {
        this.huodongTypes = huodongTypes;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getHuodongClicknum() {
        return huodongClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setHuodongClicknum(Integer huodongClicknum) {
        this.huodongClicknum = huodongClicknum;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getHuodongDelete() {
        return huodongDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setHuodongDelete(Integer huodongDelete) {
        this.huodongDelete = huodongDelete;
    }
    /**
	 * 获取：线下活动介绍
	 */
    public String getHuodongContent() {
        return huodongContent;
    }


    /**
	 * 设置：线下活动介绍
	 */
    public void setHuodongContent(String huodongContent) {
        this.huodongContent = huodongContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
