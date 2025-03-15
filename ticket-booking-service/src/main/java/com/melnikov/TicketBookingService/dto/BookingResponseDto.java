package com.melnikov.TicketBookingService.dto;

import lombok.Builder;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
@Builder
public class BookingResponseDto {
    private Integer id;
    private Long userId;
    private Integer ticketId;
    private ZonedDateTime bookingTime;
    private String status;

    private Integer ticketQuantity;
}