package com.dylan.rxjavademo.ui.util;

import com.dylan.rxjavademo.ui.PageType;
import com.dylan.rxjavademo.ui.activity.aggreate.CollectDemoActivity;
import com.dylan.rxjavademo.ui.activity.aggreate.CollectDetailActivity;
import com.dylan.rxjavademo.ui.activity.aggreate.ConcatDemoActivity;
import com.dylan.rxjavademo.ui.activity.aggreate.ConcatDetailActivity;
import com.dylan.rxjavademo.ui.activity.aggreate.CountDemoActivity;
import com.dylan.rxjavademo.ui.activity.aggreate.CountDetailActivity;
import com.dylan.rxjavademo.ui.activity.aggreate.ReduceDemoActivity;
import com.dylan.rxjavademo.ui.activity.aggreate.ReduceDetailActivity;
import com.dylan.rxjavademo.ui.activity.combine.CombineLatestDemoActivity;
import com.dylan.rxjavademo.ui.activity.combine.CombineLatestDetailActivity;
import com.dylan.rxjavademo.ui.activity.combine.JoinDemoActivity;
import com.dylan.rxjavademo.ui.activity.combine.JoinDetailActivity;
import com.dylan.rxjavademo.ui.activity.combine.MergeDelayErrorDemoActivity;
import com.dylan.rxjavademo.ui.activity.combine.MergeDelayErrorDetailActivity;
import com.dylan.rxjavademo.ui.activity.combine.MergeDemoActivity;
import com.dylan.rxjavademo.ui.activity.combine.MergeDetailActivity;
import com.dylan.rxjavademo.ui.activity.combine.StartWithDemoActivity;
import com.dylan.rxjavademo.ui.activity.combine.StartWithDetailActivity;
import com.dylan.rxjavademo.ui.activity.combine.SwitchDemoActivity;
import com.dylan.rxjavademo.ui.activity.combine.SwitchDetailActivity;
import com.dylan.rxjavademo.ui.activity.combine.ZipDemoActivity;
import com.dylan.rxjavademo.ui.activity.combine.ZipDetailActivity;
import com.dylan.rxjavademo.ui.activity.condition.AllDemoActivity;
import com.dylan.rxjavademo.ui.activity.condition.AllDetailActivity;
import com.dylan.rxjavademo.ui.activity.condition.AmbDemoActivity;
import com.dylan.rxjavademo.ui.activity.condition.AmbDetailActivity;
import com.dylan.rxjavademo.ui.activity.condition.ContainsDemoActivity;
import com.dylan.rxjavademo.ui.activity.condition.ContainsDetailActivity;
import com.dylan.rxjavademo.ui.activity.condition.DefaultIfEmptyDemoActivity;
import com.dylan.rxjavademo.ui.activity.condition.DefaultIfEmptyDetailActivity;
import com.dylan.rxjavademo.ui.activity.condition.IsEmptyDemoActivity;
import com.dylan.rxjavademo.ui.activity.condition.IsEmptyDetailActivity;
import com.dylan.rxjavademo.ui.activity.condition.SequenceEqualDemoActivity;
import com.dylan.rxjavademo.ui.activity.condition.SequenceEqualDetailActivity;
import com.dylan.rxjavademo.ui.activity.condition.SkipUntilDemoActivity;
import com.dylan.rxjavademo.ui.activity.condition.SkipUntilDetailActivity;
import com.dylan.rxjavademo.ui.activity.condition.SkipWhileDemoActivity;
import com.dylan.rxjavademo.ui.activity.condition.SkipWhileDetailActivity;
import com.dylan.rxjavademo.ui.activity.condition.TakeUntilDemoActivity;
import com.dylan.rxjavademo.ui.activity.condition.TakeUntilDetailActivity;
import com.dylan.rxjavademo.ui.activity.condition.TakeWhileDemoActivity;
import com.dylan.rxjavademo.ui.activity.condition.TakeWhileDetailActivity;
import com.dylan.rxjavademo.ui.activity.connect.ConnectDemoActivity;
import com.dylan.rxjavademo.ui.activity.connect.ConnectDetailActivity;
import com.dylan.rxjavademo.ui.activity.connect.RefCountDemoActivity;
import com.dylan.rxjavademo.ui.activity.connect.RefCountDetailActivity;
import com.dylan.rxjavademo.ui.activity.connect.ReplayDemoActivity;
import com.dylan.rxjavademo.ui.activity.connect.ReplayDetailActivity;
import com.dylan.rxjavademo.ui.activity.create.CreateDemoActivity;
import com.dylan.rxjavademo.ui.activity.create.CreateDetailActivity;
import com.dylan.rxjavademo.ui.activity.create.DeferDemoActivity;
import com.dylan.rxjavademo.ui.activity.create.DeferDetailActivity;
import com.dylan.rxjavademo.ui.activity.create.FromDemoActivity;
import com.dylan.rxjavademo.ui.activity.create.FromDetailActivity;
import com.dylan.rxjavademo.ui.activity.create.IntervalDemoActivity;
import com.dylan.rxjavademo.ui.activity.create.IntervalDetailActivity;
import com.dylan.rxjavademo.ui.activity.create.JustDemoActivity;
import com.dylan.rxjavademo.ui.activity.create.JustDetailActivity;
import com.dylan.rxjavademo.ui.activity.create.RangeDemoActivity;
import com.dylan.rxjavademo.ui.activity.create.RangeDetailActivity;
import com.dylan.rxjavademo.ui.activity.create.RepeatDemoActivity;
import com.dylan.rxjavademo.ui.activity.create.RepeatDetailActivity;
import com.dylan.rxjavademo.ui.activity.create.TimerDemoActivity;
import com.dylan.rxjavademo.ui.activity.create.TimerDetailActivity;
import com.dylan.rxjavademo.ui.activity.error.OnErrorResumeNextDemoActivity;
import com.dylan.rxjavademo.ui.activity.error.OnErrorResumeNextDetailActivity;
import com.dylan.rxjavademo.ui.activity.error.OnErrorReturnDemoActivity;
import com.dylan.rxjavademo.ui.activity.error.OnErrorReturnDetailActivity;
import com.dylan.rxjavademo.ui.activity.error.OnExceptionResumeNextDemoActivity;
import com.dylan.rxjavademo.ui.activity.error.OnExceptionResumeNextDetailActivity;
import com.dylan.rxjavademo.ui.activity.error.RetryDemoActivity;
import com.dylan.rxjavademo.ui.activity.error.RetryDetailActivity;
import com.dylan.rxjavademo.ui.activity.error.RetryWhenDemoActivity;
import com.dylan.rxjavademo.ui.activity.error.RetryWhenDetailActivity;
import com.dylan.rxjavademo.ui.activity.filter.DebouceDemoActivity;
import com.dylan.rxjavademo.ui.activity.filter.DebouceDetailActivity;
import com.dylan.rxjavademo.ui.activity.filter.DistinctDemoActivity;
import com.dylan.rxjavademo.ui.activity.filter.DistinctDetailActivity;
import com.dylan.rxjavademo.ui.activity.filter.DistinctUtilChangedDemoActivity;
import com.dylan.rxjavademo.ui.activity.filter.DistinctUtilChangedDetailActivity;
import com.dylan.rxjavademo.ui.activity.filter.ElementAtDemoActivity;
import com.dylan.rxjavademo.ui.activity.filter.ElementAtDetailActivity;
import com.dylan.rxjavademo.ui.activity.filter.ElementAtOrDefaultDemoActivity;
import com.dylan.rxjavademo.ui.activity.filter.ElementAtOrDefaultDetailActivity;
import com.dylan.rxjavademo.ui.activity.filter.FilterDemoActivity;
import com.dylan.rxjavademo.ui.activity.filter.FilterDetailActivity;
import com.dylan.rxjavademo.ui.activity.filter.FirstDemoActivity;
import com.dylan.rxjavademo.ui.activity.filter.FirstDetailActivity;
import com.dylan.rxjavademo.ui.activity.filter.LastDemoActivity;
import com.dylan.rxjavademo.ui.activity.filter.LastDetailActivity;
import com.dylan.rxjavademo.ui.activity.filter.OfTypeDemoActivity;
import com.dylan.rxjavademo.ui.activity.filter.OfTypeDetailActivity;
import com.dylan.rxjavademo.ui.activity.filter.SampleDemoActivity;
import com.dylan.rxjavademo.ui.activity.filter.SampleDetailActivity;
import com.dylan.rxjavademo.ui.activity.filter.SkipDemoActivity;
import com.dylan.rxjavademo.ui.activity.filter.SkipDetailActivity;
import com.dylan.rxjavademo.ui.activity.filter.TakeDemoActivity;
import com.dylan.rxjavademo.ui.activity.filter.TakeDetailActivity;
import com.dylan.rxjavademo.ui.activity.filter.ThrottleFirstDemoActivity;
import com.dylan.rxjavademo.ui.activity.filter.ThrottleFirstDetailActivity;
import com.dylan.rxjavademo.ui.activity.transform.BufferDemoActivity;
import com.dylan.rxjavademo.ui.activity.transform.BufferDetailActivity;
import com.dylan.rxjavademo.ui.activity.transform.CastDemoActivity;
import com.dylan.rxjavademo.ui.activity.transform.CastDetailActivity;
import com.dylan.rxjavademo.ui.activity.transform.ConcatMapDemoActivity;
import com.dylan.rxjavademo.ui.activity.transform.ConcatMapDetailActivity;
import com.dylan.rxjavademo.ui.activity.transform.FlatMapDemoActivity;
import com.dylan.rxjavademo.ui.activity.transform.FlatMapDetailActivity;
import com.dylan.rxjavademo.ui.activity.transform.FlatMapIterableDemoActivity;
import com.dylan.rxjavademo.ui.activity.transform.FlatMapIterableDetailActivity;
import com.dylan.rxjavademo.ui.activity.transform.GroupByDemoActivity;
import com.dylan.rxjavademo.ui.activity.transform.GroupByDetailActivity;
import com.dylan.rxjavademo.ui.activity.transform.MapDemoActivity;
import com.dylan.rxjavademo.ui.activity.transform.MapDetailActivity;
import com.dylan.rxjavademo.ui.activity.transform.ScanDemoActivity;
import com.dylan.rxjavademo.ui.activity.transform.ScanDetailActivity;
import com.dylan.rxjavademo.ui.activity.transform.SwitchMapDemoActivity;
import com.dylan.rxjavademo.ui.activity.transform.SwitchMapDetailActivity;
import com.dylan.rxjavademo.ui.activity.transform.WindowDemoActivity;
import com.dylan.rxjavademo.ui.activity.transform.WindowDetailActivity;
import com.dylan.rxjavademo.ui.activity.utility.DelayDemoActivity;
import com.dylan.rxjavademo.ui.activity.utility.DelayDetailActivity;
import com.dylan.rxjavademo.ui.activity.utility.DelaySubscriptionDemoActivity;
import com.dylan.rxjavademo.ui.activity.utility.DelaySubscriptionDetailActivity;
import com.dylan.rxjavademo.ui.activity.utility.DematerializeDemoActivity;
import com.dylan.rxjavademo.ui.activity.utility.DematerializeDetailActivity;
import com.dylan.rxjavademo.ui.activity.utility.DoOnCompletedDemoActivity;
import com.dylan.rxjavademo.ui.activity.utility.DoOnCompletedDetailActivity;
import com.dylan.rxjavademo.ui.activity.utility.DoOnEachDemoActivity;
import com.dylan.rxjavademo.ui.activity.utility.DoOnEachDetailActivity;
import com.dylan.rxjavademo.ui.activity.utility.DoOnErrorDemoActivity;
import com.dylan.rxjavademo.ui.activity.utility.DoOnErrorDetailActivity;
import com.dylan.rxjavademo.ui.activity.utility.DoOnNextDemoActivity;
import com.dylan.rxjavademo.ui.activity.utility.DoOnNextDetailActivity;
import com.dylan.rxjavademo.ui.activity.utility.DoOnSubscribeDemoActivity;
import com.dylan.rxjavademo.ui.activity.utility.DoOnSubscribeDetailActivity;
import com.dylan.rxjavademo.ui.activity.utility.DoOnTerminateDemoActivity;
import com.dylan.rxjavademo.ui.activity.utility.DoOnTerminateDetailActivity;
import com.dylan.rxjavademo.ui.activity.utility.DoOnUnsubscribeDemoActivity;
import com.dylan.rxjavademo.ui.activity.utility.DoOnUnsubscribeDetailActivity;
import com.dylan.rxjavademo.ui.activity.utility.FinallyDoDemoActivity;
import com.dylan.rxjavademo.ui.activity.utility.FinallyDoDetailActivity;
import com.dylan.rxjavademo.ui.activity.utility.MaterializeDemoActivity;
import com.dylan.rxjavademo.ui.activity.utility.MaterializeDetailActivity;
import com.dylan.rxjavademo.ui.activity.utility.ObserverOnDemoActivity;
import com.dylan.rxjavademo.ui.activity.utility.ObserverOnDetailActivity;
import com.dylan.rxjavademo.ui.activity.utility.SubscribOnDemoActivity;
import com.dylan.rxjavademo.ui.activity.utility.SubscribOnDetailActivity;
import com.dylan.rxjavademo.ui.activity.utility.TimeIntervalDemoActivity;
import com.dylan.rxjavademo.ui.activity.utility.TimeIntervalDetailActivity;
import com.dylan.rxjavademo.ui.activity.utility.TimeoutDemoActivity;
import com.dylan.rxjavademo.ui.activity.utility.TimeoutDetailActivity;
import com.dylan.rxjavademo.ui.activity.utility.TimestampDemoActivity;
import com.dylan.rxjavademo.ui.activity.utility.TimestampDetailActivity;
import com.dylan.rxjavademo.ui.activity.utility.UsingDemoActivity;
import com.dylan.rxjavademo.ui.activity.utility.UsingDetailActivity;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/21-下午6:43
 */
public class DetailUtil implements PageType {
    public static Class<?> getClass(int pageType, int itemType, boolean isDemo) {
        switch (pageType) {
            case CREATE:
                return getCreateClass(itemType, isDemo);
            case TRANSFROM:
                return getTransformClass(itemType, isDemo);
            case FILTER:
                return getFilterClass(itemType, isDemo);
            case COMBINE:
                return getCombineClass(itemType, isDemo);
            case ERROR:
                return getErrorClass(itemType, isDemo);
            case UTILITY:
                return getUtilityClass(itemType, isDemo);
            case CONDITION:
                return getConditionClass(itemType, isDemo);
            case AGGREGATE:
                return getAggregateClass(itemType, isDemo);
            case CONNECTABLE:
                return getConnectClass(itemType, isDemo);
        }
        return null;
    }

    private static Class<?> getCreateClass(int itemType, boolean isDemo) {
        switch (itemType) {
            case CREATE_ITEM_CREATE:
                if (isDemo) {
                    return CreateDemoActivity.class;
                } else {
                    return CreateDetailActivity.class;
                }
            case CREATE_ITEM_RANGE:
                if (isDemo) {
                    return RangeDemoActivity.class;
                } else {
                    return RangeDetailActivity.class;
                }
            case CREATE_ITEM_DEFER:
                if (isDemo) {
                    return DeferDemoActivity.class;
                } else {
                    return DeferDetailActivity.class;
                }
            case CREATE_ITEM_JUST:
                if (isDemo) {
                    return JustDemoActivity.class;
                } else {
                    return JustDetailActivity.class;
                }
            case CREATE_ITEM_FROM:
                if (isDemo) {
                    return FromDemoActivity.class;
                } else {
                    return FromDetailActivity.class;
                }
            case CREATE_ITEM_INTERVAL:
                if (isDemo) {
                    return IntervalDemoActivity.class;
                } else {
                    return IntervalDetailActivity.class;
                }
            case CREATE_ITEM_REPEAT:
                if (isDemo) {
                    return RepeatDemoActivity.class;
                } else {
                    return RepeatDetailActivity.class;
                }
            case CREATE_ITEM_TIMER:
                if (isDemo) {
                    return TimerDemoActivity.class;
                } else {
                    return TimerDetailActivity.class;
                }
        }
        return null;
    }

    private static Class<?> getTransformClass(int itemType, boolean isDemo) {
        switch (itemType) {
            case TRANSFROM_ITEM_BUFFER:
                if (isDemo) {
                    return BufferDemoActivity.class;
                } else {
                    return BufferDetailActivity.class;
                }
            case TRANSFROM_ITEM_FLATMAP:
                if (isDemo) {
                    return FlatMapDemoActivity.class;
                } else {
                    return FlatMapDetailActivity.class;
                }
            case TRANSFROM_ITEM_GROUPBY:
                if (isDemo) {
                    return GroupByDemoActivity.class;
                } else {
                    return GroupByDetailActivity.class;
                }
            case TRANSFROM_ITEM_MAP:
                if (isDemo) {
                    return MapDemoActivity.class;
                } else {
                    return MapDetailActivity.class;
                }
            case TRANSFROM_ITEM_CAST:
                if (isDemo) {
                    return CastDemoActivity.class;
                } else {
                    return CastDetailActivity.class;
                }
            case TRANSFROM_ITEM_SCAN:
                if (isDemo) {
                    return ScanDemoActivity.class;
                } else {
                    return ScanDetailActivity.class;
                }
            case TRANSFROM_ITEM_WINDOW:
                if (isDemo) {
                    return WindowDemoActivity.class;
                } else {
                    return WindowDetailActivity.class;
                }
            case TRANSFROM_ITEM_FLATMAPITERABLE:
                if (isDemo) {
                    return FlatMapIterableDemoActivity.class;
                } else {
                    return FlatMapIterableDetailActivity.class;
                }
            case TRANSFROM_ITEM_CONCAT_MAP:
                if (isDemo) {
                    return ConcatMapDemoActivity.class;
                } else {
                    return ConcatMapDetailActivity.class;
                }
            case TRANSFROM_ITEM_SWITCH_MAP:
                if (isDemo) {
                    return SwitchMapDemoActivity.class;
                } else {
                    return SwitchMapDetailActivity.class;
                }
        }
        return null;
    }

    private static Class<?> getFilterClass(int itemType, boolean isDemo) {
        switch (itemType) {
            case FILTER_ITEM_DEBOUCE:
                if (isDemo) {
                    return DebouceDemoActivity.class;
                } else {
                    return DebouceDetailActivity.class;
                }
            case FILTER_ITEM_DISTINCT:
                if (isDemo) {
                    return DistinctDemoActivity.class;
                } else {
                    return DistinctDetailActivity.class;
                }
            case FILTER_ITEM_ELEMENT_AT:
                if (isDemo) {
                    return ElementAtDemoActivity.class;
                } else {
                    return ElementAtDetailActivity.class;
                }
            case FILTER_ITEM_FILTER:
                if (isDemo) {
                    return FilterDemoActivity.class;
                } else {
                    return FilterDetailActivity.class;
                }
            case FILTER_ITEM_FIRST:
                if (isDemo) {
                    return FirstDemoActivity.class;
                } else {
                    return FirstDetailActivity.class;
                }
            case FILTER_ITEM_LAST:
                if (isDemo) {
                    return LastDemoActivity.class;
                } else {
                    return LastDetailActivity.class;
                }
            case FILTER_ITEM_SKIP:
                if (isDemo) {
                    return SkipDemoActivity.class;
                } else {
                    return SkipDetailActivity.class;
                }
            case FILTER_ITEM_TAKE:
                if (isDemo) {
                    return TakeDemoActivity.class;
                } else {
                    return TakeDetailActivity.class;
                }
            case FILTER_ITEM_SAMPLE:
                if (isDemo) {
                    return SampleDemoActivity.class;
                } else {
                    return SampleDetailActivity.class;
                }
            case FILTER_ITEM_THROTTLE_FIRST:
                if (isDemo) {
                    return ThrottleFirstDemoActivity.class;
                } else {
                    return ThrottleFirstDetailActivity.class;
                }
            case FILTER_ITEM_DISTINCT_UTIL_CHANGED:
                if (isDemo) {
                    return DistinctUtilChangedDemoActivity.class;
                } else {
                    return DistinctUtilChangedDetailActivity.class;
                }
            case FILTER_ITEM_OF_TYPE:
                if (isDemo) {
                    return OfTypeDemoActivity.class;
                } else {
                    return OfTypeDetailActivity.class;
                }
            case FILTER_ITEM_ELEMENT_AT_OR_DEFAULT:
                if (isDemo) {
                    return ElementAtOrDefaultDemoActivity.class;
                } else {
                    return ElementAtOrDefaultDetailActivity.class;
                }
        }
        return null;
    }

    private static Class<?> getCombineClass(int itemType, boolean isDemo) {
        switch (itemType) {
            case COMBINE_ITEM_COMBINE_LATEST:
                if (isDemo) {
                    return CombineLatestDemoActivity.class;
                } else {
                    return CombineLatestDetailActivity.class;
                }
            case COMBINE_ITEM_JOIN:
                if (isDemo) {
                    return JoinDemoActivity.class;
                } else {
                    return JoinDetailActivity.class;
                }
            case COMBINE_ITEM_MERGE:
                if (isDemo) {
                    return MergeDemoActivity.class;
                } else {
                    return MergeDetailActivity.class;
                }
            case COMBINE_ITEM_START_WITH:
                if (isDemo) {
                    return StartWithDemoActivity.class;
                } else {
                    return StartWithDetailActivity.class;
                }
            case COMBINE_ITEM_SWITCH:
                if (isDemo) {
                    return SwitchDemoActivity.class;
                } else {
                    return SwitchDetailActivity.class;
                }
            case COMBINE_ITEM_ZIP:
                if (isDemo) {
                    return ZipDemoActivity.class;
                } else {
                    return ZipDetailActivity.class;
                }
            case COMBINE_ITEM_MERGE_DELAY_ERROR:
                if (isDemo) {
                    return MergeDelayErrorDemoActivity.class;
                } else {
                    return MergeDelayErrorDetailActivity.class;
                }
        }
        return null;
    }

    private static Class<?> getErrorClass(int itemType, boolean isDemo) {
        switch (itemType) {
            case ERROR_ITEM_ON_ERROR_RETURN:
                if (isDemo) {
                    return OnErrorReturnDemoActivity.class;
                } else {
                    return OnErrorReturnDetailActivity.class;
                }
            case ERROR_ITEM_ON_ERROR_RESUME_NEXT:
                if (isDemo) {
                    return OnErrorResumeNextDemoActivity.class;
                } else {
                    return OnErrorResumeNextDetailActivity.class;
                }
            case ERROR_ITEM_ON_EXCEPTION_RESUME_NEXT:
                if (isDemo) {
                    return OnExceptionResumeNextDemoActivity.class;
                } else {
                    return OnExceptionResumeNextDetailActivity.class;
                }
            case ERROR_ITEM_RETRY:
                if (isDemo) {
                    return RetryDemoActivity.class;
                } else {
                    return RetryDetailActivity.class;
                }
            case ERROR_ITEM_RETRY_WHEN:
                if (isDemo) {
                    return RetryWhenDemoActivity.class;
                } else {
                    return RetryWhenDetailActivity.class;
                }
        }
        return null;
    }

    private static Class<?> getUtilityClass(int itemType, boolean isDemo) {
        switch (itemType) {
            case UTILITY_ITEM_DELAY:
                if (isDemo) {
                    return DelayDemoActivity.class;
                } else {
                    return DelayDetailActivity.class;
                }
            case UTILITY_ITEM_DO_ON_EACH:
                if (isDemo) {
                    return DoOnEachDemoActivity.class;
                } else {
                    return DoOnEachDetailActivity.class;
                }
            case UTILITY_ITEM_MATERIALIZE:
                if (isDemo) {
                    return MaterializeDemoActivity.class;
                } else {
                    return MaterializeDetailActivity.class;
                }
            case UTILITY_ITEM_SUBSCRIB_ON:
                if (isDemo) {
                    return SubscribOnDemoActivity.class;
                } else {
                    return SubscribOnDetailActivity.class;
                }
            case UTILITY_ITEM_OBSERVER_ON:
                if (isDemo) {
                    return ObserverOnDemoActivity.class;
                } else {
                    return ObserverOnDetailActivity.class;
                }
            case UTILITY_ITEM_TIME_INTERVAL:
                if (isDemo) {
                    return TimeIntervalDemoActivity.class;
                } else {
                    return TimeIntervalDetailActivity.class;
                }
            case UTILITY_ITEM_TIMESTAMP:
                if (isDemo) {
                    return TimestampDemoActivity.class;
                } else {
                    return TimestampDetailActivity.class;
                }
            case UTILITY_ITEM_TIMEOUT:
                if (isDemo) {
                    return TimeoutDemoActivity.class;
                } else {
                    return TimeoutDetailActivity.class;
                }
            case UTILITY_ITEM_USING:
                if (isDemo) {
                    return UsingDemoActivity.class;
                } else {
                    return UsingDetailActivity.class;
                }
            case UTILITY_ITEM_DELAY_SUBSCRIPTION:
                if (isDemo) {
                    return DelaySubscriptionDemoActivity.class;
                } else {
                    return DelaySubscriptionDetailActivity.class;
                }
            case UTILITY_ITEM_DO_ON_NEXT:
                if (isDemo) {
                    return DoOnNextDemoActivity.class;
                } else {
                    return DoOnNextDetailActivity.class;
                }
            case UTILITY_ITEM_DO_ON_SUBSCRIBE:
                if (isDemo) {
                    return DoOnSubscribeDemoActivity.class;
                } else {
                    return DoOnSubscribeDetailActivity.class;
                }
            case UTILITY_ITEM_DO_ON_UNSUBSCRIBE:
                if (isDemo) {
                    return DoOnUnsubscribeDemoActivity.class;
                } else {
                    return DoOnUnsubscribeDetailActivity.class;
                }
            case UTILITY_ITEM_DO_ON_COMPLETED:
                if (isDemo) {
                    return DoOnCompletedDemoActivity.class;
                } else {
                    return DoOnCompletedDetailActivity.class;
                }
            case UTILITY_ITEM_DO_ON_ERROR:
                if (isDemo) {
                    return DoOnErrorDemoActivity.class;
                } else {
                    return DoOnErrorDetailActivity.class;
                }
            case UTILITY_ITEM_DO_ON_TERMINATE:
                if (isDemo) {
                    return DoOnTerminateDemoActivity.class;
                } else {
                    return DoOnTerminateDetailActivity.class;
                }
            case UTILITY_ITEM_FINALLY_DO:
                if (isDemo) {
                    return FinallyDoDemoActivity.class;
                } else {
                    return FinallyDoDetailActivity.class;
                }
            case UTILITY_ITEM_DEMATERIALIZE:
                if (isDemo) {
                    return DematerializeDemoActivity.class;
                } else {
                    return DematerializeDetailActivity.class;
                }
        }
        return null;
    }

    private static Class<?> getConditionClass(int itemType, boolean isDemo) {
        switch (itemType) {
            case CONDITION_ITEM_ALL:
                if (isDemo) {
                    return AllDemoActivity.class;
                } else {
                    return AllDetailActivity.class;
                }
            case CONDITION_ITEM_AMB:
                if (isDemo) {
                    return AmbDemoActivity.class;
                } else {
                    return AmbDetailActivity.class;
                }
            case CONDITION_ITEM_CONTAINS:
                if (isDemo) {
                    return ContainsDemoActivity.class;
                } else {
                    return ContainsDetailActivity.class;
                }
            case CONDITION_ITEM_SEQUENCE_EQUAL:
                if (isDemo) {
                    return SequenceEqualDemoActivity.class;
                } else {
                    return SequenceEqualDetailActivity.class;
                }
            case CONDITION_ITEM_IS_EMPTY:
                if (isDemo) {
                    return IsEmptyDemoActivity.class;
                } else {
                    return IsEmptyDetailActivity.class;
                }
            case CONDITION_ITEM_DEFAULT_EMPTY:
                if (isDemo) {
                    return DefaultIfEmptyDemoActivity.class;
                } else {
                    return DefaultIfEmptyDetailActivity.class;
                }
            case CONDITION_ITEM_SKIP_UNTIL:
                if (isDemo) {
                    return SkipUntilDemoActivity.class;
                } else {
                    return SkipUntilDetailActivity.class;
                }
            case CONDITION_ITEM_SKIP_WHILE:
                if (isDemo) {
                    return SkipWhileDemoActivity.class;
                } else {
                    return SkipWhileDetailActivity.class;
                }
            case CONDITION_ITEM_TAKE_UNTIL:
                if (isDemo) {
                    return TakeUntilDemoActivity.class;
                } else {
                    return TakeUntilDetailActivity.class;
                }
            case CONDITION_ITEM_TAKE_WHILE:
                if (isDemo) {
                    return TakeWhileDemoActivity.class;
                } else {
                    return TakeWhileDetailActivity.class;
                }
        }
        return null;
    }

    private static Class<?> getAggregateClass(int itemType, boolean isDemo) {
        switch (itemType) {
            case AGGREGATE_ITEM_CONCAT:
                if (isDemo) {
                    return ConcatDemoActivity.class;
                } else {
                    return ConcatDetailActivity.class;
                }
            case AGGREGATE_ITEM_COUNT:
                if (isDemo) {
                    return CountDemoActivity.class;
                } else {
                    return CountDetailActivity.class;
                }
            case AGGREGATE_ITEM_REDUCE:
                if (isDemo) {
                    return ReduceDemoActivity.class;
                } else {
                    return ReduceDetailActivity.class;
                }
            case AGGREGATE_ITEM_COLLECT:
                if (isDemo) {
                    return CollectDemoActivity.class;
                } else {
                    return CollectDetailActivity.class;
                }
        }
        return null;
    }

    private static Class<?> getConnectClass(int itemType, boolean isDemo) {
        switch (itemType) {
            case CONNECTABLE_ITEM_CONNECT:
                if (isDemo) {
                    return ConnectDemoActivity.class;
                } else {
                    return ConnectDetailActivity.class;
                }
            case CONNECTABLE_ITEM_REF_COUNT:
                if (isDemo) {
                    return RefCountDemoActivity.class;
                } else {
                    return RefCountDetailActivity.class;
                }
            case CONNECTABLE_ITEM_REPLAY:
                if (isDemo) {
                    return ReplayDemoActivity.class;
                } else {
                    return ReplayDetailActivity.class;
                }
        }
        return null;
    }
}