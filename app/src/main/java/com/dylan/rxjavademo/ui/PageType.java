package com.dylan.rxjavademo.ui;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/20-下午9:29
 */
public interface PageType {
    int CREATE = 0;
        int  CREATE_ITEM_CREATE = 0;
        int  CREATE_ITEM_RANGE = 1;
        int  CREATE_ITEM_DEFER = 2;
        int  CREATE_ITEM_JUST = 3;
        int  CREATE_ITEM_FROM = 4;
        int  CREATE_ITEM_INTERVAL = 5;
        int  CREATE_ITEM_REPEAT = 6;
        int  CREATE_ITEM_TIMER = 7;

    int TRANSFROM = 1;
        int TRANSFROM_ITEM_BUFFER = 0;
        int TRANSFROM_ITEM_FLATMAP = 1;
        int TRANSFROM_ITEM_FLATMAPITERABLE = 2;
        int TRANSFROM_ITEM_CONCAT_MAP = 3;
        int TRANSFROM_ITEM_SWITCH_MAP = 4;
        int TRANSFROM_ITEM_GROUPBY = 5;
        int TRANSFROM_ITEM_MAP = 6;
        int TRANSFROM_ITEM_CAST = 7;
        int TRANSFROM_ITEM_SCAN = 8;
        int TRANSFROM_ITEM_WINDOW = 9;

    int FILTER = 2;
        int FILTER_ITEM_DEBOUCE = 0;
        int FILTER_ITEM_DISTINCT = 1;
        int FILTER_ITEM_ELEMENT_AT = 2;
        int FILTER_ITEM_FILTER = 3;
        int FILTER_ITEM_FIRST = 4;
        int FILTER_ITEM_LAST = 5;
        int FILTER_ITEM_SKIP = 6;
        int FILTER_ITEM_TAKE = 7;
        int FILTER_ITEM_SAMPLE = 8;
        int FILTER_ITEM_THROTTLE_FIRST = 9;
        int FILTER_ITEM_DISTINCT_UTIL_CHANGED = 10;
        int FILTER_ITEM_OF_TYPE = 11;
        int FILTER_ITEM_ELEMENT_AT_OR_DEFAULT = 12;

    int COMBINE = 3;
        int COMBINE_ITEM_COMBINE_LATEST = 0;
        int COMBINE_ITEM_JOIN = 1;
        int COMBINE_ITEM_MERGE = 2;
        int COMBINE_ITEM_START_WITH = 3;
        int COMBINE_ITEM_SWITCH = 4;
        int COMBINE_ITEM_ZIP = 5;
        int COMBINE_ITEM_MERGE_DELAY_ERROR = 6;

    int ERROR = 4;
        int ERROR_ITEM_ON_ERROR_RETURN = 0;
        int ERROR_ITEM_ON_ERROR_RESUME_NEXT = 1;
        int ERROR_ITEM_ON_EXCEPTION_RESUME_NEXT = 2;
        int ERROR_ITEM_RETRY = 3;
        int ERROR_ITEM_RETRY_WHEN = 4;

    int UTILITY = 5;
        int UTILITY_ITEM_DELAY = 0;
        int UTILITY_ITEM_DO_ON_EACH = 1;
        int UTILITY_ITEM_MATERIALIZE = 2;
        int UTILITY_ITEM_SUBSCRIB_ON = 3;
        int UTILITY_ITEM_OBSERVER_ON = 4;
        int UTILITY_ITEM_TIME_INTERVAL = 5;
        int UTILITY_ITEM_TIMESTAMP = 6;
        int UTILITY_ITEM_TIMEOUT = 7;
        int UTILITY_ITEM_USING = 8;
        int UTILITY_ITEM_DELAY_SUBSCRIPTION = 9;
        int UTILITY_ITEM_DO_ON_NEXT = 10;
        int UTILITY_ITEM_DO_ON_SUBSCRIBE = 11;
        int UTILITY_ITEM_DO_ON_UNSUBSCRIBE = 12;
        int UTILITY_ITEM_DO_ON_COMPLETED = 13;
        int UTILITY_ITEM_DO_ON_ERROR = 14;
        int UTILITY_ITEM_DO_ON_TERMINATE = 15;
        int UTILITY_ITEM_FINALLY_DO = 16;
        int UTILITY_ITEM_DEMATERIALIZE = 17;

    int CONDITION = 6;
        int CONDITION_ITEM_ALL = 0;
        int CONDITION_ITEM_AMB = 1;
        int CONDITION_ITEM_CONTAINS = 2;
        int CONDITION_ITEM_IS_EMPTY = 3;
        int CONDITION_ITEM_DEFAULT_EMPTY = 4;
        int CONDITION_ITEM_SEQUENCE_EQUAL = 5;
        int CONDITION_ITEM_SKIP_UNTIL = 6;
        int CONDITION_ITEM_SKIP_WHILE = 7;
        int CONDITION_ITEM_TAKE_UNTIL = 8;
        int CONDITION_ITEM_TAKE_WHILE = 9;

    int AGGREGATE = 7;
        int AGGREGATE_ITEM_CONCAT = 0;
        int AGGREGATE_ITEM_REDUCE = 1;
        int AGGREGATE_ITEM_COUNT = 2;
        int AGGREGATE_ITEM_COLLECT = 3;

    int CONNECTABLE = 8;
        int CONNECTABLE_ITEM_CONNECT = 0;
        int CONNECTABLE_ITEM_REF_COUNT = 1;
        int CONNECTABLE_ITEM_REPLAY = 2;
}
