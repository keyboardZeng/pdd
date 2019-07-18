package com.jtzeng.springmvc.serviceI;

import com.jtzeng.springmvc.entity.ComEntity;
import org.springframework.web.bind.annotation.RequestMapping;

public interface UtilServiceI {
    String timeGet(ComEntity param);

    String divideBase64Image(ComEntity param);

    String divideImage(ComEntity param);
}
