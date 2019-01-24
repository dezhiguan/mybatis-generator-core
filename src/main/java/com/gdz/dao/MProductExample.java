package com.gdz.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(Integer value) {
            addCriterion("product_type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(Integer value) {
            addCriterion("product_type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(Integer value) {
            addCriterion("product_type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(Integer value) {
            addCriterion("product_type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(Integer value) {
            addCriterion("product_type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<Integer> values) {
            addCriterion("product_type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<Integer> values) {
            addCriterion("product_type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(Integer value1, Integer value2) {
            addCriterion("product_type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("product_type not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andSortOrderIsNull() {
            addCriterion("sort_order is null");
            return (Criteria) this;
        }

        public Criteria andSortOrderIsNotNull() {
            addCriterion("sort_order is not null");
            return (Criteria) this;
        }

        public Criteria andSortOrderEqualTo(Integer value) {
            addCriterion("sort_order =", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotEqualTo(Integer value) {
            addCriterion("sort_order <>", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderGreaterThan(Integer value) {
            addCriterion("sort_order >", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_order >=", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderLessThan(Integer value) {
            addCriterion("sort_order <", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderLessThanOrEqualTo(Integer value) {
            addCriterion("sort_order <=", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderIn(List<Integer> values) {
            addCriterion("sort_order in", values, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotIn(List<Integer> values) {
            addCriterion("sort_order not in", values, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderBetween(Integer value1, Integer value2) {
            addCriterion("sort_order between", value1, value2, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_order not between", value1, value2, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andPayModeIsNull() {
            addCriterion("pay_mode is null");
            return (Criteria) this;
        }

        public Criteria andPayModeIsNotNull() {
            addCriterion("pay_mode is not null");
            return (Criteria) this;
        }

        public Criteria andPayModeEqualTo(Integer value) {
            addCriterion("pay_mode =", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotEqualTo(Integer value) {
            addCriterion("pay_mode <>", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeGreaterThan(Integer value) {
            addCriterion("pay_mode >", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_mode >=", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeLessThan(Integer value) {
            addCriterion("pay_mode <", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_mode <=", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeIn(List<Integer> values) {
            addCriterion("pay_mode in", values, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotIn(List<Integer> values) {
            addCriterion("pay_mode not in", values, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeBetween(Integer value1, Integer value2) {
            addCriterion("pay_mode between", value1, value2, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_mode not between", value1, value2, "payMode");
            return (Criteria) this;
        }

        public Criteria andIsOpenIsNull() {
            addCriterion("is_open is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenIsNotNull() {
            addCriterion("is_open is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenEqualTo(Integer value) {
            addCriterion("is_open =", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotEqualTo(Integer value) {
            addCriterion("is_open <>", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenGreaterThan(Integer value) {
            addCriterion("is_open >", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_open >=", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLessThan(Integer value) {
            addCriterion("is_open <", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLessThanOrEqualTo(Integer value) {
            addCriterion("is_open <=", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenIn(List<Integer> values) {
            addCriterion("is_open in", values, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotIn(List<Integer> values) {
            addCriterion("is_open not in", values, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenBetween(Integer value1, Integer value2) {
            addCriterion("is_open between", value1, value2, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotBetween(Integer value1, Integer value2) {
            addCriterion("is_open not between", value1, value2, "isOpen");
            return (Criteria) this;
        }

        public Criteria andBrandStatusIsNull() {
            addCriterion("brand_status is null");
            return (Criteria) this;
        }

        public Criteria andBrandStatusIsNotNull() {
            addCriterion("brand_status is not null");
            return (Criteria) this;
        }

        public Criteria andBrandStatusEqualTo(Integer value) {
            addCriterion("brand_status =", value, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusNotEqualTo(Integer value) {
            addCriterion("brand_status <>", value, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusGreaterThan(Integer value) {
            addCriterion("brand_status >", value, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_status >=", value, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusLessThan(Integer value) {
            addCriterion("brand_status <", value, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusLessThanOrEqualTo(Integer value) {
            addCriterion("brand_status <=", value, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusIn(List<Integer> values) {
            addCriterion("brand_status in", values, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusNotIn(List<Integer> values) {
            addCriterion("brand_status not in", values, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusBetween(Integer value1, Integer value2) {
            addCriterion("brand_status between", value1, value2, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_status not between", value1, value2, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandsIsNull() {
            addCriterion("brands is null");
            return (Criteria) this;
        }

        public Criteria andBrandsIsNotNull() {
            addCriterion("brands is not null");
            return (Criteria) this;
        }

        public Criteria andBrandsEqualTo(String value) {
            addCriterion("brands =", value, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsNotEqualTo(String value) {
            addCriterion("brands <>", value, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsGreaterThan(String value) {
            addCriterion("brands >", value, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsGreaterThanOrEqualTo(String value) {
            addCriterion("brands >=", value, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsLessThan(String value) {
            addCriterion("brands <", value, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsLessThanOrEqualTo(String value) {
            addCriterion("brands <=", value, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsLike(String value) {
            addCriterion("brands like", value, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsNotLike(String value) {
            addCriterion("brands not like", value, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsIn(List<String> values) {
            addCriterion("brands in", values, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsNotIn(List<String> values) {
            addCriterion("brands not in", values, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsBetween(String value1, String value2) {
            addCriterion("brands between", value1, value2, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsNotBetween(String value1, String value2) {
            addCriterion("brands not between", value1, value2, "brands");
            return (Criteria) this;
        }

        public Criteria andRoomPriceStartIsNull() {
            addCriterion("room_price_start is null");
            return (Criteria) this;
        }

        public Criteria andRoomPriceStartIsNotNull() {
            addCriterion("room_price_start is not null");
            return (Criteria) this;
        }

        public Criteria andRoomPriceStartEqualTo(Integer value) {
            addCriterion("room_price_start =", value, "roomPriceStart");
            return (Criteria) this;
        }

        public Criteria andRoomPriceStartNotEqualTo(Integer value) {
            addCriterion("room_price_start <>", value, "roomPriceStart");
            return (Criteria) this;
        }

        public Criteria andRoomPriceStartGreaterThan(Integer value) {
            addCriterion("room_price_start >", value, "roomPriceStart");
            return (Criteria) this;
        }

        public Criteria andRoomPriceStartGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_price_start >=", value, "roomPriceStart");
            return (Criteria) this;
        }

        public Criteria andRoomPriceStartLessThan(Integer value) {
            addCriterion("room_price_start <", value, "roomPriceStart");
            return (Criteria) this;
        }

        public Criteria andRoomPriceStartLessThanOrEqualTo(Integer value) {
            addCriterion("room_price_start <=", value, "roomPriceStart");
            return (Criteria) this;
        }

        public Criteria andRoomPriceStartIn(List<Integer> values) {
            addCriterion("room_price_start in", values, "roomPriceStart");
            return (Criteria) this;
        }

        public Criteria andRoomPriceStartNotIn(List<Integer> values) {
            addCriterion("room_price_start not in", values, "roomPriceStart");
            return (Criteria) this;
        }

        public Criteria andRoomPriceStartBetween(Integer value1, Integer value2) {
            addCriterion("room_price_start between", value1, value2, "roomPriceStart");
            return (Criteria) this;
        }

        public Criteria andRoomPriceStartNotBetween(Integer value1, Integer value2) {
            addCriterion("room_price_start not between", value1, value2, "roomPriceStart");
            return (Criteria) this;
        }

        public Criteria andRoomPriceEndIsNull() {
            addCriterion("room_price_end is null");
            return (Criteria) this;
        }

        public Criteria andRoomPriceEndIsNotNull() {
            addCriterion("room_price_end is not null");
            return (Criteria) this;
        }

        public Criteria andRoomPriceEndEqualTo(Integer value) {
            addCriterion("room_price_end =", value, "roomPriceEnd");
            return (Criteria) this;
        }

        public Criteria andRoomPriceEndNotEqualTo(Integer value) {
            addCriterion("room_price_end <>", value, "roomPriceEnd");
            return (Criteria) this;
        }

        public Criteria andRoomPriceEndGreaterThan(Integer value) {
            addCriterion("room_price_end >", value, "roomPriceEnd");
            return (Criteria) this;
        }

        public Criteria andRoomPriceEndGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_price_end >=", value, "roomPriceEnd");
            return (Criteria) this;
        }

        public Criteria andRoomPriceEndLessThan(Integer value) {
            addCriterion("room_price_end <", value, "roomPriceEnd");
            return (Criteria) this;
        }

        public Criteria andRoomPriceEndLessThanOrEqualTo(Integer value) {
            addCriterion("room_price_end <=", value, "roomPriceEnd");
            return (Criteria) this;
        }

        public Criteria andRoomPriceEndIn(List<Integer> values) {
            addCriterion("room_price_end in", values, "roomPriceEnd");
            return (Criteria) this;
        }

        public Criteria andRoomPriceEndNotIn(List<Integer> values) {
            addCriterion("room_price_end not in", values, "roomPriceEnd");
            return (Criteria) this;
        }

        public Criteria andRoomPriceEndBetween(Integer value1, Integer value2) {
            addCriterion("room_price_end between", value1, value2, "roomPriceEnd");
            return (Criteria) this;
        }

        public Criteria andRoomPriceEndNotBetween(Integer value1, Integer value2) {
            addCriterion("room_price_end not between", value1, value2, "roomPriceEnd");
            return (Criteria) this;
        }

        public Criteria andMemberLevelsIsNull() {
            addCriterion("member_levels is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelsIsNotNull() {
            addCriterion("member_levels is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelsEqualTo(String value) {
            addCriterion("member_levels =", value, "memberLevels");
            return (Criteria) this;
        }

        public Criteria andMemberLevelsNotEqualTo(String value) {
            addCriterion("member_levels <>", value, "memberLevels");
            return (Criteria) this;
        }

        public Criteria andMemberLevelsGreaterThan(String value) {
            addCriterion("member_levels >", value, "memberLevels");
            return (Criteria) this;
        }

        public Criteria andMemberLevelsGreaterThanOrEqualTo(String value) {
            addCriterion("member_levels >=", value, "memberLevels");
            return (Criteria) this;
        }

        public Criteria andMemberLevelsLessThan(String value) {
            addCriterion("member_levels <", value, "memberLevels");
            return (Criteria) this;
        }

        public Criteria andMemberLevelsLessThanOrEqualTo(String value) {
            addCriterion("member_levels <=", value, "memberLevels");
            return (Criteria) this;
        }

        public Criteria andMemberLevelsLike(String value) {
            addCriterion("member_levels like", value, "memberLevels");
            return (Criteria) this;
        }

        public Criteria andMemberLevelsNotLike(String value) {
            addCriterion("member_levels not like", value, "memberLevels");
            return (Criteria) this;
        }

        public Criteria andMemberLevelsIn(List<String> values) {
            addCriterion("member_levels in", values, "memberLevels");
            return (Criteria) this;
        }

        public Criteria andMemberLevelsNotIn(List<String> values) {
            addCriterion("member_levels not in", values, "memberLevels");
            return (Criteria) this;
        }

        public Criteria andMemberLevelsBetween(String value1, String value2) {
            addCriterion("member_levels between", value1, value2, "memberLevels");
            return (Criteria) this;
        }

        public Criteria andMemberLevelsNotBetween(String value1, String value2) {
            addCriterion("member_levels not between", value1, value2, "memberLevels");
            return (Criteria) this;
        }

        public Criteria andPayTypesIsNull() {
            addCriterion("pay_types is null");
            return (Criteria) this;
        }

        public Criteria andPayTypesIsNotNull() {
            addCriterion("pay_types is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypesEqualTo(String value) {
            addCriterion("pay_types =", value, "payTypes");
            return (Criteria) this;
        }

        public Criteria andPayTypesNotEqualTo(String value) {
            addCriterion("pay_types <>", value, "payTypes");
            return (Criteria) this;
        }

        public Criteria andPayTypesGreaterThan(String value) {
            addCriterion("pay_types >", value, "payTypes");
            return (Criteria) this;
        }

        public Criteria andPayTypesGreaterThanOrEqualTo(String value) {
            addCriterion("pay_types >=", value, "payTypes");
            return (Criteria) this;
        }

        public Criteria andPayTypesLessThan(String value) {
            addCriterion("pay_types <", value, "payTypes");
            return (Criteria) this;
        }

        public Criteria andPayTypesLessThanOrEqualTo(String value) {
            addCriterion("pay_types <=", value, "payTypes");
            return (Criteria) this;
        }

        public Criteria andPayTypesLike(String value) {
            addCriterion("pay_types like", value, "payTypes");
            return (Criteria) this;
        }

        public Criteria andPayTypesNotLike(String value) {
            addCriterion("pay_types not like", value, "payTypes");
            return (Criteria) this;
        }

        public Criteria andPayTypesIn(List<String> values) {
            addCriterion("pay_types in", values, "payTypes");
            return (Criteria) this;
        }

        public Criteria andPayTypesNotIn(List<String> values) {
            addCriterion("pay_types not in", values, "payTypes");
            return (Criteria) this;
        }

        public Criteria andPayTypesBetween(String value1, String value2) {
            addCriterion("pay_types between", value1, value2, "payTypes");
            return (Criteria) this;
        }

        public Criteria andPayTypesNotBetween(String value1, String value2) {
            addCriterion("pay_types not between", value1, value2, "payTypes");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNull() {
            addCriterion("refund_status is null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNotNull() {
            addCriterion("refund_status is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusEqualTo(Integer value) {
            addCriterion("refund_status =", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotEqualTo(Integer value) {
            addCriterion("refund_status <>", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThan(Integer value) {
            addCriterion("refund_status >", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_status >=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThan(Integer value) {
            addCriterion("refund_status <", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanOrEqualTo(Integer value) {
            addCriterion("refund_status <=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIn(List<Integer> values) {
            addCriterion("refund_status in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotIn(List<Integer> values) {
            addCriterion("refund_status not in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusBetween(Integer value1, Integer value2) {
            addCriterion("refund_status between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_status not between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andChannelsIsNull() {
            addCriterion("channels is null");
            return (Criteria) this;
        }

        public Criteria andChannelsIsNotNull() {
            addCriterion("channels is not null");
            return (Criteria) this;
        }

        public Criteria andChannelsEqualTo(String value) {
            addCriterion("channels =", value, "channels");
            return (Criteria) this;
        }

        public Criteria andChannelsNotEqualTo(String value) {
            addCriterion("channels <>", value, "channels");
            return (Criteria) this;
        }

        public Criteria andChannelsGreaterThan(String value) {
            addCriterion("channels >", value, "channels");
            return (Criteria) this;
        }

        public Criteria andChannelsGreaterThanOrEqualTo(String value) {
            addCriterion("channels >=", value, "channels");
            return (Criteria) this;
        }

        public Criteria andChannelsLessThan(String value) {
            addCriterion("channels <", value, "channels");
            return (Criteria) this;
        }

        public Criteria andChannelsLessThanOrEqualTo(String value) {
            addCriterion("channels <=", value, "channels");
            return (Criteria) this;
        }

        public Criteria andChannelsLike(String value) {
            addCriterion("channels like", value, "channels");
            return (Criteria) this;
        }

        public Criteria andChannelsNotLike(String value) {
            addCriterion("channels not like", value, "channels");
            return (Criteria) this;
        }

        public Criteria andChannelsIn(List<String> values) {
            addCriterion("channels in", values, "channels");
            return (Criteria) this;
        }

        public Criteria andChannelsNotIn(List<String> values) {
            addCriterion("channels not in", values, "channels");
            return (Criteria) this;
        }

        public Criteria andChannelsBetween(String value1, String value2) {
            addCriterion("channels between", value1, value2, "channels");
            return (Criteria) this;
        }

        public Criteria andChannelsNotBetween(String value1, String value2) {
            addCriterion("channels not between", value1, value2, "channels");
            return (Criteria) this;
        }

        public Criteria andEffectBeginTimeIsNull() {
            addCriterion("effect_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andEffectBeginTimeIsNotNull() {
            addCriterion("effect_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andEffectBeginTimeEqualTo(Date value) {
            addCriterion("effect_begin_time =", value, "effectBeginTime");
            return (Criteria) this;
        }

        public Criteria andEffectBeginTimeNotEqualTo(Date value) {
            addCriterion("effect_begin_time <>", value, "effectBeginTime");
            return (Criteria) this;
        }

        public Criteria andEffectBeginTimeGreaterThan(Date value) {
            addCriterion("effect_begin_time >", value, "effectBeginTime");
            return (Criteria) this;
        }

        public Criteria andEffectBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("effect_begin_time >=", value, "effectBeginTime");
            return (Criteria) this;
        }

        public Criteria andEffectBeginTimeLessThan(Date value) {
            addCriterion("effect_begin_time <", value, "effectBeginTime");
            return (Criteria) this;
        }

        public Criteria andEffectBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("effect_begin_time <=", value, "effectBeginTime");
            return (Criteria) this;
        }

        public Criteria andEffectBeginTimeIn(List<Date> values) {
            addCriterion("effect_begin_time in", values, "effectBeginTime");
            return (Criteria) this;
        }

        public Criteria andEffectBeginTimeNotIn(List<Date> values) {
            addCriterion("effect_begin_time not in", values, "effectBeginTime");
            return (Criteria) this;
        }

        public Criteria andEffectBeginTimeBetween(Date value1, Date value2) {
            addCriterion("effect_begin_time between", value1, value2, "effectBeginTime");
            return (Criteria) this;
        }

        public Criteria andEffectBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("effect_begin_time not between", value1, value2, "effectBeginTime");
            return (Criteria) this;
        }

        public Criteria andEffectEndTimeIsNull() {
            addCriterion("effect_end_time is null");
            return (Criteria) this;
        }

        public Criteria andEffectEndTimeIsNotNull() {
            addCriterion("effect_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEffectEndTimeEqualTo(Date value) {
            addCriterion("effect_end_time =", value, "effectEndTime");
            return (Criteria) this;
        }

        public Criteria andEffectEndTimeNotEqualTo(Date value) {
            addCriterion("effect_end_time <>", value, "effectEndTime");
            return (Criteria) this;
        }

        public Criteria andEffectEndTimeGreaterThan(Date value) {
            addCriterion("effect_end_time >", value, "effectEndTime");
            return (Criteria) this;
        }

        public Criteria andEffectEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("effect_end_time >=", value, "effectEndTime");
            return (Criteria) this;
        }

        public Criteria andEffectEndTimeLessThan(Date value) {
            addCriterion("effect_end_time <", value, "effectEndTime");
            return (Criteria) this;
        }

        public Criteria andEffectEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("effect_end_time <=", value, "effectEndTime");
            return (Criteria) this;
        }

        public Criteria andEffectEndTimeIn(List<Date> values) {
            addCriterion("effect_end_time in", values, "effectEndTime");
            return (Criteria) this;
        }

        public Criteria andEffectEndTimeNotIn(List<Date> values) {
            addCriterion("effect_end_time not in", values, "effectEndTime");
            return (Criteria) this;
        }

        public Criteria andEffectEndTimeBetween(Date value1, Date value2) {
            addCriterion("effect_end_time between", value1, value2, "effectEndTime");
            return (Criteria) this;
        }

        public Criteria andEffectEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("effect_end_time not between", value1, value2, "effectEndTime");
            return (Criteria) this;
        }

        public Criteria andBundleRatioIsNull() {
            addCriterion("bundle_ratio is null");
            return (Criteria) this;
        }

        public Criteria andBundleRatioIsNotNull() {
            addCriterion("bundle_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andBundleRatioEqualTo(Integer value) {
            addCriterion("bundle_ratio =", value, "bundleRatio");
            return (Criteria) this;
        }

        public Criteria andBundleRatioNotEqualTo(Integer value) {
            addCriterion("bundle_ratio <>", value, "bundleRatio");
            return (Criteria) this;
        }

        public Criteria andBundleRatioGreaterThan(Integer value) {
            addCriterion("bundle_ratio >", value, "bundleRatio");
            return (Criteria) this;
        }

        public Criteria andBundleRatioGreaterThanOrEqualTo(Integer value) {
            addCriterion("bundle_ratio >=", value, "bundleRatio");
            return (Criteria) this;
        }

        public Criteria andBundleRatioLessThan(Integer value) {
            addCriterion("bundle_ratio <", value, "bundleRatio");
            return (Criteria) this;
        }

        public Criteria andBundleRatioLessThanOrEqualTo(Integer value) {
            addCriterion("bundle_ratio <=", value, "bundleRatio");
            return (Criteria) this;
        }

        public Criteria andBundleRatioIn(List<Integer> values) {
            addCriterion("bundle_ratio in", values, "bundleRatio");
            return (Criteria) this;
        }

        public Criteria andBundleRatioNotIn(List<Integer> values) {
            addCriterion("bundle_ratio not in", values, "bundleRatio");
            return (Criteria) this;
        }

        public Criteria andBundleRatioBetween(Integer value1, Integer value2) {
            addCriterion("bundle_ratio between", value1, value2, "bundleRatio");
            return (Criteria) this;
        }

        public Criteria andBundleRatioNotBetween(Integer value1, Integer value2) {
            addCriterion("bundle_ratio not between", value1, value2, "bundleRatio");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andRatioLeftIsNull() {
            addCriterion("ratio_left is null");
            return (Criteria) this;
        }

        public Criteria andRatioLeftIsNotNull() {
            addCriterion("ratio_left is not null");
            return (Criteria) this;
        }

        public Criteria andRatioLeftEqualTo(Integer value) {
            addCriterion("ratio_left =", value, "ratioLeft");
            return (Criteria) this;
        }

        public Criteria andRatioLeftNotEqualTo(Integer value) {
            addCriterion("ratio_left <>", value, "ratioLeft");
            return (Criteria) this;
        }

        public Criteria andRatioLeftGreaterThan(Integer value) {
            addCriterion("ratio_left >", value, "ratioLeft");
            return (Criteria) this;
        }

        public Criteria andRatioLeftGreaterThanOrEqualTo(Integer value) {
            addCriterion("ratio_left >=", value, "ratioLeft");
            return (Criteria) this;
        }

        public Criteria andRatioLeftLessThan(Integer value) {
            addCriterion("ratio_left <", value, "ratioLeft");
            return (Criteria) this;
        }

        public Criteria andRatioLeftLessThanOrEqualTo(Integer value) {
            addCriterion("ratio_left <=", value, "ratioLeft");
            return (Criteria) this;
        }

        public Criteria andRatioLeftIn(List<Integer> values) {
            addCriterion("ratio_left in", values, "ratioLeft");
            return (Criteria) this;
        }

        public Criteria andRatioLeftNotIn(List<Integer> values) {
            addCriterion("ratio_left not in", values, "ratioLeft");
            return (Criteria) this;
        }

        public Criteria andRatioLeftBetween(Integer value1, Integer value2) {
            addCriterion("ratio_left between", value1, value2, "ratioLeft");
            return (Criteria) this;
        }

        public Criteria andRatioLeftNotBetween(Integer value1, Integer value2) {
            addCriterion("ratio_left not between", value1, value2, "ratioLeft");
            return (Criteria) this;
        }

        public Criteria andRatioRightIsNull() {
            addCriterion("ratio_right is null");
            return (Criteria) this;
        }

        public Criteria andRatioRightIsNotNull() {
            addCriterion("ratio_right is not null");
            return (Criteria) this;
        }

        public Criteria andRatioRightEqualTo(Integer value) {
            addCriterion("ratio_right =", value, "ratioRight");
            return (Criteria) this;
        }

        public Criteria andRatioRightNotEqualTo(Integer value) {
            addCriterion("ratio_right <>", value, "ratioRight");
            return (Criteria) this;
        }

        public Criteria andRatioRightGreaterThan(Integer value) {
            addCriterion("ratio_right >", value, "ratioRight");
            return (Criteria) this;
        }

        public Criteria andRatioRightGreaterThanOrEqualTo(Integer value) {
            addCriterion("ratio_right >=", value, "ratioRight");
            return (Criteria) this;
        }

        public Criteria andRatioRightLessThan(Integer value) {
            addCriterion("ratio_right <", value, "ratioRight");
            return (Criteria) this;
        }

        public Criteria andRatioRightLessThanOrEqualTo(Integer value) {
            addCriterion("ratio_right <=", value, "ratioRight");
            return (Criteria) this;
        }

        public Criteria andRatioRightIn(List<Integer> values) {
            addCriterion("ratio_right in", values, "ratioRight");
            return (Criteria) this;
        }

        public Criteria andRatioRightNotIn(List<Integer> values) {
            addCriterion("ratio_right not in", values, "ratioRight");
            return (Criteria) this;
        }

        public Criteria andRatioRightBetween(Integer value1, Integer value2) {
            addCriterion("ratio_right between", value1, value2, "ratioRight");
            return (Criteria) this;
        }

        public Criteria andRatioRightNotBetween(Integer value1, Integer value2) {
            addCriterion("ratio_right not between", value1, value2, "ratioRight");
            return (Criteria) this;
        }

        public Criteria andOnlineClaimIsNull() {
            addCriterion("online_claim is null");
            return (Criteria) this;
        }

        public Criteria andOnlineClaimIsNotNull() {
            addCriterion("online_claim is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineClaimEqualTo(Integer value) {
            addCriterion("online_claim =", value, "onlineClaim");
            return (Criteria) this;
        }

        public Criteria andOnlineClaimNotEqualTo(Integer value) {
            addCriterion("online_claim <>", value, "onlineClaim");
            return (Criteria) this;
        }

        public Criteria andOnlineClaimGreaterThan(Integer value) {
            addCriterion("online_claim >", value, "onlineClaim");
            return (Criteria) this;
        }

        public Criteria andOnlineClaimGreaterThanOrEqualTo(Integer value) {
            addCriterion("online_claim >=", value, "onlineClaim");
            return (Criteria) this;
        }

        public Criteria andOnlineClaimLessThan(Integer value) {
            addCriterion("online_claim <", value, "onlineClaim");
            return (Criteria) this;
        }

        public Criteria andOnlineClaimLessThanOrEqualTo(Integer value) {
            addCriterion("online_claim <=", value, "onlineClaim");
            return (Criteria) this;
        }

        public Criteria andOnlineClaimIn(List<Integer> values) {
            addCriterion("online_claim in", values, "onlineClaim");
            return (Criteria) this;
        }

        public Criteria andOnlineClaimNotIn(List<Integer> values) {
            addCriterion("online_claim not in", values, "onlineClaim");
            return (Criteria) this;
        }

        public Criteria andOnlineClaimBetween(Integer value1, Integer value2) {
            addCriterion("online_claim between", value1, value2, "onlineClaim");
            return (Criteria) this;
        }

        public Criteria andOnlineClaimNotBetween(Integer value1, Integer value2) {
            addCriterion("online_claim not between", value1, value2, "onlineClaim");
            return (Criteria) this;
        }

        public Criteria andAppOpenLeftIsNull() {
            addCriterion("app_open_left is null");
            return (Criteria) this;
        }

        public Criteria andAppOpenLeftIsNotNull() {
            addCriterion("app_open_left is not null");
            return (Criteria) this;
        }

        public Criteria andAppOpenLeftEqualTo(Double value) {
            addCriterion("app_open_left =", value, "appOpenLeft");
            return (Criteria) this;
        }

        public Criteria andAppOpenLeftNotEqualTo(Double value) {
            addCriterion("app_open_left <>", value, "appOpenLeft");
            return (Criteria) this;
        }

        public Criteria andAppOpenLeftGreaterThan(Double value) {
            addCriterion("app_open_left >", value, "appOpenLeft");
            return (Criteria) this;
        }

        public Criteria andAppOpenLeftGreaterThanOrEqualTo(Double value) {
            addCriterion("app_open_left >=", value, "appOpenLeft");
            return (Criteria) this;
        }

        public Criteria andAppOpenLeftLessThan(Double value) {
            addCriterion("app_open_left <", value, "appOpenLeft");
            return (Criteria) this;
        }

        public Criteria andAppOpenLeftLessThanOrEqualTo(Double value) {
            addCriterion("app_open_left <=", value, "appOpenLeft");
            return (Criteria) this;
        }

        public Criteria andAppOpenLeftIn(List<Double> values) {
            addCriterion("app_open_left in", values, "appOpenLeft");
            return (Criteria) this;
        }

        public Criteria andAppOpenLeftNotIn(List<Double> values) {
            addCriterion("app_open_left not in", values, "appOpenLeft");
            return (Criteria) this;
        }

        public Criteria andAppOpenLeftBetween(Double value1, Double value2) {
            addCriterion("app_open_left between", value1, value2, "appOpenLeft");
            return (Criteria) this;
        }

        public Criteria andAppOpenLeftNotBetween(Double value1, Double value2) {
            addCriterion("app_open_left not between", value1, value2, "appOpenLeft");
            return (Criteria) this;
        }

        public Criteria andAppOpenRightIsNull() {
            addCriterion("app_open_right is null");
            return (Criteria) this;
        }

        public Criteria andAppOpenRightIsNotNull() {
            addCriterion("app_open_right is not null");
            return (Criteria) this;
        }

        public Criteria andAppOpenRightEqualTo(Double value) {
            addCriterion("app_open_right =", value, "appOpenRight");
            return (Criteria) this;
        }

        public Criteria andAppOpenRightNotEqualTo(Double value) {
            addCriterion("app_open_right <>", value, "appOpenRight");
            return (Criteria) this;
        }

        public Criteria andAppOpenRightGreaterThan(Double value) {
            addCriterion("app_open_right >", value, "appOpenRight");
            return (Criteria) this;
        }

        public Criteria andAppOpenRightGreaterThanOrEqualTo(Double value) {
            addCriterion("app_open_right >=", value, "appOpenRight");
            return (Criteria) this;
        }

        public Criteria andAppOpenRightLessThan(Double value) {
            addCriterion("app_open_right <", value, "appOpenRight");
            return (Criteria) this;
        }

        public Criteria andAppOpenRightLessThanOrEqualTo(Double value) {
            addCriterion("app_open_right <=", value, "appOpenRight");
            return (Criteria) this;
        }

        public Criteria andAppOpenRightIn(List<Double> values) {
            addCriterion("app_open_right in", values, "appOpenRight");
            return (Criteria) this;
        }

        public Criteria andAppOpenRightNotIn(List<Double> values) {
            addCriterion("app_open_right not in", values, "appOpenRight");
            return (Criteria) this;
        }

        public Criteria andAppOpenRightBetween(Double value1, Double value2) {
            addCriterion("app_open_right between", value1, value2, "appOpenRight");
            return (Criteria) this;
        }

        public Criteria andAppOpenRightNotBetween(Double value1, Double value2) {
            addCriterion("app_open_right not between", value1, value2, "appOpenRight");
            return (Criteria) this;
        }

        public Criteria andIsInsureroomTypeIsNull() {
            addCriterion("is_insureroom_type is null");
            return (Criteria) this;
        }

        public Criteria andIsInsureroomTypeIsNotNull() {
            addCriterion("is_insureroom_type is not null");
            return (Criteria) this;
        }

        public Criteria andIsInsureroomTypeEqualTo(Integer value) {
            addCriterion("is_insureroom_type =", value, "isInsureroomType");
            return (Criteria) this;
        }

        public Criteria andIsInsureroomTypeNotEqualTo(Integer value) {
            addCriterion("is_insureroom_type <>", value, "isInsureroomType");
            return (Criteria) this;
        }

        public Criteria andIsInsureroomTypeGreaterThan(Integer value) {
            addCriterion("is_insureroom_type >", value, "isInsureroomType");
            return (Criteria) this;
        }

        public Criteria andIsInsureroomTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_insureroom_type >=", value, "isInsureroomType");
            return (Criteria) this;
        }

        public Criteria andIsInsureroomTypeLessThan(Integer value) {
            addCriterion("is_insureroom_type <", value, "isInsureroomType");
            return (Criteria) this;
        }

        public Criteria andIsInsureroomTypeLessThanOrEqualTo(Integer value) {
            addCriterion("is_insureroom_type <=", value, "isInsureroomType");
            return (Criteria) this;
        }

        public Criteria andIsInsureroomTypeIn(List<Integer> values) {
            addCriterion("is_insureroom_type in", values, "isInsureroomType");
            return (Criteria) this;
        }

        public Criteria andIsInsureroomTypeNotIn(List<Integer> values) {
            addCriterion("is_insureroom_type not in", values, "isInsureroomType");
            return (Criteria) this;
        }

        public Criteria andIsInsureroomTypeBetween(Integer value1, Integer value2) {
            addCriterion("is_insureroom_type between", value1, value2, "isInsureroomType");
            return (Criteria) this;
        }

        public Criteria andIsInsureroomTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_insureroom_type not between", value1, value2, "isInsureroomType");
            return (Criteria) this;
        }

        public Criteria andOriginNameIsNull() {
            addCriterion("origin_name is null");
            return (Criteria) this;
        }

        public Criteria andOriginNameIsNotNull() {
            addCriterion("origin_name is not null");
            return (Criteria) this;
        }

        public Criteria andOriginNameEqualTo(String value) {
            addCriterion("origin_name =", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameNotEqualTo(String value) {
            addCriterion("origin_name <>", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameGreaterThan(String value) {
            addCriterion("origin_name >", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameGreaterThanOrEqualTo(String value) {
            addCriterion("origin_name >=", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameLessThan(String value) {
            addCriterion("origin_name <", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameLessThanOrEqualTo(String value) {
            addCriterion("origin_name <=", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameLike(String value) {
            addCriterion("origin_name like", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameNotLike(String value) {
            addCriterion("origin_name not like", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameIn(List<String> values) {
            addCriterion("origin_name in", values, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameNotIn(List<String> values) {
            addCriterion("origin_name not in", values, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameBetween(String value1, String value2) {
            addCriterion("origin_name between", value1, value2, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameNotBetween(String value1, String value2) {
            addCriterion("origin_name not between", value1, value2, "originName");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(Integer value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(Integer value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(Integer value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(Integer value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(Integer value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<Integer> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<Integer> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(Integer value1, Integer value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andShelfTypeIsNull() {
            addCriterion("shelf_type is null");
            return (Criteria) this;
        }

        public Criteria andShelfTypeIsNotNull() {
            addCriterion("shelf_type is not null");
            return (Criteria) this;
        }

        public Criteria andShelfTypeEqualTo(String value) {
            addCriterion("shelf_type =", value, "shelfType");
            return (Criteria) this;
        }

        public Criteria andShelfTypeNotEqualTo(String value) {
            addCriterion("shelf_type <>", value, "shelfType");
            return (Criteria) this;
        }

        public Criteria andShelfTypeGreaterThan(String value) {
            addCriterion("shelf_type >", value, "shelfType");
            return (Criteria) this;
        }

        public Criteria andShelfTypeGreaterThanOrEqualTo(String value) {
            addCriterion("shelf_type >=", value, "shelfType");
            return (Criteria) this;
        }

        public Criteria andShelfTypeLessThan(String value) {
            addCriterion("shelf_type <", value, "shelfType");
            return (Criteria) this;
        }

        public Criteria andShelfTypeLessThanOrEqualTo(String value) {
            addCriterion("shelf_type <=", value, "shelfType");
            return (Criteria) this;
        }

        public Criteria andShelfTypeLike(String value) {
            addCriterion("shelf_type like", value, "shelfType");
            return (Criteria) this;
        }

        public Criteria andShelfTypeNotLike(String value) {
            addCriterion("shelf_type not like", value, "shelfType");
            return (Criteria) this;
        }

        public Criteria andShelfTypeIn(List<String> values) {
            addCriterion("shelf_type in", values, "shelfType");
            return (Criteria) this;
        }

        public Criteria andShelfTypeNotIn(List<String> values) {
            addCriterion("shelf_type not in", values, "shelfType");
            return (Criteria) this;
        }

        public Criteria andShelfTypeBetween(String value1, String value2) {
            addCriterion("shelf_type between", value1, value2, "shelfType");
            return (Criteria) this;
        }

        public Criteria andShelfTypeNotBetween(String value1, String value2) {
            addCriterion("shelf_type not between", value1, value2, "shelfType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}