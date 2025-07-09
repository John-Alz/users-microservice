package com.micorservice.users.application.mapper;

import com.micorservice.users.application.dto.request.UserRequestDto;
import com.micorservice.users.domain.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface IUserRequestMapper {

    UserModel requestToModel(UserRequestDto userRequestDto);

}
