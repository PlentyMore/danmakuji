package cc.dmji.website.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EpisodeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dm_episode
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dm_episode
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dm_episode
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dm_episode
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public EpisodeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dm_episode
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dm_episode
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dm_episode
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dm_episode
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dm_episode
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dm_episode
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dm_episode
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dm_episode
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dm_episode
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dm_episode
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dm_episode
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
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

        public Criteria andEpIdIsNull() {
            addCriterion("ep_id is null");
            return (Criteria) this;
        }

        public Criteria andEpIdIsNotNull() {
            addCriterion("ep_id is not null");
            return (Criteria) this;
        }

        public Criteria andEpIdEqualTo(Integer value) {
            addCriterion("ep_id =", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdNotEqualTo(Integer value) {
            addCriterion("ep_id <>", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdGreaterThan(Integer value) {
            addCriterion("ep_id >", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ep_id >=", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdLessThan(Integer value) {
            addCriterion("ep_id <", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdLessThanOrEqualTo(Integer value) {
            addCriterion("ep_id <=", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdIn(List<Integer> values) {
            addCriterion("ep_id in", values, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdNotIn(List<Integer> values) {
            addCriterion("ep_id not in", values, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdBetween(Integer value1, Integer value2) {
            addCriterion("ep_id between", value1, value2, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ep_id not between", value1, value2, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIndexIsNull() {
            addCriterion("ep_index is null");
            return (Criteria) this;
        }

        public Criteria andEpIndexIsNotNull() {
            addCriterion("ep_index is not null");
            return (Criteria) this;
        }

        public Criteria andEpIndexEqualTo(Integer value) {
            addCriterion("ep_index =", value, "epIndex");
            return (Criteria) this;
        }

        public Criteria andEpIndexNotEqualTo(Integer value) {
            addCriterion("ep_index <>", value, "epIndex");
            return (Criteria) this;
        }

        public Criteria andEpIndexGreaterThan(Integer value) {
            addCriterion("ep_index >", value, "epIndex");
            return (Criteria) this;
        }

        public Criteria andEpIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("ep_index >=", value, "epIndex");
            return (Criteria) this;
        }

        public Criteria andEpIndexLessThan(Integer value) {
            addCriterion("ep_index <", value, "epIndex");
            return (Criteria) this;
        }

        public Criteria andEpIndexLessThanOrEqualTo(Integer value) {
            addCriterion("ep_index <=", value, "epIndex");
            return (Criteria) this;
        }

        public Criteria andEpIndexIn(List<Integer> values) {
            addCriterion("ep_index in", values, "epIndex");
            return (Criteria) this;
        }

        public Criteria andEpIndexNotIn(List<Integer> values) {
            addCriterion("ep_index not in", values, "epIndex");
            return (Criteria) this;
        }

        public Criteria andEpIndexBetween(Integer value1, Integer value2) {
            addCriterion("ep_index between", value1, value2, "epIndex");
            return (Criteria) this;
        }

        public Criteria andEpIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("ep_index not between", value1, value2, "epIndex");
            return (Criteria) this;
        }

        public Criteria andBangumiIdIsNull() {
            addCriterion("bangumi_id is null");
            return (Criteria) this;
        }

        public Criteria andBangumiIdIsNotNull() {
            addCriterion("bangumi_id is not null");
            return (Criteria) this;
        }

        public Criteria andBangumiIdEqualTo(Integer value) {
            addCriterion("bangumi_id =", value, "bangumiId");
            return (Criteria) this;
        }

        public Criteria andBangumiIdNotEqualTo(Integer value) {
            addCriterion("bangumi_id <>", value, "bangumiId");
            return (Criteria) this;
        }

        public Criteria andBangumiIdGreaterThan(Integer value) {
            addCriterion("bangumi_id >", value, "bangumiId");
            return (Criteria) this;
        }

        public Criteria andBangumiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bangumi_id >=", value, "bangumiId");
            return (Criteria) this;
        }

        public Criteria andBangumiIdLessThan(Integer value) {
            addCriterion("bangumi_id <", value, "bangumiId");
            return (Criteria) this;
        }

        public Criteria andBangumiIdLessThanOrEqualTo(Integer value) {
            addCriterion("bangumi_id <=", value, "bangumiId");
            return (Criteria) this;
        }

        public Criteria andBangumiIdIn(List<Integer> values) {
            addCriterion("bangumi_id in", values, "bangumiId");
            return (Criteria) this;
        }

        public Criteria andBangumiIdNotIn(List<Integer> values) {
            addCriterion("bangumi_id not in", values, "bangumiId");
            return (Criteria) this;
        }

        public Criteria andBangumiIdBetween(Integer value1, Integer value2) {
            addCriterion("bangumi_id between", value1, value2, "bangumiId");
            return (Criteria) this;
        }

        public Criteria andBangumiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bangumi_id not between", value1, value2, "bangumiId");
            return (Criteria) this;
        }

        public Criteria andReplyableIsNull() {
            addCriterion("replyable is null");
            return (Criteria) this;
        }

        public Criteria andReplyableIsNotNull() {
            addCriterion("replyable is not null");
            return (Criteria) this;
        }

        public Criteria andReplyableEqualTo(Boolean value) {
            addCriterion("replyable =", value, "replyable");
            return (Criteria) this;
        }

        public Criteria andReplyableNotEqualTo(Boolean value) {
            addCriterion("replyable <>", value, "replyable");
            return (Criteria) this;
        }

        public Criteria andReplyableGreaterThan(Boolean value) {
            addCriterion("replyable >", value, "replyable");
            return (Criteria) this;
        }

        public Criteria andReplyableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("replyable >=", value, "replyable");
            return (Criteria) this;
        }

        public Criteria andReplyableLessThan(Boolean value) {
            addCriterion("replyable <", value, "replyable");
            return (Criteria) this;
        }

        public Criteria andReplyableLessThanOrEqualTo(Boolean value) {
            addCriterion("replyable <=", value, "replyable");
            return (Criteria) this;
        }

        public Criteria andReplyableIn(List<Boolean> values) {
            addCriterion("replyable in", values, "replyable");
            return (Criteria) this;
        }

        public Criteria andReplyableNotIn(List<Boolean> values) {
            addCriterion("replyable not in", values, "replyable");
            return (Criteria) this;
        }

        public Criteria andReplyableBetween(Boolean value1, Boolean value2) {
            addCriterion("replyable between", value1, value2, "replyable");
            return (Criteria) this;
        }

        public Criteria andReplyableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("replyable not between", value1, value2, "replyable");
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

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdIsNull() {
            addCriterion("danmaku_id is null");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdIsNotNull() {
            addCriterion("danmaku_id is not null");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdEqualTo(String value) {
            addCriterion("danmaku_id =", value, "danmakuId");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdNotEqualTo(String value) {
            addCriterion("danmaku_id <>", value, "danmakuId");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdGreaterThan(String value) {
            addCriterion("danmaku_id >", value, "danmakuId");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdGreaterThanOrEqualTo(String value) {
            addCriterion("danmaku_id >=", value, "danmakuId");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdLessThan(String value) {
            addCriterion("danmaku_id <", value, "danmakuId");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdLessThanOrEqualTo(String value) {
            addCriterion("danmaku_id <=", value, "danmakuId");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdLike(String value) {
            addCriterion("danmaku_id like", value, "danmakuId");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdNotLike(String value) {
            addCriterion("danmaku_id not like", value, "danmakuId");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdIn(List<String> values) {
            addCriterion("danmaku_id in", values, "danmakuId");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdNotIn(List<String> values) {
            addCriterion("danmaku_id not in", values, "danmakuId");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdBetween(String value1, String value2) {
            addCriterion("danmaku_id between", value1, value2, "danmakuId");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdNotBetween(String value1, String value2) {
            addCriterion("danmaku_id not between", value1, value2, "danmakuId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dm_episode
     *
     * @mbg.generated do_not_delete_during_merge Tue May 08 23:01:05 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dm_episode
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
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