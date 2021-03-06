package com.hatcher.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 订单状态表;订单的每个状态更改都需要进行记录
 * 10：待付款  20：已付款，待发货  30：已发货，待收货（7天自动确认）  40：交易成功（此时可以评价）50：交易关闭（待付款时，用户取消 或 长时间未付款，系统识别后自动关闭）
 * 退货/退货，此分支流程不做，所以不加入
 * </p>
 *
 * @author HatcherCheung
 * @since 2021-10-05
 */
@TableName("order_status")
@ApiModel(value = "OrderStatus对象", description = "订单状态表;订单的每个状态更改都需要进行记录 10：待付款 20：已付款，待发货 30：已发货，待收货（7天自动确认）  40：交易成功（此时可以评价）50：交易关闭（待付款时，用户取消 或 长时间未付款，系统识别后自动关闭） 退货/退货，此分支流程不做，所以不加入")
public class OrderStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("订单ID;对应订单表的主键id")
    @TableId
    private String orderId;

    @ApiModelProperty("订单状态")
    private Integer orderStatus;

    @ApiModelProperty("订单创建时间;对应[10:待付款]状态")
    private LocalDateTime createdTime;

    @ApiModelProperty("支付成功时间;对应[20:已付款，待发货]状态")
    private LocalDateTime payTime;

    @ApiModelProperty("发货时间;对应[30：已发货，待收货]状态")
    private LocalDateTime deliverTime;

    @ApiModelProperty("交易成功时间;对应[40：交易成功]状态")
    private LocalDateTime successTime;

    @ApiModelProperty("交易关闭时间;对应[50：交易关闭]状态")
    private LocalDateTime closeTime;

    @ApiModelProperty("留言时间;用户在交易成功后的留言时间")
    private LocalDateTime commentTime;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public LocalDateTime getPayTime() {
        return payTime;
    }

    public void setPayTime(LocalDateTime payTime) {
        this.payTime = payTime;
    }

    public LocalDateTime getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(LocalDateTime deliverTime) {
        this.deliverTime = deliverTime;
    }

    public LocalDateTime getSuccessTime() {
        return successTime;
    }

    public void setSuccessTime(LocalDateTime successTime) {
        this.successTime = successTime;
    }

    public LocalDateTime getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(LocalDateTime closeTime) {
        this.closeTime = closeTime;
    }

    public LocalDateTime getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(LocalDateTime commentTime) {
        this.commentTime = commentTime;
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "orderId=" + orderId +
                ", orderStatus=" + orderStatus +
                ", createdTime=" + createdTime +
                ", payTime=" + payTime +
                ", deliverTime=" + deliverTime +
                ", successTime=" + successTime +
                ", closeTime=" + closeTime +
                ", commentTime=" + commentTime +
                "}";
    }
}
