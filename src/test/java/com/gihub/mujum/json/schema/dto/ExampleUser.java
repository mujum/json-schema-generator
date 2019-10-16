package com.gihub.mujum.json.schema.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "ExampleUser", description = "User")
public class ExampleUser {

    @ApiModelProperty(
        notes = "User name",
        example = "John",
        position = 0)
    private String name;

    @ApiModelProperty(
        notes = "Phone number",
        example = "+1(123)4567890",
        position = 1)
    private String phone;

    @ApiModelProperty(
        notes = "Date of birth",
        example = "12.01.2000",
        position = 2)
    private Date birthDate;
}