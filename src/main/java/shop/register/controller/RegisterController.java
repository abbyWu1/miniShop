package shop.register.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Authror chenfk
 * @Date 2020-7-30 16:49
 */
@Api(tags = "用户注册接口")
@RestController
@RequestMapping("/register")
public class RegisterController {

    @ApiOperation("根据用户实体创建用户")
    @ApiImplicitParam(name = "name", value = "用户名", required = true, dataType = "String")
    @PostMapping("/add")
    public @ResponseBody
    Map<String, Object> addUser(@RequestBody(required = true) String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", "success");
        return map;
    }

    @ApiOperation("根据Id删除指定对象")
    @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "String", paramType = "path")
    @DeleteMapping("/{id}")
    public @ResponseBody
    Map<String, Object> delete(@PathVariable(value = "id") String id) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", "success");
        return map;
    }
}
