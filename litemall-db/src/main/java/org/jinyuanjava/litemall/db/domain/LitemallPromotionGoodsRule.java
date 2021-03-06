package org.jinyuanjava.litemall.db.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class LitemallPromotionGoodsRule {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table litemall_promotion_goods_rule
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean NOT_DELETED = false;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table litemall_promotion_goods_rule
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean IS_DELETED = true;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rule.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rule.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rule.begin_date
     *
     * @mbg.generated
     */
    private LocalDateTime beginDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rule.end_date
     *
     * @mbg.generated
     */
    private LocalDateTime endDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rule.expire_flag
     *
     * @mbg.generated
     */
    private Boolean expireFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rule.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rule.pic_url
     *
     * @mbg.generated
     */
    private String picUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rule.free_post
     *
     * @mbg.generated
     */
    private Boolean freePost;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rule.if_only_use_bonus
     *
     * @mbg.generated
     */
    private Boolean ifOnlyUseBonus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rule.if_use_coupon
     *
     * @mbg.generated
     */
    private Boolean ifUseCoupon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rule.if_use_bonus
     *
     * @mbg.generated
     */
    private Boolean ifUseBonus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rule.if_allow_addcart
     *
     * @mbg.generated
     */
    private Boolean ifAllowAddcart;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rule.goods_count
     *
     * @mbg.generated
     */
    private Integer goodsCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rule.add_time
     *
     * @mbg.generated
     */
    private LocalDateTime addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rule.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rule.deleted
     *
     * @mbg.generated
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rule.id
     *
     * @return the value of litemall_promotion_goods_rule.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rule.id
     *
     * @param id the value for litemall_promotion_goods_rule.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rule.name
     *
     * @return the value of litemall_promotion_goods_rule.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rule.name
     *
     * @param name the value for litemall_promotion_goods_rule.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rule.begin_date
     *
     * @return the value of litemall_promotion_goods_rule.begin_date
     *
     * @mbg.generated
     */
    public LocalDateTime getBeginDate() {
        return beginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rule.begin_date
     *
     * @param beginDate the value for litemall_promotion_goods_rule.begin_date
     *
     * @mbg.generated
     */
    public void setBeginDate(LocalDateTime beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rule.end_date
     *
     * @return the value of litemall_promotion_goods_rule.end_date
     *
     * @mbg.generated
     */
    public LocalDateTime getEndDate() {
        return endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rule.end_date
     *
     * @param endDate the value for litemall_promotion_goods_rule.end_date
     *
     * @mbg.generated
     */
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rule.expire_flag
     *
     * @return the value of litemall_promotion_goods_rule.expire_flag
     *
     * @mbg.generated
     */
    public Boolean getExpireFlag() {
        return expireFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rule.expire_flag
     *
     * @param expireFlag the value for litemall_promotion_goods_rule.expire_flag
     *
     * @mbg.generated
     */
    public void setExpireFlag(Boolean expireFlag) {
        this.expireFlag = expireFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rule.remark
     *
     * @return the value of litemall_promotion_goods_rule.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rule.remark
     *
     * @param remark the value for litemall_promotion_goods_rule.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rule.pic_url
     *
     * @return the value of litemall_promotion_goods_rule.pic_url
     *
     * @mbg.generated
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rule.pic_url
     *
     * @param picUrl the value for litemall_promotion_goods_rule.pic_url
     *
     * @mbg.generated
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rule.free_post
     *
     * @return the value of litemall_promotion_goods_rule.free_post
     *
     * @mbg.generated
     */
    public Boolean getFreePost() {
        return freePost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rule.free_post
     *
     * @param freePost the value for litemall_promotion_goods_rule.free_post
     *
     * @mbg.generated
     */
    public void setFreePost(Boolean freePost) {
        this.freePost = freePost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rule.if_only_use_bonus
     *
     * @return the value of litemall_promotion_goods_rule.if_only_use_bonus
     *
     * @mbg.generated
     */
    public Boolean getIfOnlyUseBonus() {
        return ifOnlyUseBonus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rule.if_only_use_bonus
     *
     * @param ifOnlyUseBonus the value for litemall_promotion_goods_rule.if_only_use_bonus
     *
     * @mbg.generated
     */
    public void setIfOnlyUseBonus(Boolean ifOnlyUseBonus) {
        this.ifOnlyUseBonus = ifOnlyUseBonus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rule.if_use_coupon
     *
     * @return the value of litemall_promotion_goods_rule.if_use_coupon
     *
     * @mbg.generated
     */
    public Boolean getIfUseCoupon() {
        return ifUseCoupon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rule.if_use_coupon
     *
     * @param ifUseCoupon the value for litemall_promotion_goods_rule.if_use_coupon
     *
     * @mbg.generated
     */
    public void setIfUseCoupon(Boolean ifUseCoupon) {
        this.ifUseCoupon = ifUseCoupon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rule.if_use_bonus
     *
     * @return the value of litemall_promotion_goods_rule.if_use_bonus
     *
     * @mbg.generated
     */
    public Boolean getIfUseBonus() {
        return ifUseBonus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rule.if_use_bonus
     *
     * @param ifUseBonus the value for litemall_promotion_goods_rule.if_use_bonus
     *
     * @mbg.generated
     */
    public void setIfUseBonus(Boolean ifUseBonus) {
        this.ifUseBonus = ifUseBonus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rule.if_allow_addcart
     *
     * @return the value of litemall_promotion_goods_rule.if_allow_addcart
     *
     * @mbg.generated
     */
    public Boolean getIfAllowAddcart() {
        return ifAllowAddcart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rule.if_allow_addcart
     *
     * @param ifAllowAddcart the value for litemall_promotion_goods_rule.if_allow_addcart
     *
     * @mbg.generated
     */
    public void setIfAllowAddcart(Boolean ifAllowAddcart) {
        this.ifAllowAddcart = ifAllowAddcart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rule.goods_count
     *
     * @return the value of litemall_promotion_goods_rule.goods_count
     *
     * @mbg.generated
     */
    public Integer getGoodsCount() {
        return goodsCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rule.goods_count
     *
     * @param goodsCount the value for litemall_promotion_goods_rule.goods_count
     *
     * @mbg.generated
     */
    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rule.add_time
     *
     * @return the value of litemall_promotion_goods_rule.add_time
     *
     * @mbg.generated
     */
    public LocalDateTime getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rule.add_time
     *
     * @param addTime the value for litemall_promotion_goods_rule.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rule.update_time
     *
     * @return the value of litemall_promotion_goods_rule.update_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rule.update_time
     *
     * @param updateTime the value for litemall_promotion_goods_rule.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rule.deleted
     *
     * @return the value of litemall_promotion_goods_rule.deleted
     *
     * @mbg.generated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rule.deleted
     *
     * @param deleted the value for litemall_promotion_goods_rule.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_rule
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", beginDate=").append(beginDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", expireFlag=").append(expireFlag);
        sb.append(", remark=").append(remark);
        sb.append(", picUrl=").append(picUrl);
        sb.append(", freePost=").append(freePost);
        sb.append(", ifOnlyUseBonus=").append(ifOnlyUseBonus);
        sb.append(", ifUseCoupon=").append(ifUseCoupon);
        sb.append(", ifUseBonus=").append(ifUseBonus);
        sb.append(", ifAllowAddcart=").append(ifAllowAddcart);
        sb.append(", goodsCount=").append(goodsCount);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_rule
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LitemallPromotionGoodsRule other = (LitemallPromotionGoodsRule) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getBeginDate() == null ? other.getBeginDate() == null : this.getBeginDate().equals(other.getBeginDate()))
            && (this.getEndDate() == null ? other.getEndDate() == null : this.getEndDate().equals(other.getEndDate()))
            && (this.getExpireFlag() == null ? other.getExpireFlag() == null : this.getExpireFlag().equals(other.getExpireFlag()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getPicUrl() == null ? other.getPicUrl() == null : this.getPicUrl().equals(other.getPicUrl()))
            && (this.getFreePost() == null ? other.getFreePost() == null : this.getFreePost().equals(other.getFreePost()))
            && (this.getIfOnlyUseBonus() == null ? other.getIfOnlyUseBonus() == null : this.getIfOnlyUseBonus().equals(other.getIfOnlyUseBonus()))
            && (this.getIfUseCoupon() == null ? other.getIfUseCoupon() == null : this.getIfUseCoupon().equals(other.getIfUseCoupon()))
            && (this.getIfUseBonus() == null ? other.getIfUseBonus() == null : this.getIfUseBonus().equals(other.getIfUseBonus()))
            && (this.getIfAllowAddcart() == null ? other.getIfAllowAddcart() == null : this.getIfAllowAddcart().equals(other.getIfAllowAddcart()))
            && (this.getGoodsCount() == null ? other.getGoodsCount() == null : this.getGoodsCount().equals(other.getGoodsCount()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_rule
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getBeginDate() == null) ? 0 : getBeginDate().hashCode());
        result = prime * result + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        result = prime * result + ((getExpireFlag() == null) ? 0 : getExpireFlag().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getPicUrl() == null) ? 0 : getPicUrl().hashCode());
        result = prime * result + ((getFreePost() == null) ? 0 : getFreePost().hashCode());
        result = prime * result + ((getIfOnlyUseBonus() == null) ? 0 : getIfOnlyUseBonus().hashCode());
        result = prime * result + ((getIfUseCoupon() == null) ? 0 : getIfUseCoupon().hashCode());
        result = prime * result + ((getIfUseBonus() == null) ? 0 : getIfUseBonus().hashCode());
        result = prime * result + ((getIfAllowAddcart() == null) ? 0 : getIfAllowAddcart().hashCode());
        result = prime * result + ((getGoodsCount() == null) ? 0 : getGoodsCount().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_rule
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? IS_DELETED : NOT_DELETED);
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table litemall_promotion_goods_rule
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        name("name", "name", "VARCHAR", true),
        beginDate("begin_date", "beginDate", "TIMESTAMP", false),
        endDate("end_date", "endDate", "TIMESTAMP", false),
        expireFlag("expire_flag", "expireFlag", "BIT", false),
        remark("remark", "remark", "VARCHAR", false),
        picUrl("pic_url", "picUrl", "VARCHAR", false),
        freePost("free_post", "freePost", "BIT", false),
        ifOnlyUseBonus("if_only_use_bonus", "ifOnlyUseBonus", "BIT", false),
        ifUseCoupon("if_use_coupon", "ifUseCoupon", "BIT", false),
        ifUseBonus("if_use_bonus", "ifUseBonus", "BIT", false),
        ifAllowAddcart("if_allow_addcart", "ifAllowAddcart", "BIT", false),
        goodsCount("goods_count", "goodsCount", "INTEGER", false),
        addTime("add_time", "addTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        deleted("deleted", "deleted", "BIT", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_promotion_goods_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_promotion_goods_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_promotion_goods_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_promotion_goods_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_promotion_goods_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_promotion_goods_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_promotion_goods_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_promotion_goods_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_promotion_goods_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_promotion_goods_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_promotion_goods_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_promotion_goods_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_promotion_goods_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_promotion_goods_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_promotion_goods_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}