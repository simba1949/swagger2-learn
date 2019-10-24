package top.simba1949.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author Theodore
 * @Date 2019/10/24 15:05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "school", description = "学校")
public class School {

    @ApiModelProperty(name = "id", value = "主键", dataType = "int")
    private Integer id;
    @ApiModelProperty(name = "schoolName", value = "学校名称", dataType = "String")
    private String schoolName;

    @ApiModelProperty(name = "students", value = "学校下的学生", dataType = "top.simba1949.common.Student")
    protected List<Student> students;
}
