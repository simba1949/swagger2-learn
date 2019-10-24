package top.simba1949.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Theodore
 * @Date 2019/10/24 15:05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "student", description = "学生")
public class Student {

    @ApiModelProperty(name = "id", value = "主键", dataType = "int")
    private Integer id;
    @ApiModelProperty(name = "studentName", value = "学生姓名", dataType = "String")
    private String studentName;

    @ApiModelProperty(name = "school", value = "学校", dataType = "top.simba1949.common.School")
    private School school;
}
