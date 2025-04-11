package com.entity.vo;

import com.entity.HuodongOrderEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 线下活动预约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("huodong_order")
public class HuodongOrderVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 线下活动
     */

    @TableField(value = "huodong_id")
    private Integer huodongId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 预约状态
     */

    @TableField(value = "huodong_order_yesno_types")
    private Integer huodongOrderYesnoTypes;


    /**
     * 审核意见
     */

    @TableField(value = "huodong_order_yesno_text")
    private String huodongOrderYesnoText;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：线下活动
	 */
    public Integer getHuodongId() {
        return huodongId;
    }


    /**
	 * 获取：线下活动
	 */

    public void setHuodongId(Integer huodongId) {
        this.huodongId = huodongId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：预约状态
	 */
    public Integer getHuodongOrderYesnoTypes() {
        return huodongOrderYesnoTypes;
    }


    /**
	 * 获取：预约状态
	 */

    public void setHuodongOrderYesnoTypes(Integer huodongOrderYesnoTypes) {
        this.huodongOrderYesnoTypes = huodongOrderYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getHuodongOrderYesnoText() {
        return huodongOrderYesnoText;
    }


    /**
	 * 获取：审核意见
	 */

    public void setHuodongOrderYesnoText(String huodongOrderYesnoText) {
        this.huodongOrderYesnoText = huodongOrderYesnoText;
    }
    /**
	 * 设置：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：订单创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
