package com.jtzeng.springmvc.serviceI;

import com.jtzeng.springmvc.entity.ComEntity;
import org.springframework.web.bind.annotation.RequestMapping;

public interface GoodsServiceI {
    String catsGet(ComEntity param);

    String optGet(ComEntity param);

    String cpsUnitGet(ComEntity param);
}
