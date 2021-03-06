package com.wix.reactnativenotifications;

public interface Defs {
    String LOGTAG = "ReactNativeNotifs";
    String GCM_SENDER_ID_ATTR_NAME = "com.wix.reactnativenotifications.gcmSenderId";
    String GCM_CHANEL_ID_ATTR_NAME = "com.wix.reactnativenotifications.gcmChanelId";
    String GCM_CHANEL_NAME_ATTR_NAME = "com.wix.reactnativenotifications.gcmChanelName";

    String TOKEN_RECEIVED_EVENT_NAME = "remoteNotificationsRegistered";

    String NOTIFICATION_RECEIVED_EVENT_NAME = "notificationReceived";
    String NOTIFICATION_OPENED_EVENT_NAME = "notificationOpened";
}
