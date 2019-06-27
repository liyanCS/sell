package com.imooc.sell.utils;

import com.imooc.sell.vo.ResultVO;

/**
 * @author Li Yan
 * @date 2019/6/27 15:58
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setMsg("成功");
        resultVO.setCode(0);
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer errorCode, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setMsg(msg);
        resultVO.setCode(errorCode);
        return resultVO;
    }
}
