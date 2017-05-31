package org.vodafone.main.modules;
import org.junit.Test;

import com.framework.selenium.core.FrameworkWrapper;
import com.products.components.exception.DataException;

public class MainFrameworkTest {

                @Test
                public void testrunMSafeTest() {

                                FrameworkWrapper wrapper = new FrameworkWrapper();
                                
                                
                                
                                try {
                        wrapper.startFramework();
        } catch (DataException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
        }

                }

}