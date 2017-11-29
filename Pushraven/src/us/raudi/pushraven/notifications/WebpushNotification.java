package us.raudi.pushraven.notifications;

import us.raudi.pushraven.Notification;

public class WebpushNotification extends Notification {
	/**
	 * The URL to use for the notification's icon.
	 * @param url URL to the icon resource
	 * @return
	 */
	public WebpushNotification icon(String url) {
		return (WebpushNotification) addAttribute("icon", url);
	}
	
	
	@Override
	public WebpushNotification title(String title) {
		return (WebpushNotification) super.title(title);
	}
	@Override
	public WebpushNotification body(String body) {
		return (WebpushNotification) super.body(body);
	}
}