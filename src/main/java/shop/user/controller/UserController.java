package shop.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import shop.user.domain.entity.User;
import shop.user.service.UserService;

@Api(tags = "用户登录接口")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @ApiOperation("根据Id获取用户")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "String", paramType = "path")
    @GetMapping("/{id}")
    public @ResponseBody
    User get(@PathVariable(value = "id") String id) {
        return userService.getUserById(id);
    }

    @ApiOperation("添加用户")
    @ApiImplicitParam(name = "user", value = "用户", required = true, dataType = "User")
    @PostMapping("/addUser")
    public void add(@RequestBody User user) {
        userService.addUser(user);
    }

    /*测试乐观锁*/
    @ApiOperation("修改用户")
    @ApiImplicitParam(name = "user", value = "用户", required = true, dataType = "User")
    @PutMapping("/updateUser")
    public void update(@RequestBody User user) {
        userService.updateUser(user);
    }
}
