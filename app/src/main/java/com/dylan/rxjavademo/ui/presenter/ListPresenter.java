package com.dylan.rxjavademo.ui.presenter;

import android.content.Context;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.ui.PageType;
import com.dylan.rxjavademo.ui.bean.ListBean;
import com.dylan.rxjavademo.util.common.StringUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/20-下午9:35
 */
public class ListPresenter implements PageType {
    private Context mContext;

    public ListPresenter(Context context) {
        mContext = context;
    }

    public List<ListBean> getPageItemList(int type) {
        List<ListBean> list = null;
        switch (type) {
            case CREATE:
                list = getCreateList();
                break;
            case TRANSFROM:
                list = getTransformList();
                break;
            case FILTER:
                list = getFilterList();
                break;
            case ERROR:
                list = getErrorList();
                break;
            case COMBINE:
                list = getCombineList();
                break;
            case UTILITY:
                list = getUtilityList();
                break;
            case CONDITION:
                list = getConditionList();
                break;
            case AGGREGATE:
                list = getAggregateList();
                break;
            case CONNECTABLE:
                list = getConnectList();
                break;
        }
        return list;
    }

    private List<ListBean> getCreateList() {
        List<ListBean> list = new ArrayList<>();
        list.add(new ListBean(StringUtil.getString(mContext, R.string.create_item_create), CREATE_ITEM_CREATE));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.create_item_range), CREATE_ITEM_RANGE));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.create_item_defer), CREATE_ITEM_DEFER));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.create_item_just), CREATE_ITEM_JUST));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.create_item_from), CREATE_ITEM_FROM));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.create_item_interval), CREATE_ITEM_INTERVAL));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.create_item_repeat), CREATE_ITEM_REPEAT));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.create_item_timer), CREATE_ITEM_TIMER));
        return list;
    }

    private List<ListBean> getTransformList() {
        List<ListBean> list = new ArrayList<>();
        list.add(new ListBean(StringUtil.getString(mContext, R.string.transform_item_buffer), TRANSFROM_ITEM_BUFFER));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.transform_item_flatmap), TRANSFROM_ITEM_FLATMAP));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.transform_item_flatmap_iterable), TRANSFROM_ITEM_FLATMAPITERABLE));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.transform_item_concat_map), TRANSFROM_ITEM_CONCAT_MAP));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.transform_item_switch_map), TRANSFROM_ITEM_SWITCH_MAP));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.transform_item_groupby), TRANSFROM_ITEM_GROUPBY));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.transform_item_map), TRANSFROM_ITEM_MAP));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.transform_item_cast), TRANSFROM_ITEM_CAST));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.transform_item_scan), TRANSFROM_ITEM_SCAN));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.transform_item_window), TRANSFROM_ITEM_WINDOW));
        return list;
    }

    private List<ListBean> getFilterList() {
        List<ListBean> list = new ArrayList<>();
        list.add(new ListBean(StringUtil.getString(mContext, R.string.filter_item_debounce), FILTER_ITEM_DEBOUCE));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.filter_item_distinct), FILTER_ITEM_DISTINCT));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.filter_item_distinct_util_changed), FILTER_ITEM_DISTINCT_UTIL_CHANGED));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.filter_item_element_at), FILTER_ITEM_ELEMENT_AT));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.filter_item_element_at_or_default), FILTER_ITEM_ELEMENT_AT_OR_DEFAULT));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.filter_item_filter), FILTER_ITEM_FILTER));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.filter_item_of_type), FILTER_ITEM_OF_TYPE));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.filter_item_first), FILTER_ITEM_FIRST));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.filter_item_last), FILTER_ITEM_LAST));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.filter_item_skip), FILTER_ITEM_SKIP));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.filter_item_take), FILTER_ITEM_TAKE));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.filter_item_sample), FILTER_ITEM_SAMPLE));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.filter_item_throttle_first), FILTER_ITEM_THROTTLE_FIRST));
        return list;
    }

    private List<ListBean> getCombineList() {
        List<ListBean> list = new ArrayList<>();
        list.add(new ListBean(StringUtil.getString(mContext, R.string.combine_item_combine_latest), COMBINE_ITEM_COMBINE_LATEST));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.combine_item_join), COMBINE_ITEM_JOIN));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.combine_item_merge), COMBINE_ITEM_MERGE));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.combine_item_merge_delay_error), COMBINE_ITEM_MERGE_DELAY_ERROR));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.combine_item_start_with), COMBINE_ITEM_START_WITH));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.combine_item_switch), COMBINE_ITEM_SWITCH));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.combine_item_zip), COMBINE_ITEM_ZIP));
        return list;
    }

    private List<ListBean> getErrorList() {
        List<ListBean> list = new ArrayList<>();
        list.add(new ListBean(StringUtil.getString(mContext, R.string.error_item_on_error_return), ERROR_ITEM_ON_ERROR_RETURN));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.error_item_on_error_resume_next), ERROR_ITEM_ON_ERROR_RESUME_NEXT));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.error_item_on_exception_resume_next), ERROR_ITEM_ON_EXCEPTION_RESUME_NEXT));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.error_item_retry), ERROR_ITEM_RETRY));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.error_item_retry_when), ERROR_ITEM_RETRY_WHEN));
        return list;
    }

    private List<ListBean> getConditionList() {
        List<ListBean> list = new ArrayList<>();
        list.add(new ListBean(mContext.getString(R.string.condition_boolean_item_all), CONDITION_ITEM_ALL));
        list.add(new ListBean(mContext.getString(R.string.condition_boolean_item_amb), CONDITION_ITEM_AMB));
        list.add(new ListBean(mContext.getString(R.string.condition_boolean_item_contains), CONDITION_ITEM_CONTAINS));
        list.add(new ListBean(mContext.getString(R.string.condition_boolean_item_is_empty), CONDITION_ITEM_IS_EMPTY));
        list.add(new ListBean(mContext.getString(R.string.condition_boolean_item_default_empty), CONDITION_ITEM_DEFAULT_EMPTY));
        list.add(new ListBean(mContext.getString(R.string.condition_boolean_item_sequence_equal), CONDITION_ITEM_SEQUENCE_EQUAL));
        list.add(new ListBean(mContext.getString(R.string.condition_boolean_item_skip_until), CONDITION_ITEM_SKIP_UNTIL));
        list.add(new ListBean(mContext.getString(R.string.condition_boolean_item_skip_while), CONDITION_ITEM_SKIP_WHILE));
        list.add(new ListBean(mContext.getString(R.string.condition_boolean_item_take_until), CONDITION_ITEM_TAKE_UNTIL));
        list.add(new ListBean(mContext.getString(R.string.condition_boolean_item_take_while), CONDITION_ITEM_TAKE_WHILE));
        return list;
    }

    private List<ListBean> getAggregateList() {
        List<ListBean> list = new ArrayList<>();
        list.add(new ListBean(mContext.getString(R.string.aggregate_item_concat), AGGREGATE_ITEM_CONCAT));
        list.add(new ListBean(mContext.getString(R.string.aggregate_item_reduce), AGGREGATE_ITEM_REDUCE));
        list.add(new ListBean(mContext.getString(R.string.aggregate_item_collect), AGGREGATE_ITEM_COLLECT));
        list.add(new ListBean(mContext.getString(R.string.aggregate_item_count), AGGREGATE_ITEM_COUNT));
        return list;
    }

    private List<ListBean> getConnectList() {
        List<ListBean> list = new ArrayList<>();
        list.add(new ListBean(mContext.getString(R.string.connect_item_connect), CONNECTABLE_ITEM_CONNECT));
        list.add(new ListBean(mContext.getString(R.string.connect_item_ref_count), CONNECTABLE_ITEM_REF_COUNT));
        list.add(new ListBean(mContext.getString(R.string.connect_item_replay), CONNECTABLE_ITEM_REPLAY));
        return list;
    }

    private List<ListBean> getUtilityList() {
        List<ListBean> list = new ArrayList<>();
        list.add(new ListBean(StringUtil.getString(mContext, R.string.utility_item_delay), UTILITY_ITEM_DELAY));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.utility_item_delay_subscription), UTILITY_ITEM_DELAY_SUBSCRIPTION));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.utility_item_do_on_each), UTILITY_ITEM_DO_ON_EACH));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.utility_item_do_on_next), UTILITY_ITEM_DO_ON_NEXT));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.utility_item_do_on_subscribe), UTILITY_ITEM_DO_ON_SUBSCRIBE));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.utility_item_do_on_unsubscribe), UTILITY_ITEM_DO_ON_UNSUBSCRIBE));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.utility_item_do_on_completed), UTILITY_ITEM_DO_ON_COMPLETED));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.utility_item_do_on_error), UTILITY_ITEM_DO_ON_ERROR));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.utility_item_do_on_terminate), UTILITY_ITEM_DO_ON_TERMINATE));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.utility_item_finally_do), UTILITY_ITEM_FINALLY_DO));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.utility_item_materialize), UTILITY_ITEM_MATERIALIZE));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.utility_item_dematerialize), UTILITY_ITEM_DEMATERIALIZE));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.utility_item_subscrib_on), UTILITY_ITEM_SUBSCRIB_ON));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.utility_item_observer_on), UTILITY_ITEM_OBSERVER_ON));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.utility_item_time_interval), UTILITY_ITEM_TIME_INTERVAL));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.utility_item_timestamp), UTILITY_ITEM_TIMESTAMP));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.utility_item_timeout), UTILITY_ITEM_TIMEOUT));
        list.add(new ListBean(StringUtil.getString(mContext, R.string.utility_item_using), UTILITY_ITEM_USING));
        return list;
    }

}
