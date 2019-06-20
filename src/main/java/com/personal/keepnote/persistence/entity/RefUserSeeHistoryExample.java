package com.personal.keepnote.persistence.entity;

import java.util.ArrayList;
import java.util.List;

public class RefUserSeeHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RefUserSeeHistoryExample() {
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

        public Criteria andMasterUserIdIsNull() {
            addCriterion("master_user_id is null");
            return (Criteria) this;
        }

        public Criteria andMasterUserIdIsNotNull() {
            addCriterion("master_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andMasterUserIdEqualTo(Integer value) {
            addCriterion("master_user_id =", value, "masterUserId");
            return (Criteria) this;
        }

        public Criteria andMasterUserIdNotEqualTo(Integer value) {
            addCriterion("master_user_id <>", value, "masterUserId");
            return (Criteria) this;
        }

        public Criteria andMasterUserIdGreaterThan(Integer value) {
            addCriterion("master_user_id >", value, "masterUserId");
            return (Criteria) this;
        }

        public Criteria andMasterUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("master_user_id >=", value, "masterUserId");
            return (Criteria) this;
        }

        public Criteria andMasterUserIdLessThan(Integer value) {
            addCriterion("master_user_id <", value, "masterUserId");
            return (Criteria) this;
        }

        public Criteria andMasterUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("master_user_id <=", value, "masterUserId");
            return (Criteria) this;
        }

        public Criteria andMasterUserIdIn(List<Integer> values) {
            addCriterion("master_user_id in", values, "masterUserId");
            return (Criteria) this;
        }

        public Criteria andMasterUserIdNotIn(List<Integer> values) {
            addCriterion("master_user_id not in", values, "masterUserId");
            return (Criteria) this;
        }

        public Criteria andMasterUserIdBetween(Integer value1, Integer value2) {
            addCriterion("master_user_id between", value1, value2, "masterUserId");
            return (Criteria) this;
        }

        public Criteria andMasterUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("master_user_id not between", value1, value2, "masterUserId");
            return (Criteria) this;
        }

        public Criteria andSeeUserIdIsNull() {
            addCriterion("see_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSeeUserIdIsNotNull() {
            addCriterion("see_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeeUserIdEqualTo(Integer value) {
            addCriterion("see_user_id =", value, "seeUserId");
            return (Criteria) this;
        }

        public Criteria andSeeUserIdNotEqualTo(Integer value) {
            addCriterion("see_user_id <>", value, "seeUserId");
            return (Criteria) this;
        }

        public Criteria andSeeUserIdGreaterThan(Integer value) {
            addCriterion("see_user_id >", value, "seeUserId");
            return (Criteria) this;
        }

        public Criteria andSeeUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("see_user_id >=", value, "seeUserId");
            return (Criteria) this;
        }

        public Criteria andSeeUserIdLessThan(Integer value) {
            addCriterion("see_user_id <", value, "seeUserId");
            return (Criteria) this;
        }

        public Criteria andSeeUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("see_user_id <=", value, "seeUserId");
            return (Criteria) this;
        }

        public Criteria andSeeUserIdIn(List<Integer> values) {
            addCriterion("see_user_id in", values, "seeUserId");
            return (Criteria) this;
        }

        public Criteria andSeeUserIdNotIn(List<Integer> values) {
            addCriterion("see_user_id not in", values, "seeUserId");
            return (Criteria) this;
        }

        public Criteria andSeeUserIdBetween(Integer value1, Integer value2) {
            addCriterion("see_user_id between", value1, value2, "seeUserId");
            return (Criteria) this;
        }

        public Criteria andSeeUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("see_user_id not between", value1, value2, "seeUserId");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNull() {
            addCriterion("dateTime is null");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNotNull() {
            addCriterion("dateTime is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimeEqualTo(Long value) {
            addCriterion("dateTime =", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotEqualTo(Long value) {
            addCriterion("dateTime <>", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThan(Long value) {
            addCriterion("dateTime >", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("dateTime >=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThan(Long value) {
            addCriterion("dateTime <", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThanOrEqualTo(Long value) {
            addCriterion("dateTime <=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeIn(List<Long> values) {
            addCriterion("dateTime in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotIn(List<Long> values) {
            addCriterion("dateTime not in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeBetween(Long value1, Long value2) {
            addCriterion("dateTime between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotBetween(Long value1, Long value2) {
            addCriterion("dateTime not between", value1, value2, "datetime");
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