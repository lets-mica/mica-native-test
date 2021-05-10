//package net.dreamlu.mica.cache;
//
//import net.dreamlu.mica.captcha.service.ICaptchaService;
//import net.dreamlu.mica.core.utils.StringUtil;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class CaptchaController {
//    @Autowired
//    private ICaptchaService captchaService;
//
//    @GetMapping("captcha")
//    public Object captcha() {
//        return captchaService.generateResponseEntity(StringUtil.getUUID());
//    }
//
//}
