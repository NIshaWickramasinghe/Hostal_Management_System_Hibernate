package com.d24.hms.bo.custom;

import com.d24.hms.dto.ReservationDto;
import com.d24.hms.bo.SuperService;

import java.util.List;

public interface ReservationService extends SuperService <ReservationDto,String>{
    List<ReservationDto> reservationSearchByText(String text);
    List<ReservationDto> getNotPaidKeyMoney();
}
