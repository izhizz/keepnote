package com.personal.keepnote.persistence.entity;

import java.util.ArrayList;
import java.util.List;

public class RefUserOtherInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RefUserOtherInfoExample() {
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

        public Criteria andSUserIdIsNull() {
            addCriterion("s_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSUserIdIsNotNull() {
            addCriterion("s_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSUserIdEqualTo(Integer value) {
            addCriterion("s_user_id =", value, "sUserId");
            return (Criteria) this;
        }

        public Criteria andSUserIdNotEqualTo(Integer value) {
            addCriterion("s_user_id <>", value, "sUserId");
            return (Criteria) this;
        }

        public Criteria andSUserIdGreaterThan(Integer value) {
            addCriterion("s_user_id >", value, "sUserId");
            return (Criteria) this;
        }

        public Criteria andSUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_user_id >=", value, "sUserId");
            return (Criteria) this;
        }

        public Criteria andSUserIdLessThan(Integer value) {
            addCriterion("s_user_id <", value, "sUserId");
            return (Criteria) this;
        }

        public Criteria andSUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_user_id <=", value, "sUserId");
            return (Criteria) this;
        }

        public Criteria andSUserIdIn(List<Integer> values) {
            addCriterion("s_user_id in", values, "sUserId");
            return (Criteria) this;
        }

        public Criteria andSUserIdNotIn(List<Integer> values) {
            addCriterion("s_user_id not in", values, "sUserId");
            return (Criteria) this;
        }

        public Criteria andSUserIdBetween(Integer value1, Integer value2) {
            addCriterion("s_user_id between", value1, value2, "sUserId");
            return (Criteria) this;
        }

        public Criteria andSUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_user_id not between", value1, value2, "sUserId");
            return (Criteria) this;
        }

        public Criteria andRUserIdIsNull() {
            addCriterion("r_user_id is null");
            return (Criteria) this;
        }

        public Criteria andRUserIdIsNotNull() {
            addCriterion("r_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andRUserIdEqualTo(Integer value) {
            addCriterion("r_user_id =", value, "rUserId");
            return (Criteria) this;
        }

        public Criteria andRUserIdNotEqualTo(Integer value) {
            addCriterion("r_user_id <>", value, "rUserId");
            return (Criteria) this;
        }

        public Criteria andRUserIdGreaterThan(Integer value) {
            addCriterion("r_user_id >", value, "rUserId");
            return (Criteria) this;
        }

        public Criteria andRUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_user_id >=", value, "rUserId");
            return (Criteria) this;
        }

        public Criteria andRUserIdLessThan(Integer value) {
            addCriterion("r_user_id <", value, "rUserId");
            return (Criteria) this;
        }

        public Criteria andRUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_user_id <=", value, "rUserId");
            return (Criteria) this;
        }

        public Criteria andRUserIdIn(List<Integer> values) {
            addCriterion("r_user_id in", values, "rUserId");
            return (Criteria) this;
        }

        public Criteria andRUserIdNotIn(List<Integer> values) {
            addCriterion("r_user_id not in", values, "rUserId");
            return (Criteria) this;
        }

        public Criteria andRUserIdBetween(Integer value1, Integer value2) {
            addCriterion("r_user_id between", value1, value2, "rUserId");
            return (Criteria) this;
        }

        public Criteria andRUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_user_id not between", value1, value2, "rUserId");
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