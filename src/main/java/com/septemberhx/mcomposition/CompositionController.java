package com.septemberhx.mcomposition;

import com.septemberhx.mclient.annotation.MApiFunction;
import com.septemberhx.mclient.annotation.MRestApiType;
import com.septemberhx.mclient.annotation.MFunctionType;
import com.septemberhx.mclient.base.MObject;
import com.septemberhx.common.base.MResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompositionController extends MObject {

    @MFunctionType
com.sampleservice.mobiservice.controller.MainController controller0;
@MFunctionType
com.sampleservice.baiduservice.controller.MainController controller1;


    @RequestMapping(path = "/test", method = RequestMethod.POST)
    @MApiFunction
    @MRestApiType
    public MResponse test(@RequestBody MResponse body) {
        MResponse r0 = controller0.shareBikeFunction(body);
MResponse r1 = controller1.navigationFunction(r0);
return r1;

    }
}
