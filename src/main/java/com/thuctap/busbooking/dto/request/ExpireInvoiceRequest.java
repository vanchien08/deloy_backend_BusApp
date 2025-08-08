package com.thuctap.busbooking.dto.request;

import java.util.List;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ExpireInvoiceRequest {
    private Integer invoiceId;
    private List<String> selectedSeats;
    private Integer busId;
}
