package com.company.view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    // Resource Bundle Installation's
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("eu", "EU"));  // English
    //new Locale("eu_ua", "UA")); //Ukrainian

    static {
        System.out.println(bundle.getLocale().getLanguage());
    }


    public void printMessage(String... message) {
        System.out.println("\n");
        for (String s : message)
            System.out.println(s + "  ");

    }
}
