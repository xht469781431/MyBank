package com.ll.controller;

import com.ll.common.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @className:CounterController
 * @Description: 柜台Controller
 * @Author:xht
 * @Date:2020/3/27 9:42
 * @Version:3.0
 */

@RestController
@Api(tags = "柜台相关接口")
public class CounterController {

    @Autowired
    CommonResult commonResult;

    //获取日志记录器Logger，名字为本类类名
    private static Logger logger = LogManager.getLogger();

    @GetMapping("/hello/{id}")
    @ResponseBody
    @ApiOperation(value = "测试接口", notes = "这里是关于接口的描述:这是一个测试接口")
    public CommonResult hello(@ApiParam(name = "id", value = "输入参数id") @PathVariable("id")String id){



        Pattern pattern = Pattern.compile("^(\\-|\\+)?\\d+(\\.\\d+)?$");//这个是对的
        Matcher isNum = pattern.matcher(id);
        if (!isNum.matches()) {
            logger.info("验证了一次不为数字info!");
            logger.debug("debug log");
            logger.error("error log");

            CommonResult failed = commonResult.failed();

            return failed;

        }
        return commonResult.success("yes!");
    }


    /**
     * @description: 柜台柜员登录
     * @author:xht
     * @date:2020/3/27 15:39
     * @param:
     * @return:
     */


    /**
     * @description:柜台主管登录
     * @author:xht
     * @date:2020/3/27 15:40
     * @param:
     * @return:
     */

    /**
     * @functionName:
     * @description:超级管理员登录
     * @author:xht
     * @date:2020/3/27 15:52
     * @param:
     * @return:
     */

    /**
     * @description:柜台新学生用户开户
     * @author:xht
     * @date:2020/3/27 15:40
     * @param:
     * @return:
     */
    
    /**
     * @functionName:
     * @description:使用NFC登录获取学生信息
     * @author:xht
     * @date:2020/3/27 15:41
     * @param:
     * @return:
     */
    
    /**
     * @functionName:
     * @description:柜台修改学生信息
     * @author:xht
     * @date:2020/3/27 15:42
     * @param:
     * @return:
     */
    
    /**
     * @functionName:
     * @description:柜台取款
     * @author:xht
     * @date:2020/3/27 15:43
     * @param:
     * @return:
     */
    
    /**
     * @functionName:
     * @description:柜台存款
     * @author:xht
     * @date:2020/3/27 15:43
     * @param:
     * @return:
     */
    
    /**
     * @functionName:
     * @description:柜台转账
     * @author:xht
     * @date:2020/3/27 15:44
     * @param:
     * @return:
     */

    /**
     * @functionName:
     * @description:柜台学生密码修改
     * @author:xht
     * @date:2020/3/27 15:44
     * @param:
     * @return:
     */

    /**
     * @functionName:
     * @description:柜台学生存折挂失/存折换新
     * @author:xht
     * @date:2020/3/27 15:45
     * @param:
     * @return:
     */

    /**
     * @functionName:
     * @description:根据学生id(学号)查询学生信息
     * @author:xht
     * @date:2020/3/27 15:46
     * @param:
     * @return:
     */

    /**
     * @functionName:
     * @description:根据NFC编号查询学生信息
     * @author:xht
     * @date:2020/3/27 15:47
     * @param:
     * @return:
     */

    /**
     * @functionName:
     * @description: 柜台转账流水查询
     * @author:xht
     * @date:2020/3/27 15:48
     * @param:
     * @return:
     */

    /**
     * @functionName:
     * @description:查询当前金币库存
     * @author:xht
     * @date:2020/3/27 15:49
     * @param:
     * @return:
     */

    /**
     * @functionName:
     * @description:查询今日收益(库存金币的增加或是减少)
     * @author:xht
     * @date:2020/3/27 15:50
     * @param:
     * @return:
     */

    /**
     * @functionName:
     * @description: 日结核算
     * @author:xht
     * @date:2020/3/27 15:51
     * @param:
     * @return:
     */

    /**
     * @functionName:
     * @description:超级管理员强制平账
     * @author:xht
     * @date:2020/3/27 15:51
     * @param:
     * @return:
     */
}
