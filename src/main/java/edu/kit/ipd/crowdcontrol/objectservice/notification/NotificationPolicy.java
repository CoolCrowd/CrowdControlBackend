package edu.kit.ipd.crowdcontrol.objectservice.notification;

/**
 * @author Simon Korz
 * @version 1.0
 */
public abstract class NotificationPolicy<T> {
    public void invoke(Notification notification) {
        if (notification.thresholdPassed()) {
            T token = check(notification);
            if (token != null) {
                send(notification, token);
            }
        }
    }

    /**
     * Checks the query of a notification.
     *
     * @param notification the notification to check
     * @return instance of a generic result as token if the check was positive, else null
     */
    protected abstract T check(Notification notification);

    /**
     * Sends a notification
     *
     * @param notification the notification to send
     * @param token        a token acquired from a check. Can be null.
     */
    protected abstract void send(Notification notification, T token);
}
