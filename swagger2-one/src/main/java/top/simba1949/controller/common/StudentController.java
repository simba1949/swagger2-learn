package top.simba1949.controller.common;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import top.simba1949.common.Student;

/**
 * @Author Theodore
 * @Date 2019/10/24 15:30
 */
@RestController
@RequestMapping("student")
@Api(tags = {"学生管理"})
public class StudentController {

    @PostMapping
    @ApiOperation(value = "获取学生信息")
    public Student getStudent(@RequestBody Student student){

        return null;
    }
}
