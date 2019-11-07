package com.redapplenet.cloud.util.client.fare;

import com.redapplenet.cloud.util.pojo.request.BaseFareRequest;
import com.redapplenet.cloud.util.pojo.request.FlightPriceRequest;
import com.redapplenet.cloud.util.pojo.response.AirShoppingRS;
import com.redapplenet.cloud.util.pojo.response.FlightPriceRS;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(serviceId = "fare",fallback = FareFallback.class)
public interface FareClient {

	@PostMapping("/fare/queryBaseFare")
	AirShoppingRS queryBaseFare(BaseFareRequest baseFareRequest);

	@PostMapping("/fare/queryFlightPrice")
	FlightPriceRS queryFlightPrice(FlightPriceRequest flightPriceRequest);

}
