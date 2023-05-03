package com.example.goofficebackend.dto;

import com.example.goofficebackend.entity.Booking;
import com.example.goofficebackend.entity.Desk;
import com.example.goofficebackend.entity.Employee;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

@Getter
@Setter
@NoArgsConstructor
public class BookingResponse {

    private int bookingId;
    private LocalDateTime shiftStart;
    private LocalDateTime shiftEnd;
    private LocalDateTime created;
    private LocalDateTime updated;
    private EmployeeResponse employeeResponse;

    public BookingResponse(Booking b){
        this.bookingId = b.getId();
        this.shiftStart = b.getShiftStart();
        this.shiftEnd = b.getShiftEnd();
        this.created = b.getCreated();
        this.updated = b.getUpdated();
        this.employeeResponse = new EmployeeResponse(b.getEmployee());
    }
}
