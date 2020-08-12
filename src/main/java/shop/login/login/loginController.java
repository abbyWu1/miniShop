package shop.login.login;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/login")
public class loginController {
    @ApiOperation(value = "id", notes = "根据id查找用户")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "String", paramType = "path")
    @GetMapping("/{id}")
    public @ResponseBody
    Map<String, Object> addUser(@PathVariable(value = "id") String id) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", "success");
        return map;
    }
}

