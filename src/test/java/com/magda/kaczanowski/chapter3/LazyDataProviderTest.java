package com.magda.kaczanowski.chapter3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;

public class LazyDataProviderTest {
    @DataProvider
    private Iterator<Object []> getLazyData() {
        return new Iterator<Object[]>() {

            private int counter = 1;

            public boolean hasNext() {
                return counter < 4;
            }

            public Object[] next() {
                return new Object[] {new ComplexObject(counter++)};
            }

            public void remove() {}
        };
    }

    @Test(dataProvider = "getLazyData")
    public void testLazyData(ComplexObject object) {
        System.out.println("lazy data: " + object);
    }
}
