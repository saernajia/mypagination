package com.redapplenet.cloud.util.client.fare;

import com.redapplenet.cloud.util.pojo.request.BaseFareRequest;
import com.redapplenet.cloud.util.pojo.request.FlightPriceRequest;
import com.redapplenet.cloud.util.pojo.response.AirShoppingRS;
import com.redapplenet.cloud.util.pojo.response.FlightPriceRS;
import org.springframework.stereotype.Component;

@Component
public class FareFallback implements FareClient {
	@Override
	public AirShoppingRS queryBaseFare(BaseFareRequest baseFareRequest) {
		return null;
	}

	@Override
	public FlightPriceRS queryFlightPrice(FlightPriceRequest flightPriceRequest) {
		return null;
	}
}
