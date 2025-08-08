package com.thuctap.busbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.thuctap.busbooking.entity.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Integer> {
    @Query("SELECT r FROM Route r WHERE r.busRoute.id = :busRouteId")
    List<Route> findAllByBusRouteId(@Param("busRouteId") int busRouteId);
}
