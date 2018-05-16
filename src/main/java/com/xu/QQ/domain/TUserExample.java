package com.xu.QQ.domain;

import java.util.ArrayList;
import java.util.List;

public class TUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TUserExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andTnumIsNull() {
            addCriterion("tnum is null");
            return (Criteria) this;
        }

        public Criteria andTnumIsNotNull() {
            addCriterion("tnum is not null");
            return (Criteria) this;
        }

        public Criteria andTnumEqualTo(String value) {
            addCriterion("tnum =", value, "tnum");
            return (Criteria) this;
        }

        public Criteria andTnumNotEqualTo(String value) {
            addCriterion("tnum <>", value, "tnum");
            return (Criteria) this;
        }

        public Criteria andTnumGreaterThan(String value) {
            addCriterion("tnum >", value, "tnum");
            return (Criteria) this;
        }

        public Criteria andTnumGreaterThanOrEqualTo(String value) {
            addCriterion("tnum >=", value, "tnum");
            return (Criteria) this;
        }

        public Criteria andTnumLessThan(String value) {
            addCriterion("tnum <", value, "tnum");
            return (Criteria) this;
        }

        public Criteria andTnumLessThanOrEqualTo(String value) {
            addCriterion("tnum <=", value, "tnum");
            return (Criteria) this;
        }

        public Criteria andTnumLike(String value) {
            addCriterion("tnum like", value, "tnum");
            return (Criteria) this;
        }

        public Criteria andTnumNotLike(String value) {
            addCriterion("tnum not like", value, "tnum");
            return (Criteria) this;
        }

        public Criteria andTnumIn(List<String> values) {
            addCriterion("tnum in", values, "tnum");
            return (Criteria) this;
        }

        public Criteria andTnumNotIn(List<String> values) {
            addCriterion("tnum not in", values, "tnum");
            return (Criteria) this;
        }

        public Criteria andTnumBetween(String value1, String value2) {
            addCriterion("tnum between", value1, value2, "tnum");
            return (Criteria) this;
        }

        public Criteria andTnumNotBetween(String value1, String value2) {
            addCriterion("tnum not between", value1, value2, "tnum");
            return (Criteria) this;
        }

        public Criteria andEmaileIsNull() {
            addCriterion("emaile is null");
            return (Criteria) this;
        }

        public Criteria andEmaileIsNotNull() {
            addCriterion("emaile is not null");
            return (Criteria) this;
        }

        public Criteria andEmaileEqualTo(String value) {
            addCriterion("emaile =", value, "emaile");
            return (Criteria) this;
        }

        public Criteria andEmaileNotEqualTo(String value) {
            addCriterion("emaile <>", value, "emaile");
            return (Criteria) this;
        }

        public Criteria andEmaileGreaterThan(String value) {
            addCriterion("emaile >", value, "emaile");
            return (Criteria) this;
        }

        public Criteria andEmaileGreaterThanOrEqualTo(String value) {
            addCriterion("emaile >=", value, "emaile");
            return (Criteria) this;
        }

        public Criteria andEmaileLessThan(String value) {
            addCriterion("emaile <", value, "emaile");
            return (Criteria) this;
        }

        public Criteria andEmaileLessThanOrEqualTo(String value) {
            addCriterion("emaile <=", value, "emaile");
            return (Criteria) this;
        }

        public Criteria andEmaileLike(String value) {
            addCriterion("emaile like", value, "emaile");
            return (Criteria) this;
        }

        public Criteria andEmaileNotLike(String value) {
            addCriterion("emaile not like", value, "emaile");
            return (Criteria) this;
        }

        public Criteria andEmaileIn(List<String> values) {
            addCriterion("emaile in", values, "emaile");
            return (Criteria) this;
        }

        public Criteria andEmaileNotIn(List<String> values) {
            addCriterion("emaile not in", values, "emaile");
            return (Criteria) this;
        }

        public Criteria andEmaileBetween(String value1, String value2) {
            addCriterion("emaile between", value1, value2, "emaile");
            return (Criteria) this;
        }

        public Criteria andEmaileNotBetween(String value1, String value2) {
            addCriterion("emaile not between", value1, value2, "emaile");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIsonlineIsNull() {
            addCriterion("isonline is null");
            return (Criteria) this;
        }

        public Criteria andIsonlineIsNotNull() {
            addCriterion("isonline is not null");
            return (Criteria) this;
        }

        public Criteria andIsonlineEqualTo(Boolean value) {
            addCriterion("isonline =", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotEqualTo(Boolean value) {
            addCriterion("isonline <>", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineGreaterThan(Boolean value) {
            addCriterion("isonline >", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isonline >=", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineLessThan(Boolean value) {
            addCriterion("isonline <", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineLessThanOrEqualTo(Boolean value) {
            addCriterion("isonline <=", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineIn(List<Boolean> values) {
            addCriterion("isonline in", values, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotIn(List<Boolean> values) {
            addCriterion("isonline not in", values, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineBetween(Boolean value1, Boolean value2) {
            addCriterion("isonline between", value1, value2, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isonline not between", value1, value2, "isonline");
            return (Criteria) this;
        }

        public Criteria andTouxiangIsNull() {
            addCriterion("touxiang is null");
            return (Criteria) this;
        }

        public Criteria andTouxiangIsNotNull() {
            addCriterion("touxiang is not null");
            return (Criteria) this;
        }

        public Criteria andTouxiangEqualTo(String value) {
            addCriterion("touxiang =", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangNotEqualTo(String value) {
            addCriterion("touxiang <>", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangGreaterThan(String value) {
            addCriterion("touxiang >", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangGreaterThanOrEqualTo(String value) {
            addCriterion("touxiang >=", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangLessThan(String value) {
            addCriterion("touxiang <", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangLessThanOrEqualTo(String value) {
            addCriterion("touxiang <=", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangLike(String value) {
            addCriterion("touxiang like", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangNotLike(String value) {
            addCriterion("touxiang not like", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangIn(List<String> values) {
            addCriterion("touxiang in", values, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangNotIn(List<String> values) {
            addCriterion("touxiang not in", values, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangBetween(String value1, String value2) {
            addCriterion("touxiang between", value1, value2, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangNotBetween(String value1, String value2) {
            addCriterion("touxiang not between", value1, value2, "touxiang");
            return (Criteria) this;
        }
    }

    /**
     */
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