package com.example.TravelAgencyRestApi.service;

import com.example.TravelAgencyRestApi.model.DTO.request.CreateHolidayDTO;
import com.example.TravelAgencyRestApi.model.DTO.request.CreateReservationDTO;
import com.example.TravelAgencyRestApi.model.DTO.request.UpdateHolidayDTO;
import com.example.TravelAgencyRestApi.model.DTO.request.UpdateReservationDTO;
import com.example.TravelAgencyRestApi.model.DTO.response.ResponseHolidayDTO;
import com.example.TravelAgencyRestApi.model.DTO.response.ResponseReservationDTO;

import java.util.List;

public interface ReservationService {
    ResponseReservationDTO createReservation(CreateReservationDTO createReservationDTO);
    List<ResponseReservationDTO>  getAllReservations();
    ResponseReservationDTO getReservationById(Long reservationId);
    ResponseReservationDTO updateReservation(UpdateReservationDTO update);
    Boolean deleteReservation(Long reservationId);

}
