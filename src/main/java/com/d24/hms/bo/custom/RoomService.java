package com.d24.hms.bo.custom;

import com.d24.hms.dto.RoomDto;
import com.d24.hms.bo.SuperService;

import java.util.List;

public interface RoomService extends SuperService<RoomDto,String> {
    List<RoomDto> roomSearchByText(String text);
    int getRoomCount();
}
