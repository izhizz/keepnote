package com.personal.keepnote.persistence.entity;

import java.util.ArrayList;
import java.util.List;

public class RefUserInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RefUserInformationExample() {
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

        public Criteria andSendUserIdIsNull() {
            addCriterion("send_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSendUserIdIsNotNull() {
            addCriterion("send_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSendUserIdEqualTo(Integer value) {
            addCriterion("send_user_id =", value, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdNotEqualTo(Integer value) {
            addCriterion("send_user_id <>", value, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdGreaterThan(Integer value) {
            addCriterion("send_user_id >", value, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_user_id >=", value, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdLessThan(Integer value) {
            addCriterion("send_user_id <", value, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("send_user_id <=", value, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdIn(List<Integer> values) {
            addCriterion("send_user_id in", values, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdNotIn(List<Integer> values) {
            addCriterion("send_user_id not in", values, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdBetween(Integer value1, Integer value2) {
            addCriterion("send_user_id between", value1, value2, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("send_user_id not between", value1, value2, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andReciveUserIdIsNull() {
            addCriterion("recive_user_id is null");
            return (Criteria) this;
        }

        public Criteria andReciveUserIdIsNotNull() {
            addCriterion("recive_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andReciveUserIdEqualTo(Integer value) {
            addCriterion("recive_user_id =", value, "reciveUserId");
            return (Criteria) this;
        }

        public Criteria andReciveUserIdNotEqualTo(Integer value) {
            addCriterion("recive_user_id <>", value, "reciveUserId");
            return (Criteria) this;
        }

        public Criteria andReciveUserIdGreaterThan(Integer value) {
            addCriterion("recive_user_id >", value, "reciveUserId");
            return (Criteria) this;
        }

        public Criteria andReciveUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("recive_user_id >=", value, "reciveUserId");
            return (Criteria) this;
        }

        public Criteria andReciveUserIdLessThan(Integer value) {
            addCriterion("recive_user_id <", value, "reciveUserId");
            return (Criteria) this;
        }

        public Criteria andReciveUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("recive_user_id <=", value, "reciveUserId");
            return (Criteria) this;
        }

        public Criteria andReciveUserIdIn(List<Integer> values) {
            addCriterion("recive_user_id in", values, "reciveUserId");
            return (Criteria) this;
        }

        public Criteria andReciveUserIdNotIn(List<Integer> values) {
            addCriterion("recive_user_id not in", values, "reciveUserId");
            return (Criteria) this;
        }

        public Criteria andReciveUserIdBetween(Integer value1, Integer value2) {
            addCriterion("recive_user_id between", value1, value2, "reciveUserId");
            return (Criteria) this;
        }

        public Criteria andReciveUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("recive_user_id not between", value1, value2, "reciveUserId");
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

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Long value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Long value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Long value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Long value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Long value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Long> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Long> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Long value1, Long value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Long value1, Long value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNull() {
            addCriterion("reply_time is null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNotNull() {
            addCriterion("reply_time is not null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeEqualTo(Long value) {
            addCriterion("reply_time =", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotEqualTo(Long value) {
            addCriterion("reply_time <>", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThan(Long value) {
            addCriterion("reply_time >", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("reply_time >=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThan(Long value) {
            addCriterion("reply_time <", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThanOrEqualTo(Long value) {
            addCriterion("reply_time <=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIn(List<Long> values) {
            addCriterion("reply_time in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotIn(List<Long> values) {
            addCriterion("reply_time not in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeBetween(Long value1, Long value2) {
            addCriterion("reply_time between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotBetween(Long value1, Long value2) {
            addCriterion("reply_time not between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andSendRemarkIsNull() {
            addCriterion("send_remark is null");
            return (Criteria) this;
        }

        public Criteria andSendRemarkIsNotNull() {
            addCriterion("send_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSendRemarkEqualTo(String value) {
            addCriterion("send_remark =", value, "sendRemark");
            return (Criteria) this;
        }

        public Criteria andSendRemarkNotEqualTo(String value) {
            addCriterion("send_remark <>", value, "sendRemark");
            return (Criteria) this;
        }

        public Criteria andSendRemarkGreaterThan(String value) {
            addCriterion("send_remark >", value, "sendRemark");
            return (Criteria) this;
        }

        public Criteria andSendRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("send_remark >=", value, "sendRemark");
            return (Criteria) this;
        }

        public Criteria andSendRemarkLessThan(String value) {
            addCriterion("send_remark <", value, "sendRemark");
            return (Criteria) this;
        }

        public Criteria andSendRemarkLessThanOrEqualTo(String value) {
            addCriterion("send_remark <=", value, "sendRemark");
            return (Criteria) this;
        }

        public Criteria andSendRemarkLike(String value) {
            addCriterion("send_remark like", value, "sendRemark");
            return (Criteria) this;
        }

        public Criteria andSendRemarkNotLike(String value) {
            addCriterion("send_remark not like", value, "sendRemark");
            return (Criteria) this;
        }

        public Criteria andSendRemarkIn(List<String> values) {
            addCriterion("send_remark in", values, "sendRemark");
            return (Criteria) this;
        }

        public Criteria andSendRemarkNotIn(List<String> values) {
            addCriterion("send_remark not in", values, "sendRemark");
            return (Criteria) this;
        }

        public Criteria andSendRemarkBetween(String value1, String value2) {
            addCriterion("send_remark between", value1, value2, "sendRemark");
            return (Criteria) this;
        }

        public Criteria andSendRemarkNotBetween(String value1, String value2) {
            addCriterion("send_remark not between", value1, value2, "sendRemark");
            return (Criteria) this;
        }

        public Criteria andReplyMarkIsNull() {
            addCriterion("reply_mark is null");
            return (Criteria) this;
        }

        public Criteria andReplyMarkIsNotNull() {
            addCriterion("reply_mark is not null");
            return (Criteria) this;
        }

        public Criteria andReplyMarkEqualTo(String value) {
            addCriterion("reply_mark =", value, "replyMark");
            return (Criteria) this;
        }

        public Criteria andReplyMarkNotEqualTo(String value) {
            addCriterion("reply_mark <>", value, "replyMark");
            return (Criteria) this;
        }

        public Criteria andReplyMarkGreaterThan(String value) {
            addCriterion("reply_mark >", value, "replyMark");
            return (Criteria) this;
        }

        public Criteria andReplyMarkGreaterThanOrEqualTo(String value) {
            addCriterion("reply_mark >=", value, "replyMark");
            return (Criteria) this;
        }

        public Criteria andReplyMarkLessThan(String value) {
            addCriterion("reply_mark <", value, "replyMark");
            return (Criteria) this;
        }

        public Criteria andReplyMarkLessThanOrEqualTo(String value) {
            addCriterion("reply_mark <=", value, "replyMark");
            return (Criteria) this;
        }

        public Criteria andReplyMarkLike(String value) {
            addCriterion("reply_mark like", value, "replyMark");
            return (Criteria) this;
        }

        public Criteria andReplyMarkNotLike(String value) {
            addCriterion("reply_mark not like", value, "replyMark");
            return (Criteria) this;
        }

        public Criteria andReplyMarkIn(List<String> values) {
            addCriterion("reply_mark in", values, "replyMark");
            return (Criteria) this;
        }

        public Criteria andReplyMarkNotIn(List<String> values) {
            addCriterion("reply_mark not in", values, "replyMark");
            return (Criteria) this;
        }

        public Criteria andReplyMarkBetween(String value1, String value2) {
            addCriterion("reply_mark between", value1, value2, "replyMark");
            return (Criteria) this;
        }

        public Criteria andReplyMarkNotBetween(String value1, String value2) {
            addCriterion("reply_mark not between", value1, value2, "replyMark");
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