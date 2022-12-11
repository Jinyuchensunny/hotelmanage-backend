package zjc.hotelmanage.org.model;

import java.util.ArrayList;
import java.util.List;

public class HotelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotelExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andHotelidIsNull() {
            addCriterion("HotelID is null");
            return (Criteria) this;
        }

        public Criteria andHotelidIsNotNull() {
            addCriterion("HotelID is not null");
            return (Criteria) this;
        }

        public Criteria andHotelidEqualTo(Integer value) {
            addCriterion("HotelID =", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotEqualTo(Integer value) {
            addCriterion("HotelID <>", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidGreaterThan(Integer value) {
            addCriterion("HotelID >", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("HotelID >=", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidLessThan(Integer value) {
            addCriterion("HotelID <", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidLessThanOrEqualTo(Integer value) {
            addCriterion("HotelID <=", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidIn(List<Integer> values) {
            addCriterion("HotelID in", values, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotIn(List<Integer> values) {
            addCriterion("HotelID not in", values, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidBetween(Integer value1, Integer value2) {
            addCriterion("HotelID between", value1, value2, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotBetween(Integer value1, Integer value2) {
            addCriterion("HotelID not between", value1, value2, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelkindidIsNull() {
            addCriterion("HotelKindID is null");
            return (Criteria) this;
        }

        public Criteria andHotelkindidIsNotNull() {
            addCriterion("HotelKindID is not null");
            return (Criteria) this;
        }

        public Criteria andHotelkindidEqualTo(Integer value) {
            addCriterion("HotelKindID =", value, "hotelkindid");
            return (Criteria) this;
        }

        public Criteria andHotelkindidNotEqualTo(Integer value) {
            addCriterion("HotelKindID <>", value, "hotelkindid");
            return (Criteria) this;
        }

        public Criteria andHotelkindidGreaterThan(Integer value) {
            addCriterion("HotelKindID >", value, "hotelkindid");
            return (Criteria) this;
        }

        public Criteria andHotelkindidGreaterThanOrEqualTo(Integer value) {
            addCriterion("HotelKindID >=", value, "hotelkindid");
            return (Criteria) this;
        }

        public Criteria andHotelkindidLessThan(Integer value) {
            addCriterion("HotelKindID <", value, "hotelkindid");
            return (Criteria) this;
        }

        public Criteria andHotelkindidLessThanOrEqualTo(Integer value) {
            addCriterion("HotelKindID <=", value, "hotelkindid");
            return (Criteria) this;
        }

        public Criteria andHotelkindidIn(List<Integer> values) {
            addCriterion("HotelKindID in", values, "hotelkindid");
            return (Criteria) this;
        }

        public Criteria andHotelkindidNotIn(List<Integer> values) {
            addCriterion("HotelKindID not in", values, "hotelkindid");
            return (Criteria) this;
        }

        public Criteria andHotelkindidBetween(Integer value1, Integer value2) {
            addCriterion("HotelKindID between", value1, value2, "hotelkindid");
            return (Criteria) this;
        }

        public Criteria andHotelkindidNotBetween(Integer value1, Integer value2) {
            addCriterion("HotelKindID not between", value1, value2, "hotelkindid");
            return (Criteria) this;
        }

        public Criteria andHotelnameIsNull() {
            addCriterion("HotelName is null");
            return (Criteria) this;
        }

        public Criteria andHotelnameIsNotNull() {
            addCriterion("HotelName is not null");
            return (Criteria) this;
        }

        public Criteria andHotelnameEqualTo(String value) {
            addCriterion("HotelName =", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotEqualTo(String value) {
            addCriterion("HotelName <>", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameGreaterThan(String value) {
            addCriterion("HotelName >", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameGreaterThanOrEqualTo(String value) {
            addCriterion("HotelName >=", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameLessThan(String value) {
            addCriterion("HotelName <", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameLessThanOrEqualTo(String value) {
            addCriterion("HotelName <=", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameLike(String value) {
            addCriterion("HotelName like", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotLike(String value) {
            addCriterion("HotelName not like", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameIn(List<String> values) {
            addCriterion("HotelName in", values, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotIn(List<String> values) {
            addCriterion("HotelName not in", values, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameBetween(String value1, String value2) {
            addCriterion("HotelName between", value1, value2, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotBetween(String value1, String value2) {
            addCriterion("HotelName not between", value1, value2, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelpriceIsNull() {
            addCriterion("HotelPrice is null");
            return (Criteria) this;
        }

        public Criteria andHotelpriceIsNotNull() {
            addCriterion("HotelPrice is not null");
            return (Criteria) this;
        }

        public Criteria andHotelpriceEqualTo(String value) {
            addCriterion("HotelPrice =", value, "hotelprice");
            return (Criteria) this;
        }

        public Criteria andHotelpriceNotEqualTo(String value) {
            addCriterion("HotelPrice <>", value, "hotelprice");
            return (Criteria) this;
        }

        public Criteria andHotelpriceGreaterThan(String value) {
            addCriterion("HotelPrice >", value, "hotelprice");
            return (Criteria) this;
        }

        public Criteria andHotelpriceGreaterThanOrEqualTo(String value) {
            addCriterion("HotelPrice >=", value, "hotelprice");
            return (Criteria) this;
        }

        public Criteria andHotelpriceLessThan(String value) {
            addCriterion("HotelPrice <", value, "hotelprice");
            return (Criteria) this;
        }

        public Criteria andHotelpriceLessThanOrEqualTo(String value) {
            addCriterion("HotelPrice <=", value, "hotelprice");
            return (Criteria) this;
        }

        public Criteria andHotelpriceLike(String value) {
            addCriterion("HotelPrice like", value, "hotelprice");
            return (Criteria) this;
        }

        public Criteria andHotelpriceNotLike(String value) {
            addCriterion("HotelPrice not like", value, "hotelprice");
            return (Criteria) this;
        }

        public Criteria andHotelpriceIn(List<String> values) {
            addCriterion("HotelPrice in", values, "hotelprice");
            return (Criteria) this;
        }

        public Criteria andHotelpriceNotIn(List<String> values) {
            addCriterion("HotelPrice not in", values, "hotelprice");
            return (Criteria) this;
        }

        public Criteria andHotelpriceBetween(String value1, String value2) {
            addCriterion("HotelPrice between", value1, value2, "hotelprice");
            return (Criteria) this;
        }

        public Criteria andHotelpriceNotBetween(String value1, String value2) {
            addCriterion("HotelPrice not between", value1, value2, "hotelprice");
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