package com.thuctap.busbooking.service.auth;

import java.util.List;

import com.thuctap.busbooking.entity.SeatPosition;

public interface SeatPositionService {
    List<SeatPosition> getSeatsByBusId(int busId);

    void updateSeatPosition(String name, int idBus, boolean status);
}
