package shop.common;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@Api(tags = "", description = "删除指定Id的对象", value = "删除")
public interface baseController {
    @ApiOperation(value = "删除信息", notes = "根据Id删除指定对象")
    @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "Long", paramType = "path")
    @RequestMapping("/{id}")
    public @ResponseBody Map<String, Object> delete(@PathVariable(value = "id") Long id);
}
