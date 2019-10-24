package top.simba1949.controller.company;

import io.swagger.annotations.*;
import io.swagger.models.auth.In;
import org.springframework.web.bind.annotation.*;
import top.simba1949.common.Company;

/**
 * @Author Theodore
 * @Date 2019/10/23 19:05
 */
@Api(
        tags = {"公司管理"}, // 字符串数组；用于说明该类的作用
        authorizations = {}, // 字符串数组；用于权限配置
        consumes = "", // 字符串，可选值："application/json, application/xml"；说明接收协议类型
        hidden = false, // 布尔类型；是否隐藏该类api
        produces = "", // 字符串，可选值："application/json, application/xml"；说明输出协议类型
        protocols = "" // 字符串，可选值：http, https, ws, wss；说明支持的协议类型
)
@RestController
@RequestMapping("company")
public class CompanyController {

    @ApiOperation(
            authorizations = {}, // 字符串数组；用于权限配置
            code = 200, // int；响应的HTTP状态代码。
            consumes = "", // 字符串，可选值"application/json, application/xml"，接收协议类型
            hidden = false, // 布尔类型；是否隐藏该接口
            httpMethod = "", // 字符串，可选值 "GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS" and "PATCH"；接口请求方式
            notes = "操作的详细描述。", // 字符串；操作的详细描述。(强制)
            produces = "", // 字符串，可选值："application/json, application/xml"；说明输出协议类型
            protocols = "", // 字符串，可选值：http, https, ws, wss；说明支持的协议类型
            response = String.class, // Class 类型；返回类型
            responseContainer = "", // 字符串，可选值"List", "Set" or "Map"；声明包装响应的容器。
            responseHeaders = {}, // ResponseHeader数组；响应头设置
            value = "接口描述或者摘要" // 字符串；接口描述或者摘要(强制)
    )
    @GetMapping
    public String say(){
        return "Hello Company";
    }

    @ApiOperation(value = "查找公司", notes = "详细描述：查找公司")
    @GetMapping("find-company")
    public String findCompany(
            @ApiParam(
                    name = "companyName", // 参数名
                    defaultValue = "ali", // 默认值
                    example = "示例", // 示例值
                    value = "公司名称", // 参数简要说明
                    hidden = false,  // 是否隐藏改参数
                    required = false // 是否必须输入
            ) String companyName
    ){

        return companyName;
    }

    @ApiOperation( value = "通过公司多条件查找", notes = "详细描述：通过公司多条件查找")
    @PostMapping
    public Company getCompany(@RequestBody Company company){

        return company;
    }

    @ApiOperation(value = "通过id查询公司", notes = "详细描述：通过id查询公司")
    @ApiImplicitParam(
            dataType = "int", // 字符串；入参类型
            dataTypeClass = Integer.class, // Class 类型；入参类型，如果存在会覆盖 dataType
            defaultValue = "", // 字符串；入参默认值
            name = "id", // 字符串； 入参名
            required = true, // 布尔类型；是否必传
            value = "公司id值", // 字符串类型；表示对参数的描述
            paramType = "" // 字符串类型，可选值path/query/body/header/form；表示参数存在位置
    )
    @GetMapping("id")
    public Company getCompany(int id){

        Company company = new Company();
        company.setId(id);

        return company;
    }

    @ApiOperation(value = "通过id或者name，进行查询", notes = "接口详细描述：通过id或者name，进行查询")
    @ApiImplicitParams(
            value = {
                    @ApiImplicitParam(
                            dataType = "int", // 字符串；入参类型
                            dataTypeClass = Integer.class, // Class 类型；入参类型，如果存在会覆盖 dataType
                            defaultValue = "", // 字符串；入参默认值
                            name = "id", // 字符串； 入参名
                            required = true, // 布尔类型；是否必传
                            value = "公司id值", // 字符串类型；表示对参数的描述
                            paramType = "" // 字符串类型，可选值path/query/body/header/form；表示参数存在位置
                    ),
                    @ApiImplicitParam(
                            dataType = "string", // 字符串；入参类型
                            dataTypeClass = String.class, // Class 类型；入参类型，如果存在会覆盖 dataType
                            defaultValue = "", // 字符串；入参默认值
                            name = "companyName", // 字符串； 入参名
                            required = true, // 布尔类型；是否必传
                            value = "公司名称", // 字符串类型；表示对参数的描述
                            paramType = "" // 字符串类型，可选值path/query/body/header/form；表示参数存在位置
                    )
            }
    )
    @GetMapping("id-and-name")
    public Company getCompany(int id, String companyName){

        Company company = new Company();
        company.setId(id);
        company.setCompanyName(companyName);

        return company;
    }



}
