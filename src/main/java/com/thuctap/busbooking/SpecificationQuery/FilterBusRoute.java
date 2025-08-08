package com.thuctap.busbooking.SpecificationQuery;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.Predicate;

import org.springframework.data.jpa.domain.Specification;

import com.thuctap.busbooking.entity.BusRoute;
import com.thuctap.busbooking.entity.BusStation;

public class FilterBusRoute {

    public static Specification<BusRoute> filterBusRoutes(
            String from, String to, Float distance, Float travelTime, Integer status) {
        return (root, query, cb) -> {
            List<Predicate> predicates = new ArrayList<>();

            // Join đến bến xe đi
            if (from != null && !from.trim().isEmpty()) {
                Join<BusRoute, BusStation> fromStationJoin = root.join("busStationFrom", JoinType.LEFT);
                predicates.add(cb.like(
                        cb.lower(fromStationJoin.get("name")), "%" + from.trim().toLowerCase() + "%"));
            }

            // Join đến bến xe đến
            if (to != null && !to.trim().isEmpty()) {
                Join<BusRoute, BusStation> toStationJoin = root.join("busStationTo", JoinType.LEFT);
                predicates.add(cb.like(
                        cb.lower(toStationJoin.get("name")), "%" + to.trim().toLowerCase() + "%"));
            }

            if (distance != null) {
                predicates.add(cb.equal(root.get("distance"), distance));
            }

            if (travelTime != null) {
                predicates.add(cb.equal(root.get("travelTime"), travelTime));
            }

            if (status != null) {
                predicates.add(cb.equal(root.get("status"), status));
            }

            return cb.and(predicates.toArray(new Predicate[0]));
        };
    }
}
