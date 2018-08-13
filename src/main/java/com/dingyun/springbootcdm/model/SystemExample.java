package com.dingyun.springbootcdm.model;

import java.util.ArrayList;
import java.util.List;

public class SystemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemExample() {
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

        public Criteria andSchoolnameIsNull() {
            addCriterion("schoolName is null");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIsNotNull() {
            addCriterion("schoolName is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolnameEqualTo(String value) {
            addCriterion("schoolName =", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotEqualTo(String value) {
            addCriterion("schoolName <>", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameGreaterThan(String value) {
            addCriterion("schoolName >", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameGreaterThanOrEqualTo(String value) {
            addCriterion("schoolName >=", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLessThan(String value) {
            addCriterion("schoolName <", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLessThanOrEqualTo(String value) {
            addCriterion("schoolName <=", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLike(String value) {
            addCriterion("schoolName like", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotLike(String value) {
            addCriterion("schoolName not like", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIn(List<String> values) {
            addCriterion("schoolName in", values, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotIn(List<String> values) {
            addCriterion("schoolName not in", values, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameBetween(String value1, String value2) {
            addCriterion("schoolName between", value1, value2, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotBetween(String value1, String value2) {
            addCriterion("schoolName not between", value1, value2, "schoolname");
            return (Criteria) this;
        }

        public Criteria andForbidteacherIsNull() {
            addCriterion("forbidTeacher is null");
            return (Criteria) this;
        }

        public Criteria andForbidteacherIsNotNull() {
            addCriterion("forbidTeacher is not null");
            return (Criteria) this;
        }

        public Criteria andForbidteacherEqualTo(Byte value) {
            addCriterion("forbidTeacher =", value, "forbidteacher");
            return (Criteria) this;
        }

        public Criteria andForbidteacherNotEqualTo(Byte value) {
            addCriterion("forbidTeacher <>", value, "forbidteacher");
            return (Criteria) this;
        }

        public Criteria andForbidteacherGreaterThan(Byte value) {
            addCriterion("forbidTeacher >", value, "forbidteacher");
            return (Criteria) this;
        }

        public Criteria andForbidteacherGreaterThanOrEqualTo(Byte value) {
            addCriterion("forbidTeacher >=", value, "forbidteacher");
            return (Criteria) this;
        }

        public Criteria andForbidteacherLessThan(Byte value) {
            addCriterion("forbidTeacher <", value, "forbidteacher");
            return (Criteria) this;
        }

        public Criteria andForbidteacherLessThanOrEqualTo(Byte value) {
            addCriterion("forbidTeacher <=", value, "forbidteacher");
            return (Criteria) this;
        }

        public Criteria andForbidteacherIn(List<Byte> values) {
            addCriterion("forbidTeacher in", values, "forbidteacher");
            return (Criteria) this;
        }

        public Criteria andForbidteacherNotIn(List<Byte> values) {
            addCriterion("forbidTeacher not in", values, "forbidteacher");
            return (Criteria) this;
        }

        public Criteria andForbidteacherBetween(Byte value1, Byte value2) {
            addCriterion("forbidTeacher between", value1, value2, "forbidteacher");
            return (Criteria) this;
        }

        public Criteria andForbidteacherNotBetween(Byte value1, Byte value2) {
            addCriterion("forbidTeacher not between", value1, value2, "forbidteacher");
            return (Criteria) this;
        }

        public Criteria andForbidstudentIsNull() {
            addCriterion("forbidStudent is null");
            return (Criteria) this;
        }

        public Criteria andForbidstudentIsNotNull() {
            addCriterion("forbidStudent is not null");
            return (Criteria) this;
        }

        public Criteria andForbidstudentEqualTo(Byte value) {
            addCriterion("forbidStudent =", value, "forbidstudent");
            return (Criteria) this;
        }

        public Criteria andForbidstudentNotEqualTo(Byte value) {
            addCriterion("forbidStudent <>", value, "forbidstudent");
            return (Criteria) this;
        }

        public Criteria andForbidstudentGreaterThan(Byte value) {
            addCriterion("forbidStudent >", value, "forbidstudent");
            return (Criteria) this;
        }

        public Criteria andForbidstudentGreaterThanOrEqualTo(Byte value) {
            addCriterion("forbidStudent >=", value, "forbidstudent");
            return (Criteria) this;
        }

        public Criteria andForbidstudentLessThan(Byte value) {
            addCriterion("forbidStudent <", value, "forbidstudent");
            return (Criteria) this;
        }

        public Criteria andForbidstudentLessThanOrEqualTo(Byte value) {
            addCriterion("forbidStudent <=", value, "forbidstudent");
            return (Criteria) this;
        }

        public Criteria andForbidstudentIn(List<Byte> values) {
            addCriterion("forbidStudent in", values, "forbidstudent");
            return (Criteria) this;
        }

        public Criteria andForbidstudentNotIn(List<Byte> values) {
            addCriterion("forbidStudent not in", values, "forbidstudent");
            return (Criteria) this;
        }

        public Criteria andForbidstudentBetween(Byte value1, Byte value2) {
            addCriterion("forbidStudent between", value1, value2, "forbidstudent");
            return (Criteria) this;
        }

        public Criteria andForbidstudentNotBetween(Byte value1, Byte value2) {
            addCriterion("forbidStudent not between", value1, value2, "forbidstudent");
            return (Criteria) this;
        }

        public Criteria andNoticeteacherIsNull() {
            addCriterion("noticeTeacher is null");
            return (Criteria) this;
        }

        public Criteria andNoticeteacherIsNotNull() {
            addCriterion("noticeTeacher is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeteacherEqualTo(String value) {
            addCriterion("noticeTeacher =", value, "noticeteacher");
            return (Criteria) this;
        }

        public Criteria andNoticeteacherNotEqualTo(String value) {
            addCriterion("noticeTeacher <>", value, "noticeteacher");
            return (Criteria) this;
        }

        public Criteria andNoticeteacherGreaterThan(String value) {
            addCriterion("noticeTeacher >", value, "noticeteacher");
            return (Criteria) this;
        }

        public Criteria andNoticeteacherGreaterThanOrEqualTo(String value) {
            addCriterion("noticeTeacher >=", value, "noticeteacher");
            return (Criteria) this;
        }

        public Criteria andNoticeteacherLessThan(String value) {
            addCriterion("noticeTeacher <", value, "noticeteacher");
            return (Criteria) this;
        }

        public Criteria andNoticeteacherLessThanOrEqualTo(String value) {
            addCriterion("noticeTeacher <=", value, "noticeteacher");
            return (Criteria) this;
        }

        public Criteria andNoticeteacherLike(String value) {
            addCriterion("noticeTeacher like", value, "noticeteacher");
            return (Criteria) this;
        }

        public Criteria andNoticeteacherNotLike(String value) {
            addCriterion("noticeTeacher not like", value, "noticeteacher");
            return (Criteria) this;
        }

        public Criteria andNoticeteacherIn(List<String> values) {
            addCriterion("noticeTeacher in", values, "noticeteacher");
            return (Criteria) this;
        }

        public Criteria andNoticeteacherNotIn(List<String> values) {
            addCriterion("noticeTeacher not in", values, "noticeteacher");
            return (Criteria) this;
        }

        public Criteria andNoticeteacherBetween(String value1, String value2) {
            addCriterion("noticeTeacher between", value1, value2, "noticeteacher");
            return (Criteria) this;
        }

        public Criteria andNoticeteacherNotBetween(String value1, String value2) {
            addCriterion("noticeTeacher not between", value1, value2, "noticeteacher");
            return (Criteria) this;
        }

        public Criteria andNoticestudentIsNull() {
            addCriterion("noticeStudent is null");
            return (Criteria) this;
        }

        public Criteria andNoticestudentIsNotNull() {
            addCriterion("noticeStudent is not null");
            return (Criteria) this;
        }

        public Criteria andNoticestudentEqualTo(String value) {
            addCriterion("noticeStudent =", value, "noticestudent");
            return (Criteria) this;
        }

        public Criteria andNoticestudentNotEqualTo(String value) {
            addCriterion("noticeStudent <>", value, "noticestudent");
            return (Criteria) this;
        }

        public Criteria andNoticestudentGreaterThan(String value) {
            addCriterion("noticeStudent >", value, "noticestudent");
            return (Criteria) this;
        }

        public Criteria andNoticestudentGreaterThanOrEqualTo(String value) {
            addCriterion("noticeStudent >=", value, "noticestudent");
            return (Criteria) this;
        }

        public Criteria andNoticestudentLessThan(String value) {
            addCriterion("noticeStudent <", value, "noticestudent");
            return (Criteria) this;
        }

        public Criteria andNoticestudentLessThanOrEqualTo(String value) {
            addCriterion("noticeStudent <=", value, "noticestudent");
            return (Criteria) this;
        }

        public Criteria andNoticestudentLike(String value) {
            addCriterion("noticeStudent like", value, "noticestudent");
            return (Criteria) this;
        }

        public Criteria andNoticestudentNotLike(String value) {
            addCriterion("noticeStudent not like", value, "noticestudent");
            return (Criteria) this;
        }

        public Criteria andNoticestudentIn(List<String> values) {
            addCriterion("noticeStudent in", values, "noticestudent");
            return (Criteria) this;
        }

        public Criteria andNoticestudentNotIn(List<String> values) {
            addCriterion("noticeStudent not in", values, "noticestudent");
            return (Criteria) this;
        }

        public Criteria andNoticestudentBetween(String value1, String value2) {
            addCriterion("noticeStudent between", value1, value2, "noticestudent");
            return (Criteria) this;
        }

        public Criteria andNoticestudentNotBetween(String value1, String value2) {
            addCriterion("noticeStudent not between", value1, value2, "noticestudent");
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