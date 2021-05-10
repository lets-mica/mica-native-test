package net.dreamlu.mica.ip2region;

import net.dreamlu.mica.core.utils.WebUtil;
import net.dreamlu.mica.ip2region.core.Ip2regionSearcher;
import net.dreamlu.mica.ip2region.core.IpInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ip2region 测试
 *
 * @author L.cm
 */
@RestController
public class Ip2RegionController {
    @Autowired
    private Ip2regionSearcher ip2regionSearcher;

    @GetMapping("ip2region")
    public IpInfo ip2region() {
       return ip2regionSearcher.memorySearch(WebUtil.getIP());
    }

}
