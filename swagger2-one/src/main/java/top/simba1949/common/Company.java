package top.simba1949.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @Author Theodore
 * @Date 2019/10/23 23:07
 */
@Data
@ApiModel(
        value = "company",
        description = "类的详细描述",
        parent = Object.class // 为模型提供超类，以允许描述继承。
)
@ApiIgnore(value = "填写忽略该api的原因")
@AllArgsConstructor
@NoArgsConstructor
public class Company {
//    @ApiModelProperty(
//            dataType = "int", // 数据类型
//            hidden = false, // 是否隐藏
//            name = "id", // 属性名称
//            required = true, // 是否必须
//            value = "主键" // 属性描述
//    )
    private Integer id;

    private String companyName;
}
