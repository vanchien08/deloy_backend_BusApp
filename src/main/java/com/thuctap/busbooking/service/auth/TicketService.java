package com.thuctap.busbooking.service.auth;

import java.util.List;

import com.thuctap.busbooking.entity.*;

public interface TicketService {
    List<Ticket> getAllTickets();

    List<Ticket> getAllTicketsID(int id);

    Ticket createTicket(Invoice invoice, SeatPosition seatPosition, BusTrip busTrip);

    public List<Ticket> getTicketByUserId(int id);
}
