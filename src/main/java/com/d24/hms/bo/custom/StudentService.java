package com.d24.hms.bo.custom;

import com.d24.hms.dto.StudentDto;
import com.d24.hms.bo.SuperService;

import java.util.List;

public interface StudentService extends SuperService<StudentDto,String> {
    List<StudentDto> studentSearchByText(String text);
    int getStudentCount();
}
