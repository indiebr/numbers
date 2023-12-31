package com.aor.numbers;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sun.reflect.generics.tree.ReturnType;

import java.util.Arrays;
import java.util.List;

public class ListAggregatorTest {
    private List<Integer> list1;
    private ListAggregator aggregator;
    @BeforeEach
    public void setUp() {
        list1 = Arrays.asList(1, 2, 3, 4, 5);
        aggregator = new ListAggregator();
    }
    private List<Integer> list2() {
        return Arrays.asList(-1,-4,-5);
    }
    @Test
    public void sum() {
        List<Integer> list = Arrays.asList(1,2,4,2,5);

        ListAggregator aggregator = new ListAggregator();
        int sum = aggregator.sum(list);

        Assertions.assertEquals(14, sum);
    }

    @Test
    public void max() {
        List<Integer> list = Arrays.asList(1,2,4,2,5);

        ListAggregator aggregator = new ListAggregator();
        int max = aggregator.max(list);

        Assertions.assertEquals(5, max);
    }

    @Test
    public void min() {
        List<Integer> list = Arrays.asList(1,2,4,2,5);

        ListAggregator aggregator = new ListAggregator();
        int min = aggregator.min(list);

        Assertions.assertEquals(1, min);
    }

    @Test
    public void distinct() {
        List<Integer> list = Arrays.asList(1,2,4,2,5);

        ListAggregator aggregator = new ListAggregator();
        int distinct = aggregator.distinct(list);

        Assertions.assertEquals(4, distinct);
    }

}
