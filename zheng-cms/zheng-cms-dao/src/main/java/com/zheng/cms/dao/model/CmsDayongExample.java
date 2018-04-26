package com.zheng.cms.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmsDayongExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public CmsDayongExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andDayongIdIsNull() {
            addCriterion("dayong_id is null");
            return (Criteria) this;
        }

        public Criteria andDayongIdIsNotNull() {
            addCriterion("dayong_id is not null");
            return (Criteria) this;
        }

        public Criteria andDayongIdEqualTo(Integer value) {
            addCriterion("dayong_id =", value, "dayongId");
            return (Criteria) this;
        }

        public Criteria andDayongIdNotEqualTo(Integer value) {
            addCriterion("dayong_id <>", value, "dayongId");
            return (Criteria) this;
        }

        public Criteria andDayongIdGreaterThan(Integer value) {
            addCriterion("dayong_id >", value, "dayongId");
            return (Criteria) this;
        }

        public Criteria andDayongIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dayong_id >=", value, "dayongId");
            return (Criteria) this;
        }

        public Criteria andDayongIdLessThan(Integer value) {
            addCriterion("dayong_id <", value, "dayongId");
            return (Criteria) this;
        }

        public Criteria andDayongIdLessThanOrEqualTo(Integer value) {
            addCriterion("dayong_id <=", value, "dayongId");
            return (Criteria) this;
        }

        public Criteria andDayongIdIn(List<Integer> values) {
            addCriterion("dayong_id in", values, "dayongId");
            return (Criteria) this;
        }

        public Criteria andDayongIdNotIn(List<Integer> values) {
            addCriterion("dayong_id not in", values, "dayongId");
            return (Criteria) this;
        }

        public Criteria andDayongIdBetween(Integer value1, Integer value2) {
            addCriterion("dayong_id between", value1, value2, "dayongId");
            return (Criteria) this;
        }

        public Criteria andDayongIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dayong_id not between", value1, value2, "dayongId");
            return (Criteria) this;
        }

        public Criteria andSpotIdIsNull() {
            addCriterion("spot_id is null");
            return (Criteria) this;
        }

        public Criteria andSpotIdIsNotNull() {
            addCriterion("spot_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpotIdEqualTo(String value) {
            addCriterion("spot_id =", value, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdNotEqualTo(String value) {
            addCriterion("spot_id <>", value, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdGreaterThan(String value) {
            addCriterion("spot_id >", value, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdGreaterThanOrEqualTo(String value) {
            addCriterion("spot_id >=", value, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdLessThan(String value) {
            addCriterion("spot_id <", value, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdLessThanOrEqualTo(String value) {
            addCriterion("spot_id <=", value, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdLike(String value) {
            addCriterion("spot_id like", value, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdNotLike(String value) {
            addCriterion("spot_id not like", value, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdIn(List<String> values) {
            addCriterion("spot_id in", values, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdNotIn(List<String> values) {
            addCriterion("spot_id not in", values, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdBetween(String value1, String value2) {
            addCriterion("spot_id between", value1, value2, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdNotBetween(String value1, String value2) {
            addCriterion("spot_id not between", value1, value2, "spotId");
            return (Criteria) this;
        }

        public Criteria andDayongNameIsNull() {
            addCriterion("dayong_name is null");
            return (Criteria) this;
        }

        public Criteria andDayongNameIsNotNull() {
            addCriterion("dayong_name is not null");
            return (Criteria) this;
        }

        public Criteria andDayongNameEqualTo(String value) {
            addCriterion("dayong_name =", value, "dayongName");
            return (Criteria) this;
        }

        public Criteria andDayongNameNotEqualTo(String value) {
            addCriterion("dayong_name <>", value, "dayongName");
            return (Criteria) this;
        }

        public Criteria andDayongNameGreaterThan(String value) {
            addCriterion("dayong_name >", value, "dayongName");
            return (Criteria) this;
        }

        public Criteria andDayongNameGreaterThanOrEqualTo(String value) {
            addCriterion("dayong_name >=", value, "dayongName");
            return (Criteria) this;
        }

        public Criteria andDayongNameLessThan(String value) {
            addCriterion("dayong_name <", value, "dayongName");
            return (Criteria) this;
        }

        public Criteria andDayongNameLessThanOrEqualTo(String value) {
            addCriterion("dayong_name <=", value, "dayongName");
            return (Criteria) this;
        }

        public Criteria andDayongNameLike(String value) {
            addCriterion("dayong_name like", value, "dayongName");
            return (Criteria) this;
        }

        public Criteria andDayongNameNotLike(String value) {
            addCriterion("dayong_name not like", value, "dayongName");
            return (Criteria) this;
        }

        public Criteria andDayongNameIn(List<String> values) {
            addCriterion("dayong_name in", values, "dayongName");
            return (Criteria) this;
        }

        public Criteria andDayongNameNotIn(List<String> values) {
            addCriterion("dayong_name not in", values, "dayongName");
            return (Criteria) this;
        }

        public Criteria andDayongNameBetween(String value1, String value2) {
            addCriterion("dayong_name between", value1, value2, "dayongName");
            return (Criteria) this;
        }

        public Criteria andDayongNameNotBetween(String value1, String value2) {
            addCriterion("dayong_name not between", value1, value2, "dayongName");
            return (Criteria) this;
        }

        public Criteria andDayongEnnameIsNull() {
            addCriterion("dayong_enname is null");
            return (Criteria) this;
        }

        public Criteria andDayongEnnameIsNotNull() {
            addCriterion("dayong_enname is not null");
            return (Criteria) this;
        }

        public Criteria andDayongEnnameEqualTo(String value) {
            addCriterion("dayong_enname =", value, "dayongEnname");
            return (Criteria) this;
        }

        public Criteria andDayongEnnameNotEqualTo(String value) {
            addCriterion("dayong_enname <>", value, "dayongEnname");
            return (Criteria) this;
        }

        public Criteria andDayongEnnameGreaterThan(String value) {
            addCriterion("dayong_enname >", value, "dayongEnname");
            return (Criteria) this;
        }

        public Criteria andDayongEnnameGreaterThanOrEqualTo(String value) {
            addCriterion("dayong_enname >=", value, "dayongEnname");
            return (Criteria) this;
        }

        public Criteria andDayongEnnameLessThan(String value) {
            addCriterion("dayong_enname <", value, "dayongEnname");
            return (Criteria) this;
        }

        public Criteria andDayongEnnameLessThanOrEqualTo(String value) {
            addCriterion("dayong_enname <=", value, "dayongEnname");
            return (Criteria) this;
        }

        public Criteria andDayongEnnameLike(String value) {
            addCriterion("dayong_enname like", value, "dayongEnname");
            return (Criteria) this;
        }

        public Criteria andDayongEnnameNotLike(String value) {
            addCriterion("dayong_enname not like", value, "dayongEnname");
            return (Criteria) this;
        }

        public Criteria andDayongEnnameIn(List<String> values) {
            addCriterion("dayong_enname in", values, "dayongEnname");
            return (Criteria) this;
        }

        public Criteria andDayongEnnameNotIn(List<String> values) {
            addCriterion("dayong_enname not in", values, "dayongEnname");
            return (Criteria) this;
        }

        public Criteria andDayongEnnameBetween(String value1, String value2) {
            addCriterion("dayong_enname between", value1, value2, "dayongEnname");
            return (Criteria) this;
        }

        public Criteria andDayongEnnameNotBetween(String value1, String value2) {
            addCriterion("dayong_enname not between", value1, value2, "dayongEnname");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andRouteIsNull() {
            addCriterion("route is null");
            return (Criteria) this;
        }

        public Criteria andRouteIsNotNull() {
            addCriterion("route is not null");
            return (Criteria) this;
        }

        public Criteria andRouteEqualTo(String value) {
            addCriterion("route =", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteNotEqualTo(String value) {
            addCriterion("route <>", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteGreaterThan(String value) {
            addCriterion("route >", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteGreaterThanOrEqualTo(String value) {
            addCriterion("route >=", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteLessThan(String value) {
            addCriterion("route <", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteLessThanOrEqualTo(String value) {
            addCriterion("route <=", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteLike(String value) {
            addCriterion("route like", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteNotLike(String value) {
            addCriterion("route not like", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteIn(List<String> values) {
            addCriterion("route in", values, "route");
            return (Criteria) this;
        }

        public Criteria andRouteNotIn(List<String> values) {
            addCriterion("route not in", values, "route");
            return (Criteria) this;
        }

        public Criteria andRouteBetween(String value1, String value2) {
            addCriterion("route between", value1, value2, "route");
            return (Criteria) this;
        }

        public Criteria andRouteNotBetween(String value1, String value2) {
            addCriterion("route not between", value1, value2, "route");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("summary not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andCatelogIsNull() {
            addCriterion("catelog is null");
            return (Criteria) this;
        }

        public Criteria andCatelogIsNotNull() {
            addCriterion("catelog is not null");
            return (Criteria) this;
        }

        public Criteria andCatelogEqualTo(String value) {
            addCriterion("catelog =", value, "catelog");
            return (Criteria) this;
        }

        public Criteria andCatelogNotEqualTo(String value) {
            addCriterion("catelog <>", value, "catelog");
            return (Criteria) this;
        }

        public Criteria andCatelogGreaterThan(String value) {
            addCriterion("catelog >", value, "catelog");
            return (Criteria) this;
        }

        public Criteria andCatelogGreaterThanOrEqualTo(String value) {
            addCriterion("catelog >=", value, "catelog");
            return (Criteria) this;
        }

        public Criteria andCatelogLessThan(String value) {
            addCriterion("catelog <", value, "catelog");
            return (Criteria) this;
        }

        public Criteria andCatelogLessThanOrEqualTo(String value) {
            addCriterion("catelog <=", value, "catelog");
            return (Criteria) this;
        }

        public Criteria andCatelogLike(String value) {
            addCriterion("catelog like", value, "catelog");
            return (Criteria) this;
        }

        public Criteria andCatelogNotLike(String value) {
            addCriterion("catelog not like", value, "catelog");
            return (Criteria) this;
        }

        public Criteria andCatelogIn(List<String> values) {
            addCriterion("catelog in", values, "catelog");
            return (Criteria) this;
        }

        public Criteria andCatelogNotIn(List<String> values) {
            addCriterion("catelog not in", values, "catelog");
            return (Criteria) this;
        }

        public Criteria andCatelogBetween(String value1, String value2) {
            addCriterion("catelog between", value1, value2, "catelog");
            return (Criteria) this;
        }

        public Criteria andCatelogNotBetween(String value1, String value2) {
            addCriterion("catelog not between", value1, value2, "catelog");
            return (Criteria) this;
        }

        public Criteria andDayongLevelIsNull() {
            addCriterion("dayong_level is null");
            return (Criteria) this;
        }

        public Criteria andDayongLevelIsNotNull() {
            addCriterion("dayong_level is not null");
            return (Criteria) this;
        }

        public Criteria andDayongLevelEqualTo(String value) {
            addCriterion("dayong_level =", value, "dayongLevel");
            return (Criteria) this;
        }

        public Criteria andDayongLevelNotEqualTo(String value) {
            addCriterion("dayong_level <>", value, "dayongLevel");
            return (Criteria) this;
        }

        public Criteria andDayongLevelGreaterThan(String value) {
            addCriterion("dayong_level >", value, "dayongLevel");
            return (Criteria) this;
        }

        public Criteria andDayongLevelGreaterThanOrEqualTo(String value) {
            addCriterion("dayong_level >=", value, "dayongLevel");
            return (Criteria) this;
        }

        public Criteria andDayongLevelLessThan(String value) {
            addCriterion("dayong_level <", value, "dayongLevel");
            return (Criteria) this;
        }

        public Criteria andDayongLevelLessThanOrEqualTo(String value) {
            addCriterion("dayong_level <=", value, "dayongLevel");
            return (Criteria) this;
        }

        public Criteria andDayongLevelLike(String value) {
            addCriterion("dayong_level like", value, "dayongLevel");
            return (Criteria) this;
        }

        public Criteria andDayongLevelNotLike(String value) {
            addCriterion("dayong_level not like", value, "dayongLevel");
            return (Criteria) this;
        }

        public Criteria andDayongLevelIn(List<String> values) {
            addCriterion("dayong_level in", values, "dayongLevel");
            return (Criteria) this;
        }

        public Criteria andDayongLevelNotIn(List<String> values) {
            addCriterion("dayong_level not in", values, "dayongLevel");
            return (Criteria) this;
        }

        public Criteria andDayongLevelBetween(String value1, String value2) {
            addCriterion("dayong_level between", value1, value2, "dayongLevel");
            return (Criteria) this;
        }

        public Criteria andDayongLevelNotBetween(String value1, String value2) {
            addCriterion("dayong_level not between", value1, value2, "dayongLevel");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyword not between", value1, value2, "keyword");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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