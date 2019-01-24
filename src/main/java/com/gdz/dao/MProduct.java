package com.gdz.dao;

import java.util.Date;

public class MProduct {
    private Integer id;

    private Integer productId;

    private String productName;

    private Integer status;

    private Integer productType;

    private Integer sortOrder;

    private Integer payMode;

    private Integer isOpen;

    private Integer brandStatus;

    private String brands;

    private Integer roomPriceStart;

    private Integer roomPriceEnd;

    private String memberLevels;

    private String payTypes;

    private Integer refundStatus;

    private String channels;

    private Date effectBeginTime;

    private Date effectEndTime;

    private Integer bundleRatio;

    private Date updateTime;

    private Integer ratioLeft;

    private Integer ratioRight;

    private Integer onlineClaim;

    private Double appOpenLeft;

    private Double appOpenRight;

    private Integer isInsureroomType;

    private String originName;

    private Integer supplier;

    private String shelfType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Integer getPayMode() {
        return payMode;
    }

    public void setPayMode(Integer payMode) {
        this.payMode = payMode;
    }

    public Integer getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Integer isOpen) {
        this.isOpen = isOpen;
    }

    public Integer getBrandStatus() {
        return brandStatus;
    }

    public void setBrandStatus(Integer brandStatus) {
        this.brandStatus = brandStatus;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands == null ? null : brands.trim();
    }

    public Integer getRoomPriceStart() {
        return roomPriceStart;
    }

    public void setRoomPriceStart(Integer roomPriceStart) {
        this.roomPriceStart = roomPriceStart;
    }

    public Integer getRoomPriceEnd() {
        return roomPriceEnd;
    }

    public void setRoomPriceEnd(Integer roomPriceEnd) {
        this.roomPriceEnd = roomPriceEnd;
    }

    public String getMemberLevels() {
        return memberLevels;
    }

    public void setMemberLevels(String memberLevels) {
        this.memberLevels = memberLevels == null ? null : memberLevels.trim();
    }

    public String getPayTypes() {
        return payTypes;
    }

    public void setPayTypes(String payTypes) {
        this.payTypes = payTypes == null ? null : payTypes.trim();
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getChannels() {
        return channels;
    }

    public void setChannels(String channels) {
        this.channels = channels == null ? null : channels.trim();
    }

    public Date getEffectBeginTime() {
        return effectBeginTime;
    }

    public void setEffectBeginTime(Date effectBeginTime) {
        this.effectBeginTime = effectBeginTime;
    }

    public Date getEffectEndTime() {
        return effectEndTime;
    }

    public void setEffectEndTime(Date effectEndTime) {
        this.effectEndTime = effectEndTime;
    }

    public Integer getBundleRatio() {
        return bundleRatio;
    }

    public void setBundleRatio(Integer bundleRatio) {
        this.bundleRatio = bundleRatio;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getRatioLeft() {
        return ratioLeft;
    }

    public void setRatioLeft(Integer ratioLeft) {
        this.ratioLeft = ratioLeft;
    }

    public Integer getRatioRight() {
        return ratioRight;
    }

    public void setRatioRight(Integer ratioRight) {
        this.ratioRight = ratioRight;
    }

    public Integer getOnlineClaim() {
        return onlineClaim;
    }

    public void setOnlineClaim(Integer onlineClaim) {
        this.onlineClaim = onlineClaim;
    }

    public Double getAppOpenLeft() {
        return appOpenLeft;
    }

    public void setAppOpenLeft(Double appOpenLeft) {
        this.appOpenLeft = appOpenLeft;
    }

    public Double getAppOpenRight() {
        return appOpenRight;
    }

    public void setAppOpenRight(Double appOpenRight) {
        this.appOpenRight = appOpenRight;
    }

    public Integer getIsInsureroomType() {
        return isInsureroomType;
    }

    public void setIsInsureroomType(Integer isInsureroomType) {
        this.isInsureroomType = isInsureroomType;
    }

    public String getOriginName() {
        return originName;
    }

    public void setOriginName(String originName) {
        this.originName = originName == null ? null : originName.trim();
    }

    public Integer getSupplier() {
        return supplier;
    }

    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }

    public String getShelfType() {
        return shelfType;
    }

    public void setShelfType(String shelfType) {
        this.shelfType = shelfType == null ? null : shelfType.trim();
    }
}