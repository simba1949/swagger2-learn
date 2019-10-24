package top.simba1949.controller.common;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import top.simba1949.common.School;

/**
 * @Author Theodore
 * @Date 2019/10/24 15:13
 */
@RestController
@RequestMapping("school")
@Api(tags = {"学校管理"})
public class SchoolController {

    @ApiOperation(value = "查询学校", notes = "")
    @PostMapping
    public School getSchool(@RequestBody School school){

        return null;
    }
}
