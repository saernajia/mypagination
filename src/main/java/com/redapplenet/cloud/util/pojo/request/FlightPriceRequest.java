package com.redapplenet.cloud.util.pojo.request;

import com.redapplenet.cloud.util.pojo.QueryFlightPrice;
import lombok.Data;

@Data
public class FlightPriceRequest {
    private QueryFlightPrice[] queryFlightPrices;//验价航段 0去程，1返程
}
