package top.simba1949.config;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

/**
 * 需要 @EnableSwagger2 开启 swagger2
 * 启动项目后访问 http://ip:port/swagger-ui.html 即可访问
 *
 * @Author Theodore
 * @Date 2019/10/23 18:34
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    /**
     * springfox.documentation.spring.web.plugins.Docket 用于构建 Springfox 框架
     * @return
     */
    @Bean
    public Docket commonDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                // 如果存在多个 Docket ，需要进行分组命名
                .groupName("commonDocket-api")
                // 设置 meta 信息
                .apiInfo(apiInfo("标题：通用开发接口文档", "描述：通用开发接口文档"))
                // 启动 api 选择构建器
                .select()
                // 哪些包路径下属于通用开发接口文档
                .apis(RequestHandlerSelectors.basePackage("top.simba1949.controller.common"))
                // 路径筛选 PathSelectors.any() 匹配所有接口，也可以自定义匹配哪些接口
                .paths(PathSelectors.any())
                // 构建
                .build();
    }

    /**
     * 自定义匹配哪些接口
     * @return
     */
    private Predicate<String> postPaths() {
        return or(
                regex("/api/posts.*"),
                regex("/api/comments.*")
        );
    }

    @Bean
    public Docket companyDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                // 如果存在多个 Docket ，需要进行分组命名
                .groupName("companyDocket-api")
                // 设置 meta 信息
                .apiInfo(apiInfo("标题：公司开发接口文档", "描述：公司开发接口文档"))
                // 启动 api 选择构建器
                .select()
                // 哪些包路径下属于公司开发接口文档
                .apis(RequestHandlerSelectors.basePackage("top.simba1949.controller.company"))
                // 路径筛选
                .paths(PathSelectors.any())
                // 构建
                .build();
    }

    private ApiInfo apiInfo(String title, String description) {
        // 名称，站点，邮箱地址
        Contact contact = new Contact("simba1949", "https://blog.csdn.net/simba1949", "simba1949@outlook.com");
        return new ApiInfoBuilder()
                // 标题
                .title(title)
                // 描述
                .description(description)
                // 服务条款链接
                .termsOfServiceUrl("http://hantsy.blogspot.com")
                // 联系人
                .contact(contact)
                // 认证许可
                .license("Apache License Version 2.0")
                // 认证许可链接
                .licenseUrl("https://github.com/springfox/springfox/blob/master/LICENSE")
                // 版本
                .version("2.0")
                .build();
    }
}
