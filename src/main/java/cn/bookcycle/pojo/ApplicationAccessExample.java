package cn.bookcycle.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplicationAccessExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplicationAccessExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andManufacturerIsNull() {
            addCriterion("manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("manufacturer =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("manufacturer <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("manufacturer >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturer >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("manufacturer <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("manufacturer <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("manufacturer like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("manufacturer not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("manufacturer in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("manufacturer not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("manufacturer between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("manufacturer not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNull() {
            addCriterion("device_type is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNotNull() {
            addCriterion("device_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeEqualTo(String value) {
            addCriterion("device_type =", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotEqualTo(String value) {
            addCriterion("device_type <>", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThan(String value) {
            addCriterion("device_type >", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("device_type >=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThan(String value) {
            addCriterion("device_type <", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThanOrEqualTo(String value) {
            addCriterion("device_type <=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLike(String value) {
            addCriterion("device_type like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotLike(String value) {
            addCriterion("device_type not like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIn(List<String> values) {
            addCriterion("device_type in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotIn(List<String> values) {
            addCriterion("device_type not in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeBetween(String value1, String value2) {
            addCriterion("device_type between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotBetween(String value1, String value2) {
            addCriterion("device_type not between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceModelIsNull() {
            addCriterion("device_model is null");
            return (Criteria) this;
        }

        public Criteria andDeviceModelIsNotNull() {
            addCriterion("device_model is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceModelEqualTo(String value) {
            addCriterion("device_model =", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNotEqualTo(String value) {
            addCriterion("device_model <>", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelGreaterThan(String value) {
            addCriterion("device_model >", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelGreaterThanOrEqualTo(String value) {
            addCriterion("device_model >=", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelLessThan(String value) {
            addCriterion("device_model <", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelLessThanOrEqualTo(String value) {
            addCriterion("device_model <=", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelLike(String value) {
            addCriterion("device_model like", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNotLike(String value) {
            addCriterion("device_model not like", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelIn(List<String> values) {
            addCriterion("device_model in", values, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNotIn(List<String> values) {
            addCriterion("device_model not in", values, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelBetween(String value1, String value2) {
            addCriterion("device_model between", value1, value2, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNotBetween(String value1, String value2) {
            addCriterion("device_model not between", value1, value2, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppSecretIsNull() {
            addCriterion("app_secret is null");
            return (Criteria) this;
        }

        public Criteria andAppSecretIsNotNull() {
            addCriterion("app_secret is not null");
            return (Criteria) this;
        }

        public Criteria andAppSecretEqualTo(String value) {
            addCriterion("app_secret =", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotEqualTo(String value) {
            addCriterion("app_secret <>", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretGreaterThan(String value) {
            addCriterion("app_secret >", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretGreaterThanOrEqualTo(String value) {
            addCriterion("app_secret >=", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretLessThan(String value) {
            addCriterion("app_secret <", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretLessThanOrEqualTo(String value) {
            addCriterion("app_secret <=", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretLike(String value) {
            addCriterion("app_secret like", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotLike(String value) {
            addCriterion("app_secret not like", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretIn(List<String> values) {
            addCriterion("app_secret in", values, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotIn(List<String> values) {
            addCriterion("app_secret not in", values, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretBetween(String value1, String value2) {
            addCriterion("app_secret between", value1, value2, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotBetween(String value1, String value2) {
            addCriterion("app_secret not between", value1, value2, "appSecret");
            return (Criteria) this;
        }

        public Criteria andIotAppNameIsNull() {
            addCriterion("iot_app_name is null");
            return (Criteria) this;
        }

        public Criteria andIotAppNameIsNotNull() {
            addCriterion("iot_app_name is not null");
            return (Criteria) this;
        }

        public Criteria andIotAppNameEqualTo(String value) {
            addCriterion("iot_app_name =", value, "iotAppName");
            return (Criteria) this;
        }

        public Criteria andIotAppNameNotEqualTo(String value) {
            addCriterion("iot_app_name <>", value, "iotAppName");
            return (Criteria) this;
        }

        public Criteria andIotAppNameGreaterThan(String value) {
            addCriterion("iot_app_name >", value, "iotAppName");
            return (Criteria) this;
        }

        public Criteria andIotAppNameGreaterThanOrEqualTo(String value) {
            addCriterion("iot_app_name >=", value, "iotAppName");
            return (Criteria) this;
        }

        public Criteria andIotAppNameLessThan(String value) {
            addCriterion("iot_app_name <", value, "iotAppName");
            return (Criteria) this;
        }

        public Criteria andIotAppNameLessThanOrEqualTo(String value) {
            addCriterion("iot_app_name <=", value, "iotAppName");
            return (Criteria) this;
        }

        public Criteria andIotAppNameLike(String value) {
            addCriterion("iot_app_name like", value, "iotAppName");
            return (Criteria) this;
        }

        public Criteria andIotAppNameNotLike(String value) {
            addCriterion("iot_app_name not like", value, "iotAppName");
            return (Criteria) this;
        }

        public Criteria andIotAppNameIn(List<String> values) {
            addCriterion("iot_app_name in", values, "iotAppName");
            return (Criteria) this;
        }

        public Criteria andIotAppNameNotIn(List<String> values) {
            addCriterion("iot_app_name not in", values, "iotAppName");
            return (Criteria) this;
        }

        public Criteria andIotAppNameBetween(String value1, String value2) {
            addCriterion("iot_app_name between", value1, value2, "iotAppName");
            return (Criteria) this;
        }

        public Criteria andIotAppNameNotBetween(String value1, String value2) {
            addCriterion("iot_app_name not between", value1, value2, "iotAppName");
            return (Criteria) this;
        }

        public Criteria andIotAppIdIsNull() {
            addCriterion("iot_app_id is null");
            return (Criteria) this;
        }

        public Criteria andIotAppIdIsNotNull() {
            addCriterion("iot_app_id is not null");
            return (Criteria) this;
        }

        public Criteria andIotAppIdEqualTo(String value) {
            addCriterion("iot_app_id =", value, "iotAppId");
            return (Criteria) this;
        }

        public Criteria andIotAppIdNotEqualTo(String value) {
            addCriterion("iot_app_id <>", value, "iotAppId");
            return (Criteria) this;
        }

        public Criteria andIotAppIdGreaterThan(String value) {
            addCriterion("iot_app_id >", value, "iotAppId");
            return (Criteria) this;
        }

        public Criteria andIotAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("iot_app_id >=", value, "iotAppId");
            return (Criteria) this;
        }

        public Criteria andIotAppIdLessThan(String value) {
            addCriterion("iot_app_id <", value, "iotAppId");
            return (Criteria) this;
        }

        public Criteria andIotAppIdLessThanOrEqualTo(String value) {
            addCriterion("iot_app_id <=", value, "iotAppId");
            return (Criteria) this;
        }

        public Criteria andIotAppIdLike(String value) {
            addCriterion("iot_app_id like", value, "iotAppId");
            return (Criteria) this;
        }

        public Criteria andIotAppIdNotLike(String value) {
            addCriterion("iot_app_id not like", value, "iotAppId");
            return (Criteria) this;
        }

        public Criteria andIotAppIdIn(List<String> values) {
            addCriterion("iot_app_id in", values, "iotAppId");
            return (Criteria) this;
        }

        public Criteria andIotAppIdNotIn(List<String> values) {
            addCriterion("iot_app_id not in", values, "iotAppId");
            return (Criteria) this;
        }

        public Criteria andIotAppIdBetween(String value1, String value2) {
            addCriterion("iot_app_id between", value1, value2, "iotAppId");
            return (Criteria) this;
        }

        public Criteria andIotAppIdNotBetween(String value1, String value2) {
            addCriterion("iot_app_id not between", value1, value2, "iotAppId");
            return (Criteria) this;
        }

        public Criteria andIotAppSecretIsNull() {
            addCriterion("iot_app_secret is null");
            return (Criteria) this;
        }

        public Criteria andIotAppSecretIsNotNull() {
            addCriterion("iot_app_secret is not null");
            return (Criteria) this;
        }

        public Criteria andIotAppSecretEqualTo(String value) {
            addCriterion("iot_app_secret =", value, "iotAppSecret");
            return (Criteria) this;
        }

        public Criteria andIotAppSecretNotEqualTo(String value) {
            addCriterion("iot_app_secret <>", value, "iotAppSecret");
            return (Criteria) this;
        }

        public Criteria andIotAppSecretGreaterThan(String value) {
            addCriterion("iot_app_secret >", value, "iotAppSecret");
            return (Criteria) this;
        }

        public Criteria andIotAppSecretGreaterThanOrEqualTo(String value) {
            addCriterion("iot_app_secret >=", value, "iotAppSecret");
            return (Criteria) this;
        }

        public Criteria andIotAppSecretLessThan(String value) {
            addCriterion("iot_app_secret <", value, "iotAppSecret");
            return (Criteria) this;
        }

        public Criteria andIotAppSecretLessThanOrEqualTo(String value) {
            addCriterion("iot_app_secret <=", value, "iotAppSecret");
            return (Criteria) this;
        }

        public Criteria andIotAppSecretLike(String value) {
            addCriterion("iot_app_secret like", value, "iotAppSecret");
            return (Criteria) this;
        }

        public Criteria andIotAppSecretNotLike(String value) {
            addCriterion("iot_app_secret not like", value, "iotAppSecret");
            return (Criteria) this;
        }

        public Criteria andIotAppSecretIn(List<String> values) {
            addCriterion("iot_app_secret in", values, "iotAppSecret");
            return (Criteria) this;
        }

        public Criteria andIotAppSecretNotIn(List<String> values) {
            addCriterion("iot_app_secret not in", values, "iotAppSecret");
            return (Criteria) this;
        }

        public Criteria andIotAppSecretBetween(String value1, String value2) {
            addCriterion("iot_app_secret between", value1, value2, "iotAppSecret");
            return (Criteria) this;
        }

        public Criteria andIotAppSecretNotBetween(String value1, String value2) {
            addCriterion("iot_app_secret not between", value1, value2, "iotAppSecret");
            return (Criteria) this;
        }

        public Criteria andSubscribeUrlIsNull() {
            addCriterion("subscribe_url is null");
            return (Criteria) this;
        }

        public Criteria andSubscribeUrlIsNotNull() {
            addCriterion("subscribe_url is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribeUrlEqualTo(String value) {
            addCriterion("subscribe_url =", value, "subscribeUrl");
            return (Criteria) this;
        }

        public Criteria andSubscribeUrlNotEqualTo(String value) {
            addCriterion("subscribe_url <>", value, "subscribeUrl");
            return (Criteria) this;
        }

        public Criteria andSubscribeUrlGreaterThan(String value) {
            addCriterion("subscribe_url >", value, "subscribeUrl");
            return (Criteria) this;
        }

        public Criteria andSubscribeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("subscribe_url >=", value, "subscribeUrl");
            return (Criteria) this;
        }

        public Criteria andSubscribeUrlLessThan(String value) {
            addCriterion("subscribe_url <", value, "subscribeUrl");
            return (Criteria) this;
        }

        public Criteria andSubscribeUrlLessThanOrEqualTo(String value) {
            addCriterion("subscribe_url <=", value, "subscribeUrl");
            return (Criteria) this;
        }

        public Criteria andSubscribeUrlLike(String value) {
            addCriterion("subscribe_url like", value, "subscribeUrl");
            return (Criteria) this;
        }

        public Criteria andSubscribeUrlNotLike(String value) {
            addCriterion("subscribe_url not like", value, "subscribeUrl");
            return (Criteria) this;
        }

        public Criteria andSubscribeUrlIn(List<String> values) {
            addCriterion("subscribe_url in", values, "subscribeUrl");
            return (Criteria) this;
        }

        public Criteria andSubscribeUrlNotIn(List<String> values) {
            addCriterion("subscribe_url not in", values, "subscribeUrl");
            return (Criteria) this;
        }

        public Criteria andSubscribeUrlBetween(String value1, String value2) {
            addCriterion("subscribe_url between", value1, value2, "subscribeUrl");
            return (Criteria) this;
        }

        public Criteria andSubscribeUrlNotBetween(String value1, String value2) {
            addCriterion("subscribe_url not between", value1, value2, "subscribeUrl");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Short value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Short value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Short value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Short value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Short value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Short value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Short> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Short> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Short value1, Short value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Short value1, Short value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andDeviceNumIsNull() {
            addCriterion("device_num is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNumIsNotNull() {
            addCriterion("device_num is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNumEqualTo(Integer value) {
            addCriterion("device_num =", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumNotEqualTo(Integer value) {
            addCriterion("device_num <>", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumGreaterThan(Integer value) {
            addCriterion("device_num >", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_num >=", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumLessThan(Integer value) {
            addCriterion("device_num <", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumLessThanOrEqualTo(Integer value) {
            addCriterion("device_num <=", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumIn(List<Integer> values) {
            addCriterion("device_num in", values, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumNotIn(List<Integer> values) {
            addCriterion("device_num not in", values, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumBetween(Integer value1, Integer value2) {
            addCriterion("device_num between", value1, value2, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumNotBetween(Integer value1, Integer value2) {
            addCriterion("device_num not between", value1, value2, "deviceNum");
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