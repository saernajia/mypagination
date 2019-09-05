package com.redapplenet.cloud.util.client.auth;

import com.redapplenet.cloud.util.entity.OtaChannelAccount;
import org.springframework.stereotype.Component;

@Component
public class ChannelAccountFallback implements ChannelAccountClient {
	@Override
	public OtaChannelAccount login(String channel_user, String channel_login_pwd) {
		return null;
	}
}
