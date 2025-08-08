package com.thuctap.busbooking.service.auth;

import java.util.List;

import com.thuctap.busbooking.dto.request.BusRouteRequest;
import com.thuctap.busbooking.entity.BusRoute;

public interface BusRouteService {
    List<BusRoute> getAllBusRoutes();

    void deleteBusRoute(int id);

    void restoreBusRoute(int id);

    BusRoute updateBusRoute(int id, BusRouteRequest request);

    public BusRoute addBusRoute(BusRouteRequest request);

    public List<BusRoute> filterBusRoutes(String from, String to, Float distance, Float travelTime, Integer status);
}
