package com.thuctap.busbooking.service.auth;

import java.util.List;

import jakarta.mail.MessagingException;

import com.thuctap.busbooking.entity.BusTrip;
import com.thuctap.busbooking.entity.Ticket;

public interface EmailService {
    void sendEmailTicket(BusTrip busTrip, List<Ticket> ticketList, String email) throws MessagingException;
}
