package com.redapplenet.cloud.util.client.auth;

import com.redapplenet.cloud.util.entity.OtaChannelAccount;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(serviceId = "ota-auth-service",fallback = ChannelAccountFallback.class)
public interface ChannelAccountClient {

	@GetMapping(value = "/login")
	OtaChannelAccount login(@RequestParam String channel_user, @RequestParam String channel_login_pwd);
}
