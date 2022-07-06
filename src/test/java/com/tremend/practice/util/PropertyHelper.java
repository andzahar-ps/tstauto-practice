package com.tremend.practice.util;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class PropertyHelper {

        private PropertyHelper() {
            throw new IllegalStateException("Utility class");
        }

        public static String getWebDriverBaseUrl(){
            EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
            return EnvironmentSpecificConfiguration.from(variables).getProperty("webdriver.base.url");
        }


}


