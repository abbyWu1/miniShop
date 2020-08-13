package shop.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import shop.user.domain.entity.User;
import shop.user.service.UserService;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Authror chenfk
 * @Date 2020-7-30 16:49
 */
@Api(tags = "用户注册接口")
@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    UserService userService;

    @ApiOperation("根据用户实体创建用户")
    @ApiImplicitParam(name = "name", value = "用户名", required = true, dataType = "String")
    @PostMapping("/add")
    public @ResponseBody
    Map<String, Object> addUser(@RequestBody(required = true) String name) {
        return null;
    }

    @ApiOperation("根据Id获取指定对象")
    @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "String", paramType = "path")
    @GetMapping("/{id}")
    public @ResponseBody
    User delete(@PathVariable(value = "id") String id) {
        return userService.getUserById(id);
    }
}
