package com._4paradigm.fesql_auto_test.v1;

import com._4paradigm.fesql.sqlcase.model.SQLCase;
import com._4paradigm.fesql_auto_test.common.FesqlTest;
import com._4paradigm.fesql_auto_test.entity.FesqlDataProvider;
import com._4paradigm.fesql_auto_test.executor.ExecutorFactory;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

/**
 * @author zhaowei
 * @date 2020/6/11 2:53 PM
 */
@Slf4j
public class WindowTest extends FesqlTest {

    @DataProvider
    public Object[] testRowRangeData() throws FileNotFoundException {
        FesqlDataProvider dp = FesqlDataProvider
                .dataProviderGenerator("/integration/v1/test_window_row_range.yaml");
        return dp.getCases().toArray();
    }

    @Test(enabled = false, dataProvider = "testRowRangeData")
    public void testRowRange(SQLCase testCase) throws Exception {
        ExecutorFactory.build(executor, testCase).run();
    }

    @DataProvider
    public Object[] testRowData() throws FileNotFoundException {
        FesqlDataProvider dp = FesqlDataProvider
                .dataProviderGenerator("/integration/v1/test_window_row.yaml");
        return dp.getCases().toArray();
    }

    @Test(enabled = false, dataProvider = "testRowData")
    public void testRow(SQLCase testCase) throws Exception {
        ExecutorFactory.build(executor, testCase).run();
    }

    @DataProvider
    public Object[] testWindowUnionData() throws FileNotFoundException {
        FesqlDataProvider dp = FesqlDataProvider
                .dataProviderGenerator("/integration/v1/test_window_union.yaml");
        return dp.getCases().toArray();
    }

    @Test(enabled = false, dataProvider = "testWindowUnionData")
    public void testWindowUnion(SQLCase testCase) throws Exception {
        ExecutorFactory.build(executor, testCase).run();
    }
}
