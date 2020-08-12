package shop.register.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import shop.common.baseController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Authror chenfk
 * @Date 2020-7-30 16:49
 */
@RestController
@RequestMapping("/user")
public class RegisterController {

    @ApiOperation(value = "新增用户", notes = "根据用户实体创建用户")
    @ApiImplicitParam(name = "name", value = "用户名", required = true, dataType = "String")
    @PostMapping("/add")
    public @ResponseBody
    Map<String, Object> addUser(@RequestBody String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", "success");
        return map;
    }

    @ApiOperation(value = "删除信息", notes = "根据Id删除指定对象")
    @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "String", paramType = "path")
    @DeleteMapping("/{id}")
    public @ResponseBody
    Map<String, Object> delete(@PathVariable(value = "id") String id) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", "success");
        return map;
    }
}
